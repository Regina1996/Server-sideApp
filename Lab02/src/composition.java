public class composition { // Composition
    private String name;
    private int time;
    private CompositionStyle style;

    public composition(String name, int time, String style) {
        this.name = name;
        this.time = time;
        this.style = CompositionStyle.classic;


    }
    @Override
    public String toString() {
        return "composition { " +
                "name=" + name +
                ", time=" + time +
                ", style=" + style +
                " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public CompositionStyle getStyle() {
        return style;
    }

    public void setStyle(CompositionStyle style) {
        this.style = style;
    }
}