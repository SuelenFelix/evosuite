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

public class Parser_transformTypeMirror_54814049928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38158;

    public Parser_transformTypeMirror_54814049928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38162 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38162, term38162.getClass(), "comment", null);
        setField(term38162, term38162.getClass(), "tag", null);
        setField(term38162, term38162.getClass(), "annotation", null);
        setField(term38162, term38162.getClass(), "_enum", null);
        setField(term38162, term38162.getClass(), "_interface", null);
        setField(term38162, term38162.getClass(), "clazz", null);
        setField(term38162, term38162.getClass(), "name", null);
        Object term38163 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38163, term38163.getClass(), "comment", null);
        setField(term38163, term38163.getClass(), "tag", null);
        setField(term38163, term38163.getClass(), "annotation", null);
        setField(term38163, term38163.getClass(), "_enum", null);
        setField(term38163, term38163.getClass(), "_interface", null);
        setField(term38163, term38163.getClass(), "clazz", null);
        setField(term38163, term38163.getClass(), "name", null);
        ArrayList term38160 = new ArrayList();
        ((ArrayList) term38160).add(term38162);
        ((ArrayList) term38160).add(term38163);
        term38158 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38159 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38159, term38159.getClass(), "_package", term38160);
        setField(term38158, term38158.getClass(), "xmlRoot", term38159);
        setField(term38158, term38158.getClass(), "environment", null);
        setField(term38158, term38158.getClass(), "docTreesUtils", null);
        setField(term38158, term38158.getClass(), "elementUtils", null);
        setField(term38158, term38158.getClass(), "typeUtils", null);
        setField(term38158, term38158.getClass(), "objectType", null);
        setField(term38158, term38158.getClass(), "errorType", null);
        setField(term38158, term38158.getClass(), "exceptionType", null);
        setField(term38158, term38158.getClass(), "externalizableType", null);
        setField(term38158, term38158.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.type.TypeMirror");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformTypeMirror", argTypes, term38158, args);
    }

};


