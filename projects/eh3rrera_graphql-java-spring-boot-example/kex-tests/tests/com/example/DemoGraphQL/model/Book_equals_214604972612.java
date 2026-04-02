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

public class Book_equals_214604972612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139;
     Object term1194;

    public Book_equals_214604972612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1140 = new Long(-4365849114644724155L);
        Long term1168 = new Long(2486810210675247493L);
        term1139 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term1167 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term1139, term1139.getClass(), "id", term1140);
        setField(term1139, term1139.getClass(), "title", "xLbjWUgOIL");
        setField(term1139, term1139.getClass(), "isbn", "jDtqGUpnZN");
        setIntField(term1139, term1139.getClass(), "pageCount", 1134449235);
        setField(term1167, term1167.getClass(), "id", term1168);
        setField(term1167, term1167.getClass(), "firstName", "nGKItKLYNC");
        setField(term1167, term1167.getClass(), "lastName", "UiUYnPrcCi");
        setField(term1139, term1139.getClass(), "author", term1167);
        term1194 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1194;
        callMethod(klass, "equals", argTypes, term1139, args);
    }

};


