package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Author_canEqual_78911579812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3874;
     Object term3923;

    public Author_canEqual_78911579812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3875 = new Long(5219030281405653303L);
        Long term3890 = new Long(-8471550651709805183L);
        Long term3905 = new Long(-948292411727204525L);
        ArrayList term3919 = new ArrayList();
        term3874 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3889 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3904 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3874, term3874.getClass(), "id", term3875);
        setField(term3874, term3874.getClass(), "name", "sQvGcVjdEx");
        setField(term3889, term3889.getClass(), "id", term3890);
        setField(term3889, term3889.getClass(), "name", "rLHAoqXgPh");
        setField(term3904, term3904.getClass(), "id", term3905);
        setField(term3904, term3904.getClass(), "name", "zUlRdimJtU");
        setField(term3889, term3889.getClass(), "city", term3904);
        setField(term3874, term3874.getClass(), "zipcode", term3889);
        setField(term3874, term3874.getClass(), "books", term3919);
        term3923 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3923;
        callMethod(klass, "canEqual", argTypes, term3874, args);
    }

};


