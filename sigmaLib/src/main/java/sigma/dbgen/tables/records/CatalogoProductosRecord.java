/**
 * This class is generated by jOOQ
 */
package sigma.dbgen.tables.records;


import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import sigma.dbgen.tables.CatalogoProductos;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CatalogoProductosRecord extends UpdatableRecordImpl<CatalogoProductosRecord> {

	private static final long serialVersionUID = 1782709323;

	/**
	 * Setter for <code>catalogo_productos.descripcion</code>.
	 */
	public void setDescripcion(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>catalogo_productos.descripcion</code>.
	 */
	public String getDescripcion() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>catalogo_productos.desviacion</code>.
	 */
	public void setDesviacion(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>catalogo_productos.desviacion</code>.
	 */
	public String getDesviacion() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>catalogo_productos.existencia</code>.
	 */
	public void setExistencia(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>catalogo_productos.existencia</code>.
	 */
	public String getExistencia() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>catalogo_productos.fecha_sync</code>.
	 */
	public void setFechaSync(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>catalogo_productos.fecha_sync</code>.
	 */
	public String getFechaSync() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>catalogo_productos.id_categoria</code>.
	 */
	public void setIdCategoria(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>catalogo_productos.id_categoria</code>.
	 */
	public Integer getIdCategoria() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>catalogo_productos.id_marca</code>.
	 */
	public void setIdMarca(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>catalogo_productos.id_marca</code>.
	 */
	public Integer getIdMarca() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>catalogo_productos.id_producto</code>.
	 */
	public void setIdProducto(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>catalogo_productos.id_producto</code>.
	 */
	public Integer getIdProducto() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>catalogo_productos.id_tipo_producto</code>.
	 */
	public void setIdTipoProducto(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>catalogo_productos.id_tipo_producto</code>.
	 */
	public Integer getIdTipoProducto() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>catalogo_productos.id_unidad</code>.
	 */
	public void setIdUnidad(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>catalogo_productos.id_unidad</code>.
	 */
	public Integer getIdUnidad() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>catalogo_productos.minimo</code>.
	 */
	public void setMinimo(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>catalogo_productos.minimo</code>.
	 */
	public Integer getMinimo() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>catalogo_productos.precio_compra</code>.
	 */
	public void setPrecioCompra(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>catalogo_productos.precio_compra</code>.
	 */
	public String getPrecioCompra() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>catalogo_productos.precio_venta</code>.
	 */
	public void setPrecioVenta(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>catalogo_productos.precio_venta</code>.
	 */
	public String getPrecioVenta() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>catalogo_productos.precio_venta_mayoreo</code>.
	 */
	public void setPrecioVentaMayoreo(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>catalogo_productos.precio_venta_mayoreo</code>.
	 */
	public String getPrecioVentaMayoreo() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>catalogo_productos.promedio</code>.
	 */
	public void setPromedio(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>catalogo_productos.promedio</code>.
	 */
	public String getPromedio() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>catalogo_productos.sku</code>.
	 */
	public void setSku(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>catalogo_productos.sku</code>.
	 */
	public String getSku() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>catalogo_productos.sugerido</code>.
	 */
	public void setSugerido(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>catalogo_productos.sugerido</code>.
	 */
	public String getSugerido() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>catalogo_productos.sync</code>.
	 */
	public void setSync(Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>catalogo_productos.sync</code>.
	 */
	public Integer getSync() {
		return (Integer) getValue(16);
	}

	/**
	 * Setter for <code>catalogo_productos.techo</code>.
	 */
	public void setTecho(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>catalogo_productos.techo</code>.
	 */
	public String getTecho() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>catalogo_productos.total_ventas</code>.
	 */
	public void setTotalVentas(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>catalogo_productos.total_ventas</code>.
	 */
	public String getTotalVentas() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>catalogo_productos.db_state</code>.
	 */
	public void setDbState(Integer value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>catalogo_productos.db_state</code>.
	 */
	public Integer getDbState() {
		return (Integer) getValue(19);
	}

	/**
	 * Setter for <code>catalogo_productos.image_preview</code>.
	 */
	public void setImagePreview(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>catalogo_productos.image_preview</code>.
	 */
	public String getImagePreview() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>catalogo_productos.logo</code>.
	 */
	public void setLogo(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>catalogo_productos.logo</code>.
	 */
	public String getLogo() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>catalogo_productos.custom</code>.
	 */
	public void setCustom(Integer value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>catalogo_productos.custom</code>.
	 */
	public Integer getCustom() {
		return (Integer) getValue(22);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CatalogoProductosRecord
	 */
	public CatalogoProductosRecord() {
		super(CatalogoProductos.CATALOGO_PRODUCTOS);
	}

	/**
	 * Create a detached, initialised CatalogoProductosRecord
	 */
	public CatalogoProductosRecord(String descripcion, String desviacion, String existencia, String fechaSync, Integer idCategoria, Integer idMarca, Integer idProducto, Integer idTipoProducto, Integer idUnidad, Integer minimo, String precioCompra, String precioVenta, String precioVentaMayoreo, String promedio, String sku, String sugerido, Integer sync, String techo, String totalVentas, Integer dbState, String imagePreview, String logo, Integer custom) {
		super(CatalogoProductos.CATALOGO_PRODUCTOS);

		setValue(0, descripcion);
		setValue(1, desviacion);
		setValue(2, existencia);
		setValue(3, fechaSync);
		setValue(4, idCategoria);
		setValue(5, idMarca);
		setValue(6, idProducto);
		setValue(7, idTipoProducto);
		setValue(8, idUnidad);
		setValue(9, minimo);
		setValue(10, precioCompra);
		setValue(11, precioVenta);
		setValue(12, precioVentaMayoreo);
		setValue(13, promedio);
		setValue(14, sku);
		setValue(15, sugerido);
		setValue(16, sync);
		setValue(17, techo);
		setValue(18, totalVentas);
		setValue(19, dbState);
		setValue(20, imagePreview);
		setValue(21, logo);
		setValue(22, custom);
	}
}
