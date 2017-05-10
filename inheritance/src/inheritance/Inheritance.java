package inheritance;

class Demo{
    int i=10;
    double d=46.5;
    
}

class Femo extends Demo{
    int k = 12;
    double l=12.6;
    
}

public class Inheritance {

    public static void main(String[] args) {
        Femo f= new Femo();
        System.out.println("k value is :\t"+f.k);
          System.out.println("i value is :\t"+f.i);
            System.out.println("d value is :\t"+f.d);
             System.out.println("k value is :\t"+f.l);
        
    }
    
}
