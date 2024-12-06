package com.shakov.mapper;

public interface Mapper<F, T> {

    T mapFrom(F object);
}
