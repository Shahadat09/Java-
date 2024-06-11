class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something....");

    }
    public void getinfo(){
        System.out.println(this.color+" "+this.type);

    }

}
public class Calculation {
    public static void main(String []args){
        Pen p1=new Pen();
        p1.color="Blue";
        p1.type="Ball";
        Pen p2=new Pen();
        p2.color="Black";
        p2.type="gel";
        p1.write();
        p1.getinfo();
        p2.write();
        p2.getinfo();


    }

}
