package CreareContact;
import java.lang.String;
/*@author Aysel */
public class NrFix extends NrTel{
    public NrFix(String telefon){
        super(telefon);
    }

    @Override
    public void validareNumar() {
        if(telefon.length() <10){
            System.out.println("Numarul nu este valid");
        }else{
            System.out.println("Numarul este valid");
        }
    }
    public void valideazaFix(){
       if(telefon.startsWith("03") || telefon.startsWith("02")){
           System.out.println("Numarul este fix");
       }else{
           System.out.println("Numarul nu este fix");
       }
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
}
