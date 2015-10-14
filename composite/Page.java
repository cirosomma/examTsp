public class Page {
  /**
  Il design pattern Composite è usato quando abbiamo
  la necessità di trattare un gruppo di oggetti nello
  stesso modo di un singolo oggetto. Tale pattern
  compone oggetti come se fossero strutture ad albero
  per rappresentare l'intera gerarchia o un singolo
  oggetto.
  E' un pattern di tipo strutturale, in pratica consiste
  tutto nella creazione di una classe che contiene
  un gruppo dei suoi stessi oggetti.
  */
  public static void main(String... args) {
    Employee CEO = new Employee("Robert","CEO", 30000);

    Employee headSales = new Employee("Robert","Head Sales", 20000);

    Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

    Employee clerk1 = new Employee("Laura","Marketing", 10000);
    Employee clerk2 = new Employee("Bob","Marketing", 10000);

    Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
    Employee salesExecutive2 = new Employee("Bob", "Sales", 10000);

    CEO.add(headSales);
    CEO.add(headMarketing);

    headSales.add(salesExecutive1);
    headSales.add(salesExecutive2);

    headMarketing.add(clerk1);
    headMarketing.add(clerk2);

    //print all employees of the organization
    System.out.println(CEO);
    for(Employee headEmployee : CEO.getSubordinates()) {
      System.out.println(headEmployee);
      for(Employee employee : headEmployee.getSubordinates()) {
        System.out.println(employee);
      }
    }
  }
}
