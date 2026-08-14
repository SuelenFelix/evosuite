package com.demo.bootcamp.bll;

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
import static com.demo.bootcamp.bll.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PersonService_getPersonEntity_1188104595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term40;

    public PersonService_getPersonEntity_1188104595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("com.demo.bootcamp.bll.PersonService"));
        term40 = newInstance(Class.forName("com.demo.bootcamp.model.Person"));
        setField(term40, term40.getClass(), "name", "sjlJAEtRrb");
        setField(term40, term40.getClass(), "email", "MuLcgQHgqz");
        setIntField(term40, term40.getClass(), "age", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.bll.PersonService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.demo.bootcamp.model.Person");
        Object[] args = new Object[1];
        args[0] = term40;
        callMethod(klass, "getPersonEntity", argTypes, term39, args);
    }

};


