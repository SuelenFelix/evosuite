package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Menu_getParentId_17571834221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47301;

    public Menu_getParentId_17571834221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47301 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term47301, term47301.getClass(), "id", null);
        setField(term47301, term47301.getClass(), "name", null);
        setField(term47301, term47301.getClass(), "path", null);
        setField(term47301, term47301.getClass(), "parentId", null);
        setField(term47301, term47301.getClass(), "icon", null);
        setField(term47301, term47301.getClass(), "introduce", null);
        setField(term47301, term47301.getClass(), "children", null);
        setField(term47301, term47301.getClass(), "meta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term47301, args);
    }

};


