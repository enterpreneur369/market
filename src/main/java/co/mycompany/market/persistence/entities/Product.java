package co.mycompany.market.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;
    @Column(name = "nombre")
    private String name;
    @Column(name = "id_categoria")
    private Integer idCategory;
    @Column(name = "codigo_barras")
    private String barcode;
    @Column(name = "precio_venta")
    private BigDecimal sellPrice;
    @Column(name = "cantidad_stock")
    private Integer quantityStock;
    @Column(name = "estado")
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
