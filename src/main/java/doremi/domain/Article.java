package doremi.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Article {

    @PositiveOrZero
    private int articleId;

    @NotNull
    @Size(min = 1, max = 64)
    private String title;

    private String category;

    public Article(int id, String title, String category) {
        setArticleId(id);
        setTitle(title);
        setCategory(category);
    }

    public Article() { }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Article) && (articleId == ((Article) obj).getArticleId());
    }
}
