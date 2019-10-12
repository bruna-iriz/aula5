package br.com.controller;

import br.com.entity.Conta;
import br.com.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Conta conta) {
        try {
            contaRepository.save(conta);

            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("" + e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping
    public Object listAll() {
        try {
            return contaRepository.findAll();
        } catch (Exception e) {
            System.out.println("" + e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public Optional<Conta> listById(@PathVariable(value = "id") Long id) {
        return contaRepository.findById(id);
    }


    @PutMapping
    public ResponseEntity<?> update(@Valid @RequestBody Conta conta) {
        try {
            contaRepository.save(conta);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("" + e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        try {
            contaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(" + e");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return null;
    }


}


