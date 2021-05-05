public class StarFigures {
    
    public static void fiveStar() {
        System.out.println("*****");
    }
    
    public static void twoStar() {
        System.out.println(" * * ");
    }
    
    public static void oneStar() {
        System.out.println("  *  ");
    }

    public static void fiveTwoOne() {
        fiveStar();
        fiveStar();
        twoStar();
        oneStar();
        twoStar();
    }

    public static void main(String[] args) {
        fiveTwoOne();
        System.out.println();
        fiveTwoOne();
        fiveStar();
        fiveStar();
        System.out.println();
        oneStar();
        oneStar();
        oneStar();
        fiveTwoOne();
    }
}
