public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burger(String bun, String cheese, String greens) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Дієтичний бургер: " + bun + ", " + "без м'яса" + ", " + cheese + ", " + greens + ", без майонезу");
    }

    public Burger(String bun, String meat, String cheese, String mayonnaise) {
            this.bun = bun;
            this.meat = meat + ", " + meat;
            this.cheese = cheese;
            this.mayonnaise = mayonnaise;
            System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + meat + ", " + cheese + ", " + "без салату " + "," + mayonnaise);
    }

//    @Override
//    public String toString() {
//        return "Burger{" +
//                "bun='" + bun + '\'' +
//                ", meat='" + meat + '\'' +
//                ", cheese='" + cheese + '\'' +
//                ", greens='" + greens + '\'' +
//                ", mayonnaise='" + mayonnaise + '\'' +
//                '}';
//    }
}
