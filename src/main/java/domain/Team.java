package domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {
	
	String name;
	
	public Team() {
	}

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
