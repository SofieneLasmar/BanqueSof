package org.glsid.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Employee implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmployee ;
	private String nomEmployee ;
	@ManyToOne
	@JoinColumn(name="code_emp_sup")
	private Employee employeeSup;
	@ManyToMany
	@JoinTable
	private Collection<Groupe> groupes ;
	
	
	
	public Long getCodeEmployee() {
		return codeEmployee;
	}


	public Collection<Groupe> getGroupes() {
		return groupes;
	}


	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}


	public void setCodeEmployee(Long codeEmployee) {
		this.codeEmployee = codeEmployee;
	}


	public String getNomEmployee() {
		return nomEmployee;
	}


	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}


	public Employee getEmployeeSup() {
		return employeeSup;
	}


	public void setEmployeeSup(Employee employeeSup) {
		this.employeeSup = employeeSup;
	}


	public Employee(Long codeEmployee, String nomEmployee) {
		super();
		this.codeEmployee = codeEmployee;
		this.nomEmployee = nomEmployee;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
