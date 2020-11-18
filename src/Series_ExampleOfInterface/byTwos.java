package Series_ExampleOfInterface;

public class byTwos implements Series {
    int start,value;
    public void setStart (int s){start=s;}
    public void setValue (int v){value=v;}
    public int getStart(){return start;}
    public int getValue(){return value;}
    byTwos(){
        setStart(0);
        setValue(0);
    }
    public int getNext(){
        setValue(getValue()+2);
        return getValue();
    }
    public int getPrevious(){
        setValue(getValue()-2);
        return getValue();
    }
    public void reset(){
        setValue(0);
        setStart(0);
    }
    public void start(int x){
        setValue(x);
        setStart(x);
    }
}