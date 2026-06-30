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
import java.lang.Long;

public class Role_getDescription_9225385924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11882;

    public Role_getDescription_9225385924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11883 = new Long(-769824408235898287L);
        term11882 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term11882, term11882.getClass(), "id", term11883);
        setField(term11882, term11882.getClass(), "name", "uYnmxkwLfB");
        setField(term11882, term11882.getClass(), "description", "RVZTQxYOUO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term11882, args);
    }

};


