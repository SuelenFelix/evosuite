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

public class Parser_transformParameters_178002144616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37623;

    public Parser_transformParameters_178002144616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37627 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37627, term37627.getClass(), "comment", null);
        setField(term37627, term37627.getClass(), "tag", null);
        setField(term37627, term37627.getClass(), "annotation", null);
        setField(term37627, term37627.getClass(), "_enum", null);
        setField(term37627, term37627.getClass(), "_interface", null);
        setField(term37627, term37627.getClass(), "clazz", null);
        setField(term37627, term37627.getClass(), "name", null);
        Object term37628 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37628, term37628.getClass(), "comment", null);
        setField(term37628, term37628.getClass(), "tag", null);
        setField(term37628, term37628.getClass(), "annotation", null);
        setField(term37628, term37628.getClass(), "_enum", null);
        setField(term37628, term37628.getClass(), "_interface", null);
        setField(term37628, term37628.getClass(), "clazz", null);
        setField(term37628, term37628.getClass(), "name", null);
        Object term37629 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37629, term37629.getClass(), "comment", null);
        setField(term37629, term37629.getClass(), "tag", null);
        setField(term37629, term37629.getClass(), "annotation", null);
        setField(term37629, term37629.getClass(), "_enum", null);
        setField(term37629, term37629.getClass(), "_interface", null);
        setField(term37629, term37629.getClass(), "clazz", null);
        setField(term37629, term37629.getClass(), "name", null);
        ArrayList term37625 = new ArrayList();
        ((ArrayList) term37625).add(term37627);
        ((ArrayList) term37625).add(term37628);
        ((ArrayList) term37625).add(term37629);
        term37623 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37624 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37624, term37624.getClass(), "_package", term37625);
        setField(term37623, term37623.getClass(), "xmlRoot", term37624);
        setField(term37623, term37623.getClass(), "environment", null);
        setField(term37623, term37623.getClass(), "docTreesUtils", null);
        setField(term37623, term37623.getClass(), "elementUtils", null);
        setField(term37623, term37623.getClass(), "typeUtils", null);
        setField(term37623, term37623.getClass(), "objectType", null);
        setField(term37623, term37623.getClass(), "errorType", null);
        setField(term37623, term37623.getClass(), "exceptionType", null);
        setField(term37623, term37623.getClass(), "externalizableType", null);
        setField(term37623, term37623.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformParameters", argTypes, term37623, args);
    }

};


