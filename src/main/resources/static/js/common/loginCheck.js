/*
* 로그인 여부를 확인합니다.
*
* 로그인 상태인 경우, 로그인 박스에 '마이페이지', '로그아웃' 버튼 생성
* 아니라면 로그인 박스에 '로그인', '회원가입' 버튼 생성
*/

const isLogined = localStorage.getItem("login");

const login_false = `
            <button type="button" class="btn btn-sm btn-habol mx-2 my-2" style="color:white; font-weight:bold;" onclick="javascript:location.href='/user/signup'">회원가입</button>
            <button type="button" class="btn btn-sm btn-habol mx-2 my-2 " style="color:white; font-weight:bold;" onclick="javascript:location.href='/user/login'">로그인</button>`;

const login_true = `
            <button type="button" class="btn btn-sm btn-habol mx-2 my-2" style="color:white; font-weight:bold;" onclick="javascript:location.href='/mypage/mypageHome'">마이페이지</button>
            <button type="button" id= "logout" class="btn btn-sm btn-habol mx-2 my-2 " style="color:white; font-weight:bold;" onclick="javascript:location.href='/api/v1/user/logout'">로그아웃</button>`;