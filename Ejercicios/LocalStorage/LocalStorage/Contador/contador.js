function contadorClicks() {
    // Si existe contador se incrementa y sino se inicializa
    if (localStorage.contador) {
        // Se convierte el contador a entero porque por defecto es una cadena
        localStorage.contador = parseInt(localStorage.contador) + 1;
    } else {
        localStorage.contador = 1;
    }
    document.getElementById("contador").value = localStorage.contador + " Clicks";
}

function resetearClicks() {
    localStorage.removeItem("contador");
    document.getElementById("contador").value = "0 Clicks";
}