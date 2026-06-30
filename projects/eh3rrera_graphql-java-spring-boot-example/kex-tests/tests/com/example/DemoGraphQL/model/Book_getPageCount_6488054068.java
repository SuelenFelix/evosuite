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

public class Book_getPageCount_6488054068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public Book_getPageCount_6488054068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term711 = new Long(-5476826692763582090L);
        Long term739 = new Long(-872011222785455006L);
        term710 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term738 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term710, term710.getClass(), "id", term711);
        setField(term710, term710.getClass(), "title", "OWDIEULEFu");
        setField(term710, term710.getClass(), "isbn", "dWRymuLBtr");
        setIntField(term710, term710.getClass(), "pageCount", -2038273078);
        setField(term738, term738.getClass(), "id", term739);
        setField(term738, term738.getClass(), "firstName", "AijpHYOFuy");
        setField(term738, term738.getClass(), "lastName", "SbAoxhfrkn");
        setField(term710, term710.getClass(), "author", term738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageCount", argTypes, term710, args);
    }

};


