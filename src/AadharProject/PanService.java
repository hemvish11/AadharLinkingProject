package AadharProject;

import java.util.HashMap;

public class PanService {
    HashMap<String,PanInfo> hm = new HashMap<>();
    {
        hm.put("BPZPV2169G",new PanInfo("BPZPV2169G","Stocks,ETF","Union,Axis","123456789"));
        hm.put("BPZPV2170G",new PanInfo("BPZPV2170G","Stocks,ETF","Union,Axis","123456790"));
    }
    public PanInfo getPanInfoByAadharNumber(String currAadharNumber){
        for(PanInfo panInfo:hm.values()){
            if(panInfo.aadharNumber.equals(currAadharNumber)){
                return panInfo;
            }
        }
        return null;
    }

}
