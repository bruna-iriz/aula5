package br.com.services;

import br.com.entity.Transferencia;
import br.com.interfaces.ServicesInterface;
import br.com.interfaces.TransferenciaInterface;
import br.com.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaService implements ServicesInterface<Object>, TransferenciaInterface {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Override
    public void save(Object object) {
        transferenciaRepository.save((Transferencia) object);
    }

    @Override
    public void update(Object Object) {
    }

    @Override
    public Object listAll() {
        return
                transferenciaRepository.findAll();
    }

    @Override
    public Object listById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
