package java_APK;

public class Book
{
	private String author;
	private String title;
	private boolean available;
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
		this.available=true;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public boolean isAvailable() {
		return available;
	}
	public void borrow()
	{
        if (available)
        {
            available = false;
            System.out.println("Book borrowed: " + title);
        } 
        else
        {
            System.out.println("Book not available for borrowing: " + title);
        }
    }
	public void returnBook()
	{
        if (!available) 
        {
            available = true;
            System.out.println("Book returned: " + title);
        } else 
        {
            System.out.println("Book is already available: " + title);
        }
    }
	public String toString() 
	{
        return title + " by " + author + " (" + (available ? "Available" : "Not Available") + ")";
    }
}
