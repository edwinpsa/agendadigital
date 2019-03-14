
/*function validacion()
{
var usuario, contraseña,nombre,edad,correo,sexo;
usuario = document.getElementById("usuario").value;
contraseña = document.getElementById("contraseña").value;
nombre = document.getElementById("nombre").value;
edad = document.getElementById("edad").value;
correo = document.getElementById("correo").value;
sexo = document.getElementById("sexo").value;
experesion = /\w+@\w+\.+[a-z]/;

console.log(usuario +' '+ contraseña);
if (usuario=== '' && contraseña ==='' && nombre ==='' && edad ===''&& correo ===''&& sexo ==='') {

 document.getElementById("usuario").focus();
 document.getElementById("contraseña").focus();
 document.getElementById("nombre").focus();
 document.getElementById("edad").focus();
 document.getElementById("correo").focus();
 document.getElementById("sexo").focus();
 }
else  
{
document.getElementById("usuario").value="";
document.getElementById("contraseña").value="";
document.getElementById("nombre").value="";
document.getElementById("edad").value="";
document.getElementById("correo").value="";
 document.getElementById("sexo").value="";
 document.getElementById("usuario").focus();
}
*/


function datospost() {
	var usuario, contrasena,nombre,telefonopersonal,telefonooficina,correopersonal,correooficina,fechadecumpleanos;
	usuario = document.getElementById("usuario").value;
	contrasena = document.getElementById("contrasena").value;
	nombre = document.getElementById("nombre").value;	
    telefonopersonal = document.getElementById("telefonopersonal").value;
    telefonooficina = document.getElementById("telefonooficina").value;
    correopersonal = document.getElementById("correopersonal").value;
	correooficina = document.getElementById("correooficina").value;
	fechadecumpleanos = document.getElementById("fechadecumpleanos").value;
	console.log(telefonooficina);
	var rs = {'usuario' : usuario, 'contrasena': contrasena,'nombre': nombre,'telefonopersonal':telefonopersonal,'telefonooficina':telefonooficina,'correopersonal':correopersonal,'correooficina':correooficina,'fechadecumpleanos':fechadecumpleanos};
	var jsontext = JSON.stringify(rs);
	console.log(jsontext);

	fetch('http://localhost:8080/api/usuario/', {
		method : 'POST',
		body: jsontext,
		headers: {"Content-Type": "application/json"}
	})
	.then()
	.catch()
}

/*Get*/
var formulariocontacto = [];

    getContactos()
    .then(data => data.json())
        .then(contactos => {
            console.log(contactos)
            listadoContactos(contactos)
            
    })
        .catch(error =>{
            console.log(error);
        });

function getContactos(){
    return fetch('http://localhost:8080/api/usuario', {
		method : 'GET',
		headers: {"Content-Type": "application/json"}
	})
}

function listadoContactos(contactos){
	var datosbc;

	var tablahtml = '<table class="tabltemp">'
          +'<tr id="fil">'
          +'<th id="ids">Id</th>'
          +'<th>Contraseña</th>'+
          '<th>Nombre</th>'+
          '<th>Telefono Personal</th>'+
          '<th>Telefono Oficina</th>'+
          '<th>Correo Personal</th>'+
          '<th>Correo Oficina</th>'+
          '<th>Fecha de Cumpleaños</th>'+
          '</tr>'+ 
          '</table>'+
        '<tbody>';

     datosbc = '';
     contactos.forEach(function(elemento){
     	datosbc = datosbc + '<tr><td>'+elemento.id+'</td>';  
     	datosbc = datosbc + '<td>'+elemento.contrasena+'</td>';
     	datosbc = datosbc + '<td>'+elemento.nombre+'</td>';
        datosbc = datosbc + '<td>'+elemento.telefonopersonal+'</td>';
     	datosbc = datosbc + '<td>'+elemento.telefonooficina+'</td>' ;
        datosbc = datosbc + '<td>'+elemento.correopersonal+'</td>';
     	datosbc = datosbc + '<td>'+elemento.correooficina+'</td>';
        datosbc = datosbc + '<td>'+elemento.fechadecumpleanos+'</td></tr>';
        datosbc = datosbc + '<td><button onclick="eleminarapi('+elemento.id+')">eliminar</button></td></tr>';
        datosbc = datosbc + '<td><button onclick="eleminarapi('+elemento.id+')">editar</button></td></tr>';
     })
     tablahtml = tablahtml + datosbc;
     console.log(tablahtml);
     document.getElementById("registros").innerHTML = tablahtml;
    






    
}

/*Delete*/

function eleminarapi(borrarapi){
 fetch (`http://localhost:8080/api/usuario/${borrarapi}`, {
   method: 'DELETE'})
 .then(res => res.json())
 .then(res => {
   if (res.success) {
     let ca = this.state.categories.filter(c => c.id !== id);
     this.setState({ ca });
  
   }
 });


}



















