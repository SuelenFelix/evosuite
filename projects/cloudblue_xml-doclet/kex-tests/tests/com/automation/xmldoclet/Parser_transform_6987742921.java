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

public class Parser_transform_6987742921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37478;

    public Parser_transform_6987742921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37482 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37482, term37482.getClass(), "comment", null);
        setField(term37482, term37482.getClass(), "tag", null);
        setField(term37482, term37482.getClass(), "annotation", null);
        setField(term37482, term37482.getClass(), "_enum", null);
        setField(term37482, term37482.getClass(), "_interface", null);
        setField(term37482, term37482.getClass(), "clazz", null);
        setField(term37482, term37482.getClass(), "name", null);
        Object term37483 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37483, term37483.getClass(), "comment", null);
        setField(term37483, term37483.getClass(), "tag", null);
        setField(term37483, term37483.getClass(), "annotation", null);
        setField(term37483, term37483.getClass(), "_enum", null);
        setField(term37483, term37483.getClass(), "_interface", null);
        setField(term37483, term37483.getClass(), "clazz", null);
        setField(term37483, term37483.getClass(), "name", null);
        Object term37484 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37484, term37484.getClass(), "comment", null);
        setField(term37484, term37484.getClass(), "tag", null);
        setField(term37484, term37484.getClass(), "annotation", null);
        setField(term37484, term37484.getClass(), "_enum", null);
        setField(term37484, term37484.getClass(), "_interface", null);
        setField(term37484, term37484.getClass(), "clazz", null);
        setField(term37484, term37484.getClass(), "name", null);
        Object term37485 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37485, term37485.getClass(), "comment", null);
        setField(term37485, term37485.getClass(), "tag", null);
        setField(term37485, term37485.getClass(), "annotation", null);
        setField(term37485, term37485.getClass(), "_enum", null);
        setField(term37485, term37485.getClass(), "_interface", null);
        setField(term37485, term37485.getClass(), "clazz", null);
        setField(term37485, term37485.getClass(), "name", null);
        ArrayList term37480 = new ArrayList();
        ((ArrayList) term37480).add(term37482);
        ((ArrayList) term37480).add(term37483);
        ((ArrayList) term37480).add(term37484);
        ((ArrayList) term37480).add(term37485);
        term37478 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37479 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37479, term37479.getClass(), "_package", term37480);
        setField(term37478, term37478.getClass(), "xmlRoot", term37479);
        setField(term37478, term37478.getClass(), "environment", null);
        setField(term37478, term37478.getClass(), "docTreesUtils", null);
        setField(term37478, term37478.getClass(), "elementUtils", null);
        setField(term37478, term37478.getClass(), "typeUtils", null);
        setField(term37478, term37478.getClass(), "objectType", null);
        setField(term37478, term37478.getClass(), "errorType", null);
        setField(term37478, term37478.getClass(), "exceptionType", null);
        setField(term37478, term37478.getClass(), "externalizableType", null);
        setField(term37478, term37478.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "transform", argTypes, term37478, args);
    }

};


