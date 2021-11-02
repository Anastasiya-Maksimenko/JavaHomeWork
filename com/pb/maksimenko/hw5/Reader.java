// package com.pb.maksimenko.hw5;

public class Reader {
    String FIO;
    String libraryCardNumber;
    String faculty;
    String birthday;
    String numberPhone;
    public Reader (String FIO, String libraryCardNumber, String faculty, String birthday, String numberPhone ) {
        this.FIO = FIO;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }

    String getInfo(){
        return "№ " + libraryCardNumber + " " + FIO +  "\nфакультет: [" + faculty + "] дата рождения: [" + birthday + "] номер телефона: [" + numberPhone + "]";
    }


    public void takeBook(int how) {
        System.out.println(FIO + " взял " + how + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(FIO + " взял : ");
        for (String name : books) {
            System.out.print(name + "; ");
        }
    }

    public void takeBook (Book... books) {
         System.out.print(FIO + " взял : ");
         for (Book book : books){
             System.out.print(book.getInfo() + "; ");
            }
        }

    public void returnBook(int how) {
        System.out.println(FIO + " вернул " + how + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(FIO + " вернул : ");
        for (String name : books) {
            System.out.print(name + "; ");
        }
    }
    public void returnBook (Book... books) {
        System.out.print(FIO + " вернул : ");
        for (Book book : books){
            System.out.print(book.getInfo() + "; ");
        }
    }

}