package br.com.services;

import br.com.entity.Pessoa;
import br.com.interfaces.ServicesInterface;
import br.com.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements ServicesInterface<Object> {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void save(Object object) {
        pessoaRepository.save((Pessoa) object);
    }

    @Override
    public void update(Object Object) {
    }

    @Override
    public Object listAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Object listById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
