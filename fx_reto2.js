function obtenerCliente(){

    $.ajax({
        url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "GET",
        dataType: "JSON",

        success: function(respuesta){
            console.log(respuesta);
            mostrarClientes(respuesta.items);

        }
    });
}

function mostrarClientes(items){
    let table = "<table>";
    for(i=0; i<items.length; i++){
        table += "<tr>";
        table += "<td>" + items[i].id + "</td>";
        table += "<td>" + items[i].name + "</td>";
        table += "<td>" + items[i].email + "</td>";
        table += "<td>" + items[i].age + "</td>";
        table += "<td> <button onclick='borrarCliente(" + items[i].id + ")'>BORRAR CLIENTE</button>";
        table += "<tr>"; 
    }
    table += "</table>";
    $("#verClientes").append(table);
    
}

function enviarCliente(){
    let dcliente = {
        id: $("#id").val(),
        name: $("#name").val(),
        email: $("#email").val(),
        age: $("#age").val()
};

let dataToJson = JSON.stringify(dcliente);

$.ajax({
    url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
    type: "POST",
    data:dcliente,
    dataType: "JSON"

    });

}

function actualizarCliente(){
        let dcliente = {
        id: $("#id").val(),
        name: $("#name").val(),
        email: $("#email").val(),
        age: $("#age").val()

};

let dataToSend = JSON.stringify(dcliente);

    $.ajax({
        url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "PUT",
        data:dataToSend,
        contentType:"application/json",
        dataType: "JSON",

        success: function(respuesta){
            console.log(respuesta);
            $("#verClientes").empty();
            $("#id").val(""),
            $("#name").val(""),
            $("#email").val(""),
            $("#age").val("")

            mostrarClientes();

        }
    });
}

function borrarCliente(idCliente){
    let dcliente = {

        id:idCliente,
    };

    let dataToSend = JSON.stringify(dcliente);
    
    $.ajax({
        url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "DELETE",
        data:dataToSend,
        contentType:"application/json",
        dataType: "JSON",

        success: function(respuesta){

            $("#verClientes").empty();
            mostrarClientes();

        }
    
    });

}

function buscarCliente(){
    let dcliente = $("#id").val();
    

    $.ajax({
        url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/cliente/" + dcliente,
        type: "GET",
        dataType: "JSON",

        success: function(respuesta){
            console.log(respuesta);
            
            mostrarClientes(respuesta.items);

        }
    });

}

function limpiarTabla(){
   
    $.ajax({
        url:"https://g56bd9babe34b36-sx5evivf3vpxi6m8.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "GET",
        dataType: "JSON",

        success: function(respuesta){
            $("#verClientes").empty();
           

        }
    });
     
}

