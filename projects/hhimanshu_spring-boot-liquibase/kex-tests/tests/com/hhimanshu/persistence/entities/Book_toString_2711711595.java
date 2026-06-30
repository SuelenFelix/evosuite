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

public class Book_toString_2711711595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public Book_toString_2711711595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term314 = new Integer(1227103734);
        term299 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Book"));
        Object term313 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Author"));
        setIntField(term299, term299.getClass(), "id", -1922583790);
        setField(term299, term299.getClass(), "name", "MxlszYVzRf");
        setField(term313, term313.getClass(), "id", term314);
        setField(term313, term313.getClass(), "name", "LQFpaHEwXR");
        setField(term299, term299.getClass(), "author", term313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term299, args);
    }

};


