package g;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class main{
  public static void main(String[] args) {
	  final String FileName="D://result.txt";
	  ArrayList<String> list=new ArrayList<String>();
	  list.add("201571030315");
	     String str=new String();
	  int a,b,c;
	   int re = 0;
	  int sum[] = null;
	  int number = new Random().nextInt(10) + 1;  
    Scanner scanner = new Scanner(System.in);
    System.out.print("         开始\n");  
    System.out.print("欢迎进入学习模式\n");  
    System.out.print("请输入算式个数：");  
       int m1 = scanner.nextInt();  
      Random r=new Random();
      c =0;
     for(int i=0;i<m1;i++){
    		 a=(int) (Math.random()*100);
        	 b=(int) (Math.random()*100);
			if (c == 0) {
				str += a ;
				str += "+" ;
				str += b ;
				re = a + b;
			} else if (c == 1) {
				str += a ;
				str += "-" ;
				str += b ;
				re = a - b;
			} else if (c == 2) {
				str += a ;
				str += "*" ;
				str += b ;
				re = a * b;
			} else {
				if(c==4){
					c=0;
					continue;
				}else{
					str += a ;
					str += "/" ;
					str += b ;
					re = a / b;
				}
			}
			c++;
			list.add(str+"="+re);
			str="";
    }
     for ( int i = 0; i < list.size(); i++){
		  System.out.println(list.get(i));
		}
	prints wf=new prints(FileName,list);
   }
   }