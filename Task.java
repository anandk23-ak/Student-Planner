public class Task {
    public String subject;
    public String description;

    public Task(String subject, String description, String type) {
        this.subject = subject;
        this.description = description;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return subject + " | " + description;
    }
}