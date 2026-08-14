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

public class Parser_transformTypeElement_18616811725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37514;

    public Parser_transformTypeElement_18616811725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37518 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37518, term37518.getClass(), "comment", null);
        setField(term37518, term37518.getClass(), "tag", null);
        setField(term37518, term37518.getClass(), "annotation", null);
        setField(term37518, term37518.getClass(), "_enum", null);
        setField(term37518, term37518.getClass(), "_interface", null);
        setField(term37518, term37518.getClass(), "clazz", null);
        setField(term37518, term37518.getClass(), "name", null);
        Object term37519 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37519, term37519.getClass(), "comment", null);
        setField(term37519, term37519.getClass(), "tag", null);
        setField(term37519, term37519.getClass(), "annotation", null);
        setField(term37519, term37519.getClass(), "_enum", null);
        setField(term37519, term37519.getClass(), "_interface", null);
        setField(term37519, term37519.getClass(), "clazz", null);
        setField(term37519, term37519.getClass(), "name", null);
        Object term37520 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37520, term37520.getClass(), "comment", null);
        setField(term37520, term37520.getClass(), "tag", null);
        setField(term37520, term37520.getClass(), "annotation", null);
        setField(term37520, term37520.getClass(), "_enum", null);
        setField(term37520, term37520.getClass(), "_interface", null);
        setField(term37520, term37520.getClass(), "clazz", null);
        setField(term37520, term37520.getClass(), "name", null);
        Object term37521 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37521, term37521.getClass(), "comment", null);
        setField(term37521, term37521.getClass(), "tag", null);
        setField(term37521, term37521.getClass(), "annotation", null);
        setField(term37521, term37521.getClass(), "_enum", null);
        setField(term37521, term37521.getClass(), "_interface", null);
        setField(term37521, term37521.getClass(), "clazz", null);
        setField(term37521, term37521.getClass(), "name", null);
        Object term37522 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37522, term37522.getClass(), "comment", null);
        setField(term37522, term37522.getClass(), "tag", null);
        setField(term37522, term37522.getClass(), "annotation", null);
        setField(term37522, term37522.getClass(), "_enum", null);
        setField(term37522, term37522.getClass(), "_interface", null);
        setField(term37522, term37522.getClass(), "clazz", null);
        setField(term37522, term37522.getClass(), "name", null);
        Object term37523 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37523, term37523.getClass(), "comment", null);
        setField(term37523, term37523.getClass(), "tag", null);
        setField(term37523, term37523.getClass(), "annotation", null);
        setField(term37523, term37523.getClass(), "_enum", null);
        setField(term37523, term37523.getClass(), "_interface", null);
        setField(term37523, term37523.getClass(), "clazz", null);
        setField(term37523, term37523.getClass(), "name", null);
        ArrayList term37516 = new ArrayList();
        ((ArrayList) term37516).add(term37518);
        ((ArrayList) term37516).add(term37519);
        ((ArrayList) term37516).add(term37520);
        ((ArrayList) term37516).add(term37521);
        ((ArrayList) term37516).add(term37522);
        ((ArrayList) term37516).add(term37523);
        term37514 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37515 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37515, term37515.getClass(), "_package", term37516);
        setField(term37514, term37514.getClass(), "xmlRoot", term37515);
        setField(term37514, term37514.getClass(), "environment", null);
        setField(term37514, term37514.getClass(), "docTreesUtils", null);
        setField(term37514, term37514.getClass(), "elementUtils", null);
        setField(term37514, term37514.getClass(), "typeUtils", null);
        setField(term37514, term37514.getClass(), "objectType", null);
        setField(term37514, term37514.getClass(), "errorType", null);
        setField(term37514, term37514.getClass(), "exceptionType", null);
        setField(term37514, term37514.getClass(), "externalizableType", null);
        setField(term37514, term37514.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.TypeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformTypeElement", argTypes, term37514, args);
    }

};


