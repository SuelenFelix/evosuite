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

public class PersonEntity_PersonEntityBuilder_personName_20415305642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term946;

    public PersonEntity_PersonEntityBuilder_personName_20415305642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term947 = new Long(8059786003080744426L);
        term946 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term962 = newInstance(Class.forName("java.util.Date"));
        setField(term946, term946.getClass(), "personId", term947);
        setField(term946, term946.getClass(), "personName", "Ghbwtircqb");
        setDoubleField(term946, term946.getClass(), "personPrice", 0.9527281779865117);
        setLongField(term962, term962.getClass(), "fastTime", 1739417792956L);
        setField(term962, term962.getClass(), "cdate", null);
        setField(term946, term946.getClass(), "date", term962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "personName", argTypes, term946, args);
    }

};


