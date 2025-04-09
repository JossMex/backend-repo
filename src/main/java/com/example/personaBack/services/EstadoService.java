package com.example.personaBack.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import com.example.personaBack.models.Estado;
import com.example.personaBack.repository.EstadoRepository;

@Service
public class EstadoService implements EstadoRepository{
    
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Estado> findAllByCountry(int Id){
        List<Estado> estadosRespuesta = new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
            for (int i = 0; i < estados.size(); i++) {
                if(estados.get(i).getPais().getId() == Id){
                    estadosRespuesta.add(estados.get(i));
                }
            }
            return estadosRespuesta;
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void deleteAllInBatch(Iterable<Estado> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public Estado getOne(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public Estado getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public Estado getReferenceById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    @SuppressWarnings("null")
    public List<Estado> findAllById(Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> S save(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public Optional<Estado> findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public boolean existsById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void delete(Estado entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void deleteAllById(Iterable<? extends Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public void deleteAll(Iterable<? extends Estado> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    @Override
    @SuppressWarnings("null")
    public Page<Estado> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> long count(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("null")
    public <S extends Estado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   


}