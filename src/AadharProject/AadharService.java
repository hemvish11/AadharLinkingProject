package AadharProject;

import java.util.HashMap;

//aadhar number se aadhar ki details

public class AadharService {
    HashMap<String,AadharInfo> hm = new HashMap();
    {
        hm.put("123456789",new AadharInfo("123456789","Yo Bro","Yo bro k pitashri","Nowgong","24"));
        hm.put("123456790",new AadharInfo("123456790","Yo Bro","Yo bro k pitashri","Nowgong","24"));
    }
    public AadharInfo getAadharInfoByAadharNumber(String currAadharNumber){
        return hm.get(currAadharNumber);
    }
}