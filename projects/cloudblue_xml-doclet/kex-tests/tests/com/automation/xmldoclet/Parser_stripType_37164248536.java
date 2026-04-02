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

public class Parser_stripType_37164248536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38270;

    public Parser_stripType_37164248536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38274 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38274, term38274.getClass(), "comment", null);
        setField(term38274, term38274.getClass(), "tag", null);
        setField(term38274, term38274.getClass(), "annotation", null);
        setField(term38274, term38274.getClass(), "_enum", null);
        setField(term38274, term38274.getClass(), "_interface", null);
        setField(term38274, term38274.getClass(), "clazz", null);
        setField(term38274, term38274.getClass(), "name", null);
        Object term38275 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38275, term38275.getClass(), "comment", null);
        setField(term38275, term38275.getClass(), "tag", null);
        setField(term38275, term38275.getClass(), "annotation", null);
        setField(term38275, term38275.getClass(), "_enum", null);
        setField(term38275, term38275.getClass(), "_interface", null);
        setField(term38275, term38275.getClass(), "clazz", null);
        setField(term38275, term38275.getClass(), "name", null);
        Object term38276 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38276, term38276.getClass(), "comment", null);
        setField(term38276, term38276.getClass(), "tag", null);
        setField(term38276, term38276.getClass(), "annotation", null);
        setField(term38276, term38276.getClass(), "_enum", null);
        setField(term38276, term38276.getClass(), "_interface", null);
        setField(term38276, term38276.getClass(), "clazz", null);
        setField(term38276, term38276.getClass(), "name", null);
        ArrayList term38272 = new ArrayList();
        ((ArrayList) term38272).add(term38274);
        ((ArrayList) term38272).add(term38275);
        ((ArrayList) term38272).add(term38276);
        term38270 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38271 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38271, term38271.getClass(), "_package", term38272);
        setField(term38270, term38270.getClass(), "xmlRoot", term38271);
        setField(term38270, term38270.getClass(), "environment", null);
        setField(term38270, term38270.getClass(), "docTreesUtils", null);
        setField(term38270, term38270.getClass(), "elementUtils", null);
        setField(term38270, term38270.getClass(), "typeUtils", null);
        setField(term38270, term38270.getClass(), "objectType", null);
        setField(term38270, term38270.getClass(), "errorType", null);
        setField(term38270, term38270.getClass(), "exceptionType", null);
        setField(term38270, term38270.getClass(), "externalizableType", null);
        setField(term38270, term38270.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mIrmJxrRFo";
        callMethod(klass, "stripType", argTypes, term38270, args);
    }

};


