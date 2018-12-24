package restaurant_final;

public class Desayuno extends Alimento{
    public Desayuno(){

    }
    private String des01;
    private String des02;
    private String des03;
    private String des04;
    private String des05;
    protected String[] desayunos = new String[]{des01,des02,des03,des04,des05};

    protected String[] salidas = new String[]{"Cafe","Soya","Avena"};

    public String getDes01() {
        return des01;
    }

    public void setDes01(String des01) {
        this.des01 = des01;
    }

    public String getDes02() {
        return des02;
    }

    public void setDes02(String des02) {
        this.des02 = des02;
    }

    public String getDes03() {
        return des03;
    }

    public void setDes03(String des03) {
        this.des03 = des03;
    }

    public String getDes04() {
        return des04;
    }

    public void setDes04(String des04) {
        this.des04 = des04;
    }

    public String getDes05() {
        return des05;
    }

    public void setDes05(String des05) {
        this.des05 = des05;
    }

    public String[] getDesayunos() {
        return desayunos;
    }

    public void setDesayunos(String[] desayunos) {
        this.desayunos = desayunos;
    }
}
