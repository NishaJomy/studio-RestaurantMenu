package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date update;

    public Menu() {
        this.update = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;

    }

    public  void addItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        this.update = new Date();

    }
    public void removeItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
        this.update = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for(MenuItem item: this.menuItems){
            returnString += item.toString()+"\n\n";
        }

        return returnString;
    }







}
