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

public class Book_setId_11953602793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;
     Object term244;

    public Book_setId_11953602793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190 = new Long(-8400487765614892086L);
        Long term218 = new Long(5270370404989704783L);
        term189 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term217 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term189, term189.getClass(), "id", term190);
        setField(term189, term189.getClass(), "title", "hRNSzYYIrc");
        setField(term189, term189.getClass(), "isbn", "RMFIsYGgne");
        setIntField(term189, term189.getClass(), "pageCount", 1484323161);
        setField(term217, term217.getClass(), "id", term218);
        setField(term217, term217.getClass(), "firstName", "NRdvgJlhkX");
        setField(term217, term217.getClass(), "lastName", "uuaPigETmJ");
        setField(term189, term189.getClass(), "author", term217);
        term244 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term244;
        callMethod(klass, "setId", argTypes, term189, args);
    }

};


