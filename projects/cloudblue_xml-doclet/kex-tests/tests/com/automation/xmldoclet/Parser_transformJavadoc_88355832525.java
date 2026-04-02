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
import java.util.LinkedList;

public class Parser_transformJavadoc_88355832525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38059;
     Object term38071;

    public Parser_transformJavadoc_88355832525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38063 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38063, term38063.getClass(), "comment", null);
        setField(term38063, term38063.getClass(), "tag", null);
        setField(term38063, term38063.getClass(), "annotation", null);
        setField(term38063, term38063.getClass(), "_enum", null);
        setField(term38063, term38063.getClass(), "_interface", null);
        setField(term38063, term38063.getClass(), "clazz", null);
        setField(term38063, term38063.getClass(), "name", null);
        Object term38064 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38064, term38064.getClass(), "comment", null);
        setField(term38064, term38064.getClass(), "tag", null);
        setField(term38064, term38064.getClass(), "annotation", null);
        setField(term38064, term38064.getClass(), "_enum", null);
        setField(term38064, term38064.getClass(), "_interface", null);
        setField(term38064, term38064.getClass(), "clazz", null);
        setField(term38064, term38064.getClass(), "name", null);
        Object term38065 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38065, term38065.getClass(), "comment", null);
        setField(term38065, term38065.getClass(), "tag", null);
        setField(term38065, term38065.getClass(), "annotation", null);
        setField(term38065, term38065.getClass(), "_enum", null);
        setField(term38065, term38065.getClass(), "_interface", null);
        setField(term38065, term38065.getClass(), "clazz", null);
        setField(term38065, term38065.getClass(), "name", null);
        Object term38066 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38066, term38066.getClass(), "comment", null);
        setField(term38066, term38066.getClass(), "tag", null);
        setField(term38066, term38066.getClass(), "annotation", null);
        setField(term38066, term38066.getClass(), "_enum", null);
        setField(term38066, term38066.getClass(), "_interface", null);
        setField(term38066, term38066.getClass(), "clazz", null);
        setField(term38066, term38066.getClass(), "name", null);
        Object term38067 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38067, term38067.getClass(), "comment", null);
        setField(term38067, term38067.getClass(), "tag", null);
        setField(term38067, term38067.getClass(), "annotation", null);
        setField(term38067, term38067.getClass(), "_enum", null);
        setField(term38067, term38067.getClass(), "_interface", null);
        setField(term38067, term38067.getClass(), "clazz", null);
        setField(term38067, term38067.getClass(), "name", null);
        Object term38068 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38068, term38068.getClass(), "comment", null);
        setField(term38068, term38068.getClass(), "tag", null);
        setField(term38068, term38068.getClass(), "annotation", null);
        setField(term38068, term38068.getClass(), "_enum", null);
        setField(term38068, term38068.getClass(), "_interface", null);
        setField(term38068, term38068.getClass(), "clazz", null);
        setField(term38068, term38068.getClass(), "name", null);
        ArrayList term38061 = new ArrayList();
        ((ArrayList) term38061).add(term38063);
        ((ArrayList) term38061).add(term38064);
        ((ArrayList) term38061).add(term38065);
        ((ArrayList) term38061).add(term38066);
        ((ArrayList) term38061).add(term38067);
        ((ArrayList) term38061).add(term38068);
        term38059 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38060 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38060, term38060.getClass(), "_package", term38061);
        setField(term38059, term38059.getClass(), "xmlRoot", term38060);
        setField(term38059, term38059.getClass(), "environment", null);
        setField(term38059, term38059.getClass(), "docTreesUtils", null);
        setField(term38059, term38059.getClass(), "elementUtils", null);
        setField(term38059, term38059.getClass(), "typeUtils", null);
        setField(term38059, term38059.getClass(), "objectType", null);
        setField(term38059, term38059.getClass(), "errorType", null);
        setField(term38059, term38059.getClass(), "exceptionType", null);
        setField(term38059, term38059.getClass(), "externalizableType", null);
        setField(term38059, term38059.getClass(), "serializableType", null);
        Object term38074 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term38074, term38074.getClass(), "name", "RbtoghRIMd");
        setField(term38074, term38074.getClass(), "text", "AZfmETuQka");
        Object term38100 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term38100, term38100.getClass(), "name", "");
        setField(term38100, term38100.getClass(), "text", "");
        Object term38104 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term38104, term38104.getClass(), "name", null);
        setField(term38104, term38104.getClass(), "text", null);
        term38071 = new LinkedList();
        ((LinkedList) term38071).add(term38074);
        ((LinkedList) term38071).add(term38100);
        ((LinkedList) term38071).add(term38104);
        ((LinkedList) term38071).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term38071;
        callMethod(klass, "transformJavadoc", argTypes, term38059, args);
    }

};


