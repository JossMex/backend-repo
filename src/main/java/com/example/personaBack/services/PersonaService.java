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

import com.example.personaBack.models.Persona;
import com.example.personaBack.repository.PersonaRepository;

@Service
public class PersonaService implements PersonaRepository{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public void deleteAllInBatch(Iterable<Persona> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Persona getOne(Integer id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Persona getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Persona getReferenceById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public List<Persona> findAllById(Iterable<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }

    @SuppressWarnings("null")
    @Override
    public Optional<Persona> findById(Integer id) {
        return personaRepository.findById(id);
    }

    @SuppressWarnings("null")
    @Override
    public boolean existsById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }

    @SuppressWarnings("null")
    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public void deleteAll(Iterable<? extends Persona> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public List<Persona> findAll(Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public Page<Persona> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> long count(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("null")
    @Override
    public <S extends Persona, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
