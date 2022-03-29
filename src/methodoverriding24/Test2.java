package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s= new SBI();
        ICICI i = new ICICI();
        AXIS a= new AXIS();
        System.out.println("SBI Rate Of Intrest: "+s.getRateOfIntrest());
        System.out.println("ICICI Rate Of Intrest: "+i.getRateOfIntrest());
        System.out.println("AXIS Rate Of Intrest: "+a.getRateOfIntrest());
    }
}
