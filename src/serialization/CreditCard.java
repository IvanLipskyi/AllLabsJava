package serialization;

import java.io.Serializable;

/**
 * Created by Brainacad4 on 04.07.2019.
 */
public class CreditCard implements Serializable{
    public static final long serialVersionUID = 42L;
    private CC cardType;
    private String bankName;
    private String cardNumber;
    private String expires;
    private int CVV;

    public CreditCard(CC cardType, String bankName, String cardNumber, String expires, int CVV) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.expires = expires;
        this.CVV = CVV;

    }

    @Override
    public String toString() {
        return "CreditCard" +
                "cardType=" + cardType +
                ", bankName='" + bankName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expires='" + expires + '\'' +
                ", CVV=" + CVV +
                '}';
    }



    public CC getCardType() {
        return cardType;
    }

    public void setCardType(CC cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }


}
