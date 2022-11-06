function validaEliminacion() {
    var retorno = false;
    try {
        if (confirm("¿Esta segura(o) que desea eliminar este dato?"))
        {
            retorno = true;
        }

    } catch (error) {
        retorno = false;
    }
    return retorno
}