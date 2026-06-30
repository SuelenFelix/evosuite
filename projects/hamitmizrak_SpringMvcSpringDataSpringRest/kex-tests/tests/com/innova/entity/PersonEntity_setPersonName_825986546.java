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

public class PersonEntity_setPersonName_825986546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public PersonEntity_setPersonName_825986546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144 = new Long(4872422362414183754L);
        term143 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term159 = newInstance(Class.forName("java.util.Date"));
        setField(term143, term143.getClass(), "personId", term144);
        setField(term143, term143.getClass(), "personName", "EGtDIRbSSb");
        setDoubleField(term143, term143.getClass(), "personPrice", 0.40176586625454525);
        setLongField(term159, term159.getClass(), "fastTime", 1515890130018L);
        setField(term159, term159.getClass(), "cdate", null);
        setField(term143, term143.getClass(), "date", term159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setPersonName", argTypes, term143, args);
    }

};


