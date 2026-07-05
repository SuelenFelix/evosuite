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

public class CategoryEntity_init_58644535412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17058;
     Object term17096;
     Object term17099;

    public CategoryEntity_init_58644535412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17058 = new Long(-7884871963229073324L);
        term17096 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term17096, term17096.getClass(), "nanos", 974000000);
        setLongField(term17096, term17096.getClass(), "fastTime", 1267369425000L);
        setField(term17096, term17096.getClass(), "cdate", null);
        term17099 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.sql.Timestamp");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term17058;
        args[1] = "pqFUMTCKJd";
        args[2] = "PTEndmPMzk";
        args[3] = "aJQuCOCvZs";
        args[4] = term17096;
        args[5] = term17099;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


