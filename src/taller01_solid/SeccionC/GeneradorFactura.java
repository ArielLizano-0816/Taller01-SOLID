package taller01_solid;

public interface GeneradorFactura {
    Factura generar(Compra compra, double impuestos);
}
