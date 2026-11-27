// 여기서부터는 자바스크립트다. 태그는 사용 X
// 1. 어떤 버튼이 눌렸는지 찾기위해
//      .treasure-card 셀렉터를 찾아야함
const cards = document.querySelector(".treasure-card");

// 2. 버튼을 누르면 문제를 출력할 패널 찾기
const questionText = document.querySelector("#question-text");

// 3. 어떤 버튼을 눌렀는지 찾기
//      모든 버튼을 조사해야하므로 루프가 필요
// 4. cards는 내부적으로 배열로 관리되므로
//      배열.forEach(처리할 기능(=함수란 뜻)) 를 이용하여 구현

// "9장의 카드들"에서 "한 장의 카드"를 선택(treasure-card.open)
cards.forEach(function(card){  // 각각의 카드를 찾는 루프가 내장
    // 1. 일단 카드마다 이벤트가 발생하면 처리할 이벤트핸들러 함수를 정의(익명함수)
    // function(card) : 여기서 쓰이고 다시 안 쓰일 함수
    // function card_choice(card) : 다른 곳에서 재사용
    //        그런데 홈페이지는 페이지별로 실행하기때문에 다른 곳에서 재사용 의미 없음
    // 요즘은 function(card) 형식. 즉 익명함수 또는 람다함수가 대세
    // forEach는 for(;;)(...)을 말함
    // cards가 treasure_card 9개를 가지고 있으므로 cards의 각 treasure_card 한 장을 뽑는 방법
    // card는 각 treasure-card 한 장을 의미
    // 자바스크립트는 함수를 데이터로 내부적으로 간주함
    // let alertFun = function() {alert("안녕")}
    // alertFun(); // alertFun() 함수로 실행시킴
    
        card.addEventListener("click", function() {
        // 2. 정의된 함수를 클릭이벤트와 연결 등록
        // card는 보물상자 버튼 하나
            card.classList.add("open")
            questionText.textContent = "문제가 출제됨. 정답을 맞혀보시오."
        });
        // 3. 이벤트 처리 함수를 구현
        
    }
    
); 