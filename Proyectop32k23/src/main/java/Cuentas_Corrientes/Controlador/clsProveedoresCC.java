package Cuentas_Corrientes.Controlador;
import Cuentas_Corrientes.Modelo.daoProveedoresCC;
import java.util.List;
/**
 *
 * @author visitante
 */
 //Creado por Alan Abimael Galicia Ruano; 9959-21-3632
//CAMBIO POR DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
public class clsProveedoresCC {
    private int IdProv;
    private String FechaProv;
    private String NombreProv;
    private String NitProv;
    private String FactProv;
    private Double TotFacturaProv;

    public int getIdProv() {
        return IdProv;
    }

    public void setIdProv(int IdProv) {
        this.IdProv = IdProv;
    }

    public String getFechaProv() {
        return FechaProv;
    }

    public void setFechaProv(String FechaProv) {
        this.FechaProv = FechaProv;
    }

    public String getNombreProv() {
        return NombreProv;
    }

    public void setNombreProv(String NombreProv) {
        this.NombreProv = NombreProv;
    }

    public String getNitProv() {
        return NitProv;
    }

    public void setNitProv(String NitProv) {
        this.NitProv = NitProv;
    }

    public String getFactProv() {
        return FactProv;
    }

    public void setFactProv(String FactProv) {
        this.FactProv = FactProv;
    }

    public Double getTotFacturaProv() {
        return TotFacturaProv;
    }

    public void setTotFacturaProv(Double TotFacturaProv) {
        this.TotFacturaProv = TotFacturaProv;
    }

    public clsProveedoresCC(int IdProv, String FechaProv, String NombreProv, String NitProv, String FactProv, Double TotFacturaProv) {
        this.IdProv = IdProv;
        this.FechaProv = FechaProv;
        this.NombreProv = NombreProv;
        this.NitProv = NitProv;
        this.FactProv = FactProv;
        this.TotFacturaProv = TotFacturaProv;
    }

    public clsProveedoresCC(int IdProv, String FechaProv, String NombreProv, String NitProv, String FactProv) {
        this.IdProv = IdProv;
        this.FechaProv = FechaProv;
        this.NombreProv = NombreProv;
        this.NitProv = NitProv;
        this.FactProv = FactProv;
    }

    public clsProveedoresCC(int IdProv, String FechaProv, String NombreProv, String NitProv) {
        this.IdProv = IdProv;
        this.FechaProv = FechaProv;
        this.NombreProv = NombreProv;
        this.NitProv = NitProv;
    }

    public clsProveedoresCC(int IdProv, String FechaProv, String NombreProv) {
        this.IdProv = IdProv;
        this.FechaProv = FechaProv;
        this.NombreProv = NombreProv;
    }

    public clsProveedoresCC(int IdProv, String FechaProv) {
        this.IdProv = IdProv;
        this.FechaProv = FechaProv;
    }

    public clsProveedoresCC(int IdProv) {
        this.IdProv = IdProv;
    }

    public clsProveedoresCC() {
    }
    
    //Metodos de acceso a la capa controlador   
 public List<clsProveedoresCC> getListadoT()
    {
        daoProveedoresCC daoProveedoresCC = new daoProveedoresCC();
        List<clsProveedoresCC> ListadoProveedores = daoProveedoresCC.consultaProveedores();
        return ListadoProveedores;
    }
}