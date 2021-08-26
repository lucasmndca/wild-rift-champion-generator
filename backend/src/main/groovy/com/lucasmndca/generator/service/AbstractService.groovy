package com.lucasmndca.generator.service

import org.springframework.stereotype.Component

@Component
abstract class AbstractService<T> {

    abstract T createEntity(T Entity)

    abstract T updateEntity(T Entity)

    abstract Boolean deleteEntity(T Entity)

    abstract T getEntity(Long id)

    abstract List<T> getAll()

}
