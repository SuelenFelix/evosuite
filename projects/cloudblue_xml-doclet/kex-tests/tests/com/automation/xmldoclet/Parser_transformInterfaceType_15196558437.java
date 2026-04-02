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

public class Parser_transformInterfaceType_15196558437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37538;

    public Parser_transformInterfaceType_15196558437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37542 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37542, term37542.getClass(), "comment", null);
        setField(term37542, term37542.getClass(), "tag", null);
        setField(term37542, term37542.getClass(), "annotation", null);
        setField(term37542, term37542.getClass(), "_enum", null);
        setField(term37542, term37542.getClass(), "_interface", null);
        setField(term37542, term37542.getClass(), "clazz", null);
        setField(term37542, term37542.getClass(), "name", null);
        Object term37543 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37543, term37543.getClass(), "comment", null);
        setField(term37543, term37543.getClass(), "tag", null);
        setField(term37543, term37543.getClass(), "annotation", null);
        setField(term37543, term37543.getClass(), "_enum", null);
        setField(term37543, term37543.getClass(), "_interface", null);
        setField(term37543, term37543.getClass(), "clazz", null);
        setField(term37543, term37543.getClass(), "name", null);
        Object term37544 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37544, term37544.getClass(), "comment", null);
        setField(term37544, term37544.getClass(), "tag", null);
        setField(term37544, term37544.getClass(), "annotation", null);
        setField(term37544, term37544.getClass(), "_enum", null);
        setField(term37544, term37544.getClass(), "_interface", null);
        setField(term37544, term37544.getClass(), "clazz", null);
        setField(term37544, term37544.getClass(), "name", null);
        Object term37545 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37545, term37545.getClass(), "comment", null);
        setField(term37545, term37545.getClass(), "tag", null);
        setField(term37545, term37545.getClass(), "annotation", null);
        setField(term37545, term37545.getClass(), "_enum", null);
        setField(term37545, term37545.getClass(), "_interface", null);
        setField(term37545, term37545.getClass(), "clazz", null);
        setField(term37545, term37545.getClass(), "name", null);
        Object term37546 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term37546, term37546.getClass(), "comment", null);
        setField(term37546, term37546.getClass(), "tag", null);
        setField(term37546, term37546.getClass(), "annotation", null);
        setField(term37546, term37546.getClass(), "_enum", null);
        setField(term37546, term37546.getClass(), "_interface", null);
        setField(term37546, term37546.getClass(), "clazz", null);
        setField(term37546, term37546.getClass(), "name", null);
        ArrayList term37540 = new ArrayList();
        ((ArrayList) term37540).add(term37542);
        ((ArrayList) term37540).add(term37543);
        ((ArrayList) term37540).add(term37544);
        ((ArrayList) term37540).add(term37545);
        ((ArrayList) term37540).add(term37546);
        term37538 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term37539 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term37539, term37539.getClass(), "_package", term37540);
        setField(term37538, term37538.getClass(), "xmlRoot", term37539);
        setField(term37538, term37538.getClass(), "environment", null);
        setField(term37538, term37538.getClass(), "docTreesUtils", null);
        setField(term37538, term37538.getClass(), "elementUtils", null);
        setField(term37538, term37538.getClass(), "typeUtils", null);
        setField(term37538, term37538.getClass(), "objectType", null);
        setField(term37538, term37538.getClass(), "errorType", null);
        setField(term37538, term37538.getClass(), "exceptionType", null);
        setField(term37538, term37538.getClass(), "externalizableType", null);
        setField(term37538, term37538.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.TypeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformInterfaceType", argTypes, term37538, args);
    }

};


