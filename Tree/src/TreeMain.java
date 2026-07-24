public class TreeMain {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        drinks.addChild(hot);
        drinks.addChild(cold);

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");

        hot.addChild(tea);
        hot.addChild(coffee);

        TreeNode alcohol = new TreeNode("Alcohol");
        TreeNode non_alcohol = new TreeNode("Non-Alcohol");

        cold.addChild(alcohol);
        cold.addChild(non_alcohol);

        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");

        alcohol.addChild(beer);
        alcohol.addChild(wine);

        TreeNode broCode = new TreeNode("Bro Code");
        wine.addChild(broCode);

        System.out.println(drinks.print(0));

    }
}
