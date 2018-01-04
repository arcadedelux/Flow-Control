public class Percabangan{
	public static void main(String[] args){
	
	String Word="hallo";//memberikan nilai hallo  bertipe string pada variabel Word 
	if(Word == "hallo"){//kondisi pertama jika nilai Word sama dengan hallo maka benilai true,di kondisi ini nilai word sama dengan hallo maka kondisi ini akan bernilai true dan dijalankan oleh sistem
	System.out.println("data sama");//perintah prin kesistem,sistem akan menjalankan perintah ini karena kondisi ini bernilai true
	}else{//perintah jika tidak satupun kondisi yang benilai true,maka statement ini akan otomatis dijalankan oleh sistem
		System.out.println("data beda");//perintah menncetak kesistem,perintah ini diabaikan oleh sistem karena kondisi pertama sudah terpenuhi
	}
	
System.out.println("======================================");
		
		int bil1 = 10;//memberikan nilai 10 pada variabel bil1
        int bil2 = -10;//memberikan nilai -10 pada variabel bil2

        if ( bil1 == bil2 ) {//kondisi pertama jika nilai bil1 sama dengan nilai bil2,tetapi pada kondisi ini nilai bil1 dan bil2 tidak sama maka kondisi ini bernilai false dan diabaikan oleh sistem
            System.out.println("10 == -10");//perintah mencetak kesistem pada kondisi pertama,perintah ini akan diabaikan oleh sistem karena kondisi pertama bernilai false
        } else if( bil1 < bil2 ){//kondisi kedua jika nilai bil1 kurang dari bil2,tetapi nilai bil1 lebih besar dari nilai bil2 maka kondisi kedua ini bernilai false dan akan diabaikan oleh sistem
            System.out.println("10 < -10");//perintah mencetak ke sistem pada kondisi kedua,perintah ini bernilai false maka sistem akan mengabaikanya
        } else {//kondisi dimana tidak ada satupun kondisi yang terpenuhi,maka sistem secara otomatis akan menjalankan perintah dalam ststement ini
            System.out.println("lain-lain");//perintah mencetak ke sistem,perintah ini yang akan dijalankan oleh sistem secara otomatis karena tidak ada satupun kondisi yg terpenuhi
        }
		
System.out.println("=======================================");

		
	 int bil = 10;//memberi nilai 10 pada variabel bil
        if (bil == 10) {//kondisi pertama dimana nilai bil sama dengan 10 maka kondisi ini bernilai true,dan karena nilai bil sama dengan 10 maka kondisi ini bernilai true dan kondisi ini akan dijalankan oleh sistem
            System.out.println("yang ini diksekusi (==)");//perintah mencetak ke sistem,perintah ini yg akan dijalankan oleh sistem karena perintahnya bernilai true
        } else if(bil / 2 == 0){//kondisi ke dua dimana bila nilai bil dibagi dengan 2 sama dengan 0,maka perintah ini akan bernilai true,tetapi nilai bil dibagi 2 tidak sama dengan 0 maka kondisi ini bernilai false dan diabaikan olehs sistem
            System.out.println("yang ini diksekusi (/)");//perintah mencetak ke sistem pada kondisi ke 2,karena perintah ini bernilai false maka sistem akan mengabaikanya
        } else{//kondisi dimana jika tidak ada satupun kondisi yang terpenuhi maka sistem secara otomatis akan menjalankan satement ini
            System.out.println("Lain-lain");//perintah mencetak ke sistem,karena sudah ada kondisi yg terpenuhi oleh sistem maka perintah ini akan diabaikan oleh sistem
        }
System.out.println("==========================================");
		
		 Integer ip = 4;//memberikan nilai 4 pada variabel ip
        switch(ip){//memberikan kondisi pada statement ini sesuai dengan nilai variabel ip
            case 4: System.out.println("A"); break;//sistem akan menjalankan perintah ini karena kondisi sama dengan variabel ip,dan sistem berhenti pada kondis ini
            case 3: System.out.println("B"); break;//sistem akan mengabaikan perintah ini karena tidak sama dengan nilai ip
            case 2: System.out.println("C"); break;//sistem akan mengabaikan perintah ini karena tidak sama dengan nilai ip
            case 1: System.out.println("D"); break;//sistem akan mengabaikan perintah ini karena tidak sama dengan nilai ip
            default: System.out.println("E");//kondisi dimana tidak ada satupun kondisi yng terpenuhi maka sitem secara otomatis akan menjalankan perintah ini,tetapi karena sudah ada kondisi yang terpenuhi maka perintah ini diabaikan oleh sistem
        }
		System.out.println("======================================");
		Integer ip1 = 2;//memberikan nilai 2 pada variabel ip1
        switch(ip1){////memberikan kondisi pada statement ini sesuai dengan nilai variabel ip
            case 4: System.out.println("A"); //sistem akan mengabaikan perintah ini karena tidak sama dengan nilai ip
            case 3: System.out.println("B"); break;//sistem akan mengabaikan perintah ini karena tidak sama dengan nilai ip
            case 2: System.out.println("C"); //sistem akan menjalankan perintah ini karena kondisi sama dengan variabel ip
            case 1: System.out.println("D"); break;//sistem juga akan menjalankan perintah ini meskipun kondisinya tidak sesuai karena pada kondisi sebelumnya tidak ada perintah 'break'
            default: System.out.println("E");//kondisi dimana tidak ada satupun kondisi yng terpenuhi maka sitem secara otomatis akan menjalankan perintah ini,tetapi karena sudah ada kondisi yang terpenuhi maka perintah ini diabaikan oleh sistem
		}
		
		
		
	}
}