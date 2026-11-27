package modelo;
public abstract class Comprobante {
    protected String numero;
    protected String fechaEmision;
    protected double monto;
    protected Cliente cliente;
    protected Pago pago;
}
