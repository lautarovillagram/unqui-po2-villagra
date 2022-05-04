package ar.edu.unq.po.tp5;

import java.util.ArrayList;
import java.util.List;

public interface Agencia {

	List<Factura> facturas = new ArrayList<Factura>();

	public void registrarPago(Factura factura);

}
