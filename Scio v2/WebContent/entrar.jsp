<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>SCIO</title>
    <link rel="shortcut icon" href="./img/SCIO.png" />
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/login.css">
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>

    <nav class="navbar navbar-expand-lg navbar-light">

        <a class="navbar-brand mr-0 mr-md-2" href="./index.jsp">
            <img src="./img/SCIO.png" width="100" height="60" alt="">
        </a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="./home.jsp">HOME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./sobre.jsp">SOBRE</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./como_funciona.jsp">COMO FUNCIONA</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./time.jsp">TIME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./aplicacao.jsp">APLICAÇÃO</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./contato.jsp">CONTATO</a>
                </li>
                <li class="nav-item active">
                    <a class="btn btn-primary" href="./entrar.jsp">ENTRAR/CADASTRAR</a>
                </li>
            </ul>
        </div>
    </nav>

    <section id="banner" class="banner-secondary">
        <div class="p-4 col-sm-8 text-center">
            <span class="title">Vamos mudar a maneira como você estuda!</span>
        </div>
    </section>

    <main>
        <section id="contact-form">
            <div class="justi">
                <div class="card">
                    <div class="card__top"></div>
                    <div class="card__content">
                        <div class="card__tab">
                            <input class="card__tab-input" id="tab-1" type="radio" name="card-tab" checked="checked" />
                            <label class="card__tab-label" for="tab-1">Entrar</label>
                            <div class="card__tab-inner">
                                <div class="card__form">
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" required="required" />
                                        <label class="card__input-group-label">Nome</label>
                                    </div>
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" type="password" required="required" />
                                        <label class="card__input-group-label">Senha</label>
                                    </div>
                                    <div class="card__btn-group">
                                        <button onclick="entrar()" class="card__btn"><span>Entrar</span></button>
                                    </div><button class="card__link" onclick="esqueci()">Esqueceu a senha?</button>
                                </div>
                            </div>
                        </div>
                        <form action="cadastro" method="post" class="card__tab">
                            <input class="card__tab-input" id="tab-2" type="radio" name="card-tab" />
                            <label class="card__tab-label" for="tab-2">Cadastrar</label>
                            <div class="card__tab-inner">
                                <div class="card__form">
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" name="login" required="required" />
                                        <label class="card__input-group-label">Nome de usuário</label>
                                    </div>
                                     <div class="card__input-group">
                                        <input class="card__input-group-input" name="nome" required="required" />
                                        <label class="card__input-group-label">Nome Completo</label>
                                    </div>
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" name="email" required="required" />
                                        <label class="card__input-group-label">E-mail</label>
                                    </div>
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" name="sexo" required="required" />
                                        <label class="card__input-group-label">Sexo</label>
                                    </div>
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" name="cpf" required="required" />
                                        <label class="card__input-group-label">CPF</label>
                                    </div>
                                    <div class="card__input-group">
                                        <input class="card__input-group-input" name="senha" type="password" required="required" />
                                        <label class="card__input-group-label">Senha</label>
                                    </div>
                                    <div class="card__btn-group">
                                        <button onclick="entrar()" class="card__btn"><span>Cadastrar</span></button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <footer>
        <div class="row align-items-center">
            <div class="col">
                <a class="logo" href="/">
                    <img src="./img/SCIO_negative.png" alt="">
                </a>
            </div>
            <div class="col text-right">
                <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">
                    <img alt="Licença Creative Commons" style="border-width:0"
                        src="https://i.creativecommons.org/l/by-nc-nd/4.0/88x31.png" />
                </a>
                <br />Este obra está licenciado com uma Licença
                <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons
                    Atribuição-NãoComercial-SemDerivações 4.0 Internacional</a>.
            </div>
        </div>
    </footer>

  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>
      	<script type="text/javascript" src="scripts/esqueci-senha.js"></script>
      	<script type="text/javascript" src="scripts/entrar.js"></script>
    <script src="./bootstrap/js/bootstrap.bundle.min.js"></script>
      <script src="https://code.jquery.com/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
      
   

</body>

</html>