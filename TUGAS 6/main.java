public class main {
    public static void main(String[] args) {
        Invoice[] invoices = {new Invoice("Chitato", 2, 10000),new Invoice("Sprite", 2, 5000), new Invoice("Kopiko", 10, 500)};
        Employee employee = new Employee("001", "Faiz", 2000000, invoices);
        System.out.println(employee.toString());
    }
}
