public class FlowControl{

public static void main (String[] args){
	Integer bill = 10; //memberikan nilai 10 pada variabel bill
	if(bill == 10){ //sistem akan mencek apakah nilai variabel bill sama dengan 10
		System.out.println("Bilangan sama");//sistem akan mencetak perintah ini karena nilai variabel bill sama dengan 10
		
		}
		
		System.out.println("==================================================");
		
 Integer value =20;// memberikan nilai 20 pada variabel value
 switch(value){//memberikan kondisi pada statement switch sama dengan nilai dari variabel value
 case 10://kondisi dimana nilai sama dengan 10
 System.out.println("Nilai sama dengan 10");//perintah mencetak ke sistem jika kondisi nilai variabel value sama dengan 10
 break;// perintah berhenti jika kondisi sudah terpenuhi
 case 20 :// kondisi dimana nilai sama dengan 20
 System.out.println("Nilai sama dengan 20");//perintah mencetak ke sistem jika kondisi nilai variabel value sama dengan 20
 break;//perintah berhenti jika kondisi sudah terpenuhi
 default : System.out.println("Nilai tidak ada yg sama");//perintah mencetak ke sistem jika tidak ada satupun kondisi yang terpenuhi

 }
 System.out.println("====================================================");
 
 
 //=====Perulangan===========
 
 for(int i = 1; i < 11; i++){// perintah perulangan yang akan di eksekusi oleh sistem  dengan kondisi variabel i bernilai 1||dan perulangan dilakukan sebanyak jika nilai i kurang dari 11 dengan variabel i terus bertambah 
 System.out.println("Saya berulang sebanyak" + i);//perintah mencetak ke sistem
 }
 System.out.println("================================");
 
 Integer a = 0;//memberikan nilai 0 ke variabel a 
 while(a < 10){//kondisi perulangan yang akan di lakukan sampai nilai a kurang dari 10
 System.out.println("Saya berulang sebanyak" + a);//perintah mencetak ke sistem sampai kondisi terpenuhi
 a++;//dengan variabel a yang terus bertambah
 }
 System.out.println("======================================");
 
 Integer b = 0;//memberikan nilai 0 pada variabel b
 do{//sistem akan melakukan perintah print ke sistem
 System.out.println("Sayaberulang sebanyak "+ b);//sistem akan memlakukan perintah mencetak sampai kondisi terpenuhi
 b++;//dengan variabel b yang terus bertambah
 }while ( b < 10);//kondisi perulangan yang akan dilakukan oleh sistem sebanyak nilai variabel b kurang dari 10
 
	}

}


