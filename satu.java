public class satu{

     public static void main(String []args){
        int tabungan = 2921690;
        double bunga = 2.1/100;
        
        int bulan = 12;
        
        double bungaPerBulan = tabungan*bunga;
        double temp = Math.pow(10, 2);
        
        double y = (double) Math.round(bungaPerBulan*temp)/temp;
        
        double bungaTiapBulan = tabungan + (y * bulan);
        
        System.out.println("Jumlah uang setelah "+bulan+" bulan adalah "+bungaTiapBulan);
     }
}