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

public class Book_hashCode_170023089513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1235;

    public Book_hashCode_170023089513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1236 = new Long(7009926388951271268L);
        Long term1264 = new Long(-7672528020740371001L);
        term1235 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term1263 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term1235, term1235.getClass(), "id", term1236);
        setField(term1235, term1235.getClass(), "title", "UoYtihxVaS");
        setField(term1235, term1235.getClass(), "isbn", "JDswTTCZHV");
        setIntField(term1235, term1235.getClass(), "pageCount", -883034806);
        setField(term1263, term1263.getClass(), "id", term1264);
        setField(term1263, term1263.getClass(), "firstName", "onpbIeEKoi");
        setField(term1263, term1263.getClass(), "lastName", "YRHGsAkhxb");
        setField(term1235, term1235.getClass(), "author", term1263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1235, args);
    }

};


