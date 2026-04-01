package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerService_updatePlace_6299603084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1637;
     Object term1638;

    public ManagerService_updatePlace_6299603084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1637 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1637, term1637.getClass(), "md", null);
        setField(term1637, term1637.getClass(), "logger", null);
        term1638 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1638, term1638.getClass(), "placeNum", 1193880199);
        setField(term1638, term1638.getClass(), "keyHash", "MLqYREekMl");
        setIntField(term1638, term1638.getClass(), "placeType", -1087774327);
        setField(term1638, term1638.getClass(), "culture", "ytSBIKXogI");
        setField(term1638, term1638.getClass(), "kpop", "nHXjMycHlU");
        setDoubleField(term1638, term1638.getClass(), "lat", 0.5523635872663106);
        setDoubleField(term1638, term1638.getClass(), "lng", 0.544608645520025);
        setIntField(term1638, term1638.getClass(), "status", -1530420153);
        setField(term1638, term1638.getClass(), "name", "ieCtQFdkii");
        setField(term1638, term1638.getClass(), "explain", "dEnhdmILtU");
        setField(term1638, term1638.getClass(), "address", "hoicvmsovO");
        setField(term1638, term1638.getClass(), "fileUrl", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Place");
        Object[] args = new Object[1];
        args[0] = term1638;
        callMethod(klass, "updatePlace", argTypes, term1637, args);
    }

};


