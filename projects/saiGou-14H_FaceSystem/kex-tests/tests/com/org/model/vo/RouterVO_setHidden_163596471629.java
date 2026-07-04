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

public class RouterVO_setHidden_163596471629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;

    public RouterVO_setHidden_163596471629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3528 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3528, term3528.getClass(), "name", null);
        setField(term3528, term3528.getClass(), "path", null);
        setField(term3528, term3528.getClass(), "hidden", null);
        setField(term3528, term3528.getClass(), "redirect", null);
        setField(term3528, term3528.getClass(), "component", null);
        setField(term3528, term3528.getClass(), "meta", null);
        setField(term3528, term3528.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHidden", argTypes, term3528, args);
    }

};


