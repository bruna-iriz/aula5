package br.com.interfaces;

public interface ServicesInterface<T> {

    public void save(T Object);

    public void update(T Object);

    public Object listAll();

    public Object listById(Long id);

    public void delete(Long id);
}
