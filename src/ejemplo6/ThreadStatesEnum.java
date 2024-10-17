package ejemplo6;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

public enum ThreadStatesEnum implements Closeable {
    START(2322){
        @Override
        public String toString(){
            return "START implementation. Priority="+getPriority();
        }

        @Override
        public String getDetail() {
            return "START";
        }
    },
    RUNNING(2){
        @Override
        public String getDetail() {
            return "RUNNING";
        }
    },
    WAITING(3){
        @Override
        public String getDetail() {
            return "WAITING";
        }
    },
    DEAD(4){
        @Override
        public String getDetail() {
            return "DEAD";
        }
    };

    private int priority;

    public abstract String getDetail();
    //Enum constructors should always be private.
    private ThreadStatesEnum(int i){
        priority = i;
    }

    //Enum can have methods
    public int getPriority(){
        return this.priority;
    }

    public void setPriority(int p){
        this.priority = p;
    }

    //Enum can override functions
    @Override
    public String toString(){
        return "Default ThreadStatesConstructors implementation. Priority="+getPriority();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Close of Enum");
    }
}

class Main{
    public static void main(String[] args) {
        ThreadStatesEnum tse = ThreadStatesEnum.DEAD;
        tse.setPriority(2);
        System.out.println(tse.toString());
        System.out.println(tse.getDetail());
         
    }
}