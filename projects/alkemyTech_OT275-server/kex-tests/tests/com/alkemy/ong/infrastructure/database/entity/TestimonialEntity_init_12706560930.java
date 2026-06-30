package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class TestimonialEntity_init_12706560930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2369;
     Object term2407;
     Object term2410;

    public TestimonialEntity_init_12706560930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2369 = new Long(5262507301787091109L);
        term2407 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2407, term2407.getClass(), "nanos", 632000000);
        setLongField(term2407, term2407.getClass(), "fastTime", 1442359734000L);
        setField(term2407, term2407.getClass(), "cdate", null);
        term2410 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.sql.Timestamp");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term2369;
        args[1] = "XqgfKFvPSD";
        args[2] = "JiVRgTZvKc";
        args[3] = "XPKmummaqg";
        args[4] = term2407;
        args[5] = term2410;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


