package hibernate1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@ GeneratedValue ( strategy = GenerationType.IDENTITY )
	private int id;
	@Column
	private String name;
	@Column
	private float prices;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrices() {
		return prices;
	}
	public void setPrices(float prices) {
		this.prices = prices;
	}
	@Override
	public String toString() {
		return String.format("Products [id=%s, name=%s, prices=%s]", id, name, prices);
	}
	
	

}
