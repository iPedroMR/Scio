function esqueci(){
	const swalWithBootstrapButtons = Swal.mixin({
		  customClass: {
		    confirmButton: 'btn btn-success',
		    cancelButton: 'btn btn-danger'
		  },
		  buttonsStyling: false
		})
	
Swal.fire({
  title: 'Preencha o seu e-mail',
  input: 'text',
  inputAttributes: {
    autocapitalize: 'off'
  },
  showCancelButton: true,
  cancelButtonText: 'Cancelar',
  confirmButtonText: 'Enviar',
  showLoaderOnConfirm: true,
  allowOutsideClick: () => !Swal.isLoading()
}).then((result) => {
	if (result.value) {
		swalWithBootstrapButtons.fire(
			      'Enviado!',
			      'Sua senha foi enviada para o seu e-mail com sucesso.',
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