//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PcLab lab1=new PcLab(1,"CS","Danish ","Talha");

        lab1.addPc(new Pc("core i7","16","512","hp",true));



        PcLab lab2=new PcLab(lab1);
        lab1.setPc(new Pc("core i7","16","512","hp",true),new Pc("core i6","16","512","DELL",true));
        lab1.addPc(new Pc("core i8","6","512","hp",true));
        System.out.println(lab1);
        System.out.println(lab2);
    }
}