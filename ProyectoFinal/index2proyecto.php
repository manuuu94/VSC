<!DOCTYPE html>
<html lang="en">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proyecto : AutoLavado</title>
    <link rel="stylesheet" type="text/css" href="css/proyecto.css">
</head>
<body>
<!--CABEZA - GRID-->
    <div class="header grid-container">
      <a href="index.html" style="grid-column: 1"><logo></logo></a>
      <a href="index.html" style="grid-column: 3; text-align: center;">AUTOLAVADO - LAVADOS</a>
      <a href="#" style="grid-column: 5; text-align: right;"><cart></cart> </a>
    </div>

<!-- Navigation Bar - FLEX-->
      <div class="navbar">
        <a href="index.html">INICIO</a>

        <a href="index2proyecto.php">MENÚ DE LAVADOS</a>  
        <!--DROPDOWN-->
        <div class="dropdown">
          <button class="dropbtn">INVENTARIOS</button>
          <div class="dropdown-content">

            <a href="index2.html">Accesorios de Limpieza</a>
            <a href="#">Accesorios de Mantenimiento</a>
            <a href="#">Otros productos</a>

          </div>
        </div>
        <a href="index3.html">SOBRE NOSOTROS</a>
      </div>

<!--CENTRO DEL CUERPO-->
      <div>
      <p></p>

<?php
require_once 'consultaBD.php';
$sqlQuery = "SELECT id, descripcion, precio FROM lavados";
$resultSet = ConsultaSQL($sqlQuery);
?>

<table id="table" class="table table-dark" style="width:90%; margin-left: 5%">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col" style="text-align:center">Descripcion</th>
      <th scope="col" style="text-align:right">Precio</th>
      <th scope="col" style="text-align:right"></th>
    </tr>
  </thead>


  <?php
if($resultSet)
{
  foreach($resultSet as $row)
  {
?>+

  <tbody>
    <tr>        
		   <td> <?php echo $row ['id']; ?> </td>
		   <td style="text-align:center"><?php echo $row ['descripcion']; ?></td>
		   <td style="text-align:right"><?php echo $row ['precio']; ?></td>

       <td style="text-align:right">
       <button type="button" class="btn btn-primary" >ADD TO CART</button>


        <!-- <input type="submit" name="AñadirCarrito" value="Añadir al Carrito" id="AñadirCarrito" onclick="recoge()"/> -->
       </td>
    </tr> 
		<?php } ?>
  </tbody>

<?php
  }
  else
  { 
    echo "no record found";
  }
?>

</table>
</div>








<!--PIE DE PÁGINA-->
<div>
        <footer>
          <a style="grid-column: 1">
            <img src="img/facebookflat.png" align="left" hspace="1" style="width:40px; height:40px" class="miLink" alt="Facebook" id="FacebookLink" onclick="window.open('https://www.facebook.com/')">
            <img src="img/youtubeflat.png" align="left" hspace="1" style="width:40px; height:40px" class="miLink" alt="YouTube" id="YouTubeLink" onclick="window.open('https://www.youtube.com/')">
          </a>
          <a style="grid-column: 2; text-align: center;"> Tibas, Calle 16 - Teléfonos: (506) 2244 2244| (506) 8800 8800</a>
          <a style="grid-column: 3; text-align: right;"> autolavado@gmail.com<br>
            <img src="img/emailflat.png" align="right" hspace="1" style="width:40px; height:40px" class="miLink" alt="email" id="emailLink" onclick="window.open('mailto:autolavado@gmail.com')">
          </a>
        </footer>
      </div>


</body>
</html>