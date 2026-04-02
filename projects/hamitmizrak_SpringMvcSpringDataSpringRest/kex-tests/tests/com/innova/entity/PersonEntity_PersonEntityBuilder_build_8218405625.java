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

public class PersonEntity_PersonEntityBuilder_build_8218405625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1056;

    public PersonEntity_PersonEntityBuilder_build_8218405625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1057 = new Long(7009926388951271268L);
        term1056 = newInstance(Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder"));
        Object term1072 = newInstance(Class.forName("java.util.Date"));
        setField(term1056, term1056.getClass(), "personId", term1057);
        setField(term1056, term1056.getClass(), "personName", "aKnKipADSo");
        setDoubleField(term1056, term1056.getClass(), "personPrice", 0.7332741045694002);
        setLongField(term1072, term1072.getClass(), "fastTime", 1691868468367L);
        setField(term1072, term1072.getClass(), "cdate", null);
        setField(term1056, term1056.getClass(), "date", term1072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity$PersonEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1056, args);
    }

};


