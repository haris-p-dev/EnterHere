import java.util.ArrayList;

public class Storage <T extends hasId>  {

    private ArrayList<T> mainList;  // list declaration


    public Storage(T name){   // T name could be wrong design
        validate(name);
        mainList = new ArrayList<>(); // list initialization
        mainList.add(name);
    }

    // Lists Methods
    public ArrayList getWholeList(){
        return mainList;
    }

    public void add(T other){
        mainList.add(other);
    }


    public T getByIndex(int x){
        System.out.println(mainList.get(x));
        return mainList.get(x);
    }

    public int size(){
       return mainList.size();
    }

    //Interface method implementation
//        @Override
//        public int getId(){
//
//            return 0;
//        }


    //validate name for null value
    private T validate(T name){
        if(name!=null){
            return name;
        }
        return null; //we will change that later
    }

}
