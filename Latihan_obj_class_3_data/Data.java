package Latihan_obj_class_3_data;

public class Data {
    public double celcius;

    public Data(double celcius){
        this.celcius = celcius;
    }

    public double HitungKonversi(){
        return (9/5)+celcius+32;
    }

    public double getCelcius() {
        return celcius;
    }
}
