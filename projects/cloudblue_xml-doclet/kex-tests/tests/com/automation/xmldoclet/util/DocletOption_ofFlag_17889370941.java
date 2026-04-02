package com.automation.xmldoclet.util;

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
import static com.automation.xmldoclet.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class DocletOption_ofFlag_17889370941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110;

    public DocletOption_ofFlag_17889370941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110 = new LinkedList();
        ((LinkedList) term110).add("MjGYSRKTNF");
        ((LinkedList) term110).add("hRNSzYYIrc");
        ((LinkedList) term110).add("");
        ((LinkedList) term110).add((Object)null);
        ((LinkedList) term110).add((Object)null);
        ((LinkedList) term110).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[3];
        args[0] = term110;
        args[1] = "LQFpaHEwXR";
        args[2] = null;
        callMethod(klass, "ofFlag", argTypes, null, args);
    }

};


