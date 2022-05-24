package com.team2.u26ej2.service;

import java.util.List;

import com.team2.u26ej2.dto.Cientificos;

public interface ICientificosService {
	
	//Metodos del CRUD
	public List<Cientificos> listarCientificos(); //hacer lista de todos los cientificos
	
	public Cientificos guardarCientificos(Cientificos cientificos);	//guardar cientifico
	
	public Cientificos cientificosXID(int id); //leer todos los datos de los cientidficos
	
	public Cientificos actualizarCientificos(Cientificos cientificos); //avtualizar datos de cientificos
	
	public void eliminarCientificos(int id);// Eliminar cientificos

}