package entradablogaba;
/**
 *
 * @author Adrian Bravo
 * @version 2.4
 */
public class EntradaBlogABA {
			
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;

    /**
     *Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
		public EntradaBlogABA(int id, String autor, String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}

    /**
     * Devuelve el nombre de la Entrada y su autor
     * @return
     */
    @Override
		public String toString() {
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
    /**
     * Devuelve el número de la entrada
     * @return
     */
		public int getId() {
			return this.id;
		}

    /**
     *devuelve el texto completo de la entrada
     * @return
     */
		public String getTexto() {
			return this.texto;
		}
		


    /**
     * devuelve el nombre del autor de la entrada en mayúsculas
     * @return
     */
		public String getAutor() {
			return this.autor;
		}

    /**
     * Introduce como argumentos el ID del post, Autor y Entrada para imprimirlo en pantalla
     * @param args
     */
		public static void main(String[] args) {
			EntradaBlogABA e1=new EntradaBlogABA(1,"Adrian","Correciones realizadas");
			System.out.println(e1);
		}
}
