public class FindArrowRoom extends LootRoom{
    public FindArrowRoom (int x, int y, Arrow arrow){
        super(x, y, arrow);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got one Arrow for killing Enemy");
        else
            return "";
    }
}