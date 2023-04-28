package com.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.Workers;
import com.crud.Repository.WorkersRepository;

@Service
public class WorkersServiceImpl implements WorkersService {
	
	
	@Autowired
	private WorkersRepository workersRepository;
	

	@Override
	public void saveWorkers(Workers workers) {
		
	 workersRepository.save(workers);
		
		
		
	}

	@Override
	public List<Workers> findAllWorkers() {
	 List<Workers> workers = workersRepository.findAll();
		return workers;
	}

	@Override
	public void deleteWorkersbyId(long id) {
		workersRepository.deleteById(id);
		
	}

	@Override
	public Workers findById(long id) {
		 Optional<Workers> findById = workersRepository.findById(id);
		 Workers workers = findById .get();
		return  workers;
	}

	@Override
	public void updateWorkers(Workers work) {
		  workersRepository.save(work);
		
		
	}



	
}
