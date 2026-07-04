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

public class RouterVO_getPath_127176704621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520;

    public RouterVO_getPath_127176704621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3520 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3520, term3520.getClass(), "name", null);
        setField(term3520, term3520.getClass(), "path", null);
        setField(term3520, term3520.getClass(), "hidden", null);
        setField(term3520, term3520.getClass(), "redirect", null);
        setField(term3520, term3520.getClass(), "component", null);
        setField(term3520, term3520.getClass(), "meta", null);
        setField(term3520, term3520.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term3520, args);
    }

};


