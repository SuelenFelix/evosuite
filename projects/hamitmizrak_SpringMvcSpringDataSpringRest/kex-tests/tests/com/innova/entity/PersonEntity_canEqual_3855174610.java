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

public class PersonEntity_canEqual_3855174610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term300;

    public PersonEntity_canEqual_3855174610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283 = new Long(-2813493605142626659L);
        term282 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term298 = newInstance(Class.forName("java.util.Date"));
        setField(term282, term282.getClass(), "personId", term283);
        setField(term282, term282.getClass(), "personName", "NRdvgJlhkX");
        setDoubleField(term282, term282.getClass(), "personPrice", 0.8474802076607362);
        setLongField(term298, term298.getClass(), "fastTime", 1797203628025L);
        setField(term298, term298.getClass(), "cdate", null);
        setField(term282, term282.getClass(), "date", term298);
        term300 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term300;
        callMethod(klass, "canEqual", argTypes, term282, args);
    }

};


