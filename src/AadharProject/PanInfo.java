package AadharProject;

public class PanInfo {
    String panNumber;
    String aadharNumber;
    String bankDetails;
    String investments;

    public PanInfo(String panNumber, String investments, String bankDetails, String aadharNumber) {
        this.panNumber = panNumber;
        this.investments = investments;
        this.bankDetails = bankDetails;
        this.aadharNumber = aadharNumber;
    }

    @Override
    public String toString() {
        return "PanInfo{" +
                "panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}