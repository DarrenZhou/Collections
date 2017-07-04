import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by darren on 2017/7/4.

 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Vector;

 /**
 * Created by darren on 2017/7/4.
 */
public class application {
    public static void main(String []args){
        Person person0=new Person(12,"licy");
        Person person1=new Person(13,"tom");
        List<Person> list2=new ArrayList<Person>(10);
        list2.add(person0);
        list2.add(person1);
        //遍历方法1
        Iterator<Person> it=list2.iterator();
        while (it.hasNext()){
            Person person=it.next();
            System.out.println(person.getName()+" "+person.getAge());
        }
        //遍历方法2
        for (Person person:list2){
            System.out.println(person.getName()+" "+person.getAge());
        }

    }


}
