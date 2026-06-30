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

public class Author_getBooks_3054741656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3322;

    public Author_getBooks_3054741656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3323 = new Long(-6587807377747738663L);
        Long term3338 = new Long(-6301101997917060727L);
        Long term3353 = new Long(8166095254618543564L);
        ArrayList term3367 = new ArrayList();
        term3322 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3337 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3352 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3322, term3322.getClass(), "id", term3323);
        setField(term3322, term3322.getClass(), "name", "HzqpegHiRq");
        setField(term3337, term3337.getClass(), "id", term3338);
        setField(term3337, term3337.getClass(), "name", "jwsfVjMoJT");
        setField(term3352, term3352.getClass(), "id", term3353);
        setField(term3352, term3352.getClass(), "name", "ZfdXfCCFDf");
        setField(term3337, term3337.getClass(), "city", term3352);
        setField(term3322, term3322.getClass(), "zipcode", term3337);
        setField(term3322, term3322.getClass(), "books", term3367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term3322, args);
    }

};


