public class Main {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit(50 ,"Gina",true);
        rabbit1.changeName("Super");
        rabbit1.viewName();
        System.out.println(rabbit1.viewName());
        rabbit1.changeSoftness(false);
        rabbit1.viewSoftness();
        System.out.println(rabbit1.viewSoftness());
        rabbit1.changeLength(25);
        rabbit1.viewLength();
        System.out.println(rabbit1.viewLength());
    }
}
