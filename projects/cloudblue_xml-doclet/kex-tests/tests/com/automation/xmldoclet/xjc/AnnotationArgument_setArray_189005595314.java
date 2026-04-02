package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class AnnotationArgument_setArray_189005595314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54333;
     Object term54498;

    public AnnotationArgument_setArray_189005595314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54336 = new ArrayList();
        ((ArrayList) term54336).add((Object)null);
        ArrayList term54340 = new ArrayList();
        ((ArrayList) term54340).add((Object)null);
        Object term54346 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54346, term54346.getClass(), "wildcard", null);
        setField(term54346, term54346.getClass(), "generic", null);
        setField(term54346, term54346.getClass(), "qualified", null);
        setField(term54346, term54346.getClass(), "dimension", null);
        Object term54347 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54347, term54347.getClass(), "wildcard", null);
        setField(term54347, term54347.getClass(), "generic", null);
        setField(term54347, term54347.getClass(), "qualified", null);
        setField(term54347, term54347.getClass(), "dimension", null);
        Object term54348 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54348, term54348.getClass(), "wildcard", null);
        setField(term54348, term54348.getClass(), "generic", null);
        setField(term54348, term54348.getClass(), "qualified", null);
        setField(term54348, term54348.getClass(), "dimension", null);
        Object term54349 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54349, term54349.getClass(), "wildcard", null);
        setField(term54349, term54349.getClass(), "generic", null);
        setField(term54349, term54349.getClass(), "qualified", null);
        setField(term54349, term54349.getClass(), "dimension", null);
        Object term54350 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54350, term54350.getClass(), "wildcard", null);
        setField(term54350, term54350.getClass(), "generic", null);
        setField(term54350, term54350.getClass(), "qualified", null);
        setField(term54350, term54350.getClass(), "dimension", null);
        Object term54351 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54351, term54351.getClass(), "wildcard", null);
        setField(term54351, term54351.getClass(), "generic", null);
        setField(term54351, term54351.getClass(), "qualified", null);
        setField(term54351, term54351.getClass(), "dimension", null);
        ArrayList term54344 = new ArrayList();
        ((ArrayList) term54344).add(term54346);
        ((ArrayList) term54344).add(term54347);
        ((ArrayList) term54344).add(term54348);
        ((ArrayList) term54344).add(term54349);
        ((ArrayList) term54344).add(term54350);
        ((ArrayList) term54344).add(term54347);
        ((ArrayList) term54344).add(term54349);
        ((ArrayList) term54344).add(term54351);
        ArrayList term54378 = new ArrayList();
        ((ArrayList) term54378).add("JjAzEOCzpy");
        ((ArrayList) term54378).add("sfnWXPvplq");
        ((ArrayList) term54378).add("XCjrExLFnS");
        ((ArrayList) term54378).add("uSsDtYSMyW");
        ((ArrayList) term54378).add("aUCvWznXaf");
        ((ArrayList) term54378).add("oVzNRoocVP");
        ((ArrayList) term54378).add("TpRpjeUdAl");
        ((ArrayList) term54378).add("WEliuTadEc");
        ArrayList term54478 = new ArrayList();
        Boolean term54494 = new Boolean(false);
        Boolean term54496 = new Boolean(true);
        term54333 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term54334 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term54335 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term54335, term54335.getClass(), "extendsBound", term54336);
        setField(term54335, term54335.getClass(), "superBound", term54340);
        setField(term54334, term54334.getClass(), "wildcard", term54335);
        setField(term54334, term54334.getClass(), "generic", term54344);
        setField(term54334, term54334.getClass(), "qualified", "PunATSMspd");
        setField(term54334, term54334.getClass(), "dimension", "PrYUAaSaAU");
        setField(term54333, term54333.getClass(), "type", term54334);
        setField(term54333, term54333.getClass(), "value", term54378);
        setField(term54333, term54333.getClass(), "annotation", term54478);
        setField(term54333, term54333.getClass(), "name", "bmPlACzvTW");
        setField(term54333, term54333.getClass(), "primitive", term54494);
        setField(term54333, term54333.getClass(), "array", term54496);
        term54498 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term54498;
        callMethod(klass, "setArray", argTypes, term54333, args);
    }

};


