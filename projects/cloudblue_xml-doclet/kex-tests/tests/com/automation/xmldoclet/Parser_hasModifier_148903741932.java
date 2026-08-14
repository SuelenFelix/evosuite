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

public class Parser_hasModifier_148903741932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38199;
     Object term38214;

    public Parser_hasModifier_148903741932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38203 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38203, term38203.getClass(), "comment", null);
        setField(term38203, term38203.getClass(), "tag", null);
        setField(term38203, term38203.getClass(), "annotation", null);
        setField(term38203, term38203.getClass(), "_enum", null);
        setField(term38203, term38203.getClass(), "_interface", null);
        setField(term38203, term38203.getClass(), "clazz", null);
        setField(term38203, term38203.getClass(), "name", null);
        Object term38204 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38204, term38204.getClass(), "comment", null);
        setField(term38204, term38204.getClass(), "tag", null);
        setField(term38204, term38204.getClass(), "annotation", null);
        setField(term38204, term38204.getClass(), "_enum", null);
        setField(term38204, term38204.getClass(), "_interface", null);
        setField(term38204, term38204.getClass(), "clazz", null);
        setField(term38204, term38204.getClass(), "name", null);
        Object term38205 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38205, term38205.getClass(), "comment", null);
        setField(term38205, term38205.getClass(), "tag", null);
        setField(term38205, term38205.getClass(), "annotation", null);
        setField(term38205, term38205.getClass(), "_enum", null);
        setField(term38205, term38205.getClass(), "_interface", null);
        setField(term38205, term38205.getClass(), "clazz", null);
        setField(term38205, term38205.getClass(), "name", null);
        Object term38206 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38206, term38206.getClass(), "comment", null);
        setField(term38206, term38206.getClass(), "tag", null);
        setField(term38206, term38206.getClass(), "annotation", null);
        setField(term38206, term38206.getClass(), "_enum", null);
        setField(term38206, term38206.getClass(), "_interface", null);
        setField(term38206, term38206.getClass(), "clazz", null);
        setField(term38206, term38206.getClass(), "name", null);
        Object term38207 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38207, term38207.getClass(), "comment", null);
        setField(term38207, term38207.getClass(), "tag", null);
        setField(term38207, term38207.getClass(), "annotation", null);
        setField(term38207, term38207.getClass(), "_enum", null);
        setField(term38207, term38207.getClass(), "_interface", null);
        setField(term38207, term38207.getClass(), "clazz", null);
        setField(term38207, term38207.getClass(), "name", null);
        Object term38208 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38208, term38208.getClass(), "comment", null);
        setField(term38208, term38208.getClass(), "tag", null);
        setField(term38208, term38208.getClass(), "annotation", null);
        setField(term38208, term38208.getClass(), "_enum", null);
        setField(term38208, term38208.getClass(), "_interface", null);
        setField(term38208, term38208.getClass(), "clazz", null);
        setField(term38208, term38208.getClass(), "name", null);
        Object term38209 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38209, term38209.getClass(), "comment", null);
        setField(term38209, term38209.getClass(), "tag", null);
        setField(term38209, term38209.getClass(), "annotation", null);
        setField(term38209, term38209.getClass(), "_enum", null);
        setField(term38209, term38209.getClass(), "_interface", null);
        setField(term38209, term38209.getClass(), "clazz", null);
        setField(term38209, term38209.getClass(), "name", null);
        Object term38210 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38210, term38210.getClass(), "comment", null);
        setField(term38210, term38210.getClass(), "tag", null);
        setField(term38210, term38210.getClass(), "annotation", null);
        setField(term38210, term38210.getClass(), "_enum", null);
        setField(term38210, term38210.getClass(), "_interface", null);
        setField(term38210, term38210.getClass(), "clazz", null);
        setField(term38210, term38210.getClass(), "name", null);
        Object term38211 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38211, term38211.getClass(), "comment", null);
        setField(term38211, term38211.getClass(), "tag", null);
        setField(term38211, term38211.getClass(), "annotation", null);
        setField(term38211, term38211.getClass(), "_enum", null);
        setField(term38211, term38211.getClass(), "_interface", null);
        setField(term38211, term38211.getClass(), "clazz", null);
        setField(term38211, term38211.getClass(), "name", null);
        ArrayList term38201 = new ArrayList();
        ((ArrayList) term38201).add(term38203);
        ((ArrayList) term38201).add(term38204);
        ((ArrayList) term38201).add(term38205);
        ((ArrayList) term38201).add(term38206);
        ((ArrayList) term38201).add(term38207);
        ((ArrayList) term38201).add(term38208);
        ((ArrayList) term38201).add(term38209);
        ((ArrayList) term38201).add(term38210);
        ((ArrayList) term38201).add(term38211);
        term38199 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38200 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38200, term38200.getClass(), "_package", term38201);
        setField(term38199, term38199.getClass(), "xmlRoot", term38200);
        setField(term38199, term38199.getClass(), "environment", null);
        setField(term38199, term38199.getClass(), "docTreesUtils", null);
        setField(term38199, term38199.getClass(), "elementUtils", null);
        setField(term38199, term38199.getClass(), "typeUtils", null);
        setField(term38199, term38199.getClass(), "objectType", null);
        setField(term38199, term38199.getClass(), "errorType", null);
        setField(term38199, term38199.getClass(), "exceptionType", null);
        setField(term38199, term38199.getClass(), "externalizableType", null);
        setField(term38199, term38199.getClass(), "serializableType", null);
        term38214 = newInstance(Class.forName("javax.lang.model.element.Modifier"));
        setField(term38214, term38214.getClass(), "name", "TRANSIENT");
        setIntField(term38214, term38214.getClass(), "ordinal", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        argTypes[1] = Class.forName("javax.lang.model.element.Modifier");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38214;
        callMethod(klass, "hasModifier", argTypes, term38199, args);
    }

};


