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

public class Book_getAuthor_12662787010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902;

    public Book_getAuthor_12662787010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term903 = new Long(-6573104506744284592L);
        Long term931 = new Long(-4920224193275732920L);
        term902 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term930 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term902, term902.getClass(), "id", term903);
        setField(term902, term902.getClass(), "title", "nyiiPDVjAc");
        setField(term902, term902.getClass(), "isbn", "aKnKipADSo");
        setIntField(term902, term902.getClass(), "pageCount", 1725571209);
        setField(term930, term930.getClass(), "id", term931);
        setField(term930, term930.getClass(), "firstName", "wSQxaModmm");
        setField(term930, term930.getClass(), "lastName", "UlajhuVLaP");
        setField(term902, term902.getClass(), "author", term930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term902, args);
    }

};


