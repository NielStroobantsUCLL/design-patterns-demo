package builder;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .withDough("thin crust")
                .withSauce("tomato basil")
                .withTopping("mozzarella")
                .build();

        System.out.println(pizza);
    }
}
