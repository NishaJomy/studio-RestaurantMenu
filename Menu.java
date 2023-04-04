public class Menu {
    private ArrayList<MenuItem> menuItems = new MenuItem();
    private Date update;
    public Menu(){
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
