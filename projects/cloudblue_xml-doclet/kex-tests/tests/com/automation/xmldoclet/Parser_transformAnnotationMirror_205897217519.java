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

public class Parser_transformAnnotationMirror_205897217519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37663;

    public Parser_transformAnnotationMirror_205897217519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37665 = new ArrayList();
        term37663 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37664 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37664, term37664.getClass(), "_package", term37665);
        setField(term37663, term37663.getClass(), "xmlRoot", term37664);
        setField(term37663, term37663.getClass(), "environment", null);
        setField(term37663, term37663.getClass(), "docTreesUtils", null);
        setField(term37663, term37663.getClass(), "elementUtils", null);
        setField(term37663, term37663.getClass(), "typeUtils", null);
        setField(term37663, term37663.getClass(), "objectType", null);
        setField(term37663, term37663.getClass(), "errorType", null);
        setField(term37663, term37663.getClass(), "exceptionType", null);
        setField(term37663, term37663.getClass(), "externalizableType", null);
        setField(term37663, term37663.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.AnnotationMirror");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformAnnotationMirror", argTypes, term37663, args);
    }

};


