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

public class Book_getIsbn_691279636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;

    public Book_getIsbn_691279636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term499 = new Long(-2813493605142626659L);
        Long term527 = new Long(-8885298608300233488L);
        term498 = newInstance(Class.forName("com.example.DemoGraphQL.model.Book"));
        Object term526 = newInstance(Class.forName("com.example.DemoGraphQL.model.Author"));
        setField(term498, term498.getClass(), "id", term499);
        setField(term498, term498.getClass(), "title", "RkybSrpybU");
        setField(term498, term498.getClass(), "isbn", "xOEqzGAmDU");
        setIntField(term498, term498.getClass(), "pageCount", -616727354);
        setField(term526, term526.getClass(), "id", term527);
        setField(term526, term526.getClass(), "firstName", "eZFUvlxvGV");
        setField(term526, term526.getClass(), "lastName", "BYqFIqCKAV");
        setField(term498, term498.getClass(), "author", term526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsbn", argTypes, term498, args);
    }

};


