const BASE_URL_SCORE = 'http://localhost:8080/api/Score/save';

function loadScoreForm(){
    $('#form-reservas').empty();
    $('#form-reservas').append(
        `<form>
            <p><b>Califica la reserva :</b></p>
            <input type="radio" id="score-one" value="1">
            <label for="score-one">1</label>
            
            <input type="radio" id="score-two" value="2">
            <label for="score-two">2</label>
            
            <input type="radio" id="score-three" value="3">
            <label for="score-three">3</label>
            
            <input type="radio" id="score-four" value="4">
            <label for="score-four">4</label>
            
            <input type="radio" id="score-five" value="5">
            <label for="score-five">5</label>
            <br />
            <br />
            <textarea
            name="message-score"
            id="message-score"
            cols="25" rows="6"
            placeholder="Ingresar mensaje..."
            style="resize: none"
            ></textarea>
        </form>`
    )
    $('#save-btn-reservation').text('Enviar calificación');
}