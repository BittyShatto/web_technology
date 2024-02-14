function func(){
    let a = document.getElementById("num").value;
    if(a % 2 == 0){
        document.getElementById("result").innerHTML="Even number";
    }
    else{
        document.getElementById("result").innerHTML="ODD number";
    }
}

function lightoff(){
    document.getElementById("bulb").src="bulboff.gif";
}
function lighton(){
    document.getElementById("bulb").src="bulbon.gif";
}

function sumfun(){
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    let c = a + b;
    document.getElementById("ans").value= c;

}

function passfunc(){
    let a = document.getElementById("pass").value;

    if(a.length < 10){
        document.getElementById("passout").innerHTML="Weak Password!";
    }
    else{
        document.getElementById("passout").innerHTML="Strong Password!";
    }

}