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

public class Book_setIsbn_16507486057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;

    public Book_setIsbn_16507486057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term594 = new Long(-4325723315152823407L);
        Long term622 = new Long(2535595959091595249L);
        term593 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term621 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term593, term593.getClass(), "id", term594);
        setField(term593, term593.getClass(), "title", "vrQLuWIDJX");
        setField(term593, term593.getClass(), "isbn", "flxyYxBRtu");
        setIntField(term593, term593.getClass(), "pageCount", -1955890973);
        setField(term621, term621.getClass(), "id", term622);
        setField(term621, term621.getClass(), "firstName", "OclPbYPkcH");
        setField(term621, term621.getClass(), "lastName", "IoAlmYsBwc");
        setField(term593, term593.getClass(), "author", term621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setIsbn", argTypes, term593, args);
    }

};


