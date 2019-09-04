package facotry;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class BakeryFactory implements Serializable {
    public BakeryFactory() {
    }

    public Bakery getBakery(String bakeryType) {
        if (bakeryType == null) {
            return null;
        }
        if (bakeryType.equalsIgnoreCase("Cake")) {
            return new Cake();
        } else if (bakeryType.equalsIgnoreCase("Bread")) {
            return new Bread();
        }

        return null;
    }

    public static Bakery baking(String bakeryName, String bakeryDescription, String bakeryType, double price, String expiredate, int quantity) {
        Bakery bake = new BakeryFactory().getBakery("Cake");
        bake.setBakeryName(bakeryName);
        bake.setBakeryDescription(bakeryDescription);
        bake.setBakeryType(bakeryType);
        bake.setPrice(price);
        bake.setExpireDate(expiredate);
        bake.setQuantity(quantity);
        return bake;
    }

    public static  List<Bakery> getAllBakery(){
        LinkedList<Bakery> bakeries = new LinkedList<>();
        bakeries.add(BakeryFactory.baking("Strawberry Short Cake", "Made with real strawberries, this pretty pink cake is filled and frosted with our fresh strawberry buttercream. Strawberry Amycakes are decorated with a ring of strawberry buttercream rosettes and fresh strawberry halves.", "Cake", 150.00, "10/09/2019", 5));
        bakeries.add(BakeryFactory.baking("Vanilla Almond", "Light and sweet but moist and rich in flavor, our Vanilla Almond cake is filled and frosted with our house vanilla buttercream.", "Cake", 120.00, "10/09/2019", 2));
        bakeries.add(BakeryFactory.baking("Double Chocolate", "Rich, fudgy chocolate cake filled and frosted with our house chocolate buttercream. Double Chocolate Amycakes are decorated with chocolate flakes and chocolate ganache drizzle.", "Cake", 120.00, "10/09/2019", 1));
        bakeries.add(BakeryFactory.baking("Caramel Craze", "Buttery Golden Vanilla cake filled with our thick, creamy caramel, and frosted with our creamy vanilla buttercream. Caramel Craze Amycakes are decorated with caramel drizzle, rosettes and gold sprinkles.", "Cake", 110.00, "10/09/2019", 4));
        bakeries.add(BakeryFactory.baking("Red Velvet", "One of our most popular cakes, our red velvet is always moist and dense with a light chocolate flavor. It is perfectly paired when filled and frosted with our house vanilla buttercream.", "Cake", 130.00, "10/09/2019", 0));
        bakeries.add(BakeryFactory.baking("Carrot", "Dense, moist and perfectly spiced carrot cake, filled and frosted with our house vanilla buttercream. Carrot Amycakes are decorated with a caramel drizzle, a ring of rosettes, candy carrots and brown sugar.", "Cake", 110.00, "10/09/2019", 3));
        bakeries.add(BakeryFactory.baking("Golden Triple Berry", "Buttery, golden vanilla cake filled with three layers of fresh triple berry compote and frosted with our house vanilla buttercream. Golden Triple Berry Amycakes are decorated with fresh strawberries, gold and purple sprinkles and white chocolate flakes.", "Cake", 150.00, "10/09/2019", 0));
        bakeries.add(BakeryFactory.baking("Bagel", "Ring-shaped, usually with a dense, chewy interior; usually topped with sesame or poppy seeds baked into the surface.", "Bread", 30.00, "8/09/2019", 10));
        bakeries.add(BakeryFactory.baking("Baguette", "Thin elongated loaf, made of water, flour, yeast, and salt, instantly recognizable by slits cut in top surface before baking to allow gas expansion.", "Bread", 45.00, "10/09/2019", 3));
        bakeries.add(BakeryFactory.baking("Curry bread", "Some Japanese curry is wrapped in a piece of dough, which is coated in flaky bread crumbs, and usually deep fried or baked.", "Bread", 40.00, "10/09/2019", 0));
        bakeries.add(BakeryFactory.baking("English muffin", "Small, round, thin, usually dusted with cornmeal and served split horizontally, toasted, buttered, eaten as a snack alone or part of meal, usually breakfast or, in the UK and Ireland, early-evening tea. In the UK, usually just called a \"muffin\"", "Bread", 25.00, "6/09/2019", 4));
        bakeries.add(BakeryFactory.baking("White bread", "Made from wheat flour from which the bran and the germ have been removed through a process known as milling.", "Bread", 35.00, "10/09/2019", 2));
        bakeries.add(BakeryFactory.baking("Whole wheat bread", "Made using flour which is partly or entirely made from whole or almost whole wheat grains.", "Bread", 40.00, "10/09/2019", 3));
        bakeries.add(BakeryFactory.baking("Brioche", "A highly enriched bread, noted for its high butter and egg content, commonly served as a component of French desserts.", "Bread", 38.00, "8/09/2019", 1));
        bakeries.add(BakeryFactory.baking("Potato bread", "Potato replaces part of usual wheat flour, ratio of potato to wheat varies much, leavened or unleavened, may have many other ingredients baked in, varied cooking methods.", "Bread", 50.00, "9/09/2019", 4));
        bakeries.add(BakeryFactory.baking("Mantou", "Steamed, made of white flour, often slightly sweetened.", "Bread", 20.00, "7/09/2019", 0));
        return bakeries;
    }

    public static List<Bakery> getAllAvailableBakeries(){
        LinkedList<Bakery> bakeries = new LinkedList<>();
        for(Bakery i: getAllBakery()){
            if(i.getQuantity() > 0){
                bakeries.add(i);
            }
        }
        return bakeries;
    }

    public static List<Bakery> getAllCake(){
        LinkedList<Bakery> bakeries = new LinkedList<>();
        for(Bakery j: getAllBakery()){
            if(j.getBakeryType().equalsIgnoreCase("Cake")){
                bakeries.add(j);
            }
        }
        return bakeries;
    }

    public static List<Bakery> getAllBread(){
        LinkedList<Bakery> bakeries = new LinkedList<>();
        for(Bakery k: getAllBakery()){
            if(k.getBakeryType().equalsIgnoreCase("Bread")){
                bakeries.add(k);
            }
        }
        return bakeries;
    }

}
