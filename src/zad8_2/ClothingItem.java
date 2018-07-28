package zad8_2;

import java.util.Arrays;
import java.util.Scanner;

public class ClothingItem {
    private String type;
    private String brand;
    private int size;

    public ClothingItem(String type, String brand, int size) {
        this.type = type;
        this.brand = brand;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ClothingItem)) {
            return false;
        }
        ClothingItem other = (ClothingItem) obj;
        if (this.size != other.size) {
            return false;
        }
        if (this.type == null && other.type != null) {
            return false;
        }
        if (this.brand == null && other.brand != null) {
            return false;
        }

        if (!(this.type.equals(other.type))) {
            return false;
        }
        if (!(this.brand.equals(other.brand))) {
            return false;
        }

        return true;
    }

    public static void addItems(ClothingItem[] table) {
        Scanner scan = new Scanner(System.in);
        ClothingItem item;
        int i = 0;

        do {

            System.out.println("Podaj typ: ");
            String type = scan.nextLine();
            System.out.println("Podaj markę: ");
            String brand = scan.nextLine();
            System.out.println("Podaj rozmiar: ");
            int size = scan.nextInt();
            scan.nextLine();
            item = new ClothingItem(type, brand, size);

            if (!ClothingItem.czyIstnieje(table, item) && table[i] == null) {
                table[i] = item;
                System.out.println("Dodano.");
                i++;

            } else
                System.out.println("Taki item juz istnieje.");

        } while (i < table.length);

        System.out.println("Tablica pełna");
        System.out.println(Arrays.toString(table));
    }

    @Override
    public String toString() {
        return type + " " + brand + " " + size;
    }

    public static boolean czyIstnieje(ClothingItem[] tab, ClothingItem item) {
        for (int i = 0; i < tab.length; i++) {
            if (item.equals(tab[i])) {
                return true;

            }

        }
        return false;
    }
}
