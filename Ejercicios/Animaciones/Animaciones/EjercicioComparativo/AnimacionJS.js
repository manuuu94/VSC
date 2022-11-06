var botonAnimado = document.getElementById('myButton');
var boton = document.getElementById('Alerta');
var posIzq = 0;
var flag = true;

function moverBoton (timestamp){
    var timestamp = new Date().getTime()
    if(flag){
      posIzq += 10;  
    } else {
      posIzq -= 10;
    }
  
    var element = document.getElementsByTagName('body')[0],
    style = window.getComputedStyle(element),
    marginTop = parseInt(style.getPropertyValue('margin-top'));

    if(posIzq > (element.offsetWidth - (boton.offsetWidth + botonAnimado.offsetWidth + ( 2* marginTop)))){
      flag = false;
    } else if(posIzq == 0) {
      flag = true;
    }
    
    botonAnimado.style.marginLeft = posIzq + 'px';
    requestAnimationFrame(moverBoton);
};

requestAnimationFrame(moverBoton);

