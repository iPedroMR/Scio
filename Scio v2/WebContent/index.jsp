<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="favicon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <title>SCIO</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
   
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>
   
        <link rel="stylesheet" type="text/css" href="style/dashboard.css">
        <link rel="stylesheet" type="text/css" href="style/main.css" />
        <link rel="stylesheet" type="text/css" href="style/chat.css" />
        
</head>
<body>

    <div class="sidebar-container">
        <div class="sidebar-logo">
            <img src="./img/SCIO.png" width="100" height="60" alt="">
        </div>
        <ul class="sidebar-navigation">
            <li class="header">Ações</li>
            <li>
                <a href="perfil.jsp">
                    <i class="fa fa-user" aria-hidden="true"></i> Perfil
                </a>
            </li>
            <li>
                <a href="ajuda.jsp">
                    <i class="fa fa-info-circle" aria-hidden="true"></i> Ajuda
                </a>
            </li>
            <li>
                <a onclick="sair()">
                    <i class="fa fa-sign-out" aria-hidden="true"></i> Sair
                </a>
            </li>
            <li class="header">Atividades</li>
            <li>
                <a href="memorizacao.jsp">
                    <i class="fa fa-question" aria-hidden="true"></i> Memorização
                </a>
            </li>
            <li>
                <a href="materia.jsp">
                    <i class="fa fa-book" aria-hidden="true"></i> Matérias
                </a>
            </li>
            <li>
                <a href="index.jsp" class="active">
                    <i class="fa fa-commenting" aria-hidden="true"></i> ChatBot
                </a>
            </li>
        </ul>
    </div>

    <div class="content-container">
    
    <div id="frame">
	<div class="content">
		<div class="contact-profile">
			<img src="./img/fiapinho.png" alt="" />
			<p>Fiapinho</p>
		</div>
		<div class="chat-container"></div>
		<div class="message-input">
			<div class="wrap">
			<input type="text" id="question" name="question" placeholder="Escreva sua mensagem..." />
			<button id="sendQuestion" class="submit"><i class="fa fa-paper-plane" aria-hidden="true"></i></button>
			<button id="recordButton"><i class="fa fa-microphone" aria-hidden="true"></i></button>
			<button id="stopButton" disabled><i class="fa fa-stop" aria-hidden="true"></i></button>
			</div>
		</div>
	</div>
</div>
    </div>

    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>

	<script src="https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js"></script>
	<!-- Para a versão dois utilizar o script main.js -->
	<script type="text/javascript" src="scripts/assistant.js"></script>
	<script type="text/javascript" src="scripts/sair.js"></script>
	<script type="text/javascript" src="scripts/tts.js"></script>
	<script type="text/javascript" src="scripts/stt.js"></script>
</body>
</html>