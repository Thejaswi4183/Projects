var objPeople = [
	{ // Object @ 0 index
		email: "thejaswi4uns@gmail.com",
		password: "Hitler#83"
	}
    ]
    
    function getInfo() {
        var username = document.getElementById('email').value
        var password = document.getElementById('password').value
    
        for(var i = 0; i < objPeople.length; i++) {
            // check is user input matches username and password of a current index of the objPeople array
            if(username == objPeople[i].username && password == objPeople[i].password) {
                
                // stop the function if this is found to be true
                return
            }
        }
        console.log("incorrect username or password")
    }