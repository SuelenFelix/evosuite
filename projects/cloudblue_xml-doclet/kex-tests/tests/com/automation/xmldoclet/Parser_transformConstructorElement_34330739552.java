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

public class Parser_transformConstructorElement_34330739552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38410;

    public Parser_transformConstructorElement_34330739552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38410 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        setField(term38410, term38410.getClass(), "xmlRoot", null);
        setField(term38410, term38410.getClass(), "environment", null);
        setField(term38410, term38410.getClass(), "docTreesUtils", null);
        setField(term38410, term38410.getClass(), "elementUtils", null);
        setField(term38410, term38410.getClass(), "typeUtils", null);
        setField(term38410, term38410.getClass(), "objectType", null);
        setField(term38410, term38410.getClass(), "errorType", null);
        setField(term38410, term38410.getClass(), "exceptionType", null);
        setField(term38410, term38410.getClass(), "externalizableType", null);
        setField(term38410, term38410.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformConstructorElement", argTypes, term38410, args);
    }

};


