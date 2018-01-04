import java.lang.Math;

public class Latihan2{

 public static void main(String[] args){
 
 for(int q = 0;q <=100;q++){
	 if(q % 2 ==0){
 System.out.println("q["+q+"]");
    } 
 }
System.out.println("=================================");	 
	 
for(int w =0; w <= 4; w++){
	for(int e=0;e <= w ;e++){
		System.out.print("*");
	}
	    System.out.println();
 }
	 System.out.println("=======================================");
	 
	 for(int a= 0; a<=7;a++){
		 for(int s=0;s<=a;s++){
			 if(s % 2 == 1){
			 System.out.print("*");
		 }
	}
			if(a %2 == 1){
	 		 System.out.println();
	 }
 }
	 System.out.println("======================================");
	 
	 for(int d=0;d<=10;d++){
	 for(int f=0;f<5;f++){
		if(d % 2 ==0 ){
		 System.out.print(d*f+" ");
	}else {
		 System.out.print(Math.pow(d,f)+" ");
		}
	 }
		 System.out.println();
   }
 }
}
	


