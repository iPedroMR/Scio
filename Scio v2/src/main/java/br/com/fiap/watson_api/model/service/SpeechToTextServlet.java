package br.com.fiap.watson_api.model.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ibm.cloud.sdk.core.http.HttpMediaType;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v1.Assistant;
import com.ibm.watson.assistant.v1.model.Context;
import com.ibm.watson.assistant.v1.model.MessageInput;
import com.ibm.watson.assistant.v1.model.MessageOptions;
import com.ibm.watson.assistant.v1.model.MessageResponse;
import com.ibm.watson.speech_to_text.v1.SpeechToText;
import com.ibm.watson.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.speech_to_text.v1.model.SpeechRecognitionResults;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;
import com.ibm.watson.text_to_speech.v1.util.WaveUtils;

@WebServlet(urlPatterns = "/stt")
public class SpeechToTextServlet extends HttpServlet {

	private Context context = null;
	private static final long serialVersionUID = 7476959821119009111L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		byte[] buffer = new byte[1024 * 1024];
		
		InputStream is = req.getInputStream();
		
		//File tempFile = File.createTempFile("speech-", ".wav");
		File tempFile = new File("d:\\audio.wav");
		try (FileOutputStream os = new FileOutputStream(tempFile)) {
			int length;
			while((length = is.read(buffer)) != -1) {
				os.write(buffer, 0, length);
			}
		}
		
		IamOptions options = new IamOptions.Builder()
				//Colocar a sua APIKEY
				.apiKey("bL140DnTUZAM6xuym0ERZrzOnW9zC3BNMMLMXT0hixij")
				.build();
		
		SpeechToText service = new SpeechToText(options);
		
		RecognizeOptions recognizeOptions = new RecognizeOptions.Builder()
				.audio(tempFile)
				.contentType(HttpMediaType.AUDIO_WAV)
				.model("pt-BR_BroadbandModel")
			    .acousticCustomizationId("5be7a6a4-6bc8-4331-9c39-2d81423957cc")   // customização acústica
				.customizationId("91f977d7-d099-4310-b12a-8cb9193f71a2")    // customização de linguagem
				.build();
		
		SpeechRecognitionResults transcript = service.recognize(recognizeOptions)
				.execute()
				.getResult();
		
		
		String s = new Gson().toJson(transcript.getResults());
		//System.out.println(">>>>> " + s);
		
		MessageResponse mr = assistantAPICall(s);
		
		String str =  mr.getOutput().getText().get(0);
	    System.out.println(">>>>> " + str);
	
		resp.getWriter().write(str);
		
//		resp.setContentType("application/json");
//		resp.getWriter().write(new Gson().toJson(transcript.getResults()));
	}
	
//	
	private MessageResponse assistantAPICall(String msg) {

		// Configuração de autenticação do serviço *********************************************
		IamOptions options = new IamOptions.Builder()
				//Colocar a sua APIKEY
				.apiKey("8YJECaOoHdzkhJ-KhCpV03C_HEdcs_VBooqHMUonM0Oc")
				.build();
		
		// Criando o objeto do serviço desejado ************************************************
		
		Assistant service = new Assistant("2018-02-16", options);
		      //Colocar a sua WORKSPACEID
		String workspaceId = "c3d4debe-6959-4182-8f7b-f39ebe6b5e37";
		
		// Preparando a mensagem de envio *****************************************************
		MessageInput input = new MessageInput();
		input.setText(msg);
		
		// Configurando os parametros para o Watson *******************************************
		MessageOptions messageOptions = new MessageOptions.Builder()
				.workspaceId(workspaceId)
				.input(input)
				.context(this.context)
				.build();
		
		// Conectando com o Assistant e recebendo a resposta dele ******************************
		MessageResponse response  = service.message(messageOptions)
				.execute()
				.getResult();
		
		this.context = response.getContext();

		return response;
	}

}




