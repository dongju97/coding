package 그리드;

import java.util.Scanner;

public class 잃어버린괄호 {
    //P_1541
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");//40+50+74
        for(int i =0; i<str.length;i++){
            int temp = mySum(str[i]);
            if(i==0){
                answer += temp;//가장 앞에 있는 값만 더함
            }else{
                answer -= answer - temp;//뒷부분은 더한 값 빼기
            }
            
        }
    System.out.println(answer);
      
    } //main
    
    //나뉜 그룹의 더하기 연산 수행함수
    private static int mySum(String string) { 
             int sum = 0;
            String temp[] = string.split("[+]");
            for(int i =0; i< temp.length; i++){
                sum += Integer.parseInt(temp[i]);
            }
            return sum;
        
    }
    
}
