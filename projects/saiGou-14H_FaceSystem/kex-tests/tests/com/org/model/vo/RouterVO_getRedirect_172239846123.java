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

public class RouterVO_getRedirect_172239846123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3522;

    public RouterVO_getRedirect_172239846123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3522 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3522, term3522.getClass(), "name", null);
        setField(term3522, term3522.getClass(), "path", null);
        setField(term3522, term3522.getClass(), "hidden", null);
        setField(term3522, term3522.getClass(), "redirect", null);
        setField(term3522, term3522.getClass(), "component", null);
        setField(term3522, term3522.getClass(), "meta", null);
        setField(term3522, term3522.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRedirect", argTypes, term3522, args);
    }

};


