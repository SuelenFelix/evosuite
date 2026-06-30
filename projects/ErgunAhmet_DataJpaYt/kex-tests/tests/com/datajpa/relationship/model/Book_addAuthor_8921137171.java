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
import java.util.ArrayList;
import java.lang.Object;

public class Book_addAuthor_8921137171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;
     Object term429;

    public Book_addAuthor_8921137171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term392 = new Long(7009926388951271268L);
        ArrayList term406 = new ArrayList();
        Long term411 = new Long(-7672528020740371001L);
        ArrayList term425 = new ArrayList();
        term391 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term410 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term391, term391.getClass(), "id", term392);
        setField(term391, term391.getClass(), "name", "OclPbYPkcH");
        setField(term391, term391.getClass(), "authors", term406);
        setField(term410, term410.getClass(), "id", term411);
        setField(term410, term410.getClass(), "name", "IoAlmYsBwc");
        setField(term410, term410.getClass(), "books", term425);
        setField(term391, term391.getClass(), "category", term410);
        Long term430 = new Long(-4502405999831680926L);
        Long term445 = new Long(1967728129628047933L);
        Long term460 = new Long(2120084523938730454L);
        ArrayList term474 = new ArrayList();
        term429 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term444 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term459 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term429, term429.getClass(), "id", term430);
        setField(term429, term429.getClass(), "name", "TEParAifyi");
        setField(term444, term444.getClass(), "id", term445);
        setField(term444, term444.getClass(), "name", "OWDIEULEFu");
        setField(term459, term459.getClass(), "id", term460);
        setField(term459, term459.getClass(), "name", "dWRymuLBtr");
        setField(term444, term444.getClass(), "city", term459);
        setField(term429, term429.getClass(), "zipcode", term444);
        setField(term429, term429.getClass(), "books", term474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Author");
        Object[] args = new Object[1];
        args[0] = term429;
        callMethod(klass, "addAuthor", argTypes, term391, args);
    }

};


