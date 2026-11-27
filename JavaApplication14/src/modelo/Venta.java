package modelo;
public class Venta {
    private String numeroContrato;
    private Cliente cliente;
    private UnidadInmobiliaria unidad;
    private Copropietario[] copropietarios = new Copropietario[10];
    private int cantidadCopropietarios;
    private Adicional[] adicionalesSeleccionados = new Adicional[50];
    private int cantidadAdicionales;
    private PaquetePromocional[] paquetesSeleccionados = new PaquetePromocional[20];
    private int cantidadPaquetes;
    private double montoSeparacion;
    private double montoCuotaInicial;
    private int numeroCuotasDirectas;
    private String fechaSeparacion;
    private String fechaLimiteFirma;
    private EstadoVenta estado;
    private CronogramaPago cronograma;
    private Pago[] pagos = new Pago[100];
    private int cantidadPagos;
}
