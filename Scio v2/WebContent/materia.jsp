<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta charset="utf-8">

    <title>SCIO</title>
    <link rel="shortcut icon" href="./img/SCIO.png" />
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
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/dashboard.css">
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
                <a onclick="sair()" >
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
                <a href="materia.jsp" class="active">
                    <i class="fa fa-book" aria-hidden="true"></i> Matérias
                </a>
            </li>
            <li>
                <a href="index.jsp">
                    <i class="fa fa-commenting" aria-hidden="true"></i> ChatBot
                </a>
            </li>
        </ul>
    </div>

    <div class="content-container">

        <div class="container-fluid">

            <div class="accordion" id="accordionExample">
                <div class="card">
                    <div class="card-header" id="headingOne">
                        <h2 class="mb-0">
                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne"
                                aria-expanded="true" aria-controls="collapseOne">
                                Regência
                            </button>
                        </h2>
                    </div>

                    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne"
                        data-parent="#accordionExample">
                        <div class="card-body">
                            Regência o que é? Como deve ser usado? Tire essas dúvidas hoje no globo repórter! rs rs 
                            <div class="list-group pt-4">
                                    <button type="button" class="list-group-item list-group-item-action active">
                                            Alguns exemplos de perguntas que podem ser feitas ao Fiapinho:                                            
                                    </button>
                                    <button type="button" class="list-group-item list-group-item-action">O que é regência?</button>
                                    <button type="button" class="list-group-item list-group-item-action">Não entendo regência, poderia simplicar?</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header" id="headingTwo">
                        <h2 class="mb-0">
                            <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                Concordância
                            </button>
                        </h2>
                    </div>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                        <div class="card-body">
                                Quantas vezes você já não se deparou com dificuldades para prosseguir com a sua frase, no sentido de concordância de palavras?
                                Chegou a hora de acabar com esses impasses!                                 
                                <div class="list-group pt-4">
                                        <button type="button" class="list-group-item list-group-item-action active">
                                                Alguns exemplos de perguntas que podem ser feitas ao Fiapinho:                                            
                                        </button>
                                        <button type="button" class="list-group-item list-group-item-action">Qual o conceito da concordância.</button>
                                        <button type="button" class="list-group-item list-group-item-action">O que seria concordância?</button>
                                </div>
                            </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header" id="headingThree">
                        <h2 class="mb-0">
                            <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                Vírgula
                            </button>
                        </h2>
                    </div>
                    <div id="collapseThree" class="collapse" aria-labelledby="headingThree"
                        data-parent="#accordionExample">
                        <div class="card-body">
                            Como usar e como não usar vírgula, esta questão persegue muitos até hoje, chegou a hora de usar e abusar das vírgulas de forma correta!         
                            <div class="list-group pt-4">
                                    <button type="button" class="list-group-item list-group-item-action active">
                                            Alguns exemplos de perguntas que podem ser feitas ao Fiapinho:                                            
                                    </button>
                                    <button type="button" class="list-group-item list-group-item-action">Como usar a vírgula corretamente?</button>
                                    <button type="button" class="list-group-item list-group-item-action">Exemplos de frases com a vírgula</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                        <div class="card-header" id="headingThree">
                            <h2 class="mb-0">
                                <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                    data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                    Crase
                                </button>
                            </h2>
                        </div>
                        <div id="collapseFour" class="collapse" aria-labelledby="headingFour"
                            data-parent="#accordionExample">
                            <div class="card-body">
                                    Nesta matéria é retratado nada mais nada menos, sobre como utilizar a crase de forma correta!
                                    Sabe aquelas dúvidas que você carregou desde o ensino médio? Essa é a hora de acabar com elas!
                                
                                    <div class="list-group pt-4">
                                            <button type="button" class="list-group-item list-group-item-action active">
                                                    Alguns exemplos de perguntas que podem ser feitas ao Fiapinho:                                            
                                            </button>
                                            <button type="button" class="list-group-item list-group-item-action">Qual é o conceito de crase?</button>
                                            <button type="button" class="list-group-item list-group-item-action">Não entendo crase. Como usar?</button>
                                    </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
    </div>
    
    <div class="content-container">

        <div class="container-fluid">

            <section id="perfil-form">
                <div class="container">
                    <form id="mensagem-form">
                        <label for="subject">Alguma sugestão?</label>
          				<textarea id="subject" name="subject" placeholder="Escreva algo..." style="height:200px"></textarea>

                    </form>
                    
                  <button onclick="contato()" class="btn btn-primary">Enviar</button>
                    
                </div>
            </section>
        </div>
    </div>

	<script type="text/javascript" src="scripts/contato.js"></script>
	<script type="text/javascript" src="scripts/sair.js"></script>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>


</body>

</html>