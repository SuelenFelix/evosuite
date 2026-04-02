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

public class Parser_transformClassType_2900171166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37526;

    public Parser_transformClassType_2900171166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37530 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37530, term37530.getClass(), "comment", null);
        setField(term37530, term37530.getClass(), "tag", null);
        setField(term37530, term37530.getClass(), "annotation", null);
        setField(term37530, term37530.getClass(), "_enum", null);
        setField(term37530, term37530.getClass(), "_interface", null);
        setField(term37530, term37530.getClass(), "clazz", null);
        setField(term37530, term37530.getClass(), "name", null);
        Object term37531 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37531, term37531.getClass(), "comment", null);
        setField(term37531, term37531.getClass(), "tag", null);
        setField(term37531, term37531.getClass(), "annotation", null);
        setField(term37531, term37531.getClass(), "_enum", null);
        setField(term37531, term37531.getClass(), "_interface", null);
        setField(term37531, term37531.getClass(), "clazz", null);
        setField(term37531, term37531.getClass(), "name", null);
        Object term37532 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37532, term37532.getClass(), "comment", null);
        setField(term37532, term37532.getClass(), "tag", null);
        setField(term37532, term37532.getClass(), "annotation", null);
        setField(term37532, term37532.getClass(), "_enum", null);
        setField(term37532, term37532.getClass(), "_interface", null);
        setField(term37532, term37532.getClass(), "clazz", null);
        setField(term37532, term37532.getClass(), "name", null);
        Object term37533 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37533, term37533.getClass(), "comment", null);
        setField(term37533, term37533.getClass(), "tag", null);
        setField(term37533, term37533.getClass(), "annotation", null);
        setField(term37533, term37533.getClass(), "_enum", null);
        setField(term37533, term37533.getClass(), "_interface", null);
        setField(term37533, term37533.getClass(), "clazz", null);
        setField(term37533, term37533.getClass(), "name", null);
        Object term37534 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37534, term37534.getClass(), "comment", null);
        setField(term37534, term37534.getClass(), "tag", null);
        setField(term37534, term37534.getClass(), "annotation", null);
        setField(term37534, term37534.getClass(), "_enum", null);
        setField(term37534, term37534.getClass(), "_interface", null);
        setField(term37534, term37534.getClass(), "clazz", null);
        setField(term37534, term37534.getClass(), "name", null);
        Object term37535 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37535, term37535.getClass(), "comment", null);
        setField(term37535, term37535.getClass(), "tag", null);
        setField(term37535, term37535.getClass(), "annotation", null);
        setField(term37535, term37535.getClass(), "_enum", null);
        setField(term37535, term37535.getClass(), "_interface", null);
        setField(term37535, term37535.getClass(), "clazz", null);
        setField(term37535, term37535.getClass(), "name", null);
        ArrayList term37528 = new ArrayList();
        ((ArrayList) term37528).add(term37530);
        ((ArrayList) term37528).add(term37531);
        ((ArrayList) term37528).add(term37532);
        ((ArrayList) term37528).add(term37533);
        ((ArrayList) term37528).add(term37534);
        ((ArrayList) term37528).add(term37535);
        term37526 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37527 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37527, term37527.getClass(), "_package", term37528);
        setField(term37526, term37526.getClass(), "xmlRoot", term37527);
        setField(term37526, term37526.getClass(), "environment", null);
        setField(term37526, term37526.getClass(), "docTreesUtils", null);
        setField(term37526, term37526.getClass(), "elementUtils", null);
        setField(term37526, term37526.getClass(), "typeUtils", null);
        setField(term37526, term37526.getClass(), "objectType", null);
        setField(term37526, term37526.getClass(), "errorType", null);
        setField(term37526, term37526.getClass(), "exceptionType", null);
        setField(term37526, term37526.getClass(), "externalizableType", null);
        setField(term37526, term37526.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.TypeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformClassType", argTypes, term37526, args);
    }

};


