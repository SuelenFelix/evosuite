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

public class Author_setName_3863743678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3482;

    public Author_setName_3863743678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3483 = new Long(-4360569253593381888L);
        Long term3498 = new Long(1457594663983990440L);
        Long term3513 = new Long(3452833434644634217L);
        ArrayList term3527 = new ArrayList();
        term3482 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3497 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3512 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3482, term3482.getClass(), "id", term3483);
        setField(term3482, term3482.getClass(), "name", "aNWLJdrZMq");
        setField(term3497, term3497.getClass(), "id", term3498);
        setField(term3497, term3497.getClass(), "name", "HHmNoYxIGj");
        setField(term3512, term3512.getClass(), "id", term3513);
        setField(term3512, term3512.getClass(), "name", "PtirvZmsGt");
        setField(term3497, term3497.getClass(), "city", term3512);
        setField(term3482, term3482.getClass(), "zipcode", term3497);
        setField(term3482, term3482.getClass(), "books", term3527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        callMethod(klass, "setName", argTypes, term3482, args);
    }

};


