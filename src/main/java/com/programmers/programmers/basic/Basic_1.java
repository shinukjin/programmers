package com.programmers.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

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

    private void solution6(){
        String answer = "";
        String code = "abc1abc1abc";
        int mode = 0;

        for(int i=0; i < code.length(); i++){
            char c = code.charAt(i);

            if(mode == 0){
                if(c != '1' && i % 2 == 0){
                    answer = answer.concat(String.valueOf(c));
                }else if(c == '1'){
                    mode = 1;
                }
            }else{
                if(c != '1' && i % 2 == 1){
                    answer = answer.concat(String.valueOf(c));
                }else if(c == '1'){
                    mode = 0;
                }
            }
        }
        System.out.println("answer = " + answer);
    }


    /*
        문제 설명
        정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
        만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

        제한사항
        1 ≤ l ≤ r ≤ 1,000,000
    */
    private void solution7(){
        int[] answer = {};
        int l = 6;
        int r = 10;

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=l; i <= r; i++){
            String num = Integer.toString(i);
            boolean isValid = true;
            for(char c : num.toCharArray()){
                if(c != '5' && c!='0'){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                result.add(Integer.parseInt(num));
            }
        }

        if(result.isEmpty()){
            result.add(Integer.parseInt("-1"));
        }
        System.out.println("answer = " + result.toString());
    }

    private void solution8(){
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        int americano = 0;
        int latte = 0;
        int sum = 0;

        for (String o : order) {
            if(o.contains("americano") || o.contains("anything")){
                sum += 4500;
            }
            if(o.contains("latte")){
                sum += 5000;
            }
        }

        System.out.println("sum = " + sum);
    }

    private void solution9(){
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance ={false, true, true, true, true, false, false};
        int[] sort = new int[rank.length];

        for(int i=0; i < rank.length; i++){
            if(attendance[i]){
                sort[i] = rank[i];
            }else{
                rank[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(rank);

        int sum = 0;
        for(int j=0; j < sort.length; j++){
            if(rank[0] == sort[j]){
                sum += j * 10000;
            }
            if(rank[1] == sort[j]){
                sum += j * 100;
            }
            if(rank[2] == sort[j]){
                sum += j;
            }
        }
        System.out.println("sum = " + sum);
    }

    public void solution10(){
        int[]  array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int sum = 0;

        for(int a : array){
            sum += a == n ? 1 : 0;
        }
        System.out.println("sum = " + sum);
    }

    public void solution11(){
        String num = "-1 1 2 3 4";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String [] numArray = num.split(" ");

        for(String n : numArray){
            int curValue = Integer.parseInt(n);
            if(max < curValue){
                max = curValue;
            }

            if(curValue < min){
                min = curValue;
            }
        }

        String result = min + " " + max;
        System.out.println("result = " + result);

    }

    /**
     * 최솟값 구하기
     * int[] numA, int[] numB
     * numA[i] x numB[j]의 곱의 합이 최솟값 구하기
     * */
    public void solution_makeMin(){
        int[] numA = {1,4,2};
        int[] numB = {5,4,4};
        int sum = 0;

        Arrays.sort(numA);
        Arrays.sort(numB);

        for(int i=0; i < numA.length ; i++){
            sum = sum + (numA[i] * numB[numB.length-1-i]);
        }
        System.out.println("sum = " + sum);
    }

//    public void solution_kakaoBrian(){
//        String sentence = "SpIpGpOpNpGJqOqA";
//        StringBuilder sb = new StringBuilder();
//        Set<Character> lowercaseSet = new HashSet<>();
//        char[] charSentence = sentence.toCharArray();
//
//        // 소문자만 Set에 추가
//        for (char c : charSentence) {
//            if (Character.isLowerCase(c)) {
//                lowercaseSet.add(c);
//            }
//            }
//        // Set에 있는 소문자들만 StringBuilder에 추가
//        for (char c : lowercaseSet) {
//            sb.append(c);
//        }
//        // 소문자 배열 생성
//        char[] lowerCharArray = sb.toString().toCharArray();
//
//        StringBuilder sb2 = new StringBuilder(sentence);
//
//        for(int j=0; j<lowerCharArray.length; j++){
//
//            if(j>0){
//                int index = sb2.indexOf(String.valueOf(lowerCharArray[j]));
//                System.out.println("index = " + index);
//                sb2.insert(index, " ");
//            }
//            sb2 = new StringBuilder(sb2.toString().replace(String.valueOf(lowerCharArray[j]), ""));
//        }
//
//        System.out.println("sentence = " + sb2);
//
//    }

    public void solution12(String s){
        // 스택을 사용하여 괄호의 짝을 맞추기
        Stack<Character> stack = new Stack<>();

        // 문자열을 순회하며 괄호를 처리
        for (char ch : s.toCharArray()) {
            // 열린 괄호 '('는 스택에 넣음
            if (ch == '(') {
                stack.push(ch);
            }
            // 닫힌 괄호 ')'는 스택에서 열린 괄호 '('를 하나 꺼냄
            else if (ch == ')') {
                // 스택이 비어 있으면 올바르지 않은 괄호임
                if (stack.isEmpty()) {
                    System.out.println("false = " + false);
                }
                stack.pop();  // 열린 괄호 '('를 스택에서 제거
            }
        }
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }

    public static void main(String[] args) {
        Basic_1 a = new Basic_1();
//        System.out.println(a.solution4(6,6,3,3));
//        a.solution_kakaoBrian();
    }


}
