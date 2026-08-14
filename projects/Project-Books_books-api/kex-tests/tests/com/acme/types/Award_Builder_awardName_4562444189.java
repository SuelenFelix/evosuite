package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Award_Builder_awardName_4562444189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228;

    public Award_Builder_awardName_4562444189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term4228, term4228.getClass(), "id", null);
        setField(term4228, term4228.getClass(), "awardName", null);
        setField(term4228, term4228.getClass(), "category", null);
        setIntField(term4228, term4228.getClass(), "year", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.AwardName");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "awardName", argTypes, term4228, args);
    }

};


