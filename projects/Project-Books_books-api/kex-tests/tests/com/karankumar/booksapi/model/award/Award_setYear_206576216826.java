package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Award_setYear_206576216826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6134;
     Object term6136;

    public Award_setYear_206576216826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6134 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term6134, term6134.getClass(), "id", null);
        setField(term6134, term6134.getClass(), "awardName", null);
        setField(term6134, term6134.getClass(), "category", null);
        setIntField(term6134, term6134.getClass(), "year", 0);
        setField(term6134, term6134.getClass(), "books", null);
        term6136 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6136;
        callMethod(klass, "setYear", argTypes, term6134, args);
    }

};


