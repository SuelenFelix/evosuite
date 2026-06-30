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

public class PersonEntity_setDate_10833594218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term241;

    public PersonEntity_setDate_10833594218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224 = new Long(-7237588299778557629L);
        term223 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term239 = newInstance(Class.forName("java.util.Date"));
        setField(term223, term223.getClass(), "personId", term224);
        setField(term223, term223.getClass(), "personName", "hRNSzYYIrc");
        setDoubleField(term223, term223.getClass(), "personPrice", 0.6076495596892013);
        setLongField(term239, term239.getClass(), "fastTime", 1495357463288L);
        setField(term239, term239.getClass(), "cdate", null);
        setField(term223, term223.getClass(), "date", term239);
        term241 = newInstance(Class.forName("java.util.Date"));
        setLongField(term241, term241.getClass(), "fastTime", 1645834034896L);
        setField(term241, term241.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term241;
        callMethod(klass, "setDate", argTypes, term223, args);
    }

};


