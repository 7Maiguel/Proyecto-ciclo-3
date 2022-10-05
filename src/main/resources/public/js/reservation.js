const BASE_URL_RESER = 'http://localhost:8080/api/Reservation';

function listReservations(){
    $.ajax({
        url: `${BASE_URL_RESER}/all`,
        type: 'GET',
        dataType: 'JSON',
        success: (res)=>{
            console.log('Mostrando reservas...');
            loadData(res);
        },
        error: (err)=>{
            alert(`Error: Status ${err.status}`);
        }
    })
}

function loadData(res){
    const reservations = res;

    $('#reservationList').empty();
    $('#reservationList').append(
        `<table id="reservationTable" style="border: 1px solid black"> 
            <thead>
                <th>Cliente</th>
                <th>Bicicleta</th>
                <th>Fecha inicio</th>
                <th>Fecha entrega</th>
            </thead>
            <tbody></tbody>
         </table>`
    )

    for(let i=0; i<reservations.length; i++){
        $('#reservationTable tbody').append(
            `<tr>
                <th>${reservations[i].client.name}</th>
                <th>${reservations[i].bike.name}</th>
                <td>${reservations[i].startDate.slice(0,10)}</td>
                <td>${reservations[i].devolutionDate.slice(0,10)}</td>
                <td><button>Calificar</button></td>
            </tr>`
        )
    }
    $('#list-btn-reservation').text('Ocultar');
    $('#list-btn-reservation').attr('onclick', 'hideData()');
}

function hideData(){
    $('#list-btn-reservation').text('Consultar');
    $('#list-btn-reservation').attr('onclick', 'listReservations()');
    $('#reservationList').empty();
}

function saveReservation(){
    $.ajax({
        url: `${BASE_URL_RESER}/save`,
        type: 'POST',
        data: JSON.stringify({
            startDate: $('#startDate-reservation').val(),
            devolutionDate: $('#devolutionDate-reservation').val(),
            client: {idClient: $('#clientId-reservation').val()},
            bike: {id: $('#bikeId-reservation').val()}
        }),
        contentType: 'application/json',
        success: (res)=>{
            console.log('Guardando reserva...');
            listReservations();
            clearReservation();
        },
        error: (err)=>{
            alert(`Error: Status ${err.status}`);
        }
    })
}

function clearReservation(){
    $('#clientId-reservation').val('');
    $('#bikeId-reservation').val('');
    $('#startDate-reservation').val('');
    $('#devolutionDate-reservation').val('');
}