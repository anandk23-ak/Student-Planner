public class SchoolTask extends Task {
  private String type;

  public SchoolTask(String subject, String description, String type)
  {
    super(subject, description, type);
    this.type = type;
  }

  public String toString()
  {
    return "[" + type + "]" + super.toString();
  }
}