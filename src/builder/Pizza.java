package builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    private Pizza() { }

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder withDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder withTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.dough = this.dough;
            pizza.sauce = this.sauce;
            pizza.topping = this.topping;
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.";
    }
}

