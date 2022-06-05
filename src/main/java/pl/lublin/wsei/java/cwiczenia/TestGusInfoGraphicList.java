package pl.lublin.wsei.java.cwiczenia;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");
        for(INFOGRAFIKA ig: list.infografiki) {
            ig.print();
        }
    }
}
