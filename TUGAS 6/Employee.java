public class Employee implements Payable {
    private String registrationNumber;
    private String name;
    private double salaryPerMonth;
    private Invoice[] invoices;

    public Employee(String registrationNumber, String name, double salaryPerMonth, Invoice[] invoices) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return salaryPerMonth - total;
    }

    private String getInvoice() {
        String invoicesPrint = "";
        for (Invoice invoice : invoices) {
            invoicesPrint += invoice.toString();
        }
        return invoicesPrint;
    }

    public String toString() {
        double total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return "============================="+"\nReg. Number\t: " + registrationNumber +"\nName\t\t: " + name +  "\nSalary\t\t: " + salaryPerMonth +
        "\n============================="+ "\nInvoices: " + getInvoice() + "\n\nTotal Invoice\t: " + total + "\nSalary - Invoice: " + getPayableAmount();
    }
}