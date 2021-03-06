/**
 * This class is generated by jOOQ
 */
package sigma.dbgen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import sigma.dbgen.DefaultSchema;
import sigma.dbgen.Keys;
import sigma.dbgen.tables.records.CatalogoProductosRecord;


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
public class CatalogoProductos extends TableImpl<CatalogoProductosRecord> {

	private static final long serialVersionUID = 1241339957;

	/**
	 * The reference instance of <code>catalogo_productos</code>
	 */
	public static final CatalogoProductos CATALOGO_PRODUCTOS = new CatalogoProductos();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CatalogoProductosRecord> getRecordType() {
		return CatalogoProductosRecord.class;
	}

	/**
	 * The column <code>catalogo_productos.descripcion</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> DESCRIPCION = createField("descripcion", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.desviacion</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> DESVIACION = createField("desviacion", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.existencia</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> EXISTENCIA = createField("existencia", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.fecha_sync</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> FECHA_SYNC = createField("fecha_sync", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.id_categoria</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> ID_CATEGORIA = createField("id_categoria", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.id_marca</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> ID_MARCA = createField("id_marca", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.id_producto</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> ID_PRODUCTO = createField("id_producto", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.id_tipo_producto</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> ID_TIPO_PRODUCTO = createField("id_tipo_producto", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.id_unidad</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> ID_UNIDAD = createField("id_unidad", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.minimo</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> MINIMO = createField("minimo", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.precio_compra</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> PRECIO_COMPRA = createField("precio_compra", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.precio_venta</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> PRECIO_VENTA = createField("precio_venta", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.precio_venta_mayoreo</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> PRECIO_VENTA_MAYOREO = createField("precio_venta_mayoreo", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.promedio</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> PROMEDIO = createField("promedio", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.sku</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> SKU = createField("sku", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.sugerido</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> SUGERIDO = createField("sugerido", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.sync</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> SYNC = createField("sync", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.techo</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> TECHO = createField("techo", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.total_ventas</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> TOTAL_VENTAS = createField("total_ventas", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.db_state</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> DB_STATE = createField("db_state", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>catalogo_productos.image_preview</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> IMAGE_PREVIEW = createField("image_preview", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.logo</code>.
	 */
	public final TableField<CatalogoProductosRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>catalogo_productos.custom</code>.
	 */
	public final TableField<CatalogoProductosRecord, Integer> CUSTOM = createField("custom", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * Create a <code>catalogo_productos</code> table reference
	 */
	public CatalogoProductos() {
		this("catalogo_productos", null);
	}

	/**
	 * Create an aliased <code>catalogo_productos</code> table reference
	 */
	public CatalogoProductos(String alias) {
		this(alias, CATALOGO_PRODUCTOS);
	}

	private CatalogoProductos(String alias, Table<CatalogoProductosRecord> aliased) {
		this(alias, aliased, null);
	}

	private CatalogoProductos(String alias, Table<CatalogoProductosRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CatalogoProductosRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CATALOGO_PRODUCTOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CatalogoProductosRecord> getPrimaryKey() {
		return Keys.PK_CATALOGO_PRODUCTOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CatalogoProductosRecord>> getKeys() {
		return Arrays.<UniqueKey<CatalogoProductosRecord>>asList(Keys.PK_CATALOGO_PRODUCTOS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatalogoProductos as(String alias) {
		return new CatalogoProductos(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CatalogoProductos rename(String name) {
		return new CatalogoProductos(name, null);
	}
}
