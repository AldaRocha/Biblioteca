
function insertarEjemplar() {
    let datos = null;
    let params = null;

    let ejemplar = new Object();
    ejemplar.libro = new Object();
    ejemplar.libro.autor = new Object();
    ejemplar.libro.editorial = new Object();
    ejemplar.libro.genero = new Object();

    ejemplar.libro.autor.nombre = document.getElementById("txtNombreAutor").value;

    ejemplar.libro.editorial.nombre = document.getElementById("txtNombreEditorial").value;

    ejemplar.libro.genero.nombre = document.getElementById("txtGenero").value;

    ejemplar.libro.idLibro = document.getElementById("txtIdLibro").value;
    ejemplar.libro.titulo = document.getElementById("txtTituloLibro").value;
    ejemplar.libro.isbn = document.getElementById("txtISBN").value;

    ejemplar.codigo = document.getElementById("txtCodigoEjemplar").value;
    ejemplar.estatus = document.getElementById("txtEstatusEjemplar").value;
    ejemplar.observaciones = document.getElementById("txtObervacionesEjemplar").value;

    datos = {
        datos: JSON.stringify(ejemplar)
    };

    params = new URLSearchParams(datos);

    console.log(params);

    fetch("api/ejemplar/insertar",
            {
                method: "POST",
                headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'}, //cabecera de la peticcion, metodo de como estoy condicionando y como voy a mandar los datos
                body: params
            })
            .then(response => {
                return response.json();
            })
            .then(function (data)
            {
                if (data.exception != null)
                {
                    Swal.fire('', "Error interno del servidor. Intente nuevamente más tarde", 'error');
                    return;
                }
                if (data.error != null)
                {
                    Swal.fire('', data.error, 'warning')
                    return;
                }
                cleanRegistro();
            });
    alert("Datos del Ejemplar se guardaron con exito");
}

function cleanRegistro() {
    document.getElementById("txtNombreAutor").value = "";
    document.getElementById("txtNombreEditorial").value = "";
    document.getElementById("txtGenero").value = "";
    document.getElementById("txtIdLibro").value = "";
    document.getElementById("txtTituloLibro").value = "";
    document.getElementById("txtISBN").value = "";
    document.getElementById("txtCodigoEjemplar").value = "";
    document.getElementById("txtEstatusEjemplar").value = "";
    document.getElementById("txtObervacionesEjemplar").value = "";
}
