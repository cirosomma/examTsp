public class Page {
  /**
  Il pattern Builder è utilizzato per la costruzione di
  oggetti complessi usando oggetti più semplici e con un
  approccio step by step. Questo design pattern è di tipo
  creazionale.
  Una classe builder costruisce l'oggetto step by step.
  */
  public static void main(String... args) {
    MealBuilder mealBuilder = new MealBuilder();
    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total Cost: "+ vegMeal.getCost());

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("\n\nNon-Veg Meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost: "+ nonVegMeal.getCost());
  }
}
