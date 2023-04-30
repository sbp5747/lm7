public class Items {

    protected String name;
    protected String desc;
    protected int value;

    public Items(String name, String desc, int value){
        this.name = name;
        this.desc = desc;
        this.value= value;
    }
    public String toString(){
        return String.format("%s \n=====\n %s \nValue= %d \n", this.name, this.desc, this.value);
    }


}