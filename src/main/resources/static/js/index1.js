document.addEventListener("DOMContentLoaded",function(){

     error = function(type){
        if(type == "email"){
            var value= document.getElementById("email").value;
            if(value == "" || value.length < 3 || value.length > 50){
                document.getElementById("email").style.border = "1px solid red";
                document.getElementById("erroremail").classList.add("fixerror");
            }else{
                document.getElementById("email").style.border = "1px solid green";
                document.getElementById("erroremail").classList.remove("fixerror");
            }}
            if(type == "password"){
                var value= document.getElementById("password").value;
                if(value == "" || value.length <=6 ){
                    document.getElementById("password").style.border = "1px solid red";
                    document.getElementById("errorpassword").classList.add("fixerror");
                }else{
                    document.getElementById("password").style.border = "1px solid green";
                    document.getElementById("errorpassword").classList.remove("fixerror");
                }}
    }
    document.getElementById("signin").onclick = function(){
        error("email");
        error("password");

    }


    
},false)