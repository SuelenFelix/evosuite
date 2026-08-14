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

public class TypeInfo_getDimension_1477336476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45097;

    public TypeInfo_getDimension_1477336476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45099 = new ArrayList();
        Object term45105 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45105, term45105.getClass(), "wildcard", null);
        setField(term45105, term45105.getClass(), "generic", null);
        setField(term45105, term45105.getClass(), "qualified", null);
        setField(term45105, term45105.getClass(), "dimension", null);
        Object term45106 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45106, term45106.getClass(), "wildcard", null);
        setField(term45106, term45106.getClass(), "generic", null);
        setField(term45106, term45106.getClass(), "qualified", null);
        setField(term45106, term45106.getClass(), "dimension", null);
        ArrayList term45103 = new ArrayList();
        ((ArrayList) term45103).add(term45105);
        ((ArrayList) term45103).add(term45106);
        ((ArrayList) term45103).add(term45105);
        ArrayList term45109 = new ArrayList();
        term45097 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term45098 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term45098, term45098.getClass(), "extendsBound", term45099);
        setField(term45098, term45098.getClass(), "superBound", term45103);
        setField(term45097, term45097.getClass(), "wildcard", term45098);
        setField(term45097, term45097.getClass(), "generic", term45109);
        setField(term45097, term45097.getClass(), "qualified", "EEsNXTSeKi");
        setField(term45097, term45097.getClass(), "dimension", "QGrBfLUAvf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDimension", argTypes, term45097, args);
    }

};


