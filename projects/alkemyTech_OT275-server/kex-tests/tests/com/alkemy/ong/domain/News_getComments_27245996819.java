package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class News_getComments_27245996819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19628;

    public News_getComments_27245996819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19628 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        setField(term19628, term19628.getClass(), "id", null);
        setField(term19628, term19628.getClass(), "name", null);
        setField(term19628, term19628.getClass(), "content", null);
        setField(term19628, term19628.getClass(), "imageUrl", null);
        setField(term19628, term19628.getClass(), "category", null);
        setField(term19628, term19628.getClass(), "comments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term19628, args);
    }

};


