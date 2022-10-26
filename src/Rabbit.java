public class  Rabbit {
    private int length;
    private String name;
    private boolean softness;

     Rabbit(int length, String name,boolean softness){
        this.length = length;
        this.name = name;
        this.softness = softness;
    }
    public void changeName(String name){
         this.name = name;
    }
    public String viewName(){
         return name;
    }
    public void changeSoftness(boolean softness){
         this.softness = softness;
    }
    public boolean viewSoftness(){
         return softness;
    }
    public void changeLength(int length){
         this.length = length;
    }
    public int viewLength(){
         return length;
    }
}
