function validate(){
	
	var flag=true;
	
	var usrName=document.getElementById("userName").value;
	if(usrName==""|| userName==null){
	document.getElementById("usrErr").innerHTML="* Please enter UserName";
	flag=false;
	}else{
		document.getElementById("usrErr").innerHTML="";
		
	}
	
	var usrPwd=document.getElementById("userPwd").value;
	if(usrPwd==""|| usrPwd==null){
	document.getElementById("pwdErr").innerHTML="* Please enter Password";
	flag=false;
	}else{
		document.getElementById("pwdErr").innerHTML="";
		
	}
	
	
	return flag;
}