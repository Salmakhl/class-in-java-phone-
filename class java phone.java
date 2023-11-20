public class Main {
    public static void main(String[] args) {
         Phone firstPhone = new phone();
         firstPhone .name = "galaxy s23 ultra" ;
         firstPhone .brand= "Sumsang" ;
         firstPhone .ram = 16 ;
         firstPhone .color = "black" ;
         //method to provide the first phine information:
         firstPhone .info() ;


         Phone secondPhone = new Phone();
         secondPhone .name = "ROG PHONE 6" ;
         secondPhone .brand = "asus" ;
         secondPhone .ram = 18 ;
         secondPhone .color = "red" ;
         //method to provide the second phone information:
         secondPhone .info();


         Phone thirdPlayer = new Phone();
         thirdPhone .name = "oneplus 11" ;
         thirdPhone .brand = "one plus" ;
         thirdPhone .ram = 18 ;
         thirdPhone .color = "pink" ;
         //method to provide the third phone information:
         thirdPhone .info() ;


        
    }
}


public class Phone {
    String name ;

    short brand ;

    double ram ;

    String color ;


    //method to provide player information:
    void info(){
        System.out.println ("The phone name is:"+name) ;
        System.out.println ("His brand :"+brand) ;
        System.out.println ("His ram is:"+ram) ;
        System.out.println ("And his color :"+color);

    }
}