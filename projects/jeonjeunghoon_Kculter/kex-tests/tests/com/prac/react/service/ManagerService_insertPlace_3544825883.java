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

public class ManagerService_insertPlace_3544825883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1476;
     Object term1477;

    public ManagerService_insertPlace_3544825883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1476 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1476, term1476.getClass(), "md", null);
        setField(term1476, term1476.getClass(), "logger", null);
        term1477 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1477, term1477.getClass(), "placeNum", -1179120542);
        setField(term1477, term1477.getClass(), "keyHash", "nGKItKLYNC");
        setIntField(term1477, term1477.getClass(), "placeType", -73683645);
        setField(term1477, term1477.getClass(), "culture", "UiUYnPrcCi");
        setField(term1477, term1477.getClass(), "kpop", "UoYtihxVaS");
        setDoubleField(term1477, term1477.getClass(), "lat", 0.13238746331190498);
        setDoubleField(term1477, term1477.getClass(), "lng", 0.3455959125047594);
        setIntField(term1477, term1477.getClass(), "status", -226514366);
        setField(term1477, term1477.getClass(), "name", "JDswTTCZHV");
        setField(term1477, term1477.getClass(), "explain", "onpbIeEKoi");
        setField(term1477, term1477.getClass(), "address", "YRHGsAkhxb");
        setField(term1477, term1477.getClass(), "fileUrl", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Place");
        Object[] args = new Object[1];
        args[0] = term1477;
        callMethod(klass, "insertPlace", argTypes, term1476, args);
    }

};


