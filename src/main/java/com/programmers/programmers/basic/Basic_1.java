package com.programmers.programmers.basic;
import java.util.*;

public class Basic_1 {

    // 공배수
    // 문제 설명 : 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    // 제한사항 : 10 ≤ number ≤ 100, 2 ≤ n, m < 10
    public int solution1() {

        Scanner scanner = new Scanner(System.in);
        // 입력 받기
        int number = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();

        int result = number % n == 0 ? number % m == 0 ? 1 : 0 : 0;
        // solution1 메서드 호출 및 결과 출력
        System.out.println("Result: " + result);
        scanner.close();
        return result;
    }

    // a , b 출력하기
    // 입력 예 ) 4 5
    // 출력 에 ) a = 4
    //          b = 5
    public void solution2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a =" + a + "\nb = " + b);
    }

    // 문자열 숫자 형변환
    public int solution3(String n_str){
        return Integer.parseInt(n_str);
    }

    // 문자열 대소문자 변환
    public void solution4(){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String result = "";

        for(int i=0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
//                sb.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
//                sb.append(Character.toUpperCase(c));
            }else{
                result += c;
//                sb.append(c);
            }
        }

        System.out.println(result);

    }

    // 주사위 문제4
    // 정렬로 해곃 하는법 굿..
    public int solution4(int a, int b, int c, int d) {
//        int answer = 0;
//        int [] number = {a,b,c,d};
//        Map<Integer, Integer> counts = new HashMap<>();
//        for(int num : number){
//            counts.put(num, counts.getOrDefault(num, 0) + 1);
//        }
//
//        if(counts.size() == 1){
//            return 1111 * number[0];
//        }
//
//        if(counts.size() == 2){
//            int p = -1, q = -1;
//            for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
//                if(entry.getValue() == 3){
//                    p = entry.getKey();
//                }else if(entry.getValue() ==1){
//                    q = entry.getKey();
//                }else{
//                    if (entry.getValue() == 2) {
//                        if (p == -1) {
//                            p = entry.getKey();
//                        } else {
//                            q = entry.getKey();
//                            return (p + q) * Math.abs(p - q);
//                        }
//                    }
//                }
//            }
//            return (10 * p + q) * (10 * p + q);
//        }
//
//        if(counts.size() == 3){
//            int p = -1, q = -1, r = -1;
//            for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
//                if(entry.getValue() == 2){
//                    p = entry.getKey();
//                }else if(entry.getValue() == 1){
//                    if(q == -1){
//                        q = entry.getKey();
//                    }else{
//                        r = entry.getKey();
//                    }
//                }
//            }
//            return q * r;
//        }
//
//        if(counts.size() == 4){
//            int min = Integer.MAX_VALUE;
//            System.out.println("min = " + min);
//            for(int num : number){
//                min = Math.min(min, num);
//            }
//            return min;
//        }
        int ans = 0;
        int [] dice = {a,b,c,d};
        Arrays.sort(dice);

        if(dice[0] == dice[3]){
            ans = 1111 * dice[0];
        }else if(dice[0] == dice[2] || dice[1] == dice[3]){
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        }else if(dice[0] == dice[1] && dice[2] == dice[3]){
            ans = (dice[0] + dice[3]) * (dice[3] - dice[1]);
        }else if(dice[0] == dice[1]){
            ans = dice[0] * dice[1];
        }else if(dice[1] == dice[2]){
            ans = dice[1] * dice[2];
        }else if(dice[2] == dice[3]){
            ans = dice[2] * dice[3];
        }else{
            ans = dice[0];
        }

        return ans;
    }

    public void solution5(){
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};

        int [] ans = {};

        for(int i=0; i < query.length; i++){
            if(i % 2 == 0 ){
                arr = Arrays.copyOfRange(arr, 0, query[i]+1 );
                System.out.println(Arrays.toString(arr));  // ans 배열 출력

            }else{
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
                System.out.println(Arrays.toString(arr));  // ans 배열 출력

            }
        }

        System.out.println(Arrays.toString(arr));  // ans 배열 출력
    }

    public static void main(String[] args) {
        Basic_1 a = new Basic_1();
//        System.out.println(a.solution4(6,6,3,3));
        a.solution5();
    }


}
