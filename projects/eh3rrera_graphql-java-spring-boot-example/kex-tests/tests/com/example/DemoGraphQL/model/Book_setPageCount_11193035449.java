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
import java.lang.Integer;

public class Book_setPageCount_11193035449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;
     Object term860;

    public Book_setPageCount_11193035449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term806 = new Long(-316468845751588286L);
        Long term834 = new Long(5127676408959197577L);
        term805 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term833 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term805, term805.getClass(), "id", term806);
        setField(term805, term805.getClass(), "title", "kuTXqwMtDB");
        setField(term805, term805.getClass(), "isbn", "Ghbwtircqb");
        setIntField(term805, term805.getClass(), "pageCount", 1227103734);
        setField(term833, term833.getClass(), "id", term834);
        setField(term833, term833.getClass(), "firstName", "xrwlQZdwCp");
        setField(term833, term833.getClass(), "lastName", "IDCWpPLRkE");
        setField(term805, term805.getClass(), "author", term833);
        term860 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term860;
        callMethod(klass, "setPageCount", argTypes, term805, args);
    }

};


