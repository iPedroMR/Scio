function sair(){
const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    confirmButton: 'btn btn-success',
    cancelButton: 'btn btn-danger'
  },
  buttonsStyling: false
})

swalWithBootstrapButtons.fire({
  title: 'Você tem certeza?',
  text: "Você sairá da sua conta!",
  type: 'warning',
  showCancelButton: true,
  confirmButtonText: 'Sair',
  cancelButtonText: 'Não sair',
  reverseButtons: true
}).then((result) => {
  if (result.value) {
    window.location.href = "home.jsp";
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    
  }
})
}