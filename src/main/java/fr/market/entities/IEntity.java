package fr.market.entities;

import java.io.Serializable;

public interface IEntity extends Serializable {
	public Integer getId();
	public void setId(Integer id);
}
