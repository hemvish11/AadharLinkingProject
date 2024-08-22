import AadharProject.AadharInfo;
import AadharProject.AadharService;
import AadharProject.PanInfo;
import AadharProject.PanService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AadharService as1 = new AadharService();
        PanService ps1 = new PanService();

        System.out.println("Enter the aadhar number");
        String currAadharNumber = sc.nextLine();

        AadharInfo a1 = as1.getAadharInfoByAadharNumber(currAadharNumber);
        PanInfo p1 = ps1.getPanInfoByAadharNumber(currAadharNumber);

        if(a1!=null && p1!=null){
            System.out.println("Aadhar Info = " + a1);
            System.out.println("Pan Info = " + p1);
        }else{
            System.out.println("No records found...");
        }
    }

}