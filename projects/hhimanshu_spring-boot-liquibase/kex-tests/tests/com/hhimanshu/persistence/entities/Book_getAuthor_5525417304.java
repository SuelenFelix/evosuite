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

public class Book_getAuthor_5525417304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;

    public Book_getAuthor_5525417304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term265 = new Integer(-2038273078);
        term250 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Book"));
        Object term264 = newInstance(Class.forName("com.hhimanshu.persistence.entities.Author"));
        setIntField(term250, term250.getClass(), "id", 391863371);
        setField(term250, term250.getClass(), "name", "NRdvgJlhkX");
        setField(term264, term264.getClass(), "id", term265);
        setField(term264, term264.getClass(), "name", "uuaPigETmJ");
        setField(term250, term250.getClass(), "author", term264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hhimanshu.persistence.entities.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term250, args);
    }

};


