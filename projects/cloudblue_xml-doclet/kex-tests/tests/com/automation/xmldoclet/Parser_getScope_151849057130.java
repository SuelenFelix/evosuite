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

public class Parser_getScope_151849057130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38178;

    public Parser_getScope_151849057130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38182 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38182, term38182.getClass(), "comment", null);
        setField(term38182, term38182.getClass(), "tag", null);
        setField(term38182, term38182.getClass(), "annotation", null);
        setField(term38182, term38182.getClass(), "_enum", null);
        setField(term38182, term38182.getClass(), "_interface", null);
        setField(term38182, term38182.getClass(), "clazz", null);
        setField(term38182, term38182.getClass(), "name", null);
        Object term38183 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38183, term38183.getClass(), "comment", null);
        setField(term38183, term38183.getClass(), "tag", null);
        setField(term38183, term38183.getClass(), "annotation", null);
        setField(term38183, term38183.getClass(), "_enum", null);
        setField(term38183, term38183.getClass(), "_interface", null);
        setField(term38183, term38183.getClass(), "clazz", null);
        setField(term38183, term38183.getClass(), "name", null);
        Object term38184 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38184, term38184.getClass(), "comment", null);
        setField(term38184, term38184.getClass(), "tag", null);
        setField(term38184, term38184.getClass(), "annotation", null);
        setField(term38184, term38184.getClass(), "_enum", null);
        setField(term38184, term38184.getClass(), "_interface", null);
        setField(term38184, term38184.getClass(), "clazz", null);
        setField(term38184, term38184.getClass(), "name", null);
        Object term38185 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38185, term38185.getClass(), "comment", null);
        setField(term38185, term38185.getClass(), "tag", null);
        setField(term38185, term38185.getClass(), "annotation", null);
        setField(term38185, term38185.getClass(), "_enum", null);
        setField(term38185, term38185.getClass(), "_interface", null);
        setField(term38185, term38185.getClass(), "clazz", null);
        setField(term38185, term38185.getClass(), "name", null);
        Object term38186 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38186, term38186.getClass(), "comment", null);
        setField(term38186, term38186.getClass(), "tag", null);
        setField(term38186, term38186.getClass(), "annotation", null);
        setField(term38186, term38186.getClass(), "_enum", null);
        setField(term38186, term38186.getClass(), "_interface", null);
        setField(term38186, term38186.getClass(), "clazz", null);
        setField(term38186, term38186.getClass(), "name", null);
        Object term38187 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38187, term38187.getClass(), "comment", null);
        setField(term38187, term38187.getClass(), "tag", null);
        setField(term38187, term38187.getClass(), "annotation", null);
        setField(term38187, term38187.getClass(), "_enum", null);
        setField(term38187, term38187.getClass(), "_interface", null);
        setField(term38187, term38187.getClass(), "clazz", null);
        setField(term38187, term38187.getClass(), "name", null);
        Object term38188 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38188, term38188.getClass(), "comment", null);
        setField(term38188, term38188.getClass(), "tag", null);
        setField(term38188, term38188.getClass(), "annotation", null);
        setField(term38188, term38188.getClass(), "_enum", null);
        setField(term38188, term38188.getClass(), "_interface", null);
        setField(term38188, term38188.getClass(), "clazz", null);
        setField(term38188, term38188.getClass(), "name", null);
        Object term38189 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38189, term38189.getClass(), "comment", null);
        setField(term38189, term38189.getClass(), "tag", null);
        setField(term38189, term38189.getClass(), "annotation", null);
        setField(term38189, term38189.getClass(), "_enum", null);
        setField(term38189, term38189.getClass(), "_interface", null);
        setField(term38189, term38189.getClass(), "clazz", null);
        setField(term38189, term38189.getClass(), "name", null);
        Object term38190 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38190, term38190.getClass(), "comment", null);
        setField(term38190, term38190.getClass(), "tag", null);
        setField(term38190, term38190.getClass(), "annotation", null);
        setField(term38190, term38190.getClass(), "_enum", null);
        setField(term38190, term38190.getClass(), "_interface", null);
        setField(term38190, term38190.getClass(), "clazz", null);
        setField(term38190, term38190.getClass(), "name", null);
        ArrayList term38180 = new ArrayList();
        ((ArrayList) term38180).add(term38182);
        ((ArrayList) term38180).add(term38183);
        ((ArrayList) term38180).add(term38184);
        ((ArrayList) term38180).add(term38185);
        ((ArrayList) term38180).add(term38186);
        ((ArrayList) term38180).add(term38187);
        ((ArrayList) term38180).add(term38188);
        ((ArrayList) term38180).add(term38189);
        ((ArrayList) term38180).add(term38190);
        term38178 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38179 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38179, term38179.getClass(), "_package", term38180);
        setField(term38178, term38178.getClass(), "xmlRoot", term38179);
        setField(term38178, term38178.getClass(), "environment", null);
        setField(term38178, term38178.getClass(), "docTreesUtils", null);
        setField(term38178, term38178.getClass(), "elementUtils", null);
        setField(term38178, term38178.getClass(), "typeUtils", null);
        setField(term38178, term38178.getClass(), "objectType", null);
        setField(term38178, term38178.getClass(), "errorType", null);
        setField(term38178, term38178.getClass(), "exceptionType", null);
        setField(term38178, term38178.getClass(), "externalizableType", null);
        setField(term38178, term38178.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getScope", argTypes, term38178, args);
    }

};


