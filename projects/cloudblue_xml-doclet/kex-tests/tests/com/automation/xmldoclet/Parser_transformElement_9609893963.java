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

public class Parser_transformElement_9609893963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37489;

    public Parser_transformElement_9609893963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37493 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37493, term37493.getClass(), "comment", null);
        setField(term37493, term37493.getClass(), "tag", null);
        setField(term37493, term37493.getClass(), "annotation", null);
        setField(term37493, term37493.getClass(), "_enum", null);
        setField(term37493, term37493.getClass(), "_interface", null);
        setField(term37493, term37493.getClass(), "clazz", null);
        setField(term37493, term37493.getClass(), "name", null);
        Object term37494 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37494, term37494.getClass(), "comment", null);
        setField(term37494, term37494.getClass(), "tag", null);
        setField(term37494, term37494.getClass(), "annotation", null);
        setField(term37494, term37494.getClass(), "_enum", null);
        setField(term37494, term37494.getClass(), "_interface", null);
        setField(term37494, term37494.getClass(), "clazz", null);
        setField(term37494, term37494.getClass(), "name", null);
        Object term37495 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37495, term37495.getClass(), "comment", null);
        setField(term37495, term37495.getClass(), "tag", null);
        setField(term37495, term37495.getClass(), "annotation", null);
        setField(term37495, term37495.getClass(), "_enum", null);
        setField(term37495, term37495.getClass(), "_interface", null);
        setField(term37495, term37495.getClass(), "clazz", null);
        setField(term37495, term37495.getClass(), "name", null);
        Object term37496 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37496, term37496.getClass(), "comment", null);
        setField(term37496, term37496.getClass(), "tag", null);
        setField(term37496, term37496.getClass(), "annotation", null);
        setField(term37496, term37496.getClass(), "_enum", null);
        setField(term37496, term37496.getClass(), "_interface", null);
        setField(term37496, term37496.getClass(), "clazz", null);
        setField(term37496, term37496.getClass(), "name", null);
        Object term37497 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37497, term37497.getClass(), "comment", null);
        setField(term37497, term37497.getClass(), "tag", null);
        setField(term37497, term37497.getClass(), "annotation", null);
        setField(term37497, term37497.getClass(), "_enum", null);
        setField(term37497, term37497.getClass(), "_interface", null);
        setField(term37497, term37497.getClass(), "clazz", null);
        setField(term37497, term37497.getClass(), "name", null);
        Object term37498 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37498, term37498.getClass(), "comment", null);
        setField(term37498, term37498.getClass(), "tag", null);
        setField(term37498, term37498.getClass(), "annotation", null);
        setField(term37498, term37498.getClass(), "_enum", null);
        setField(term37498, term37498.getClass(), "_interface", null);
        setField(term37498, term37498.getClass(), "clazz", null);
        setField(term37498, term37498.getClass(), "name", null);
        Object term37499 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37499, term37499.getClass(), "comment", null);
        setField(term37499, term37499.getClass(), "tag", null);
        setField(term37499, term37499.getClass(), "annotation", null);
        setField(term37499, term37499.getClass(), "_enum", null);
        setField(term37499, term37499.getClass(), "_interface", null);
        setField(term37499, term37499.getClass(), "clazz", null);
        setField(term37499, term37499.getClass(), "name", null);
        ArrayList term37491 = new ArrayList();
        ((ArrayList) term37491).add(term37493);
        ((ArrayList) term37491).add(term37494);
        ((ArrayList) term37491).add(term37495);
        ((ArrayList) term37491).add(term37496);
        ((ArrayList) term37491).add(term37497);
        ((ArrayList) term37491).add(term37498);
        ((ArrayList) term37491).add(term37499);
        term37489 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37490 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37490, term37490.getClass(), "_package", term37491);
        setField(term37489, term37489.getClass(), "xmlRoot", term37490);
        setField(term37489, term37489.getClass(), "environment", null);
        setField(term37489, term37489.getClass(), "docTreesUtils", null);
        setField(term37489, term37489.getClass(), "elementUtils", null);
        setField(term37489, term37489.getClass(), "typeUtils", null);
        setField(term37489, term37489.getClass(), "objectType", null);
        setField(term37489, term37489.getClass(), "errorType", null);
        setField(term37489, term37489.getClass(), "exceptionType", null);
        setField(term37489, term37489.getClass(), "externalizableType", null);
        setField(term37489, term37489.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformElement", argTypes, term37489, args);
    }

};


