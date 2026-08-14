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

public class Parser_transformAnnotationElement_42814620510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37564;

    public Parser_transformAnnotationElement_42814620510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37566 = new ArrayList();
        term37564 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37565 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37565, term37565.getClass(), "_package", term37566);
        setField(term37564, term37564.getClass(), "xmlRoot", term37565);
        setField(term37564, term37564.getClass(), "environment", null);
        setField(term37564, term37564.getClass(), "docTreesUtils", null);
        setField(term37564, term37564.getClass(), "elementUtils", null);
        setField(term37564, term37564.getClass(), "typeUtils", null);
        setField(term37564, term37564.getClass(), "objectType", null);
        setField(term37564, term37564.getClass(), "errorType", null);
        setField(term37564, term37564.getClass(), "exceptionType", null);
        setField(term37564, term37564.getClass(), "externalizableType", null);
        setField(term37564, term37564.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformAnnotationElement", argTypes, term37564, args);
    }

};


