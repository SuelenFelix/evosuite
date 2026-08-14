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
import java.util.LinkedHashMap;

public class Parser_transformAnnotationValues_31101161420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37669;
     Object term37676;

    public Parser_transformAnnotationValues_31101161420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37673 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37673, term37673.getClass(), "comment", null);
        setField(term37673, term37673.getClass(), "tag", null);
        setField(term37673, term37673.getClass(), "annotation", null);
        setField(term37673, term37673.getClass(), "_enum", null);
        setField(term37673, term37673.getClass(), "_interface", null);
        setField(term37673, term37673.getClass(), "clazz", null);
        setField(term37673, term37673.getClass(), "name", null);
        ArrayList term37671 = new ArrayList();
        ((ArrayList) term37671).add(term37673);
        term37669 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37670 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37670, term37670.getClass(), "_package", term37671);
        setField(term37669, term37669.getClass(), "xmlRoot", term37670);
        setField(term37669, term37669.getClass(), "environment", null);
        setField(term37669, term37669.getClass(), "docTreesUtils", null);
        setField(term37669, term37669.getClass(), "elementUtils", null);
        setField(term37669, term37669.getClass(), "typeUtils", null);
        setField(term37669, term37669.getClass(), "objectType", null);
        setField(term37669, term37669.getClass(), "errorType", null);
        setField(term37669, term37669.getClass(), "exceptionType", null);
        setField(term37669, term37669.getClass(), "externalizableType", null);
        setField(term37669, term37669.getClass(), "serializableType", null);
        term37676 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term37676;
        callMethod(klass, "transformAnnotationValues", argTypes, term37669, args);
    }

};


