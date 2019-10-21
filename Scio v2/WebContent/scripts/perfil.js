function perfil(){
const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    confirmButton: 'btn btn-success',
    cancelButton: 'btn btn-danger'
  },
  buttonsStyling: false
})

swalWithBootstrapButtons.fire({
  title: 'Você deseja salvar?',
  type: 'question',
  showCancelButton: true,
  confirmButtonText: 'Sim',
  cancelButtonText: 'Não',
  reverseButtons: true
}).then((result) => {
  if (result.value) {
	  swalWithBootstrapButtons.fire(
		      'Salvo!',
		      'Seu perfil foi atualizado com sucesso.',
		      'success'
		    )
		    
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    
  }
})
}