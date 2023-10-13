public class Rabositas {
    public static void main(String[] args) {
        System.out.println("Csináljunk valamit");
        boolean[] rab = new boolean[101];
        System.out.println("Mindenki zárva lesz ,ezért false érték a kezdő");
        for (int i = 0; i < 101; i++) {
            rab[i] = false;

        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (i * j <= 100) {
                    if (rab[i * j] == false) {
                        rab[i * j] = true;
                    } else if (rab[i * j] == true) {
                        rab[i * j] = false;
                    }
                }

            }

        }

        for (int i = 1; i < 101; i++) {
            System.out.print(rab[i]+" ");
            if (rab[i] == true) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
