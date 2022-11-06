addEventListener('load', cargaInicial);

function cargaInicial(){
    cargaProfesores();
    cargaDias();
    darClick();
}

function cargaProfesores() {
    var TextoJSON = '{ "Profesores" : [' +
    '{ "cedula":"123456789" , "nombre":"Eduardo González Paniagua" },' +
    '{ "cedula":"567891234" , "nombre":"Gerardo Alberto Gamboa Acosta" },' +
    '{ "cedula":"987654321" , "nombre":"Wilberth Molina Pérez" } ]}';
//----------------------------------------------        
LlenaProfesorJson(TextoJSON);
}

function LlenaProfesorJson(TextoJSON){
    var elValor;
    var elHTML;
    var ObjetoJSON = JSON.parse(TextoJSON);
    for(i=0; i < ObjetoJSON.Profesores.length; i++){
        elValor = ObjetoJSON.Profesores[i].cedula;
        elHTML= ObjetoJSON.Profesores[i].nombre;
        var opt = document.createElement("option");
        opt.value = elValor;
        opt.innerHTML = elHTML;
        document.getElementById("idProfesor").appendChild(opt);
    }
}

function cargaDias() {
    TextoXML="<Semana>";
    TextoXML=TextoXML+"<dia>";
    TextoXML=TextoXML+"<numero>1</numero>";
    TextoXML=TextoXML+"<valor>Lunes</valor>";
    TextoXML=TextoXML+"</dia>";
    TextoXML=TextoXML+"<dia>";
    TextoXML=TextoXML+"<numero>2</numero>";
    TextoXML=TextoXML+"<valor>Martes</valor>";
    TextoXML=TextoXML+"</dia>";
    TextoXML=TextoXML+"<dia>";
    TextoXML=TextoXML+"<numero>3</numero>";
    TextoXML=TextoXML+"<valor>Miércoles</valor>";
    TextoXML=TextoXML+"</dia>";
    TextoXML=TextoXML+"<dia>";
    TextoXML=TextoXML+"<numero>4</numero>";
    TextoXML=TextoXML+"<valor>Jueves</valor>";
    TextoXML=TextoXML+"</dia>";
    TextoXML=TextoXML+"<dia>";
    TextoXML=TextoXML+"<numero>5</numero>";
    TextoXML=TextoXML+"<valor>Viernes</valor>";
    TextoXML=TextoXML+"</dia>";
    TextoXML=TextoXML+"</Semana>";
    //----------------------------------------------
    if (window.DOMParser)
    {
      parser=new DOMParser();
      ObjetoXML=parser.parseFromString(TextoXML,"text/xml");
    } else {
      ObjetoXML=new ActiveXObject("Microsoft.XMLDOM");
      ObjetoXML.async=false;
      ObjetoXML.loadXML(TextoXML);
    }   
    LlenaDiasXML(ObjetoXML);
}

function LlenaDiasXML(ObjetoXML){
    var elValor;
    var elHTML;
    var EtiquetaXML = ObjetoXML.getElementsByTagName("dia");
    for(i=0; i < EtiquetaXML.length; i++){
        elValor = EtiquetaXML[i].getElementsByTagName("numero")[0].childNodes[0].nodeValue;
        elHTML = EtiquetaXML[i].getElementsByTagName("valor")[0].childNodes[0].nodeValue;
        var opt = document.createElement("option");
        opt.value = elValor;
        opt.innerHTML = elHTML;
        document.getElementById("idDia").appendChild(opt);
    }
}

//evento en javascript para general un almacenamiento 
function darClick(){
    var elSubmit = document.getElementById('btEnviar');
    elSubmit.addEventListener('click', Almacenamiento);
}

function setCookie(cname,cvalue, exdays){
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function Almacenamiento(){
    var response = false;
    try {
        console.log("Se inicia el almacenamiento de la información!")
        var alumno = document.getElementById('nombreAlumno').value;
        var elComboProfesor = document.getElementById("idProfesor");
        var CedulaProfesor = elComboProfesor.options[elComboProfesor.selectedIndex].value;
        var NombreProfesor = elComboProfesor.options[elComboProfesor.selectedIndex].text;
        var elComboDia = document.getElementById("idDia");
        var dia = elComboDia.options[elComboDia.selectedIndex].value;
        var diaDescripcion = elComboDia.options[elComboDia.selectedIndex].text;
        var hora = document.getElementsByName('hora');
        var valHora;
        for (var i = 0, len = hora.length; i <length; i++){
            if(hora[i].checked){
                valHora = hora[i];
                break;
            }
        }
        var asunto = document.getElementById('asunto').value;

        setCookie('Alumno', alumno, 30);

        sessionStorage.setItem("Hora", valHora);
        sessionStorage.setItem("Asunto", asunto);

        localStorage.setItem("Id_Dia", dia);
        localStorage.setItem("DiaDeSemana", diaDescripcion);
        localStorage.setItem("Identificacion_Profesor", CedulaProfesor);
        localStorage.setItem("Nombre_Profesor", NombreProfesor);
        console.log("La informacion se almaceno correctamente!")
        response = true;
    } catch(error){
        console.error(error);
    }
    return response;
}

function Anuncios() {
    return TextoJSON = '{ "Anuncios" : [' +
        '{ "id":"1" , "mensaje":"!Bienvenido al curso SC-502!" },' +
        '{ "id":"2" , "mensaje":"Para la Universidad es un placer atenderles" },' +
        '{ "id":"3" , "mensaje":"Solicite su tutoría" } ]}';
}
function RetornaAnuncio(){
    var elValor = "";
    var ObjetoJSON = JSON.parse(Anuncios());
    if (ObjetoJSON.Anuncios.length > 0) {
        var idAnuncio = Math.floor((Math.random() * ObjetoJSON.Anuncios.length))
        elValor = ObjetoJSON.Anuncios[idAnuncio].mensaje;
    }
    return elValor;
}
function MostrarAnuncios() {
    var horaReloj = "";
    var Digital = new Date();
    var Dia = Digital.getDate();
    var Mes = Digital.getMonth();
    var Ano = Digital.getFullYear();
    var hours = Digital.getHours();
    var minutes = Digital.getMinutes();
    var segundos = Digital.getSeconds();
    var dn = "am";
    if (hours == 12) dn = "pm"
    if (hours > 12) {
        dn = "pm";
        hours = hours -12;
    }
    if (hours == 0) hours = 12
    if (hours.toString().length == 1)
        hours = "0" + hours;
    if (minutes <= 9)
        minutes = "0" + minutes;
    var timestampt = new Date().getTime();
    var canvas = document.getElementById("anuncio");
    var ctx = canvas.getContext("2d");
    if (segundos == 0) { 
        ctx.clearRect(0, 0, canvas.width, canvas.height);
        ctx.font = "30px Arial";
        ctx.strokeText(RetornaAnuncio(), 10, 50);
    }else
        if (segundos > 10) { 
            ctx.clearRect(0, 0, canvas.width, canvas.height);
            horaReloj = Dia + "/" + Mes + "/" + Ano + ", " + hours + ":" + 
            minutes + " " + dn;
            ctx.font = "30px Arial";
            ctx.strokeText(horaReloj, 10, 50);
        }
        requestAnimationFrame(MostrarAnuncios);
    }
    requestAnimationFrame(MostrarAnuncios);
    

