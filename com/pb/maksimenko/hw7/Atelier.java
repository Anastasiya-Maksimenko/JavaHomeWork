public class Atelier {
    public static void main(String[] args) {

        Pants pants = new Pants("чёрные", Size.S, 1999.99);
        Skirt skirt = new Skirt("чёрная", Size.M, 1299.00);
        Tie tie = new Tie("чёрный", Size.L, 600);
        Tshirt tshirt = new Tshirt("чёрный", Size.XXS, 300.00);

        Clothes[] clothes = new Clothes[]{pants, skirt, tie, tshirt};
        dressMan(clothes);
        dressWomen(clothes);
    }

        public static void dressMan(Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes clothing: clothes) {
                if (clothing instanceof ManClothes) {
                    ManClothes manClothes = (ManClothes) clothing;
                    manClothes.dressMan();
                }
            }
        }

        public static void dressWomen(Clothes[] clothes) {
            System.out.println("Женская одежда:");
            for (Clothes clothing: clothes) {
                if(clothing instanceof WomenClothes) {
                    WomenClothes womenClothes = (WomenClothes) clothing;
                    womenClothes.dressWomen();
                }

            }
        }
    }
