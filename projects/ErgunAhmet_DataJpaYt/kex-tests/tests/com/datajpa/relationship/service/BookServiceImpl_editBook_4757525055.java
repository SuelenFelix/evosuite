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
import java.util.ArrayList;

public class BookServiceImpl_editBook_4757525055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;
     Object term234;

    public BookServiceImpl_editBook_4757525055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = new Long(2486810210675247493L);
        Long term249 = new Long(7009926388951271268L);
        Long term251 = new Long(-7672528020740371001L);
        Long term253 = new Long(-4502405999831680926L);
        Long term255 = new Long(1967728129628047933L);
        ArrayList term247 = new ArrayList();
        ((ArrayList) term247).add(term249);
        ((ArrayList) term247).add(term251);
        ((ArrayList) term247).add(term253);
        ((ArrayList) term247).add(term255);
        Long term259 = new Long(2120084523938730454L);
        term234 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term234, term234.getClass(), "name", "MjGYSRKTNF");
        setField(term234, term234.getClass(), "authorIds", term247);
        setField(term234, term234.getClass(), "categoryId", term259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.service.BookServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Object[] args = new Object[2];
        args[0] = term232;
        args[1] = term234;
        callMethod(klass, "editBook", argTypes, null, args);
    }

};


