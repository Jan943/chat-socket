var client = null;

function showMesage(value) {
    var newResponse = document.createElement('p');
    newResponse.appendChild(document.createTextNode(value));
    var response = document.getElementById('response');
    response.appendChild(newResponse);
}

function connect() {
    client = Stomp.client('ws://localhost:8080/chat');
    client.connect({}, function (frame){
        client.subscribe("/topic/messages", function(message){
            showMessage(JSON.parse(message).value())
        });
    })

}