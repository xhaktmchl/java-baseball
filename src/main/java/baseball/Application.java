package baseball;

import java.util.List;

//1.문한 반복: 진행 여부 1, 2
//2.랜덤 3자리 숫자 저장
//무한 반복
//3.입력
// 입력 예외처리
// 잘못 입력하면 프로그램 종료
//4.야구 판별
//1) 각 자릿수 숫자로 랜덤 숫자 탐색
//만약 숫자와 자릿수 같으면 스트라이크 카운트
//만약 숫자만 같고 자릿수 다르면 볼 카운트
//2) 출력
// 3스트라이크이면 3개의 숫자를 모두 맞히셨습니다! 게임 종료 , // 카운트 초기화, 진행 여부 입력, 중단
// 스트라이크, 볼 모두0이면 낫싱
// 스트라이크0이고 볼 0아니면  출력
// 스트라이크 0 아니거볼 0 이면 출력
// 둘 다 0아닌 경우
public class Application {

    public static void startBaseballGame(){
        String again = "1";
        //1.문한 반복: 진행 여부 1, 2
        //2.랜덤 3자리 숫자 저장
        while (again.equals("1")) {
            if (again.equals("2")) {
                break;
            }
            boolean flag=false;
        }
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        startBaseballGame();
    }
}