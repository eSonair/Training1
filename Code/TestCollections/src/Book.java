public class Book implements Comparable <Book> {

    private String author;   //Autor
    private String title;    //Titel
    private int issue;       //Auflagenhoehe

    public Book(String author, String title, int issue)
    {
        setAuthor(author);
        setTitle(title);
        setIssue(issue);
    }


    public int compareTo (Book o) {
        if ((o == null || (o.getClass() != getClass())))
            return -1;

            int i = getAuthor().compareTo(o.getAuthor());
            if (i != 0)
                return i;
            else  {
                i = getTitle().compareTo(o.getTitle());
                if (i != 0)
                    return i;
                else {
                    i = getIssue() - o.getIssue();// i=getPersonalNr().compareTo(o.getPersonalNr());
                    return i;
                }
            }
        }//Ende compareTo.

    public boolean equals (Object o){
        if ((o==null) || (o.getClass()!= this.getClass()))
            return false;
        else {
            Book obj = (Book) o;
            return (obj.getAuthor().equals(getAuthor())&&
                    obj.getTitle().equals(getTitle())&&
                    obj.getIssue()==(getIssue()));
        }
    }//Ende equals



    public int hashCode(){
        return getAuthor().hashCode() + getTitle().hashCode() + getIssue();
    }





    public String getAuthor()
    {
        return this.author;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getIssue()
    {
        return this.issue;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setIssue(int issue)
    {
        this.issue = issue;
    }



}
