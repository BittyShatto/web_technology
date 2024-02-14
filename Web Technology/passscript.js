function passfun(){
    var a;
    a=document.getElementById("pass").value;
    
    if(a.length<10){
        document.getElementById("result").innerHTML="Weak Password";
    }
    else{
        document.getElementById("result").innerHTML="Strong Password";
    }
}