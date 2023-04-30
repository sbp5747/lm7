public class LootRoom extends MapTile{
    Items item;
    public boolean pickedItem = false;
    public LootRoom(int x, int y, Items item){
        super(x, y);
        this.item = item;
    }
    public void add_Loot(Player player){
        player.inventory.add(item);
        pickedItem = true;
    }
    public void modify_player(Player player){
        if(pickedItem == false)
            add_Loot(player);
    }
}