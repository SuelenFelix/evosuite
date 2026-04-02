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

public class Parser_getXmlPackage_144912355834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38250;

    public Parser_getXmlPackage_144912355834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38254 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38254, term38254.getClass(), "comment", null);
        setField(term38254, term38254.getClass(), "tag", null);
        setField(term38254, term38254.getClass(), "annotation", null);
        setField(term38254, term38254.getClass(), "_enum", null);
        setField(term38254, term38254.getClass(), "_interface", null);
        setField(term38254, term38254.getClass(), "clazz", null);
        setField(term38254, term38254.getClass(), "name", null);
        ArrayList term38252 = new ArrayList();
        ((ArrayList) term38252).add(term38254);
        term38250 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38251 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38251, term38251.getClass(), "_package", term38252);
        setField(term38250, term38250.getClass(), "xmlRoot", term38251);
        setField(term38250, term38250.getClass(), "environment", null);
        setField(term38250, term38250.getClass(), "docTreesUtils", null);
        setField(term38250, term38250.getClass(), "elementUtils", null);
        setField(term38250, term38250.getClass(), "typeUtils", null);
        setField(term38250, term38250.getClass(), "objectType", null);
        setField(term38250, term38250.getClass(), "errorType", null);
        setField(term38250, term38250.getClass(), "exceptionType", null);
        setField(term38250, term38250.getClass(), "externalizableType", null);
        setField(term38250, term38250.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.PackageElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getXmlPackage", argTypes, term38250, args);
    }

};


