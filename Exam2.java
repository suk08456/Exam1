public class Exam2 {
    public static void main(String[] args) {
        // 높이를 입력해주세요 : 3                // 출력
        int height = 3;

        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *

         ***

         *****

         */

        // 높이를 입력해주세요 : 5

        int height2 = 5;

        for(int i = 1; i <= height2; i++){
            for(int j = 1; j <= height2 - i; j++){
                System.out.print(" ");
            }for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7

        int height3 = 7;

        for(int i = 1; i <= height3; i++){
            for(int j = 1; j <= height3 - i; j++){
                System.out.print(" ");
            }for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

    }

}



