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

public class PersonEntity_getPersonPrice_10837060543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public PersonEntity_getPersonPrice_10837060543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58 = new Long(-8257434502486459194L);
        term57 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term73 = newInstance(Class.forName("java.util.Date"));
        setField(term57, term57.getClass(), "personId", term58);
        setField(term57, term57.getClass(), "personName", "MuLcgQHgqz");
        setDoubleField(term57, term57.getClass(), "personPrice", 0.5523635872663106);
        setLongField(term73, term73.getClass(), "fastTime", 1610940182830L);
        setField(term73, term73.getClass(), "cdate", null);
        setField(term57, term57.getClass(), "date", term73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPersonPrice", argTypes, term57, args);
    }

};


