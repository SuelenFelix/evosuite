package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Celebrity_setStatus_14750174959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16674;
     Object term16727;

    public Celebrity_setStatus_14750174959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16674 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16674, term16674.getClass(), "keyNum", 947897214);
        setField(term16674, term16674.getClass(), "name", "cABEHYBnys");
        setIntField(term16674, term16674.getClass(), "likeCount", 1496340209);
        setIntField(term16674, term16674.getClass(), "status", -1748391876);
        setField(term16674, term16674.getClass(), "explain", "EhlWSobaco");
        setField(term16674, term16674.getClass(), "fileUrl", "hEuycunsSe");
        setField(term16674, term16674.getClass(), "keyHash", "IMFzXhpNCx");
        setIntField(term16674, term16674.getClass(), "spot", 43258317);
        term16727 = new Integer(1707220033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16727;
        callMethod(klass, "setStatus", argTypes, term16674, args);
    }

};


