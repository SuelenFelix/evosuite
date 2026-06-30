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

public class Book_setTitle_12795264375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;

    public Book_setTitle_12795264375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term382 = new Long(-7237588299778557629L);
        Long term410 = new Long(6967924379644551255L);
        term381 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term409 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term381, term381.getClass(), "id", term382);
        setField(term381, term381.getClass(), "title", "ZiaGIbnzTs");
        setField(term381, term381.getClass(), "isbn", "tbcdzjIfER");
        setIntField(term381, term381.getClass(), "pageCount", -1922583790);
        setField(term409, term409.getClass(), "id", term410);
        setField(term409, term409.getClass(), "firstName", "HyxfbSQYBe");
        setField(term409, term409.getClass(), "lastName", "pCTimMblYc");
        setField(term381, term381.getClass(), "author", term409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setTitle", argTypes, term381, args);
    }

};


