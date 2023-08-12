package Mijo;

import PADRE.Empleado;

public class ScrumMaster extends Empleado {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ScrumMaster(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String ObtenerDetalles(){
        return "nombre: "+this.getNombre()+" sueldo: "+this.getSueldo() + " departamento: " + this.getDepartamento();
    }
}
