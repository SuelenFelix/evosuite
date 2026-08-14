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

public class Parser_getXmlRoot_34756271738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38316;

    public Parser_getXmlRoot_34756271738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38320 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38320, term38320.getClass(), "comment", null);
        setField(term38320, term38320.getClass(), "tag", null);
        setField(term38320, term38320.getClass(), "annotation", null);
        setField(term38320, term38320.getClass(), "_enum", null);
        setField(term38320, term38320.getClass(), "_interface", null);
        setField(term38320, term38320.getClass(), "clazz", null);
        setField(term38320, term38320.getClass(), "name", null);
        Object term38321 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38321, term38321.getClass(), "comment", null);
        setField(term38321, term38321.getClass(), "tag", null);
        setField(term38321, term38321.getClass(), "annotation", null);
        setField(term38321, term38321.getClass(), "_enum", null);
        setField(term38321, term38321.getClass(), "_interface", null);
        setField(term38321, term38321.getClass(), "clazz", null);
        setField(term38321, term38321.getClass(), "name", null);
        Object term38322 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38322, term38322.getClass(), "comment", null);
        setField(term38322, term38322.getClass(), "tag", null);
        setField(term38322, term38322.getClass(), "annotation", null);
        setField(term38322, term38322.getClass(), "_enum", null);
        setField(term38322, term38322.getClass(), "_interface", null);
        setField(term38322, term38322.getClass(), "clazz", null);
        setField(term38322, term38322.getClass(), "name", null);
        Object term38323 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38323, term38323.getClass(), "comment", null);
        setField(term38323, term38323.getClass(), "tag", null);
        setField(term38323, term38323.getClass(), "annotation", null);
        setField(term38323, term38323.getClass(), "_enum", null);
        setField(term38323, term38323.getClass(), "_interface", null);
        setField(term38323, term38323.getClass(), "clazz", null);
        setField(term38323, term38323.getClass(), "name", null);
        Object term38324 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38324, term38324.getClass(), "comment", null);
        setField(term38324, term38324.getClass(), "tag", null);
        setField(term38324, term38324.getClass(), "annotation", null);
        setField(term38324, term38324.getClass(), "_enum", null);
        setField(term38324, term38324.getClass(), "_interface", null);
        setField(term38324, term38324.getClass(), "clazz", null);
        setField(term38324, term38324.getClass(), "name", null);
        Object term38325 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38325, term38325.getClass(), "comment", null);
        setField(term38325, term38325.getClass(), "tag", null);
        setField(term38325, term38325.getClass(), "annotation", null);
        setField(term38325, term38325.getClass(), "_enum", null);
        setField(term38325, term38325.getClass(), "_interface", null);
        setField(term38325, term38325.getClass(), "clazz", null);
        setField(term38325, term38325.getClass(), "name", null);
        Object term38326 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38326, term38326.getClass(), "comment", null);
        setField(term38326, term38326.getClass(), "tag", null);
        setField(term38326, term38326.getClass(), "annotation", null);
        setField(term38326, term38326.getClass(), "_enum", null);
        setField(term38326, term38326.getClass(), "_interface", null);
        setField(term38326, term38326.getClass(), "clazz", null);
        setField(term38326, term38326.getClass(), "name", null);
        Object term38327 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38327, term38327.getClass(), "comment", null);
        setField(term38327, term38327.getClass(), "tag", null);
        setField(term38327, term38327.getClass(), "annotation", null);
        setField(term38327, term38327.getClass(), "_enum", null);
        setField(term38327, term38327.getClass(), "_interface", null);
        setField(term38327, term38327.getClass(), "clazz", null);
        setField(term38327, term38327.getClass(), "name", null);
        Object term38328 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38328, term38328.getClass(), "comment", null);
        setField(term38328, term38328.getClass(), "tag", null);
        setField(term38328, term38328.getClass(), "annotation", null);
        setField(term38328, term38328.getClass(), "_enum", null);
        setField(term38328, term38328.getClass(), "_interface", null);
        setField(term38328, term38328.getClass(), "clazz", null);
        setField(term38328, term38328.getClass(), "name", null);
        ArrayList term38318 = new ArrayList();
        ((ArrayList) term38318).add(term38320);
        ((ArrayList) term38318).add(term38321);
        ((ArrayList) term38318).add(term38322);
        ((ArrayList) term38318).add(term38323);
        ((ArrayList) term38318).add(term38324);
        ((ArrayList) term38318).add(term38325);
        ((ArrayList) term38318).add(term38326);
        ((ArrayList) term38318).add(term38327);
        ((ArrayList) term38318).add(term38328);
        term38316 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38317 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38317, term38317.getClass(), "_package", term38318);
        setField(term38316, term38316.getClass(), "xmlRoot", term38317);
        setField(term38316, term38316.getClass(), "environment", null);
        setField(term38316, term38316.getClass(), "docTreesUtils", null);
        setField(term38316, term38316.getClass(), "elementUtils", null);
        setField(term38316, term38316.getClass(), "typeUtils", null);
        setField(term38316, term38316.getClass(), "objectType", null);
        setField(term38316, term38316.getClass(), "errorType", null);
        setField(term38316, term38316.getClass(), "exceptionType", null);
        setField(term38316, term38316.getClass(), "externalizableType", null);
        setField(term38316, term38316.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getXmlRoot", argTypes, term38316, args);
    }

};


