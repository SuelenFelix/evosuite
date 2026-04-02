package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;

public class PersonEntity_init_98423712114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;
     Object term381;
     Object term383;

    public PersonEntity_init_98423712114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = new Long(2535595959091595249L);
        term381 = new Double(0.1374549299694151);
        term383 = newInstance(Class.forName("java.util.Date"));
        setLongField(term383, term383.getClass(), "fastTime", 1349069753960L);
        setField(term383, term383.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("java.util.Date");
        Object[] args = new Object[4];
        args[0] = term367;
        args[1] = "LQFpaHEwXR";
        args[2] = term381;
        args[3] = term383;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


