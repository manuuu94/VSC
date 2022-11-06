
var mycanvas = document.getElementById('mycanvas');
var ctx = mycanvas.getContext('2d');
var snakeSize = 10; 
var w = 350;
var h = 350;
var snake;
var snakeSize = 10;
var pixel;

var drawModule = (function () { 

  var bodySnake = function(x, y) {
        ctx.fillStyle = 'green';
        ctx.fillRect(x*snakeSize, y*snakeSize, snakeSize, snakeSize);
        ctx.strokeStyle = 'black';
        ctx.strokeRect(x*snakeSize, y*snakeSize, snakeSize, snakeSize);
  }

 

  var drawSnake = function() {
      var length = 4;
      snake = [];
      for (var i = length-1; i>=0; i--) {
          snake.push({x:i, y:0});
      }  
  }
    
  var paint = function(){
      ctx.fillStyle = 'lightgrey';
      ctx.fillRect(0, 0, w, h);
      ctx.strokeStyle = 'black';
      ctx.strokeRect(0, 0, w, h);

      btn.setAttribute('disabled', true);

      var snakeX = snake[0].x;
      var snakeY = snake[0].y;

      if (direction == 'right') { 
        snakeX++; }
      else if (direction == 'left') { 
        snakeX--; }
      else if (direction == 'up') { 
        snakeY--; 
      } else if(direction == 'down') { 
        snakeY++; }

      if (snakeX == -1 || snakeX == w/snakeSize || snakeY == -1 || snakeY == h/snakeSize || checkCollision(snakeX, snakeY, snake)) {
         
          btn.removeAttribute('disabled', true);

          ctx.clearRect(0,0,w,h);
          gameloop = clearInterval(gameloop);
          return;          
        }
        
        if(snakeX == pixel.x && snakeY == pixel.y) {
          var tail = {x: snakeX, y: snakeY}; 
          
        } else {
          var tail = snake.pop(); 
          tail.x = snakeX; 
          tail.y = snakeY;
        }
  
        snake.unshift(tail); 

        for(var i = 0; i < snake.length; i++) {
          bodySnake(snake[i].x, snake[i].y);
        } 
        
        
  }

  var createPixels = function() {
    pixel = {
        x: Math.floor((Math.random() * 30) + 1),
        y: Math.floor((Math.random() * 30) + 1)
      }
  }

  var checkCollision = function(x, y, array) {
      for(var i = 0; i < array.length; i++) {
        if(array[i].x === x && array[i].y === y)
        return true;
      } 
      return false;
  }

  var init = function(){
      direction = 'down';
      drawSnake();
      createPixels();
      gameloop = setInterval(paint, 80);
  }


    return {
      init : init
    };

    
}());


(function (window, document, drawModule, undefined) {

  var btn = document.getElementById('btn');
  btn.addEventListener("click", function(){ drawModule.init();});
  
    document.onkeydown = function(event) {
  
          keyCode = window.event.keyCode; 
          keyCode = event.keyCode;
  
          switch(keyCode) {
          
          case 37: 
            if (direction != 'right') {
              direction = 'left';
            }
            console.log('left'); 
            break;
  
          case 39:
            if (direction != 'left') {
            direction = 'right';
            console.log('right');
            }
            break;
  
          case 38:
            if (direction != 'down') {
            direction = 'up';
            console.log('up');
            }
            break;
  
          case 40:
            if (direction != 'up') {
            direction = 'down';
            console.log('down');
            }
            break;
            }
        }
  
  
  })(window, document, drawModule);