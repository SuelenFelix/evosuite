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

public class AnnotationElement_getName_15390016855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6367;

    public AnnotationElement_getName_15390016855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6370 = new ArrayList();
        ((ArrayList) term6370).add((Object)null);
        ((ArrayList) term6370).add((Object)null);
        ((ArrayList) term6370).add((Object)null);
        ((ArrayList) term6370).add((Object)null);
        ((ArrayList) term6370).add((Object)null);
        ArrayList term6374 = new ArrayList();
        ((ArrayList) term6374).add((Object)null);
        Object term6380 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6380, term6380.getClass(), "wildcard", null);
        setField(term6380, term6380.getClass(), "generic", null);
        setField(term6380, term6380.getClass(), "qualified", null);
        setField(term6380, term6380.getClass(), "dimension", null);
        Object term6381 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6381, term6381.getClass(), "wildcard", null);
        setField(term6381, term6381.getClass(), "generic", null);
        setField(term6381, term6381.getClass(), "qualified", null);
        setField(term6381, term6381.getClass(), "dimension", null);
        ArrayList term6378 = new ArrayList();
        ((ArrayList) term6378).add(term6380);
        ((ArrayList) term6378).add(term6381);
        term6367 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term6368 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term6369 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term6369, term6369.getClass(), "extendsBound", term6370);
        setField(term6369, term6369.getClass(), "superBound", term6374);
        setField(term6368, term6368.getClass(), "wildcard", term6369);
        setField(term6368, term6368.getClass(), "generic", term6378);
        setField(term6368, term6368.getClass(), "qualified", "jjwHVTqCkP");
        setField(term6368, term6368.getClass(), "dimension", "uUAkxSFPyL");
        setField(term6367, term6367.getClass(), "type", term6368);
        setField(term6367, term6367.getClass(), "name", "XfzbAdTaCO");
        setField(term6367, term6367.getClass(), "qualified", "rDcGfVDmsE");
        setField(term6367, term6367.getClass(), "_default", "agspBqCjgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6367, args);
    }

};


