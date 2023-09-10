let primer = 0;
let segundo = null;
let simbolo = null;
let eleccion = false;
let resultado = null;

document.getElementById("prime").innerHTML = primer;

function sumar(elec) {
  if (eleccion) {
    if (segundo === null) {
      segundo = elec;
    } else {
      segundo = segundo * 10 + elec;
    }
    document.getElementById("segund").innerHTML = segundo;
  } else {
    primer = primer * 10 + elec;
    document.getElementById("prime").innerHTML = primer;
  }
}

function elegir(s) {
  if (segundo !== null) {
    calcular();
    primer = resultado;
    document.getElementById("prime").innerHTML = primer;
    segundo = null;
  }
  eleccion = true;
  simbolo = s;
  document.getElementById("simbolo").innerHTML = simbolo;
}

function calcular() {
  switch (simbolo) {
    case "+":
      resultado = primer + segundo;
      break;
    case "-":
      resultado = primer - segundo;
      break;
    case "X":
      resultado = primer * segundo;
      break;
    case "/":
      resultado = primer / segundo;
      break;
    default:
      break;
  }
  document.getElementById("prime").innerHTML = resultado;
  primer = resultado;
  segundo = null;
  simbolo = null;
  eleccion = false;
  document.getElementById("segund").innerHTML = "";
  document.getElementById("simbolo").innerHTML = "";
}

function borrar() {
  primer = 0;
  segundo = null;
  simbolo = null;
  eleccion = false;
  resultado = null;
  document.getElementById("prime").innerHTML = primer;
  document.getElementById("segund").innerHTML = "";
  document.getElementById("simbolo").innerHTML = "";
}
