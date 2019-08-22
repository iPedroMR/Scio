package com.spi.ibmcoleta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.tapadoo.alerter.Alerter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerIntencao;
    private TextView editTextSentenca;
    private String sentenca;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("Intencao", MODE_PRIVATE);

        spinnerIntencao = findViewById(R.id.spinner_intencao);

        spinnerIntencao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if(!spinnerIntencao.getSelectedItem().toString().equals("Selecione uma intenção...")){

                    String result = sharedPreferences.getString(spinnerIntencao.getSelectedItem().toString(), "");

                    if(!result.equals("")){
                        Toast.makeText(getApplicationContext(), "Encontramos sentenças salvas.",Toast.LENGTH_SHORT).show();
                        editTextSentenca.setText(result);
                    }else{
                        editTextSentenca.setText("");
                        editTextSentenca.setHint("Sentenças...");
                    }
                } else{
                    editTextSentenca.setText("");
                    editTextSentenca.setHint("Sentenças...");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        editTextSentenca = findViewById(R.id.et_sentenca);

        editTextSentenca.setMovementMethod(new ScrollingMovementMethod());

        editTextSentenca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popUpEditText(editTextSentenca.getText().toString());
            }
        });

        // Initializing a String Array
        String[] intencoes = new String[]{
                "Selecione uma intenção...",
                "#o_que_e_concordancia",
                "#exemplos_de_concordancia",
                "#o_que_regencia",
                "#exemplos_de_regencia",
                "#o_que_e_crase",
                "#exemplos_de_frases_com_crase",
                "#como_nao_posso_usar_virgula",
                "#como_usar_virgula",
                "#o_que_e_sintaxe",
                "#o_que_e_pronome",
                "#o_que_e_gramatica_normativa",
                "#o_que_ortografia",
                "#exemplos_ortografia",
                "#classes_morfologia",
                "#exemplos_de_ortoepia",
                "#exemplos_de_prosodia",
                "#o_que_e_fonologia",
                "#o_que_e_morfologia",
                "#o_que_e_ortoepia",
                "#o_que_e_prosodia"
        };

        final List<String> intencaoList = new ArrayList<>(Arrays.asList(intencoes));

        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.support_simple_spinner_dropdown_item,intencaoList);

        spinnerIntencao.setAdapter(spinnerArrayAdapter);

    }

    private void popUpEditText(String texto) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sentenças");

        final EditText input = new EditText(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        input.setHeight(1000);
        input.setPadding(75,40,40,40);
        input.setGravity(View.TEXT_ALIGNMENT_VIEW_END);
        input.isVerticalScrollBarEnabled();
        input.setLayoutParams(lp);
        input.setText(texto);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                editTextSentenca.setText(input.getText().toString());

            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();

    }

    public void btnFormatar(View view) {

        sentenca = editTextSentenca.getText().toString();

        sentenca = sentenca.replaceAll("[^À-ú a-zA-ZçÇ0-9\\\\.!?,]", "");

        sentenca = sentenca.replace(".", ".\n \n");

        editTextSentenca.setText(sentenca);


        Toast.makeText(getApplicationContext(),"Sentença formatada com sucesso.", Toast.LENGTH_LONG).show();



    }

    public void btnColetar(View view) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(null, sentenca);
        assert clipboard != null;
        clipboard.setPrimaryClip(clip);

        SharedPreferences.Editor editor = getSharedPreferences("Intencao", MODE_PRIVATE).edit();
        editor.putString(spinnerIntencao.getSelectedItem().toString(), editTextSentenca.getText().toString());
        editor.apply();

        Toast.makeText(getApplicationContext(),"Copiado para a área de transferência e adicionado a intenção.", Toast.LENGTH_LONG).show();
    }
}
