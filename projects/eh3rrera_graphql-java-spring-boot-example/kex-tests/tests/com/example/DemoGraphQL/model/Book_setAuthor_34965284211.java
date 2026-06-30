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

public class Book_setAuthor_34965284211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;
     Object term1052;

    public Book_setAuthor_34965284211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term998 = new Long(8428634514691209827L);
        Long term1026 = new Long(-2585684163342970173L);
        term997 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term1025 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term997, term997.getClass(), "id", term998);
        setField(term997, term997.getClass(), "title", "gGSMzuGICf");
        setField(term997, term997.getClass(), "isbn", "hxCBltsObl");
        setIntField(term997, term997.getClass(), "pageCount", -522618178);
        setField(term1025, term1025.getClass(), "id", term1026);
        setField(term1025, term1025.getClass(), "firstName", "BndsHwAFMv");
        setField(term1025, term1025.getClass(), "lastName", "GzFkzHGYFt");
        setField(term997, term997.getClass(), "author", term1025);
        Long term1053 = new Long(8059786003080744426L);
        term1052 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term1052, term1052.getClass(), "id", term1053);
        setField(term1052, term1052.getClass(), "firstName", "tShwQLRGNe");
        setField(term1052, term1052.getClass(), "lastName", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.DemoGraphQL.model.Author");
        Object[] args = new Object[1];
        args[0] = term1052;
        callMethod(klass, "setAuthor", argTypes, term997, args);
    }

};


