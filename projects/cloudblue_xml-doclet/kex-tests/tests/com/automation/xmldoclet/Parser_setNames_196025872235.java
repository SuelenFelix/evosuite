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

public class Parser_setNames_196025872235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38257;

    public Parser_setNames_196025872235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38261 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38261, term38261.getClass(), "comment", null);
        setField(term38261, term38261.getClass(), "tag", null);
        setField(term38261, term38261.getClass(), "annotation", null);
        setField(term38261, term38261.getClass(), "_enum", null);
        setField(term38261, term38261.getClass(), "_interface", null);
        setField(term38261, term38261.getClass(), "clazz", null);
        setField(term38261, term38261.getClass(), "name", null);
        Object term38262 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38262, term38262.getClass(), "comment", null);
        setField(term38262, term38262.getClass(), "tag", null);
        setField(term38262, term38262.getClass(), "annotation", null);
        setField(term38262, term38262.getClass(), "_enum", null);
        setField(term38262, term38262.getClass(), "_interface", null);
        setField(term38262, term38262.getClass(), "clazz", null);
        setField(term38262, term38262.getClass(), "name", null);
        Object term38263 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38263, term38263.getClass(), "comment", null);
        setField(term38263, term38263.getClass(), "tag", null);
        setField(term38263, term38263.getClass(), "annotation", null);
        setField(term38263, term38263.getClass(), "_enum", null);
        setField(term38263, term38263.getClass(), "_interface", null);
        setField(term38263, term38263.getClass(), "clazz", null);
        setField(term38263, term38263.getClass(), "name", null);
        Object term38264 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38264, term38264.getClass(), "comment", null);
        setField(term38264, term38264.getClass(), "tag", null);
        setField(term38264, term38264.getClass(), "annotation", null);
        setField(term38264, term38264.getClass(), "_enum", null);
        setField(term38264, term38264.getClass(), "_interface", null);
        setField(term38264, term38264.getClass(), "clazz", null);
        setField(term38264, term38264.getClass(), "name", null);
        Object term38265 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38265, term38265.getClass(), "comment", null);
        setField(term38265, term38265.getClass(), "tag", null);
        setField(term38265, term38265.getClass(), "annotation", null);
        setField(term38265, term38265.getClass(), "_enum", null);
        setField(term38265, term38265.getClass(), "_interface", null);
        setField(term38265, term38265.getClass(), "clazz", null);
        setField(term38265, term38265.getClass(), "name", null);
        Object term38266 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38266, term38266.getClass(), "comment", null);
        setField(term38266, term38266.getClass(), "tag", null);
        setField(term38266, term38266.getClass(), "annotation", null);
        setField(term38266, term38266.getClass(), "_enum", null);
        setField(term38266, term38266.getClass(), "_interface", null);
        setField(term38266, term38266.getClass(), "clazz", null);
        setField(term38266, term38266.getClass(), "name", null);
        Object term38267 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38267, term38267.getClass(), "comment", null);
        setField(term38267, term38267.getClass(), "tag", null);
        setField(term38267, term38267.getClass(), "annotation", null);
        setField(term38267, term38267.getClass(), "_enum", null);
        setField(term38267, term38267.getClass(), "_interface", null);
        setField(term38267, term38267.getClass(), "clazz", null);
        setField(term38267, term38267.getClass(), "name", null);
        ArrayList term38259 = new ArrayList();
        ((ArrayList) term38259).add(term38261);
        ((ArrayList) term38259).add(term38262);
        ((ArrayList) term38259).add(term38263);
        ((ArrayList) term38259).add(term38264);
        ((ArrayList) term38259).add(term38265);
        ((ArrayList) term38259).add(term38266);
        ((ArrayList) term38259).add(term38267);
        term38257 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38258 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38258, term38258.getClass(), "_package", term38259);
        setField(term38257, term38257.getClass(), "xmlRoot", term38258);
        setField(term38257, term38257.getClass(), "environment", null);
        setField(term38257, term38257.getClass(), "docTreesUtils", null);
        setField(term38257, term38257.getClass(), "elementUtils", null);
        setField(term38257, term38257.getClass(), "typeUtils", null);
        setField(term38257, term38257.getClass(), "objectType", null);
        setField(term38257, term38257.getClass(), "errorType", null);
        setField(term38257, term38257.getClass(), "exceptionType", null);
        setField(term38257, term38257.getClass(), "externalizableType", null);
        setField(term38257, term38257.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        argTypes[2] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setNames", argTypes, term38257, args);
    }

};


