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

public class RouterVO_getComponent_105508692624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3523;

    public RouterVO_getComponent_105508692624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3523 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3523, term3523.getClass(), "name", null);
        setField(term3523, term3523.getClass(), "path", null);
        setField(term3523, term3523.getClass(), "hidden", null);
        setField(term3523, term3523.getClass(), "redirect", null);
        setField(term3523, term3523.getClass(), "component", null);
        setField(term3523, term3523.getClass(), "meta", null);
        setField(term3523, term3523.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComponent", argTypes, term3523, args);
    }

};


