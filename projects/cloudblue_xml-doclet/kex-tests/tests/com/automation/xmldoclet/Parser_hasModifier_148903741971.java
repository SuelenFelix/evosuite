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

public class Parser_hasModifier_148903741971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38429;

    public Parser_hasModifier_148903741971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38429 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        setField(term38429, term38429.getClass(), "xmlRoot", null);
        setField(term38429, term38429.getClass(), "environment", null);
        setField(term38429, term38429.getClass(), "docTreesUtils", null);
        setField(term38429, term38429.getClass(), "elementUtils", null);
        setField(term38429, term38429.getClass(), "typeUtils", null);
        setField(term38429, term38429.getClass(), "objectType", null);
        setField(term38429, term38429.getClass(), "errorType", null);
        setField(term38429, term38429.getClass(), "exceptionType", null);
        setField(term38429, term38429.getClass(), "externalizableType", null);
        setField(term38429, term38429.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        argTypes[1] = Class.forName("javax.lang.model.element.Modifier");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "hasModifier", argTypes, term38429, args);
    }

};


