public class GiantSpiderRoom extends EnemyRoom{

    GiantSpider enemy;
    public GiantSpiderRoom(int x, int y, GiantSpider enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "You enter a dark and musty room, and suddenly a Giant Spider jumps from the shadows to attack you!";
        }else{
            return "The carcass of a giant spider lies crumpled in the corner of the room.";
        }
    }

}