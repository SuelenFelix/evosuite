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

public class PersonEntity_PersonEntityBuilder_personId_16055114251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;
     Object term934;

    public PersonEntity_PersonEntityBuilder_personId_16055114251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term917 = new Long(8428634514691209827L);
        term916 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term932 = newInstance(Class.forName("java.util.Date"));
        setField(term916, term916.getClass(), "personId", term917);
        setField(term916, term916.getClass(), "personName", "kuTXqwMtDB");
        setDoubleField(term916, term916.getClass(), "personPrice", 0.7031006357544823);
        setLongField(term932, term932.getClass(), "fastTime", 1630952644759L);
        setField(term932, term932.getClass(), "cdate", null);
        setField(term916, term916.getClass(), "date", term932);
        term934 = new Long(-2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term934;
        callMethod(klass, "personId", argTypes, term916, args);
    }

};


