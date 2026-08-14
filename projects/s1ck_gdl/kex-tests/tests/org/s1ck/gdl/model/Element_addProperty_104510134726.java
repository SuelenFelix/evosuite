package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Element_addProperty_104510134726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3094;

    public Element_addProperty_104510134726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3094 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term3094, term3094.getClass(), "id", null);
        setField(term3094, term3094.getClass(), "labels", null);
        setField(term3094, term3094.getClass(), "properties", null);
        setField(term3094, term3094.getClass(), "variable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addProperty", argTypes, term3094, args);
    }

};


