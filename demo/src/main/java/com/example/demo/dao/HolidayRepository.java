package com.example.demo.dao;

import com.example.demo.model.CreateHolidayDTO;
import com.example.demo.model.Holiday;
import com.example.demo.model.ResponseHolidayDTO;
import com.example.demo.model.UpdateHolidayDTO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.*;
import java.util.function.Function;

public class HolidayRepository implements JpaRepository<Holiday, Long> {

    @Override
    public void flush() {

    }

    @Override
    public <S extends Holiday> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Holiday> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Holiday> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Holiday getOne(Long aLong) {
        return null;
    }

    @Override
    public Holiday getById(Long aLong) {
        return null;
    }

    @Override
    public Holiday getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Holiday> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Holiday> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Holiday> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Holiday> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Holiday> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Holiday> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Holiday, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Holiday> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Holiday> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Holiday> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Holiday> findAll() {
        return null;
    }

    @Override
    public List<Holiday> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Holiday entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Holiday> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Holiday> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Holiday> findAll(Pageable pageable) {
        return null;
    }
}