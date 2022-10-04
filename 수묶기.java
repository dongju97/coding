package 그리드;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수묶기{
    //P1744
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        //양수는 내림차순 저장하기
        PriorityQueue<Integer> pluspq = 
            new PriorityQueue<>(Collections.reverseOrder());
        //음수 큐
        PriorityQueue<Integer> minuspq = new PriorityQueue<>();

        int one =0;
        int zero =0;

        //분리해서 넣어주기
        for(int i=0; i<N; i++){
            int data = sc.nextInt();
            if(data>0){
                pluspq.add(data);
            }else if(data == 1 ){
                one++;
            }else if( data == 0){
                zero++;
            }else{
                minuspq.add(data);
            }
        }//for

        int sum = 0;

        //양수끼리 큰 값부터 곱하기
        while(pluspq.size() >1 ){
            int first = pluspq.remove();
            int second = pluspq.remove();
            sum = first * second;
        }
        //남았으면 마지막 한 값 마저 더해주기
        if(!pluspq.isEmpty()){
            sum += pluspq.remove();
        }

        //이제 음수 처리하기
        while(minuspq.size() > 1){
            int first = minuspq.remove();
            int second = minuspq.remove();
            sum += first * second;
        }
        //남은 음수는 0이 있으면 0을 곱해주고 없으면 그냥 더하기
        if(!minuspq.isEmpty()){
             if(zero == 0){
                sum +=  minuspq.remove();
            }
        }
       
        //1처리하기
        sum += one;
        System.out.println(sum);
    }
}