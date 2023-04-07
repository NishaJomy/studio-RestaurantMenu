package Restaurant;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem menuitem1 = new MenuItem("cake1" ,7.5, "organic ingredients" , "desert" , true);
        MenuItem menuitem2 = new MenuItem("cake2" ,8.5, "nonorganic ingredients" , "desert" , true);
        MenuItem menuitem3 = new MenuItem("cake3" ,9.5, "organic ingredients " , "desert" , true);
        System.out.println( menuitem1.toString());
        Menu menu = new Menu();
        menu.addItem(menuitem1);
        menu.addItem(menuitem2);
        menu.addItem(menuitem3);
        menu.removeItem(menuitem3);
        System.out.println(menu.toString());

    }
}
