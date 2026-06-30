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

public class Book_setCategory_80507620410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term1227;

    public Book_setCategory_80507620410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1190 = new Long(305759998609888272L);
        ArrayList term1204 = new ArrayList();
        Long term1209 = new Long(-8654565919063661957L);
        ArrayList term1223 = new ArrayList();
        term1189 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1208 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1189, term1189.getClass(), "id", term1190);
        setField(term1189, term1189.getClass(), "name", "whBvTVIIlC");
        setField(term1189, term1189.getClass(), "authors", term1204);
        setField(term1208, term1208.getClass(), "id", term1209);
        setField(term1208, term1208.getClass(), "name", "IgRJUzaCwW");
        setField(term1208, term1208.getClass(), "books", term1223);
        setField(term1189, term1189.getClass(), "category", term1208);
        Long term1228 = new Long(-5248475803419977214L);
        ArrayList term1242 = new ArrayList();
        term1227 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1227, term1227.getClass(), "id", term1228);
        setField(term1227, term1227.getClass(), "name", "JUmudUmaaV");
        setField(term1227, term1227.getClass(), "books", term1242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Category");
        Object[] args = new Object[1];
        args[0] = term1227;
        callMethod(klass, "setCategory", argTypes, term1189, args);
    }

};


