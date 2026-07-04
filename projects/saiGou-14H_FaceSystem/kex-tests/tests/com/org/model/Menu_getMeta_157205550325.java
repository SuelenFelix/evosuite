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

public class Menu_getMeta_157205550325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47305;

    public Menu_getMeta_157205550325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47305 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term47305, term47305.getClass(), "id", null);
        setField(term47305, term47305.getClass(), "name", null);
        setField(term47305, term47305.getClass(), "path", null);
        setField(term47305, term47305.getClass(), "parentId", null);
        setField(term47305, term47305.getClass(), "icon", null);
        setField(term47305, term47305.getClass(), "introduce", null);
        setField(term47305, term47305.getClass(), "children", null);
        setField(term47305, term47305.getClass(), "meta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term47305, args);
    }

};


