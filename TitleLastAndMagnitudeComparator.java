
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class TitleLastAndMagnitudeComparator implements Comparator <QuakeEntry> {
    public int compare(QuakeEntry q1,QuakeEntry q2){
        String q1S = q1.getInfo().substring(q1.getInfo().lastIndexOf(" ") + 1);
        String q2S = q2.getInfo().substring(q2.getInfo().lastIndexOf(" ") + 1);
        int comp = q1S.compareTo(q2S);
        if(comp<0){
            return comp;
        }
        if(comp>0){
            return comp;
        }
        if(comp==0){
            int temp = Double.compare(q1.getMagnitude(),q2.getMagnitude());
            if(temp<0){
                return temp;
            }
            if(temp>0){
                return temp;
            }
            if(temp==0){
                return 0;
            }
        }
        return comp;
    }
    }


