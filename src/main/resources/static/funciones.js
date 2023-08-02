function eliminar(id){
	swal({
  title: "Esta seguro de Eliminar?",
  text: "Una vez eliminado no se podra recuperar!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminar/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Se elimino registro", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/listar";
		}
	});
		;
  } else {
    swal("Your imaginary file is safe!");
  }
});
}