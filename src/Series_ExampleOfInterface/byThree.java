package Series_ExampleOfInterface;

public class byThree implements Series {
    int start,value;
    public void setStart (int s){start=s;}
    public void setValue (int v){value=v;}
    public int getStart(){return start;}
    public int getValue(){return value;}
    byThree(){
        setStart(0);
        setValue(0);
    }
    public int getNext(){
        setValue(getValue()+3);
        return getValue();
    }
    public int getPrevious(){
        setValue(getValue()-3);
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
