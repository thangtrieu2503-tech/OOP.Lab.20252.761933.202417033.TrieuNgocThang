public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public Cart() {
        qtyOrdered = 0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("Add successful");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Remove successful");
                return;
            }
        }
        System.out.println("Remove failed");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void sortByTitle() {
        for (int i = 0; i < qtyOrdered - 1; i++) {
            for (int j = i + 1; j < qtyOrdered; j++) {
                if (itemsOrdered[i].getTitle().compareTo(itemsOrdered[j].getTitle()) > 0) {
                    DigitalVideoDisc temp = itemsOrdered[i];
                    itemsOrdered[i] = itemsOrdered[j];
                    itemsOrdered[j] = temp;
                }
            }
        }
        System.out.println("Sort by title successful");
    }

    public void sortByCost() {
        for (int i = 0; i < qtyOrdered - 1; i++) {
            for (int j = i + 1; j < qtyOrdered; j++) {
                if (itemsOrdered[i].getCost() > itemsOrdered[j].getCost()) {
                    DigitalVideoDisc temp = itemsOrdered[i];
                    itemsOrdered[i] = itemsOrdered[j];
                    itemsOrdered[j] = temp;
                }
            }
        }
        System.out.println("Sort by cost successful");
    }

    public DigitalVideoDisc searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                return itemsOrdered[i];
            }
        }
        return null;
    }
//2.1
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        for (DigitalVideoDisc dvd : dvdList) {
//            addDigitalVideoDisc(dvd);
//        }
//    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd);
        }
    }
    //2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void displayCart() {
//        System.out.println("Items in cart:");
//        for (int i = 0; i < qtyOrdered; i++) {
//            System.out.println((i + 1) + ". " + itemsOrdered[i].getTitle()
//                    + " - " + itemsOrdered[i].getCost() + " $");
        //6.1
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        float totalCost = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". "
                    + itemsOrdered[i].getTitle()
                    + " - "
                    + itemsOrdered[i].getCost() + " $");

            totalCost += itemsOrdered[i].getCost();
        }

        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
        }
    }
