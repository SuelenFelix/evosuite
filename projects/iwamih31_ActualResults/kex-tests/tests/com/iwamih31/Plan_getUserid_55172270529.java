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

public class Plan_getUserid_55172270529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34841;

    public Plan_getUserid_55172270529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34841 = newInstance(Class.forName("com.iwamih31.Plan"));
        setField(term34841, term34841.getClass(), "id", null);
        setField(term34841, term34841.getClass(), "user_id", null);
        setField(term34841, term34841.getClass(), "start_date", null);
        setField(term34841, term34841.getClass(), "last_date", null);
        setField(term34841, term34841.getClass(), "day_of_week", null);
        setField(term34841, term34841.getClass(), "subject", null);
        setField(term34841, term34841.getClass(), "start_time", null);
        setField(term34841, term34841.getClass(), "minutes", null);
        setField(term34841, term34841.getClass(), "items", null);
        setField(term34841, term34841.getClass(), "note", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser_id", argTypes, term34841, args);
    }

};


