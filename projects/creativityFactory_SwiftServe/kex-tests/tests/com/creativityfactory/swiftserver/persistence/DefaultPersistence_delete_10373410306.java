package com.creativityfactory.swiftserver.persistence;

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
import static com.creativityfactory.swiftserver.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultPersistence_delete_10373410306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term68;

    public DefaultPersistence_delete_10373410306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("com.creativityfactory.swiftserver.persistence.DefaultPersistence"));
        setField(term67, term67.getClass(), "model", null);
        setField(term67, term67.getClass(), "api", null);
        term68 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.persistence.DefaultPersistence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68;
        callMethod(klass, "delete", argTypes, term67, args);
    }

};


