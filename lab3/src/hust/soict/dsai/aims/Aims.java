package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation", "Roger Allens", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("DVD 1 id: " + dvd1.getId());
        System.out.println("DVD 2 id: " + dvd2.getId());
        System.out.println("DVD 3 id: " + dvd3.getId());

        anOrder.displayCart();

        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());

        DigitalVideoDisc foundDisc = anOrder.searchByTitle("Star Wars");
        if (foundDisc != null) {
            System.out.println("Found disc: " + foundDisc.getTitle());
        } else {
            System.out.println("Not found");
        }

        anOrder.sortByTitle();
        anOrder.displayCart();

        anOrder.sortByCost();
        anOrder.displayCart();

        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}