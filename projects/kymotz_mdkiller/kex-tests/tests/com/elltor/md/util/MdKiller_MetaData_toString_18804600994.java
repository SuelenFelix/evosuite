package com.elltor.md.util;

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
import static com.elltor.md.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class MdKiller_MetaData_toString_18804600994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6339;

    public MdKiller_MetaData_toString_18804600994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6421 = Class.forName((String) "com.elltor.md.util.MdKiller$MetaData$Type");
        Field term6420 = ((Class) term6421).getDeclaredField((String) "LINK");
        ((Field) term6420).setAccessible(true);
        Object enum25 = ((Field) term6420).get((Object) null);
        HashMap term6362 = new HashMap();
        Set<Object> term6654 =  ((Map) term6362).keySet();
        HashSet term6361 = new HashSet((Collection<? extends Object>) term6654);
        HashSet term6372 = new HashSet();
        Object term6370 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6370, term6370.getClass(), "text", "");
        setField(term6370, term6370.getClass(), "styles", term6372);
        HashSet term6375 = new HashSet();
        Object term6373 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6373, term6373.getClass(), "text", "");
        setField(term6373, term6373.getClass(), "styles", term6375);
        HashSet term6378 = new HashSet();
        Object term6376 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6376, term6376.getClass(), "text", "");
        setField(term6376, term6376.getClass(), "styles", term6378);
        HashSet term6381 = new HashSet();
        Object term6379 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6379, term6379.getClass(), "text", "");
        setField(term6379, term6379.getClass(), "styles", term6381);
        HashSet term6384 = new HashSet();
        Object term6382 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6382, term6382.getClass(), "text", "");
        setField(term6382, term6382.getClass(), "styles", term6384);
        HashSet term6387 = new HashSet();
        Object term6385 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6385, term6385.getClass(), "text", "");
        setField(term6385, term6385.getClass(), "styles", term6387);
        HashSet term6390 = new HashSet();
        Object term6388 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6388, term6388.getClass(), "text", "");
        setField(term6388, term6388.getClass(), "styles", term6390);
        HashSet term6393 = new HashSet();
        Object term6391 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6391, term6391.getClass(), "text", "");
        setField(term6391, term6391.getClass(), "styles", term6393);
        ArrayList term6368 = new ArrayList();
        ((ArrayList) term6368).add(term6370);
        ((ArrayList) term6368).add(term6373);
        ((ArrayList) term6368).add(term6376);
        ((ArrayList) term6368).add(term6379);
        ((ArrayList) term6368).add(term6382);
        ((ArrayList) term6368).add(term6385);
        ((ArrayList) term6368).add(term6388);
        ((ArrayList) term6368).add(term6391);
        term6339 = newInstance(Class.forName("com.elltor.md.util.MdKiller$MetaData"));
        Object term6348 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6339, term6339.getClass(), "type", enum25);
        setField(term6348, term6348.getClass(), "text", "EGtDIRbSSb");
        setField(term6348, term6348.getClass(), "styles", term6361);
        setField(term6339, term6339.getClass(), "text", term6348);
        setField(term6339, term6339.getClass(), "values", term6368);
        setField(term6339, term6339.getClass(), "separator", "oVcInYnLWB");
        setField(term6339, term6339.getClass(), "valueSeparator", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$MetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6339, args);
    }

};


