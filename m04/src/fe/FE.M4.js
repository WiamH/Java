var carta = [];
var pedido = [];

function guardarPlato() {

    var nombre = document.querySelector("#nombrePlato").value;
    var precio = document.querySelector("#precioPlato").value;

    if(nombre != "" && precio != 0 ){
        carta.push({nombre, precio});
        document.querySelector("#seleccionarPlato").options[carta.length] = new Option(nombre, precio);
        window.alert("Plato guardado");
    }
    
    document.querySelector("#nombrePlato").value = "";
    document.querySelector("#precioPlato").value = "";
}

function verCarta(){
    var cartaFinal = "LOS PLATOS QUE OFRECEMOS HOY SON:<br>";
    carta.forEach(function(plato){
        cartaFinal += plato.nombre + ":" + plato.precio + " € <br>";
    })

    document.querySelector("#menu").innerHTML = cartaFinal;
}

function anyadirPedido(){
    var select = document.querySelector("#seleccionarPlato");
    if(document.querySelector("#seleccionarPlato").value != ""){
        pedido.push({precio:select.value, nombre:select.options[select.selectedIndex].text});
    } else {
        window.alert("Selecciona plato, hombre!")
    }

}

function acabarPedido(){
    var cuentaTotal = 0;
    var cuenta = "Detalles del pago: <br>";
    pedido.forEach(function(plato){
        cuenta += plato.nombre + ":" + plato.precio + " € <br>";
        cuentaTotal += parseInt(plato.precio);
    })

    document.querySelector("#cuentaFinal").innerHTML = cuenta + cuentaTotal +"€ Total a ingresar a mi cuenta de paypal =) <br>";
}

function IrACrear(){
    document.querySelector(".main").style.display = "none";
    document.querySelector(".crear").style.display = "block";
}

function IrAInicio(){
    document.querySelector(".main").style.display = "block";
    document.querySelector(".crear").style.display = "none";
    document.querySelector(".ver").style.display = "none";
    document.querySelector(".pedido").style.display = "none";
}


function IrAVer(){
    document.querySelector(".main").style.display = "none";
    document.querySelector(".ver").style.display = "block";
}

function IrAPedido(){
    document.querySelector(".main").style.display = "none";
    document.querySelector(".pedido").style.display = "block";
}





