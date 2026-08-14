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

public class Parser_transformMethodElement_168941539114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37600;

    public Parser_transformMethodElement_168941539114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37604 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37604, term37604.getClass(), "comment", null);
        setField(term37604, term37604.getClass(), "tag", null);
        setField(term37604, term37604.getClass(), "annotation", null);
        setField(term37604, term37604.getClass(), "_enum", null);
        setField(term37604, term37604.getClass(), "_interface", null);
        setField(term37604, term37604.getClass(), "clazz", null);
        setField(term37604, term37604.getClass(), "name", null);
        Object term37605 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37605, term37605.getClass(), "comment", null);
        setField(term37605, term37605.getClass(), "tag", null);
        setField(term37605, term37605.getClass(), "annotation", null);
        setField(term37605, term37605.getClass(), "_enum", null);
        setField(term37605, term37605.getClass(), "_interface", null);
        setField(term37605, term37605.getClass(), "clazz", null);
        setField(term37605, term37605.getClass(), "name", null);
        Object term37606 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37606, term37606.getClass(), "comment", null);
        setField(term37606, term37606.getClass(), "tag", null);
        setField(term37606, term37606.getClass(), "annotation", null);
        setField(term37606, term37606.getClass(), "_enum", null);
        setField(term37606, term37606.getClass(), "_interface", null);
        setField(term37606, term37606.getClass(), "clazz", null);
        setField(term37606, term37606.getClass(), "name", null);
        Object term37607 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37607, term37607.getClass(), "comment", null);
        setField(term37607, term37607.getClass(), "tag", null);
        setField(term37607, term37607.getClass(), "annotation", null);
        setField(term37607, term37607.getClass(), "_enum", null);
        setField(term37607, term37607.getClass(), "_interface", null);
        setField(term37607, term37607.getClass(), "clazz", null);
        setField(term37607, term37607.getClass(), "name", null);
        Object term37608 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37608, term37608.getClass(), "comment", null);
        setField(term37608, term37608.getClass(), "tag", null);
        setField(term37608, term37608.getClass(), "annotation", null);
        setField(term37608, term37608.getClass(), "_enum", null);
        setField(term37608, term37608.getClass(), "_interface", null);
        setField(term37608, term37608.getClass(), "clazz", null);
        setField(term37608, term37608.getClass(), "name", null);
        Object term37609 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37609, term37609.getClass(), "comment", null);
        setField(term37609, term37609.getClass(), "tag", null);
        setField(term37609, term37609.getClass(), "annotation", null);
        setField(term37609, term37609.getClass(), "_enum", null);
        setField(term37609, term37609.getClass(), "_interface", null);
        setField(term37609, term37609.getClass(), "clazz", null);
        setField(term37609, term37609.getClass(), "name", null);
        Object term37610 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37610, term37610.getClass(), "comment", null);
        setField(term37610, term37610.getClass(), "tag", null);
        setField(term37610, term37610.getClass(), "annotation", null);
        setField(term37610, term37610.getClass(), "_enum", null);
        setField(term37610, term37610.getClass(), "_interface", null);
        setField(term37610, term37610.getClass(), "clazz", null);
        setField(term37610, term37610.getClass(), "name", null);
        Object term37611 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37611, term37611.getClass(), "comment", null);
        setField(term37611, term37611.getClass(), "tag", null);
        setField(term37611, term37611.getClass(), "annotation", null);
        setField(term37611, term37611.getClass(), "_enum", null);
        setField(term37611, term37611.getClass(), "_interface", null);
        setField(term37611, term37611.getClass(), "clazz", null);
        setField(term37611, term37611.getClass(), "name", null);
        ArrayList term37602 = new ArrayList();
        ((ArrayList) term37602).add(term37604);
        ((ArrayList) term37602).add(term37605);
        ((ArrayList) term37602).add(term37606);
        ((ArrayList) term37602).add(term37607);
        ((ArrayList) term37602).add(term37608);
        ((ArrayList) term37602).add(term37609);
        ((ArrayList) term37602).add(term37610);
        ((ArrayList) term37602).add(term37611);
        term37600 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37601 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37601, term37601.getClass(), "_package", term37602);
        setField(term37600, term37600.getClass(), "xmlRoot", term37601);
        setField(term37600, term37600.getClass(), "environment", null);
        setField(term37600, term37600.getClass(), "docTreesUtils", null);
        setField(term37600, term37600.getClass(), "elementUtils", null);
        setField(term37600, term37600.getClass(), "typeUtils", null);
        setField(term37600, term37600.getClass(), "objectType", null);
        setField(term37600, term37600.getClass(), "errorType", null);
        setField(term37600, term37600.getClass(), "exceptionType", null);
        setField(term37600, term37600.getClass(), "externalizableType", null);
        setField(term37600, term37600.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformMethodElement", argTypes, term37600, args);
    }

};


