public class tiga{

     public static void main(String []args){
         CetakGambar(9);
     }
     
     public static void CetakGambar(int angka){
         int a;
         if(angka%2 == 1){
             for(int i=0; i<angka; i++){
                 for(int j=0; j<angka; j++){
                     a = i + j;
                     if(a%2 == 0){
                         System.out.print("= ");
                     }else{
                         System.out.print("* ");
                     }
                 }
                System.out.println("");
             }
         }
         else{
             System.out.println("angka yang dimasukkan harus ganjil");
         }
     }
}