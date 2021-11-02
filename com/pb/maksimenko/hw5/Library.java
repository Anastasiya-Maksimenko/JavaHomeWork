// package com.pb.maksimenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] Books = new Book[3];
        Books[0] = new Book("Приключения", "Иванов И. И.", 2000);
        Books[1] = new Book("Словарь", "Сидоров А. В. ", 1980);
        Books[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader[] Readers = new Reader[3];
        Readers [0] = new Reader("Максименко А. С.", " 001"," 007 факультет психологии",  "01.06.1994", "+380502707498");
        Readers [1] = new Reader("Барвинок А. А.", " 456"," 007 факультет психологии",  "24.02.2000", "+38088888888");
        Readers [2] = new Reader("Ваховский А. Л.", " 228", "007 факультет психологии", "03.03.1997", "+38011111111");


        System.out.println("Книги:");
        for (int i = 0; i < Books.length; i++) {
            System.out.println(Books[i].getInfo());
        }
        System.out.println("\n");
        System.out.println("Читатели:");
        for (int i = 0; i < Readers.length; i++){
            System.out.println(Readers[i].getInfo());
        }

        System.out.println("\n");
        Readers[0].takeBook(3);
        Readers[0].takeBook(Books[2].getName(),Books[0].getName(),Books[1].getName());         System.out.print("\n");
        Readers[0].takeBook(Books[0],Books[1],Books[2]);

        System.out.println("\n");
        Readers[0].returnBook(3);
        Readers[0].returnBook(Books[2].getName(),Books[0].getName(),Books[1].getName());       System.out.print("\n");
        Readers[0].returnBook(Books[0],Books[1],Books[2]);


    }
}