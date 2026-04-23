package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore >= MAX_ITEMS_IN_STORE) {
            System.out.println("The store is full");
            return;
        }

        itemsInStore[qtyInStore] = dvd;
        qtyInStore++;
        System.out.println("DVD added to store successfully");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }

                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD removed from store successfully");
                return;
            }
        }

        System.out.println("DVD not found in store");
    }
}