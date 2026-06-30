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

public class PersonEntity_PersonEntityBuilder_date_21433431054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026;
     Object term1044;

    public PersonEntity_PersonEntityBuilder_date_21433431054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1027 = new Long(2486810210675247493L);
        term1026 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term1042 = newInstance(Class.forName("java.util.Date"));
        setField(term1026, term1026.getClass(), "personId", term1027);
        setField(term1026, term1026.getClass(), "personName", "nyiiPDVjAc");
        setDoubleField(term1026, term1026.getClass(), "personPrice", 0.6436713023569729);
        setLongField(term1042, term1042.getClass(), "fastTime", 1334853104718L);
        setField(term1042, term1042.getClass(), "cdate", null);
        setField(term1026, term1026.getClass(), "date", term1042);
        term1044 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1044, term1044.getClass(), "fastTime", 1496859828764L);
        setField(term1044, term1044.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1044;
        callMethod(klass, "date", argTypes, term1026, args);
    }

};


