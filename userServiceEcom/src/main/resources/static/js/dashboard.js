/
/
//let text = localStorage.getItem("user");
//let obj = JSON.parse(text);
//console.log(obj.name);
//document.getElementById("user").innerHTML = obj.name;


function getCookie(name) {
    const value = `; ${document.cookie}`;
    const parts = value.split(`; ${name}=`);

    if (parts.length === 2) {
        return parts.pop().split(';').shift();
    }
    return null;
}

// Usage
const token = getCookie('JWT_TOKEN'); // Replace 'yourCookieName' with the actual name of your cookie
console.log(token);