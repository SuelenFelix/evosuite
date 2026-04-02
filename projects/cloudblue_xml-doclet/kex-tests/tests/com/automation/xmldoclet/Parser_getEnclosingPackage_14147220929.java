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

public class Parser_getEnclosingPackage_14147220929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38166;

    public Parser_getEnclosingPackage_14147220929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38170 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38170, term38170.getClass(), "comment", null);
        setField(term38170, term38170.getClass(), "tag", null);
        setField(term38170, term38170.getClass(), "annotation", null);
        setField(term38170, term38170.getClass(), "_enum", null);
        setField(term38170, term38170.getClass(), "_interface", null);
        setField(term38170, term38170.getClass(), "clazz", null);
        setField(term38170, term38170.getClass(), "name", null);
        Object term38171 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38171, term38171.getClass(), "comment", null);
        setField(term38171, term38171.getClass(), "tag", null);
        setField(term38171, term38171.getClass(), "annotation", null);
        setField(term38171, term38171.getClass(), "_enum", null);
        setField(term38171, term38171.getClass(), "_interface", null);
        setField(term38171, term38171.getClass(), "clazz", null);
        setField(term38171, term38171.getClass(), "name", null);
        Object term38172 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38172, term38172.getClass(), "comment", null);
        setField(term38172, term38172.getClass(), "tag", null);
        setField(term38172, term38172.getClass(), "annotation", null);
        setField(term38172, term38172.getClass(), "_enum", null);
        setField(term38172, term38172.getClass(), "_interface", null);
        setField(term38172, term38172.getClass(), "clazz", null);
        setField(term38172, term38172.getClass(), "name", null);
        Object term38173 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38173, term38173.getClass(), "comment", null);
        setField(term38173, term38173.getClass(), "tag", null);
        setField(term38173, term38173.getClass(), "annotation", null);
        setField(term38173, term38173.getClass(), "_enum", null);
        setField(term38173, term38173.getClass(), "_interface", null);
        setField(term38173, term38173.getClass(), "clazz", null);
        setField(term38173, term38173.getClass(), "name", null);
        Object term38174 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38174, term38174.getClass(), "comment", null);
        setField(term38174, term38174.getClass(), "tag", null);
        setField(term38174, term38174.getClass(), "annotation", null);
        setField(term38174, term38174.getClass(), "_enum", null);
        setField(term38174, term38174.getClass(), "_interface", null);
        setField(term38174, term38174.getClass(), "clazz", null);
        setField(term38174, term38174.getClass(), "name", null);
        Object term38175 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38175, term38175.getClass(), "comment", null);
        setField(term38175, term38175.getClass(), "tag", null);
        setField(term38175, term38175.getClass(), "annotation", null);
        setField(term38175, term38175.getClass(), "_enum", null);
        setField(term38175, term38175.getClass(), "_interface", null);
        setField(term38175, term38175.getClass(), "clazz", null);
        setField(term38175, term38175.getClass(), "name", null);
        ArrayList term38168 = new ArrayList();
        ((ArrayList) term38168).add(term38170);
        ((ArrayList) term38168).add(term38171);
        ((ArrayList) term38168).add(term38172);
        ((ArrayList) term38168).add(term38173);
        ((ArrayList) term38168).add(term38174);
        ((ArrayList) term38168).add(term38175);
        term38166 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38167 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38167, term38167.getClass(), "_package", term38168);
        setField(term38166, term38166.getClass(), "xmlRoot", term38167);
        setField(term38166, term38166.getClass(), "environment", null);
        setField(term38166, term38166.getClass(), "docTreesUtils", null);
        setField(term38166, term38166.getClass(), "elementUtils", null);
        setField(term38166, term38166.getClass(), "typeUtils", null);
        setField(term38166, term38166.getClass(), "objectType", null);
        setField(term38166, term38166.getClass(), "errorType", null);
        setField(term38166, term38166.getClass(), "exceptionType", null);
        setField(term38166, term38166.getClass(), "externalizableType", null);
        setField(term38166, term38166.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEnclosingPackage", argTypes, term38166, args);
    }

};


