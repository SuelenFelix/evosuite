package com.hhimanshu.persistence.entities;

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
import static com.hhimanshu.persistence.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Book_getName_8605865803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public Book_getName_8605865803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term216 = new Integer(-1955890973);
        term201 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Book"));
        Object term215 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Author"));
        setIntField(term201, term201.getClass(), "id", 1484323161);
        setField(term201, term201.getClass(), "name", "hRNSzYYIrc");
        setField(term215, term215.getClass(), "id", term216);
        setField(term215, term215.getClass(), "name", "RMFIsYGgne");
        setField(term201, term201.getClass(), "author", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term201, args);
    }

};


