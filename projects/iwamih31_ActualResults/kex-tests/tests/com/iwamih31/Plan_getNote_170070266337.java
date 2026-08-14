package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Plan_getNote_170070266337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34849;

    public Plan_getNote_170070266337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34849 = newInstance(Class.forName("com.iwamih31.Plan"));
        setField(term34849, term34849.getClass(), "id", null);
        setField(term34849, term34849.getClass(), "user_id", null);
        setField(term34849, term34849.getClass(), "start_date", null);
        setField(term34849, term34849.getClass(), "last_date", null);
        setField(term34849, term34849.getClass(), "day_of_week", null);
        setField(term34849, term34849.getClass(), "subject", null);
        setField(term34849, term34849.getClass(), "start_time", null);
        setField(term34849, term34849.getClass(), "minutes", null);
        setField(term34849, term34849.getClass(), "items", null);
        setField(term34849, term34849.getClass(), "note", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNote", argTypes, term34849, args);
    }

};


