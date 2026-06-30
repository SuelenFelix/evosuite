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
import java.lang.Integer;

public class Book_init_13005511281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term117;

    public Book_init_13005511281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = new Integer(568599855);
        Integer term118 = new Integer(-1922583790);
        term117 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Author"));
        setField(term117, term117.getClass(), "id", term118);
        setField(term117, term117.getClass(), "name", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.hhimanshu.persistence.entities.Author");
        Object[] args = new Object[3];
        args[0] = term103;
        args[1] = "jJCZpVmanW";
        args[2] = term117;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


