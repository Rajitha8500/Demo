package com.worker.controller;


import com.worker.entity.Worker;
import com.worker.service.WorkerService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/worker")
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @PostMapping("/add")
    public String addWorker( @RequestBody Worker worker
    ) {


        workerService.addWorker(worker);

        return "saved";
    }

    //http://localhost:8080/api/v1/worker?id=1

    @DeleteMapping
    public String deleteWorker(
            @RequestParam Long id
    ){
        workerService.deleteWorker(id);
        return "deleted";
    }



}
