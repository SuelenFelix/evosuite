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

public class Parser_transformTypeMirrors_86819454327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38141;
     Object term38155;

    public Parser_transformTypeMirrors_86819454327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38145 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38145, term38145.getClass(), "comment", null);
        setField(term38145, term38145.getClass(), "tag", null);
        setField(term38145, term38145.getClass(), "annotation", null);
        setField(term38145, term38145.getClass(), "_enum", null);
        setField(term38145, term38145.getClass(), "_interface", null);
        setField(term38145, term38145.getClass(), "clazz", null);
        setField(term38145, term38145.getClass(), "name", null);
        Object term38146 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38146, term38146.getClass(), "comment", null);
        setField(term38146, term38146.getClass(), "tag", null);
        setField(term38146, term38146.getClass(), "annotation", null);
        setField(term38146, term38146.getClass(), "_enum", null);
        setField(term38146, term38146.getClass(), "_interface", null);
        setField(term38146, term38146.getClass(), "clazz", null);
        setField(term38146, term38146.getClass(), "name", null);
        Object term38147 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38147, term38147.getClass(), "comment", null);
        setField(term38147, term38147.getClass(), "tag", null);
        setField(term38147, term38147.getClass(), "annotation", null);
        setField(term38147, term38147.getClass(), "_enum", null);
        setField(term38147, term38147.getClass(), "_interface", null);
        setField(term38147, term38147.getClass(), "clazz", null);
        setField(term38147, term38147.getClass(), "name", null);
        Object term38148 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38148, term38148.getClass(), "comment", null);
        setField(term38148, term38148.getClass(), "tag", null);
        setField(term38148, term38148.getClass(), "annotation", null);
        setField(term38148, term38148.getClass(), "_enum", null);
        setField(term38148, term38148.getClass(), "_interface", null);
        setField(term38148, term38148.getClass(), "clazz", null);
        setField(term38148, term38148.getClass(), "name", null);
        Object term38149 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38149, term38149.getClass(), "comment", null);
        setField(term38149, term38149.getClass(), "tag", null);
        setField(term38149, term38149.getClass(), "annotation", null);
        setField(term38149, term38149.getClass(), "_enum", null);
        setField(term38149, term38149.getClass(), "_interface", null);
        setField(term38149, term38149.getClass(), "clazz", null);
        setField(term38149, term38149.getClass(), "name", null);
        Object term38150 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38150, term38150.getClass(), "comment", null);
        setField(term38150, term38150.getClass(), "tag", null);
        setField(term38150, term38150.getClass(), "annotation", null);
        setField(term38150, term38150.getClass(), "_enum", null);
        setField(term38150, term38150.getClass(), "_interface", null);
        setField(term38150, term38150.getClass(), "clazz", null);
        setField(term38150, term38150.getClass(), "name", null);
        Object term38151 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38151, term38151.getClass(), "comment", null);
        setField(term38151, term38151.getClass(), "tag", null);
        setField(term38151, term38151.getClass(), "annotation", null);
        setField(term38151, term38151.getClass(), "_enum", null);
        setField(term38151, term38151.getClass(), "_interface", null);
        setField(term38151, term38151.getClass(), "clazz", null);
        setField(term38151, term38151.getClass(), "name", null);
        Object term38152 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38152, term38152.getClass(), "comment", null);
        setField(term38152, term38152.getClass(), "tag", null);
        setField(term38152, term38152.getClass(), "annotation", null);
        setField(term38152, term38152.getClass(), "_enum", null);
        setField(term38152, term38152.getClass(), "_interface", null);
        setField(term38152, term38152.getClass(), "clazz", null);
        setField(term38152, term38152.getClass(), "name", null);
        ArrayList term38143 = new ArrayList();
        ((ArrayList) term38143).add(term38145);
        ((ArrayList) term38143).add(term38146);
        ((ArrayList) term38143).add(term38147);
        ((ArrayList) term38143).add(term38148);
        ((ArrayList) term38143).add(term38149);
        ((ArrayList) term38143).add(term38150);
        ((ArrayList) term38143).add(term38151);
        ((ArrayList) term38143).add(term38152);
        term38141 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38142 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38142, term38142.getClass(), "_package", term38143);
        setField(term38141, term38141.getClass(), "xmlRoot", term38142);
        setField(term38141, term38141.getClass(), "environment", null);
        setField(term38141, term38141.getClass(), "docTreesUtils", null);
        setField(term38141, term38141.getClass(), "elementUtils", null);
        setField(term38141, term38141.getClass(), "typeUtils", null);
        setField(term38141, term38141.getClass(), "objectType", null);
        setField(term38141, term38141.getClass(), "errorType", null);
        setField(term38141, term38141.getClass(), "exceptionType", null);
        setField(term38141, term38141.getClass(), "externalizableType", null);
        setField(term38141, term38141.getClass(), "serializableType", null);
        term38155 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term38155;
        callMethod(klass, "transformTypeMirrors", argTypes, term38141, args);
    }

};


