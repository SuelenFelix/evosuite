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

public class AnnotationElement_setName_10360890436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6494;

    public AnnotationElement_setName_10360890436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6497 = new ArrayList();
        ((ArrayList) term6497).add((Object)null);
        ((ArrayList) term6497).add((Object)null);
        ((ArrayList) term6497).add((Object)null);
        ((ArrayList) term6497).add((Object)null);
        ArrayList term6501 = new ArrayList();
        ((ArrayList) term6501).add((Object)null);
        ((ArrayList) term6501).add((Object)null);
        Object term6507 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6507, term6507.getClass(), "wildcard", null);
        setField(term6507, term6507.getClass(), "generic", null);
        setField(term6507, term6507.getClass(), "qualified", null);
        setField(term6507, term6507.getClass(), "dimension", null);
        Object term6508 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6508, term6508.getClass(), "wildcard", null);
        setField(term6508, term6508.getClass(), "generic", null);
        setField(term6508, term6508.getClass(), "qualified", null);
        setField(term6508, term6508.getClass(), "dimension", null);
        Object term6509 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6509, term6509.getClass(), "wildcard", null);
        setField(term6509, term6509.getClass(), "generic", null);
        setField(term6509, term6509.getClass(), "qualified", null);
        setField(term6509, term6509.getClass(), "dimension", null);
        Object term6510 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6510, term6510.getClass(), "wildcard", null);
        setField(term6510, term6510.getClass(), "generic", null);
        setField(term6510, term6510.getClass(), "qualified", null);
        setField(term6510, term6510.getClass(), "dimension", null);
        Object term6511 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term6511, term6511.getClass(), "wildcard", null);
        setField(term6511, term6511.getClass(), "generic", null);
        setField(term6511, term6511.getClass(), "qualified", null);
        setField(term6511, term6511.getClass(), "dimension", null);
        ArrayList term6505 = new ArrayList();
        ((ArrayList) term6505).add(term6507);
        ((ArrayList) term6505).add(term6508);
        ((ArrayList) term6505).add(term6509);
        ((ArrayList) term6505).add(term6507);
        ((ArrayList) term6505).add(term6510);
        ((ArrayList) term6505).add(term6511);
        term6494 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term6495 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term6496 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term6496, term6496.getClass(), "extendsBound", term6497);
        setField(term6496, term6496.getClass(), "superBound", term6501);
        setField(term6495, term6495.getClass(), "wildcard", term6496);
        setField(term6495, term6495.getClass(), "generic", term6505);
        setField(term6495, term6495.getClass(), "qualified", "XLjtkfroHJ");
        setField(term6495, term6495.getClass(), "dimension", "hdqypaATat");
        setField(term6494, term6494.getClass(), "type", term6495);
        setField(term6494, term6494.getClass(), "name", "yXrHDHEipD");
        setField(term6494, term6494.getClass(), "qualified", "pbqIeikQzp");
        setField(term6494, term6494.getClass(), "_default", "baLJgqNNUx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GlPSGqVaBj";
        callMethod(klass, "setName", argTypes, term6494, args);
    }

};


