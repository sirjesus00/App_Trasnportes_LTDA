
package Logica;

/**
 *
 * @author Yoiner the best
 */
public class cls_vehiculo {
    
    private String placaStr;
    private String descripcionStr;
    private String nombre_conductorStr;
    private String rutaStr;
    private String marcaStr;
    private String modeloStr;

    public cls_vehiculo(String placaStr, String descripcionStr, String nombre_conductorStr, String rutaStr, String marcaStr, String modeloStr) {
        this.placaStr = placaStr;
        this.descripcionStr = descripcionStr;
        this.nombre_conductorStr = nombre_conductorStr;
        this.rutaStr = rutaStr;
        this.marcaStr = marcaStr;
        this.modeloStr = modeloStr;
    }

    public String getPlacaStr() {
        return placaStr;
    }

    public void setPlacaStr(String placaStr) {
        this.placaStr = placaStr;
    }

    public String getDescripcionStr() {
        return descripcionStr;
    }

    public void setDescripcionStr(String descripcionStr) {
        this.descripcionStr = descripcionStr;
    }

    public String getNombre_conductorStr() {
        return nombre_conductorStr;
    }

    public void setNombre_conductorStr(String nombre_conductorStr) {
        this.nombre_conductorStr = nombre_conductorStr;
    }

    public String getRutaStr() {
        return rutaStr;
    }

    public void setRutaStr(String rutaStr) {
        this.rutaStr = rutaStr;
    }

    public String getMarcaStr() {
        return marcaStr;
    }

    public void setMarcaStr(String marcaStr) {
        this.marcaStr = marcaStr;
    }

    public String getModeloStr() {
        return modeloStr;
    }

    public void setModeloStr(String modeloStr) {
        this.modeloStr = modeloStr;
    }
    
    
    
}
