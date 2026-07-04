package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RouterVO_canEqual_18530323935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3534;

    public RouterVO_canEqual_18530323935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3534 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3534, term3534.getClass(), "name", null);
        setField(term3534, term3534.getClass(), "path", null);
        setField(term3534, term3534.getClass(), "hidden", null);
        setField(term3534, term3534.getClass(), "redirect", null);
        setField(term3534, term3534.getClass(), "component", null);
        setField(term3534, term3534.getClass(), "meta", null);
        setField(term3534, term3534.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term3534, args);
    }

};


