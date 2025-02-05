$(document).ready(function(){

    /* 로그인 관련 */
    document.getElementById('islogin').innerHTML=login_false;

    if(isLogined == 'true') {
        document.getElementById('islogin').innerHTML=login_true;
    }

    /* 메뉴 토글 */
    $('#navbardrop_chlg').hover(
      function() {
        $(this).siblings('.dropdown-menu').css('display', 'block');
      },  
      function() {
        $(this).siblings('.dropdown-menu').css('display', 'none');
      }
    );
    $('#navbardrop_lng').hover(
      function() {
        $(this).siblings('.dropdown-menu').css('display', 'block');
      },  
      function() {
        $(this).siblings('.dropdown-menu').css('display', 'none');
      }
    );
});

$(document).on('click', 'button#logout', () => {
    localStorage.setItem('login', null);
});