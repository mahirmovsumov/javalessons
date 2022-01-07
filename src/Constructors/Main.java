package Constructors;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345",0.00,
                "Mahir Movsumov","mahirmovsumov@gmail.com",
                "7525153");

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Mahir Movsumov");
//        bobsAccount.setCustomerEmailAddress("mahirmovsumov@gmail.com");
//        bobsAccount.setCustomerPhoneNumber("7525153");

        bobsAccount.withDraw(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withDraw(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withDraw(100.0);

        Account mahirAccount =new Account("Mahir","mahirmovsumov@gmail.com","12345");
        System.out.println(mahirAccount.getNumber() + " name " + mahirAccount.getCustomerName());

        System.out.println();

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("mahir", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("maverick",100.00,"maverick@mail.com");
        System.out.println(person3.getName());
}}
