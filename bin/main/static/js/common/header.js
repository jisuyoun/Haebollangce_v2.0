/*
$(document).ready(function(){

    document.getElementById('islogin').innerHTML=login_false;

    if(isLogined == 'true') {
        document.getElementById('islogin').innerHTML=login_true;
    }

});
*/
$(document).on('click', 'button#logout', () => {
    localStorage.setItem('login', null);
});