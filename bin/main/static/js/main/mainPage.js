$(document).ready(function() {
    // 메인 페이지 챌린지 조회
    $.ajax({
        url: "/challenge/selectAllChallenge",
        method: "GET",
        dataType: "json",
        success: function(data) {
            /*
            * data[0]: 챌린지명,  data[1]: 카테고리명,  data[2]: 등록일자,  data[3]: 인원 수
            * data[4]: 썸네일,  data[5]: 인증주기,  data[6]: 챌린지 기간,  data[7]: 등록한 사용자
            */
            if (data.length != 0) {
                let html = "";
                
                $.each(data, function(index, item) {
                    var startDate = new Date(item[2]);
                    var month = startDate.getMonth() + 1;
                    var day = startDate.getDate();
                    var dayOfWeek = startDate.getDay();
                    var daysOfWeek = ['일', '월', '화', '수', '목', '금', '토'];
                    var dayString = daysOfWeek[dayOfWeek];
                    
                    html += `
                        <div class="All_content__card__e">
                            <a class="ChallengeCard_card">
                                <span><img src="/images/`+item[4]+`" class="ChallengeCard_card_image"/></span>
                                <div class="ChallengeCard_info" >
                                <div class="ChallengeCard_info__subject">
                                    <div class="ChallengeCard_tag">`+item[1]+`</div>
                                </div>
                                <div class="ChallengeCard_info__title">` + item[0] + `</div>
                                <div class="ChallengeCard_info__describe">
                                     챌린지 ·&nbsp;
                                         <div style="font-size:18px;">` + month + `.` + day + `(`+dayString+`)</div> `+ `&nbsp;· `+ item[5] +` 
                                         ·&nbsp;
                                         <div>` + item[6] + `주간</div>
                                                                    
                                </div>
                                <div class="ChallengeCard_info_participants">
                                    <div class="ChallengeCard_participant_image"> 개설자ID`+ `&nbsp; : `+ item[7] + `</div>                                    
                                    &nbsp;&nbsp;<i class="fa-solid fa-people-group" style="color: #bebfc1; padding: 5px 0px;"></i>
                                    <div class="ChallengeCard_member">
                                        <div class="ChallengeCard_member_count">` + item[3] + `명</div>
                                    </div>
                                </div>
                             </div>
                          </a>
                       </div>
                    `;
                });
                
                // html 변수에 저장된 코드를 기존 요소에 추가
                $(".All_content__card__d").append(html);
            }
        },
        error: function(request, status, error) {
            alert("code: " + request.status + "\n" + "message: " + request.responseText + "\n" + "error: " + error);
        }
    })
});