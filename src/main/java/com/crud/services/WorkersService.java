package com.crud.services;

import java.util.List;

import com.crud.Entity.Workers;

public interface WorkersService {
	
	public void saveWorkers(Workers workers);

	List<Workers>findAllWorkers();

	public void deleteWorkersbyId(long id);

	public Workers findById(long id);

	public void updateWorkers(Workers work);

}
