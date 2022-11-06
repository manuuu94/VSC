<?php
require_once 'conection.php';
function ConsultaSQL($elQuery)
{
    $conexion = Conecta();
    if (!$conexion->set_charset("utf8")) {
        printf("Error cargando el conjunto de caracteres utf8: %s\n", $conexion->error);
    } else {
        //printf("Conjunto de caracteres actual: %s\n", $conexion->character_set_name());
    }
    $queryDevuelto = $conexion->query($elQuery);
    return $queryDevuelto;
}
?>