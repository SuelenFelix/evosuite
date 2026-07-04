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

public class RouterVO_setMeta_142740919832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3531;

    public RouterVO_setMeta_142740919832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3531 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        setField(term3531, term3531.getClass(), "name", null);
        setField(term3531, term3531.getClass(), "path", null);
        setField(term3531, term3531.getClass(), "hidden", null);
        setField(term3531, term3531.getClass(), "redirect", null);
        setField(term3531, term3531.getClass(), "component", null);
        setField(term3531, term3531.getClass(), "meta", null);
        setField(term3531, term3531.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.org.model.vo.MetaVO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMeta", argTypes, term3531, args);
    }

};


