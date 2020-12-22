public abstract class Animal implements IAnimal{
String name;
double svalue;
double rvalue;
double jvalue;

Animal(String name, double svalue, double rvalue, double jvalue){
    this.name=name;
    this.svalue=svalue;
    this.rvalue=rvalue;
    this.jvalue=jvalue;
}

    public boolean swim(double s){
        return(this.svalue>=s);
    }
public boolean run(double r){
    return(this.rvalue>=r);
}
    public boolean jump(double j){
        return(this.jvalue>=j);
    }
}