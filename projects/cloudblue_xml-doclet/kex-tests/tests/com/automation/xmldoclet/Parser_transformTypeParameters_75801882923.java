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

public class Parser_transformTypeParameters_75801882923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38027;
     Object term38037;

    public Parser_transformTypeParameters_75801882923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38031 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38031, term38031.getClass(), "comment", null);
        setField(term38031, term38031.getClass(), "tag", null);
        setField(term38031, term38031.getClass(), "annotation", null);
        setField(term38031, term38031.getClass(), "_enum", null);
        setField(term38031, term38031.getClass(), "_interface", null);
        setField(term38031, term38031.getClass(), "clazz", null);
        setField(term38031, term38031.getClass(), "name", null);
        Object term38032 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38032, term38032.getClass(), "comment", null);
        setField(term38032, term38032.getClass(), "tag", null);
        setField(term38032, term38032.getClass(), "annotation", null);
        setField(term38032, term38032.getClass(), "_enum", null);
        setField(term38032, term38032.getClass(), "_interface", null);
        setField(term38032, term38032.getClass(), "clazz", null);
        setField(term38032, term38032.getClass(), "name", null);
        Object term38033 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38033, term38033.getClass(), "comment", null);
        setField(term38033, term38033.getClass(), "tag", null);
        setField(term38033, term38033.getClass(), "annotation", null);
        setField(term38033, term38033.getClass(), "_enum", null);
        setField(term38033, term38033.getClass(), "_interface", null);
        setField(term38033, term38033.getClass(), "clazz", null);
        setField(term38033, term38033.getClass(), "name", null);
        Object term38034 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38034, term38034.getClass(), "comment", null);
        setField(term38034, term38034.getClass(), "tag", null);
        setField(term38034, term38034.getClass(), "annotation", null);
        setField(term38034, term38034.getClass(), "_enum", null);
        setField(term38034, term38034.getClass(), "_interface", null);
        setField(term38034, term38034.getClass(), "clazz", null);
        setField(term38034, term38034.getClass(), "name", null);
        ArrayList term38029 = new ArrayList();
        ((ArrayList) term38029).add(term38031);
        ((ArrayList) term38029).add(term38032);
        ((ArrayList) term38029).add(term38033);
        ((ArrayList) term38029).add(term38034);
        term38027 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38028 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38028, term38028.getClass(), "_package", term38029);
        setField(term38027, term38027.getClass(), "xmlRoot", term38028);
        setField(term38027, term38027.getClass(), "environment", null);
        setField(term38027, term38027.getClass(), "docTreesUtils", null);
        setField(term38027, term38027.getClass(), "elementUtils", null);
        setField(term38027, term38027.getClass(), "typeUtils", null);
        setField(term38027, term38027.getClass(), "objectType", null);
        setField(term38027, term38027.getClass(), "errorType", null);
        setField(term38027, term38027.getClass(), "exceptionType", null);
        setField(term38027, term38027.getClass(), "externalizableType", null);
        setField(term38027, term38027.getClass(), "serializableType", null);
        term38037 = new LinkedList();
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
        ((LinkedList) term38037).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term38037;
        callMethod(klass, "transformTypeParameters", argTypes, term38027, args);
    }

};


