class One {
    One(int x) {
        System.out.println("Constructor of One with x = " + x);
    }
}


class Two extends One {
    // No  constructor
}


public class Main {
    public static void main(String[] args) {
        Two obj = new Two();
    }
}
