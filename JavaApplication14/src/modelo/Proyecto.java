package modelo;
public class Proyecto {
    private String codigo;
    private String nombreCondominio;
    private String direccion;
    private String distrito;
    private int cantidadTorres;
    private int pisosPorTorre;
    private String fechaEstimadaEntrega;
    private Torre[] torres = new Torre[50];
    private Adicional[] adicionales = new Adicional[100];
    private int cantidadTorresRegistradas;
    private int cantidadAdicionalesRegistrados;
}
