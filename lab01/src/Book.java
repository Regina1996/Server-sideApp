public class Book {
    private  int  id;
    private  String name;
    private  String avthor;
    private String publish;
    private int year;
    private  int pages;
    private int price;
    private String binder;

    public Book(int id,
                String name,
                String avthor,
                String publish,
                int year,
                int pages,
                int price,
                String binder){

        this.id = id;
        this.name = name;
        this.avthor = avthor;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binder = binder;

    }


    public int getId() { return id; }

    public String getName() { return name; }

    public String getAvthor() { return avthor; }

    public String getPublish() { return publish; }

    public int getPages() { return pages; }

    public int getYear() { return year; }

    public int getPrice() { return price; }

    public String getBinder() { return binder; }

    public void setId(int id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setAvthor(String avthor) { this.avthor = avthor; }

    public void setPublish(String publish) { this.publish = publish; }

    public void setYear(int year) { this.year = year; }

    public void setPages(int pages) { this.pages = pages; }

    public void setPrice(int price) { this.price = price; }

    public void setBinder(String binder) { this.binder = binder; }


    @Override
    public String toString() {
        return "Book {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avthor =" + avthor + '\'' +
                ", publish =" + publish + '\'' +
                ",year = " + year + '\'' +
                ",pages = " + pages + '\'' +
                ",price = " + price + '\'' +
                ",binder =" + binder + '\'' +
                '}';
    }


}

