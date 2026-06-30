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

public class Book_getId_5038967912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;

    public Book_getId_5038967912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term167 = new Integer(-616727354);
        term152 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Book"));
        Object term166 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Author"));
        setIntField(term152, term152.getClass(), "id", 1162663216);
        setField(term152, term152.getClass(), "name", "SzjVpOQTyS");
        setField(term166, term166.getClass(), "id", term167);
        setField(term166, term166.getClass(), "name", "MjGYSRKTNF");
        setField(term152, term152.getClass(), "author", term166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term152, args);
    }

};


