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

public class Comment_setAssociatedNews_9534415820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10730;

    public Comment_setAssociatedNews_9534415820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10730 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term10730, term10730.getClass(), "id", null);
        setField(term10730, term10730.getClass(), "body", null);
        setField(term10730, term10730.getClass(), "createdBy", null);
        setField(term10730, term10730.getClass(), "associatedNews", null);
        setField(term10730, term10730.getClass(), "createTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.News");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAssociatedNews", argTypes, term10730, args);
    }

};


