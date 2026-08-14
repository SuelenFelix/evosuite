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

public class Plan_hashCode_7132306550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34862;

    public Plan_hashCode_7132306550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34862 = newInstance(Class.forName("com.iwamih31.Plan"));
        setField(term34862, term34862.getClass(), "id", null);
        setField(term34862, term34862.getClass(), "user_id", null);
        setField(term34862, term34862.getClass(), "start_date", null);
        setField(term34862, term34862.getClass(), "last_date", null);
        setField(term34862, term34862.getClass(), "day_of_week", null);
        setField(term34862, term34862.getClass(), "subject", null);
        setField(term34862, term34862.getClass(), "start_time", null);
        setField(term34862, term34862.getClass(), "minutes", null);
        setField(term34862, term34862.getClass(), "items", null);
        setField(term34862, term34862.getClass(), "note", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term34862, args);
    }

};


