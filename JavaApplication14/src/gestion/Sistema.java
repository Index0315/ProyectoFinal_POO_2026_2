package gestion;

import modelo.*;

public class Sistema {
    public Empleado[] empleados = new Empleado[100];
    public Proyecto[] proyectos = new Proyecto[50];
    public Cliente[] clientes = new Cliente[500];
    public Adicional[] adicionales = new Adicional[500];
    public PaquetePromocional[] paquetes = new PaquetePromocional[200];
    public Venta[] ventas = new Venta[500];

    public int cantidadEmpleados;
    public int cantidadProyectos;
    public int cantidadClientes;
    public int cantidadAdicionales;
    public int cantidadPaquetes;
    public int cantidadVentas;

    public Empleado usuarioActual;
}
