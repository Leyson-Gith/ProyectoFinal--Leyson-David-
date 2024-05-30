public class cls_citas {
    private String idcitastr;
    private String fechaStr;
    private String horaStr;
    private String detalleStr;
    public cls_citas(String idcitastr, String fechaStr, String horaStr, String detalleStr) {
        this.idcitastr = idcitastr;
        this.fechaStr = fechaStr;
        this.horaStr = horaStr;
        this.detalleStr = detalleStr;
    }
    public String getIdcitastr() {
        return idcitastr;
    }
    public void setIdcitastr(String idcitastr) {
        this.idcitastr = idcitastr;
    }
    public String getFechaStr() {
        return fechaStr;
    }
    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }
    public String getHoraStr() {
        return horaStr;
    }
    public void setHoraStr(String horaStr) {
        this.horaStr = horaStr;
    }
    public String getDetalleStr() {
        return detalleStr;
    }
    public void setDetalleStr(String detalleStr) {
        this.detalleStr = detalleStr;
    }

}
