
package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1,2,5,8,9,23,6,2,3,9,2,1,5,3,22};
        String [] data2 = {"maria" , "pablo", "pedro" , "pepe", "maria", "pepe"};
        
        Histogram meta_histogram = new Histogram(data2);
        Map <String, Integer> histogram = meta_histogram.getHistogram();

        Iterator<Map.Entry<String, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + " , value = " + entry.getValue());
                       
        } 
        

    }
    
}
