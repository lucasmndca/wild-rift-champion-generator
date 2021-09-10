package com.lucasmndca.generator.service

import org.springframework.stereotype.Component

@Component
abstract class AbstractService<T> {

    abstract T createEntity(T entity)

    abstract T updateEntity(T entity)

    abstract Boolean deleteEntity(T entity)

    abstract T getEntity(Long id)

    abstract List<T> getAll()

}
