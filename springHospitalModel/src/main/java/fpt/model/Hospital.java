package fpt.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hospital database table.
 * 
 */
@Entity
@Table(name = "hospital")
public class Hospital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_hospital")
	private Integer idHospital;

	@Column(name="code_hospital")
	private String codeHospital;

	@Column(name="confirm_api_link")
	private String confirmApiLink;

	@Column(name="name_hospital")
	private String nameHospital;
	
	@Column(name="active_begin")
	private String activeBegin;
	
	@Column(name="address")
	private String address;
	
	@Column(name="active_end")
	private String activeEnd;

	public Hospital() {
	}

	public int getIdHospital() {
		return this.idHospital;
	}

	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}

	public String getCodeHospital() {
		return this.codeHospital;
	}

	public void setCodeHospital(String codeHospital) {
		this.codeHospital = codeHospital;
	}

	public String getConfirmApiLink() {
		return this.confirmApiLink;
	}

	public void setConfirmApiLink(String confirmApiLink) {
		this.confirmApiLink = confirmApiLink;
	}

	public String getNameHospital() {
		return this.nameHospital;
	}

	public void setNameHospital(String nameHospital) {
		this.nameHospital = nameHospital;
	}

	public String getActiveBegin() {
		return activeBegin;
	}

	public void setActiveBegin(String activeBegin) {
		this.activeBegin = activeBegin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActiveEnd() {
		return activeEnd;
	}

	public void setActiveEnd(String activeEnd) {
		this.activeEnd = activeEnd;
	}
}