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
import java.util.LinkedList;

public class Parser_transformAnnotationMirrors_32893139618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37638;
     Object term37653;

    public Parser_transformAnnotationMirrors_32893139618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37642 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37642, term37642.getClass(), "comment", null);
        setField(term37642, term37642.getClass(), "tag", null);
        setField(term37642, term37642.getClass(), "annotation", null);
        setField(term37642, term37642.getClass(), "_enum", null);
        setField(term37642, term37642.getClass(), "_interface", null);
        setField(term37642, term37642.getClass(), "clazz", null);
        setField(term37642, term37642.getClass(), "name", null);
        Object term37643 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37643, term37643.getClass(), "comment", null);
        setField(term37643, term37643.getClass(), "tag", null);
        setField(term37643, term37643.getClass(), "annotation", null);
        setField(term37643, term37643.getClass(), "_enum", null);
        setField(term37643, term37643.getClass(), "_interface", null);
        setField(term37643, term37643.getClass(), "clazz", null);
        setField(term37643, term37643.getClass(), "name", null);
        Object term37644 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37644, term37644.getClass(), "comment", null);
        setField(term37644, term37644.getClass(), "tag", null);
        setField(term37644, term37644.getClass(), "annotation", null);
        setField(term37644, term37644.getClass(), "_enum", null);
        setField(term37644, term37644.getClass(), "_interface", null);
        setField(term37644, term37644.getClass(), "clazz", null);
        setField(term37644, term37644.getClass(), "name", null);
        Object term37645 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37645, term37645.getClass(), "comment", null);
        setField(term37645, term37645.getClass(), "tag", null);
        setField(term37645, term37645.getClass(), "annotation", null);
        setField(term37645, term37645.getClass(), "_enum", null);
        setField(term37645, term37645.getClass(), "_interface", null);
        setField(term37645, term37645.getClass(), "clazz", null);
        setField(term37645, term37645.getClass(), "name", null);
        Object term37646 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37646, term37646.getClass(), "comment", null);
        setField(term37646, term37646.getClass(), "tag", null);
        setField(term37646, term37646.getClass(), "annotation", null);
        setField(term37646, term37646.getClass(), "_enum", null);
        setField(term37646, term37646.getClass(), "_interface", null);
        setField(term37646, term37646.getClass(), "clazz", null);
        setField(term37646, term37646.getClass(), "name", null);
        Object term37647 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37647, term37647.getClass(), "comment", null);
        setField(term37647, term37647.getClass(), "tag", null);
        setField(term37647, term37647.getClass(), "annotation", null);
        setField(term37647, term37647.getClass(), "_enum", null);
        setField(term37647, term37647.getClass(), "_interface", null);
        setField(term37647, term37647.getClass(), "clazz", null);
        setField(term37647, term37647.getClass(), "name", null);
        Object term37648 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37648, term37648.getClass(), "comment", null);
        setField(term37648, term37648.getClass(), "tag", null);
        setField(term37648, term37648.getClass(), "annotation", null);
        setField(term37648, term37648.getClass(), "_enum", null);
        setField(term37648, term37648.getClass(), "_interface", null);
        setField(term37648, term37648.getClass(), "clazz", null);
        setField(term37648, term37648.getClass(), "name", null);
        Object term37649 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37649, term37649.getClass(), "comment", null);
        setField(term37649, term37649.getClass(), "tag", null);
        setField(term37649, term37649.getClass(), "annotation", null);
        setField(term37649, term37649.getClass(), "_enum", null);
        setField(term37649, term37649.getClass(), "_interface", null);
        setField(term37649, term37649.getClass(), "clazz", null);
        setField(term37649, term37649.getClass(), "name", null);
        Object term37650 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37650, term37650.getClass(), "comment", null);
        setField(term37650, term37650.getClass(), "tag", null);
        setField(term37650, term37650.getClass(), "annotation", null);
        setField(term37650, term37650.getClass(), "_enum", null);
        setField(term37650, term37650.getClass(), "_interface", null);
        setField(term37650, term37650.getClass(), "clazz", null);
        setField(term37650, term37650.getClass(), "name", null);
        ArrayList term37640 = new ArrayList();
        ((ArrayList) term37640).add(term37642);
        ((ArrayList) term37640).add(term37643);
        ((ArrayList) term37640).add(term37644);
        ((ArrayList) term37640).add(term37645);
        ((ArrayList) term37640).add(term37646);
        ((ArrayList) term37640).add(term37647);
        ((ArrayList) term37640).add(term37648);
        ((ArrayList) term37640).add(term37649);
        ((ArrayList) term37640).add(term37650);
        term37638 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37639 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37639, term37639.getClass(), "_package", term37640);
        setField(term37638, term37638.getClass(), "xmlRoot", term37639);
        setField(term37638, term37638.getClass(), "environment", null);
        setField(term37638, term37638.getClass(), "docTreesUtils", null);
        setField(term37638, term37638.getClass(), "elementUtils", null);
        setField(term37638, term37638.getClass(), "typeUtils", null);
        setField(term37638, term37638.getClass(), "objectType", null);
        setField(term37638, term37638.getClass(), "errorType", null);
        setField(term37638, term37638.getClass(), "exceptionType", null);
        setField(term37638, term37638.getClass(), "externalizableType", null);
        setField(term37638, term37638.getClass(), "serializableType", null);
        term37653 = new LinkedList();
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
        ((LinkedList) term37653).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term37653;
        callMethod(klass, "transformAnnotationMirrors", argTypes, term37638, args);
    }

};


