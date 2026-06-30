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

public class Book_getCategory_2527666166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;

    public Book_getCategory_2527666166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term840 = new Long(-2068172595987555756L);
        ArrayList term854 = new ArrayList();
        Long term859 = new Long(-6292278961887936280L);
        ArrayList term873 = new ArrayList();
        term839 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term858 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term839, term839.getClass(), "id", term840);
        setField(term839, term839.getClass(), "name", "hxCBltsObl");
        setField(term839, term839.getClass(), "authors", term854);
        setField(term858, term858.getClass(), "id", term859);
        setField(term858, term858.getClass(), "name", "BndsHwAFMv");
        setField(term858, term858.getClass(), "books", term873);
        setField(term839, term839.getClass(), "category", term858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term839, args);
    }

};


