package com.example.Employee.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String job;

	private int salary;

	private long mobile;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_aid")
//	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
 @JoinColumn(name="fk_aid",referencedColumnName = "id")
 private List<Address> address;

}
