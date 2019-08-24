window.onload = function () {
    $("#sentenca").val(localStorage.getItem("sentenca"));
    contar();
};

function formatar() {

    var sentenca = $("#sentenca").val();

    sentenca = sentenca.replace(/[`~@#$%^&*()_|+\-=?;:'"<>\{\}\[\]\\\/]/gi, '');

    sentenca = sentenca.replace(/\.\n\n/g,'.');

    sentenca = sentenca.replace(/\./g,'.\n\n');

    localStorage.setItem("sentenca",sentenca);

    $("#sentenca").val(sentenca);

    

}

function contar() {

    var sentenca = $("#sentenca").val();

    var cont = 0;

    for (var i = 0; i < sentenca.length; i++) {
        if (sentenca[i] == ".") {
            cont++;
        }
    }

    $("#total").text(cont);

    $("#faltam").text(1000 - cont);
}