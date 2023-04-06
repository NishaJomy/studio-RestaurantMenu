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
}
