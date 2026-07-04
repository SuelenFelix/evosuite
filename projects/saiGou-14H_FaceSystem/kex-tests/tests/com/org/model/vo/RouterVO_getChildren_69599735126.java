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

public class RouterVO_getChildren_69599735126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3525;

    public RouterVO_getChildren_69599735126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3525 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3525, term3525.getClass(), "name", null);
        setField(term3525, term3525.getClass(), "path", null);
        setField(term3525, term3525.getClass(), "hidden", null);
        setField(term3525, term3525.getClass(), "redirect", null);
        setField(term3525, term3525.getClass(), "component", null);
        setField(term3525, term3525.getClass(), "meta", null);
        setField(term3525, term3525.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term3525, args);
    }

};


