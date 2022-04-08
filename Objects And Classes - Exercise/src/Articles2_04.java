import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2_04 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s",
                    getTitle(), getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> allArticles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);
            allArticles.add(article);
        }

        String command = scanner.nextLine();
        switch (command){
            case "title":
                allArticles.stream().sorted((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                allArticles.stream().sorted((c1, c2) -> c1.getContent().compareTo(c2.getContent()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                allArticles.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
        }
    }
}
