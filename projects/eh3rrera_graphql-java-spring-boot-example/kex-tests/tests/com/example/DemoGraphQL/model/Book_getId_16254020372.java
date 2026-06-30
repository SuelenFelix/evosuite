package com.example.DemoGraphQL.model;

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
import static com.example.DemoGraphQL.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Book_getId_16254020372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public Book_getId_16254020372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95 = new Long(6375119433582206027L);
        Long term123 = new Long(-8257434502486459194L);
        term94 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term122 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term94, term94.getClass(), "id", term95);
        setField(term94, term94.getClass(), "title", "jJCZpVmanW");
        setField(term94, term94.getClass(), "isbn", "EGtDIRbSSb");
        setIntField(term94, term94.getClass(), "pageCount", 1162663216);
        setField(term122, term122.getClass(), "id", term123);
        setField(term122, term122.getClass(), "firstName", "SzjVpOQTyS");
        setField(term122, term122.getClass(), "lastName", "MjGYSRKTNF");
        setField(term94, term94.getClass(), "author", term122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term94, args);
    }

};


