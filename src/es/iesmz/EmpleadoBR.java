package es.iesmz;

public class EmpleadoBR {

    private TipoEmpleado tipo;
    private static float salarioBase;
    private static float ventaMes;
    private static float horasExtra;
    //private float salarioBruto;

    public EmpleadoBR(TipoEmpleado tipo, float salarioBase, float ventaMes, float horasExtra) {
        this.tipo = tipo;
        this.salarioBase = salarioBase;
        this.ventaMes = ventaMes;
        this.horasExtra = horasExtra;
        //this.salarioBruto= calculaSalarioBruto(tipo,ventaMes,horasExtra);
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getVentaMes() {
        return ventaMes;
    }

    public void setVentaMes(float ventaMes) {
        this.ventaMes = ventaMes;
    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventaMensual, float hExtra) {
        //Asumo que el encargado es el autónomo y el vendedor el empleado.
        float salarioBruto;
        if (tipus == TipoEmpleado.vendedor) {
            salarioBase = 1000;
            salarioBruto=salarioBase;
            if (ventaMensual >= 0) {
                if (ventaMensual >= 1000 && ventaMensual < 1500) {
                    salarioBruto += 100;
                } else if (ventaMensual >= 1500) {
                    salarioBruto += 200;
                }
            } else {
                return -1;
            }
            if (hExtra >= 0) {
                float dineroHoras = 20 * hExtra;
                salarioBruto += dineroHoras;
            } else {
                return -1;
            }

        } else if (tipus == TipoEmpleado.encargado) {
            salarioBase=1500;
            salarioBruto = salarioBase;
            if (ventaMensual >= 0) {
                if (ventaMensual >= 1000 && ventaMensual < 1500) {
                    salarioBruto += 100;
                } else if (ventaMensual >= 1500) {
                    salarioBruto += 200;
                }
            } else {
                return -1;
            }
            if (hExtra >= 0) {
                float dineroHoras = 20 * hExtra;
                salarioBruto += dineroHoras;

            } else {
                return -1;
            }

        }else{
            return -1;
        }
        return salarioBruto;
    }


    public static float calculaSalarioNeto(float salarioBruto){
        float salarioNeto=0, retencion;
        if(salarioBruto>0 && salarioBruto<1000){
            salarioNeto=salarioBruto;

        }else if(salarioBruto>=1000 && salarioBruto<1500){
            retencion=salarioBruto*0.16f;
            salarioNeto=salarioBruto-retencion;
        }else if(salarioBruto>=1500){
            retencion=salarioBruto*0.18f;
            salarioNeto=salarioBruto-retencion;
        }else{
            return -1;
        }
        return salarioNeto;
    }


}
