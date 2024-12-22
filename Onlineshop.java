public class Onlineshop {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setFirstname("Alice");
        customer1.setLastname("James");

        System.out.println(customer1.getFirstname() + " " + customer1.getLastname());

        customer2.setFirstname("Nick");
        customer2.setLastname("Wilson");

        customer1.setFirstname("Lily");
        System.out.println(customer1.getFirstname() + " " + customer1.getLastname());
        System.out.println(customer2.getFirstname() + " " + customer2.getLastname());

    }    
}
