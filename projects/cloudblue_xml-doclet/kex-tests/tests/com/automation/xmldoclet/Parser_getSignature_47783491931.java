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

public class Parser_getSignature_47783491931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38193;

    public Parser_getSignature_47783491931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38195 = new ArrayList();
        term38193 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38194 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38194, term38194.getClass(), "_package", term38195);
        setField(term38193, term38193.getClass(), "xmlRoot", term38194);
        setField(term38193, term38193.getClass(), "environment", null);
        setField(term38193, term38193.getClass(), "docTreesUtils", null);
        setField(term38193, term38193.getClass(), "elementUtils", null);
        setField(term38193, term38193.getClass(), "typeUtils", null);
        setField(term38193, term38193.getClass(), "objectType", null);
        setField(term38193, term38193.getClass(), "errorType", null);
        setField(term38193, term38193.getClass(), "exceptionType", null);
        setField(term38193, term38193.getClass(), "externalizableType", null);
        setField(term38193, term38193.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.ExecutableElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSignature", argTypes, term38193, args);
    }

};


