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
import java.lang.Object;
import java.util.ArrayList;

public class Parser_transformParameter_153640194017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37632;

    public Parser_transformParameter_153640194017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37634 = new ArrayList();
        term37632 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37633 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37633, term37633.getClass(), "_package", term37634);
        setField(term37632, term37632.getClass(), "xmlRoot", term37633);
        setField(term37632, term37632.getClass(), "environment", null);
        setField(term37632, term37632.getClass(), "docTreesUtils", null);
        setField(term37632, term37632.getClass(), "elementUtils", null);
        setField(term37632, term37632.getClass(), "typeUtils", null);
        setField(term37632, term37632.getClass(), "objectType", null);
        setField(term37632, term37632.getClass(), "errorType", null);
        setField(term37632, term37632.getClass(), "exceptionType", null);
        setField(term37632, term37632.getClass(), "externalizableType", null);
        setField(term37632, term37632.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.VariableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformParameter", argTypes, term37632, args);
    }

};


