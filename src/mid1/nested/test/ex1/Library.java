package mid1.nested.test.ex1;

public class Library {

    private Book[] books;
    private int count;

    public Library(int size) {
        this.books = new Book[size];
        this.count = 0;
    }

    void addBook(String title, String author) {
        if (count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다");
        } else {
            books[count] = new Book(title, author);
            count++;
        }
    }

    void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }


    private static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }
}
