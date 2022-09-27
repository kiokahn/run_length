# JAVA Test code

by 안기옥(kiokahn@gazzi.ai, kiokahn76@gmail.com, 주식회사 가치랩스, http://gazzi.ai)     
Tested :  MS WIndows 10 Pro, Eclipse IDE for Java Developers Version: 2022-06 (4.24.0)    

## 문제 
    
런 렝스 부호화(Run-length encoding, RLE) 또는 런 길이 부호화는 매우 간단한 비손실 압축 방법으로, 데이터에서 같은 값이 연속해서 나타나는 것을 그 개수와 반복되는 값만으로 표현하는 방법이다. 예를 들어서, 흰 바탕에 검은 글자가 나오는 스크린을 생각하면 이 스크린에는 연속된 흰 픽셀이 많이 나타날 것이다. 이러한 스크린의 한 스캔 라인이 다음과 같다고 가정하자. (흰 픽셀을 W로 표시하고 검은 픽셀을 B로 표시한다.)    
“WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW”    
위의 데이터를 간단한 반복 길이 부호를 사용해서 압축하면 다음과 같은 결과를 얻을 수 있다.    
“12WB12W3B24WB14W    
이는 '12개의 W, (한 개의) B, 12개의 W, 3개의 B, 24개의 W, (한 개의) B, 14개의 W'로 해석한다    
주어진 문자열에 대하여 상기 부호화의 결과가 출력 되도록 프로그램하시오.    

## 조건
함수 run_length_encoding() 구현 조건 -> for문을 이용    
함수 print_current_code(char code, int count) 구현 조건 -> “code”에 따라 switch문 사용하여 화면 출력. 단, (count==0)일 경우 "Encording error!" 출력 후 프로그램 종료    

## 출력
```
Run-length encoding(RLE) Test
Input data :WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWW WWWWWWWWWWBWWWWWWWWWWWWWW
Encording result : 12WB12W3B24WB14W
```

## 초기 코드
```
public class run_length {
  public static void print_current_code(char code, int count)
  {
  }
  public static void run_length_encoding( String screen )
  {
  }
  public static void main(String[] args)
  {
    String screen = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW" ;
    System.out.println("Run-length encoding(RLE) Test");
    System.out.println("Input data : " + screen );

    System.out.print("Encording result : ");
    run_length_encoding(screen);
  }
}

```