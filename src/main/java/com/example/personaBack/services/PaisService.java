package com.example.personaBack.services;


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

import com.example.personaBack.models.Pais;
import com.example.personaBack.repository.PaisRepository;

@Service
public class PaisService implements PaisRepository{
    
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch(@SuppressWarnings("null") Iterable<Pais> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllByIdInBatch(@SuppressWarnings("null") Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Pais getOne(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Pais getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Pais getReferenceById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @SuppressWarnings("null")
    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public List<Pais> findAllById(Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> S save(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Optional<Pais> findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean existsById(@SuppressWarnings("null") Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(@SuppressWarnings("null") Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(@SuppressWarnings("null") Pais entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllById(@SuppressWarnings("null") Iterable<? extends Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll(@SuppressWarnings("null") Iterable<? extends Pais> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public List<Pais> findAll(Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Page<Pais> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Pais> long count(@SuppressWarnings("null") Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Pais> boolean exists(@SuppressWarnings("null") Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Pais, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
}
