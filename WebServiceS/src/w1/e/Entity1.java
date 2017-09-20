package w1.e;

import java.io.Serializable;

public class Entity1 implements Serializable {
	private Integer id;
	private String name;
	private String column1;

	public Entity1() {
	}

	public Entity1(Integer id, String name, String column1) {
		this.id = id;
		this.name = name;
		this.column1 = column1;
	}

	@Override
	public String toString() {
		return "Entity1 [id=" + id + ", name=" + name + ", column1=" + column1 + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

}
