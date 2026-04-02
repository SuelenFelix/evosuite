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

public class Parser_transformTypeParameter_105210855424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38047;

    public Parser_transformTypeParameter_105210855424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38051 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38051, term38051.getClass(), "comment", null);
        setField(term38051, term38051.getClass(), "tag", null);
        setField(term38051, term38051.getClass(), "annotation", null);
        setField(term38051, term38051.getClass(), "_enum", null);
        setField(term38051, term38051.getClass(), "_interface", null);
        setField(term38051, term38051.getClass(), "clazz", null);
        setField(term38051, term38051.getClass(), "name", null);
        Object term38052 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38052, term38052.getClass(), "comment", null);
        setField(term38052, term38052.getClass(), "tag", null);
        setField(term38052, term38052.getClass(), "annotation", null);
        setField(term38052, term38052.getClass(), "_enum", null);
        setField(term38052, term38052.getClass(), "_interface", null);
        setField(term38052, term38052.getClass(), "clazz", null);
        setField(term38052, term38052.getClass(), "name", null);
        Object term38053 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38053, term38053.getClass(), "comment", null);
        setField(term38053, term38053.getClass(), "tag", null);
        setField(term38053, term38053.getClass(), "annotation", null);
        setField(term38053, term38053.getClass(), "_enum", null);
        setField(term38053, term38053.getClass(), "_interface", null);
        setField(term38053, term38053.getClass(), "clazz", null);
        setField(term38053, term38053.getClass(), "name", null);
        Object term38054 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38054, term38054.getClass(), "comment", null);
        setField(term38054, term38054.getClass(), "tag", null);
        setField(term38054, term38054.getClass(), "annotation", null);
        setField(term38054, term38054.getClass(), "_enum", null);
        setField(term38054, term38054.getClass(), "_interface", null);
        setField(term38054, term38054.getClass(), "clazz", null);
        setField(term38054, term38054.getClass(), "name", null);
        Object term38055 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38055, term38055.getClass(), "comment", null);
        setField(term38055, term38055.getClass(), "tag", null);
        setField(term38055, term38055.getClass(), "annotation", null);
        setField(term38055, term38055.getClass(), "_enum", null);
        setField(term38055, term38055.getClass(), "_interface", null);
        setField(term38055, term38055.getClass(), "clazz", null);
        setField(term38055, term38055.getClass(), "name", null);
        Object term38056 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38056, term38056.getClass(), "comment", null);
        setField(term38056, term38056.getClass(), "tag", null);
        setField(term38056, term38056.getClass(), "annotation", null);
        setField(term38056, term38056.getClass(), "_enum", null);
        setField(term38056, term38056.getClass(), "_interface", null);
        setField(term38056, term38056.getClass(), "clazz", null);
        setField(term38056, term38056.getClass(), "name", null);
        ArrayList term38049 = new ArrayList();
        ((ArrayList) term38049).add(term38051);
        ((ArrayList) term38049).add(term38052);
        ((ArrayList) term38049).add(term38053);
        ((ArrayList) term38049).add(term38054);
        ((ArrayList) term38049).add(term38055);
        ((ArrayList) term38049).add(term38056);
        term38047 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38048 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38048, term38048.getClass(), "_package", term38049);
        setField(term38047, term38047.getClass(), "xmlRoot", term38048);
        setField(term38047, term38047.getClass(), "environment", null);
        setField(term38047, term38047.getClass(), "docTreesUtils", null);
        setField(term38047, term38047.getClass(), "elementUtils", null);
        setField(term38047, term38047.getClass(), "typeUtils", null);
        setField(term38047, term38047.getClass(), "objectType", null);
        setField(term38047, term38047.getClass(), "errorType", null);
        setField(term38047, term38047.getClass(), "exceptionType", null);
        setField(term38047, term38047.getClass(), "externalizableType", null);
        setField(term38047, term38047.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.TypeParameterElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformTypeParameter", argTypes, term38047, args);
    }

};


