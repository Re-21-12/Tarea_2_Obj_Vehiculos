package tarea_2;

public class Carros {
//cantidad de carros
private int cantidad_carros;
private double velocidad_promedio;
public int getCantidad_carros() {
	return cantidad_carros;
}

public void setCantidad_carros(int cantidad_carros) {
	this.cantidad_carros = cantidad_carros;
}

public int[] carros_en_pista(int cantidad_carros) {
return new int[cantidad_carros];
}

public double getVelocidad_promedio() {
	return velocidad_promedio;
}

public void setVelocidad_promedio(double velocidad_promedio) {
	this.velocidad_promedio = velocidad_promedio;
}


}
