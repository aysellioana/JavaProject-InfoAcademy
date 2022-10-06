package CreareContact;

import java.util.Objects;

/**@author Aysel */
public abstract class NrTel {
    protected String telefon;
    
    public NrTel(String telefon){
        telefon = telefon;
    }
    public abstract void validareNumar();

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NrTel other = (NrTel) obj;
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        return true;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    

    @Override
    public String toString() {
        return "NrTel{" + "telefon=" + telefon + '}';
    }
    
    
}
