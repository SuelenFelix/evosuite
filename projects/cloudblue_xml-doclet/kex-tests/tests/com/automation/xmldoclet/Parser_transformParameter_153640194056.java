package com.automation.xmldoclet;

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
import static com.automation.xmldoclet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Parser_transformParameter_153640194056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38414;

    public Parser_transformParameter_153640194056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38414 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        setField(term38414, term38414.getClass(), "xmlRoot", null);
        setField(term38414, term38414.getClass(), "environment", null);
        setField(term38414, term38414.getClass(), "docTreesUtils", null);
        setField(term38414, term38414.getClass(), "elementUtils", null);
        setField(term38414, term38414.getClass(), "typeUtils", null);
        setField(term38414, term38414.getClass(), "objectType", null);
        setField(term38414, term38414.getClass(), "errorType", null);
        setField(term38414, term38414.getClass(), "exceptionType", null);
        setField(term38414, term38414.getClass(), "externalizableType", null);
        setField(term38414, term38414.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.VariableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformParameter", argTypes, term38414, args);
    }

};


