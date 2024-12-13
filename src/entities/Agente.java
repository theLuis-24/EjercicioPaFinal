package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private String EquipoActual;//NEW IMPLEMENTACION

    public Agente(int id, String nombre, String habilidadEspecial, String EquipoActual) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.EquipoActual = EquipoActual;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    
    public String getEquipoActual() {
        return EquipoActual;
    }

    public void setEquipoActual(String asignarEquipo) {
        this.EquipoActual = asignarEquipo;
    }


    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial + " Equipo actual: " + EquipoActual+
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
