package br.com.services;

import br.com.entity.Conta;
import br.com.interfaces.ServicesInterface;
import br.com.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService implements ServicesInterface<Object> {

    @Autowired
    private ContaRepository contaRepository;

//    //SalvarConta
//    public Conta saveConta(Conta conta) {
//        return contaRepository.save(conta);
//    }
//
//    //ListarConta
//    public List<Conta> listConta() {
//        return contaRepository.findAll();
//    }


    @Override
    public void save(Object object) {
        contaRepository.save((Conta) object);
    }

    @Override
    public void update(Object Object) {
    }

    @Override
    public Object listAll() {
        return contaRepository.findAll();
    }

    @Override
    public Object listById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
