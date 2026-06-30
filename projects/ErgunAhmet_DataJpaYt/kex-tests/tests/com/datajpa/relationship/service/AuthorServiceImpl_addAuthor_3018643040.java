package com.datajpa.relationship.service;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.datajpa.relationship.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AuthorServiceImpl_addAuthor_3018643040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;

    public AuthorServiceImpl_addAuthor_3018643040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310 = new Long(-8708192233349544946L);
        term297 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.AuthorRequestDto"));
        setField(term297, term297.getClass(), "name", "hRNSzYYIrc");
        setField(term297, term297.getClass(), "zipcodeId", term310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.service.AuthorServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.dto.requestDto.AuthorRequestDto");
        Object[] args = new Object[1];
        args[0] = term297;
        callMethod(klass, "addAuthor", argTypes, null, args);
    }

};


