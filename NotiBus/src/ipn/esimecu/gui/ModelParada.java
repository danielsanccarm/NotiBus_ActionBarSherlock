package ipn.esimecu.gui;
//http://www.vogella.com/tutorials/AndroidListView/article.html

public class ModelParada {
	private int codigo;
	private String nombre;
	  private boolean seleccionado;

	  public ModelParada(){
		  codigo=-1;
		  nombre=null;
		  seleccionado=false;
	  }
	  
	  public ModelParada(int codigo, String nombre, boolean selected) {
	    this.nombre = nombre;
	    this.codigo=codigo;
	    this.seleccionado = selected;
	  }

	  public int obtenerCodigo() {
		  return codigo;
	 }
	
	  public void asignarCodigo(int codigo) {
		  this.codigo = codigo;
	 }
	  
	  public String obtenerNombre() {
	    return nombre;
	  }

	  public void asignarNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public boolean isSelected() {
	    return seleccionado;
	  }

	  public void setSelected(boolean selected) {
	    this.seleccionado = selected;
	  }
}
