public class cls_pasientes {

    private String nombreStr; 
    private String idStr;
    private int edadInt;
    private String ContactoStr;
    private String historiaStr;
    public cls_pasientes(String nombreStr, String idStr, int edadInt, String contactoStr, String historiaStr) {
        this.nombreStr = nombreStr;
        this.idStr = idStr;
        this.edadInt = edadInt;
        ContactoStr = contactoStr;
        this.historiaStr = historiaStr;
    }
    public String getNombreStr() {
        return nombreStr;
    }
    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }
    public String getIdStr() {
        return idStr;
    }
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    public int getEdadInt() {
        return edadInt;
    }
    public void setEdadInt(int edadInt) {
        this.edadInt = edadInt;
    }
    public String getContactoStr() {
        return ContactoStr;
    }
    public void setContactoStr(String contactoStr) {
        ContactoStr = contactoStr;
    }
    public String getHistoriaStr() {
        return historiaStr;
    }
    public void setHistoriaStr(String historiaStr) {
        this.historiaStr = historiaStr;
    }

    
    
}