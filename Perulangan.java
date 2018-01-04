public class Perulangan {
    public static void main(String[] args){
        Integer times = 100;//memberikan nilai 100 pada variabel times
        for(int i = 0; i < times ; i++){//memberikan perintah perulangan dimulai dengan nilai i sama dengan 0,dengan kondisi batas perulangan i kurang dari 100,dan i yang terus bertambah
            System.out.println("Saya minta maaf, saya akan lebih rajin dalam bejar dan tidak akan bolos lagi");//perintah ini akan di lakukan sebanyak 100x oleh sistem
		}
		System.out.println("==============================");
		
		for(int j = 0; j < 10; j++){//memberikan perintah perulangan dimulai dengan nilai j sama dengan 0,dengan bantas perulangan j lebih kecil dari 10,dengan j yang terus bertambah
            for(int k = 0; k < 5; k++){//memberikan perintah perulangan dengan nilai k sama dengan 0,dan batas perulangannya k lebih kecil dari 5,dengan k yang terus bertambah dan perintah ini akan diulangi sebanyak 10 kali
                System.out.print("k["+ k + "], ");//perintah ini akan mencetak k di ulang sebanyak 5 kali pada di line yang sama
            }
                System.out.println("j["+ j  + "]");//perintah ini akan mencetak j di ulang sebanyak 10 kali pada di line yang berbeda
        }
		
		System.out.println("========================================");
		
		for(int l = 0; l < 10; l++){//memberikan perintah perulangan dimulai dengan nilai l sama dengan 0,dengan bantas perulangan l lebih kecil dari 10,dengan l yang terus bertambah
            if( l == 5 ){//meberikan perintah jika l sama dengan 5 maka perintah ini akan di jalankan oleh sistem
                System.out.println("Sekarang ada di posisi ke 5");//perintah ini akan dijalan kan oleh sistem jika perulangan telah mencapai l ke 5
            }
		}
		System.out.println("====================================");
		
		
		 boolean isRepeat = true;//memberikan variabel isRepeat yang bertipe boolean bernilai true
		 if(isRepeat) {//dengan kondisi pertama bernilai true
            for(int q = 0; q < 10; q ++){//memberikan perintah perulangan dimulai  dengan nilai q sama dengan 0,dengan bantas perulangan q lebih kecil dari 10,dengan q yang terus bertambah,perinntah ini akan dijalan kan oleh sistem karena perintah nya bernilai true 
                System.out.println("Sekarang ada di index ke "+ q);//perintah mencetak kesistem,akan dijalankan sebanyak 10 kali
            }
        }
		System.out.println("====================================");

		for(int w = 10 ; w > 0; w--){//memberikan perintah perulangan ,dimulai dengan nilai w sama dengan 10,dengan bantas perulangan w lebih besar dari 0,dengan w yang terus berkurang
            System.out.println("Indexnya "+ w);//perintah mencetak ke sistem,maka sistem akan mencetak dari index ke 10 sampai ke index ke 1
        }
		System.out.println("========================================");
		
		 Integer e = 0;//memberikan nilai 0 pada variabel e
        do {//sistem akan mengerjakan perintah ini terlebih dahulu
            System.out.println("Sekarang ada di index ke " + e++);//perintah mencetak ke sistem dimulai dari index ke 0
        } while (e < 10);//kondisi perulangan akan berhenti sampai 9 kali
		
		System.out.println("========================================");
		
		 Integer f = 0;//memberikan nilai 0 ke variabel f
        while (f < 10){//perintah perulangan sampai dengan nilai f kurang dari 10
            System.out.println("Sekarang ada di index ke " + (f++));//perintah mencetak ke sistem sebanyak 9 kali
        }        
		System.out.println("==============================================");
		
		for(int g = 0; g < 100; g++){//perulangan dimulai dengan g sama dengan 0 dan di ulang sebanyak g lebih kecil dari 100,dan g terus bertambah
            if(g == 5) break;//kondisi dimana g sama dengan 5 maka pada index ke lima perulangan berhenti
            System.out.println("Saya berada di index ke " + g);//perintah mencetak kesistem dengan perulangan sebanyak 5 kali
        }
		System.out.println("=============================================");

		for(int x = 0 ; x < 3 ; x++){//perintah perulangan dimulai dengan nilai x sama dengan 0 dan perulangan berlangsung sampai nilai x kurang dari 3,dengan nilai x terus bertambah
            if(x == 2) ;//kondisi ini akan di jalankan oleh sistem jika nilai x sama dengan 2 ini akan berhenti jika nilai x sama dengan index ke 2
            System.out.println("Saya berada di index ke " + x);//perintah mencetak kesistem sebanyak 2 kali
        }
    }
	
	
}
	