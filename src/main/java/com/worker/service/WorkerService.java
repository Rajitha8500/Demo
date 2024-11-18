package com.worker.service;


import com.worker.entity.Worker;
import com.worker.repository.WorkerRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    private WorkerRepository workerRepository;


    public WorkerService(WorkerRepository workerRepository){
        this.workerRepository = workerRepository;
    }


    public void addWorker(Worker worker) {

        workerRepository.save(worker);
    }

    public void deleteWorker(Long id) {
        workerRepository.deleteById(id);
    }
}
