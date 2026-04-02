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

public class Book_getTitle_8558580214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;

    public Book_getTitle_8558580214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term287 = new Long(4872422362414183754L);
        Long term315 = new Long(6811161968424632369L);
        term286 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term314 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term286, term286.getClass(), "id", term287);
        setField(term286, term286.getClass(), "title", "MxlszYVzRf");
        setField(term286, term286.getClass(), "isbn", "LQFpaHEwXR");
        setIntField(term286, term286.getClass(), "pageCount", 391863371);
        setField(term314, term314.getClass(), "id", term315);
        setField(term314, term314.getClass(), "firstName", "oVcInYnLWB");
        setField(term314, term314.getClass(), "lastName", "aJlieCFVtF");
        setField(term286, term286.getClass(), "author", term314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term286, args);
    }

};


