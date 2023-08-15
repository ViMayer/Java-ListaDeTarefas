
public class Tarefa {
    private String title;
    private String description;
    public Tarefa(String title, String description) {
        this.title = title;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Tarefa: " + title + "\n   Descrição: " + description;
    }
}
