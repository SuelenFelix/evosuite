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
import java.lang.Object;

public class PersonEntity_getDate_12668947554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public PersonEntity_getDate_12668947554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86 = new Long(-8400487765614892086L);
        term85 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term101 = newInstance(Class.forName("java.util.Date"));
        setField(term85, term85.getClass(), "personId", term86);
        setField(term85, term85.getClass(), "personName", "xxtlPwDYFs");
        setDoubleField(term85, term85.getClass(), "personPrice", 0.544608645520025);
        setLongField(term101, term101.getClass(), "fastTime", 1606045635837L);
        setField(term101, term101.getClass(), "cdate", null);
        setField(term85, term85.getClass(), "date", term101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term85, args);
    }

};


