public class dua{

     public static void main(String []args){
        String[] dataKey = {"dumb", "ways", "the", "best"};
        String word = "dumb ways";
        Check(dataKey, word);
     }
     
     public static void Check(String[] kataKunci, String kata){
         for(int i=0; i<kataKunci.length; i++){
             System.out.println(kata.contains(kataKunci[i]));
         }
     }
}