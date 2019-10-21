function contato(){
const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    confirmButton: 'btn btn-success',
    cancelButton: 'btn btn-danger'
  },
  buttonsStyling: false
})

swalWithBootstrapButtons.fire({
  title: 'Você deseja enviar?',
  type: 'question',
  showCancelButton: true,
  confirmButtonText: 'Sim',
  cancelButtonText: 'Não',
  reverseButtons: true
}).then((result) => {
  if (result.value) {
	  swalWithBootstrapButtons.fire(
		      'Enviado!',
		      'Sua mensagem foi enviada com sucesso.',
		      'success'
		    )
		    
		    document.getElementById("mensagem-form").reset();

  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    
  }
})
}