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

public class Parser_transformConstructorElement_34330739513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37590;

    public Parser_transformConstructorElement_34330739513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37594 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37594, term37594.getClass(), "comment", null);
        setField(term37594, term37594.getClass(), "tag", null);
        setField(term37594, term37594.getClass(), "annotation", null);
        setField(term37594, term37594.getClass(), "_enum", null);
        setField(term37594, term37594.getClass(), "_interface", null);
        setField(term37594, term37594.getClass(), "clazz", null);
        setField(term37594, term37594.getClass(), "name", null);
        Object term37595 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37595, term37595.getClass(), "comment", null);
        setField(term37595, term37595.getClass(), "tag", null);
        setField(term37595, term37595.getClass(), "annotation", null);
        setField(term37595, term37595.getClass(), "_enum", null);
        setField(term37595, term37595.getClass(), "_interface", null);
        setField(term37595, term37595.getClass(), "clazz", null);
        setField(term37595, term37595.getClass(), "name", null);
        Object term37596 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37596, term37596.getClass(), "comment", null);
        setField(term37596, term37596.getClass(), "tag", null);
        setField(term37596, term37596.getClass(), "annotation", null);
        setField(term37596, term37596.getClass(), "_enum", null);
        setField(term37596, term37596.getClass(), "_interface", null);
        setField(term37596, term37596.getClass(), "clazz", null);
        setField(term37596, term37596.getClass(), "name", null);
        Object term37597 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37597, term37597.getClass(), "comment", null);
        setField(term37597, term37597.getClass(), "tag", null);
        setField(term37597, term37597.getClass(), "annotation", null);
        setField(term37597, term37597.getClass(), "_enum", null);
        setField(term37597, term37597.getClass(), "_interface", null);
        setField(term37597, term37597.getClass(), "clazz", null);
        setField(term37597, term37597.getClass(), "name", null);
        ArrayList term37592 = new ArrayList();
        ((ArrayList) term37592).add(term37594);
        ((ArrayList) term37592).add(term37595);
        ((ArrayList) term37592).add(term37596);
        ((ArrayList) term37592).add(term37597);
        term37590 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37591 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37591, term37591.getClass(), "_package", term37592);
        setField(term37590, term37590.getClass(), "xmlRoot", term37591);
        setField(term37590, term37590.getClass(), "environment", null);
        setField(term37590, term37590.getClass(), "docTreesUtils", null);
        setField(term37590, term37590.getClass(), "elementUtils", null);
        setField(term37590, term37590.getClass(), "typeUtils", null);
        setField(term37590, term37590.getClass(), "objectType", null);
        setField(term37590, term37590.getClass(), "errorType", null);
        setField(term37590, term37590.getClass(), "exceptionType", null);
        setField(term37590, term37590.getClass(), "externalizableType", null);
        setField(term37590, term37590.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformConstructorElement", argTypes, term37590, args);
    }

};


