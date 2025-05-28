package com.example.status;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusRepository repo;

    @PostMapping
    public Status insertar(@RequestBody Status status) {
        return repo.save(status);
    }

    @GetMapping
    public List<Status> consultarTodos() {
        return repo.findAll();
    }

    @GetMapping("/buscar")
    public List<Status> consultarPorNombre(@RequestParam String nombre) {
        return repo.findByNombre(nombre);
    }

    @Transactional
    @DeleteMapping("/eliminar")
    public void eliminarPorNombre(@RequestParam String nombre) {
        repo.deleteByNombre(nombre);
    }
}
