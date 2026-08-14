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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Method_getName_157686716111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47424;

    public Method_getName_157686716111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47439 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47439, term47439.getClass(), "name", "");
        setField(term47439, term47439.getClass(), "text", "");
        Object term47442 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47442, term47442.getClass(), "name", "");
        setField(term47442, term47442.getClass(), "text", "");
        ArrayList term47437 = new ArrayList();
        ((ArrayList) term47437).add(term47439);
        ((ArrayList) term47437).add(term47442);
        ArrayList term47451 = new ArrayList();
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        ((ArrayList) term47451).add((Object)null);
        Object term47449 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47450 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47450, term47450.getClass(), "wildcard", null);
        setField(term47450, term47450.getClass(), "generic", null);
        setField(term47450, term47450.getClass(), "qualified", null);
        setField(term47450, term47450.getClass(), "dimension", null);
        setField(term47449, term47449.getClass(), "type", term47450);
        setField(term47449, term47449.getClass(), "annotation", term47451);
        setField(term47449, term47449.getClass(), "name", "");
        ArrayList term47456 = new ArrayList();
        ((ArrayList) term47456).add((Object)null);
        ((ArrayList) term47456).add((Object)null);
        ((ArrayList) term47456).add((Object)null);
        ((ArrayList) term47456).add((Object)null);
        Object term47455 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term47455, term47455.getClass(), "type", term47450);
        setField(term47455, term47455.getClass(), "annotation", term47456);
        setField(term47455, term47455.getClass(), "name", "");
        ArrayList term47447 = new ArrayList();
        ((ArrayList) term47447).add(term47449);
        ((ArrayList) term47447).add(term47455);
        ArrayList term47467 = new ArrayList();
        ((ArrayList) term47467).add((Object)null);
        ((ArrayList) term47467).add((Object)null);
        ((ArrayList) term47467).add((Object)null);
        Object term47465 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term47466 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term47466, term47466.getClass(), "extendsBound", null);
        setField(term47466, term47466.getClass(), "superBound", null);
        setField(term47465, term47465.getClass(), "wildcard", term47466);
        setField(term47465, term47465.getClass(), "generic", term47467);
        setField(term47465, term47465.getClass(), "qualified", "");
        setField(term47465, term47465.getClass(), "dimension", "");
        Object term47472 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47472, term47472.getClass(), "wildcard", null);
        setField(term47472, term47472.getClass(), "generic", null);
        setField(term47472, term47472.getClass(), "qualified", null);
        setField(term47472, term47472.getClass(), "dimension", null);
        Object term47473 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47473, term47473.getClass(), "wildcard", null);
        setField(term47473, term47473.getClass(), "generic", null);
        setField(term47473, term47473.getClass(), "qualified", null);
        setField(term47473, term47473.getClass(), "dimension", null);
        Object term47474 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47474, term47474.getClass(), "wildcard", null);
        setField(term47474, term47474.getClass(), "generic", null);
        setField(term47474, term47474.getClass(), "qualified", null);
        setField(term47474, term47474.getClass(), "dimension", null);
        ArrayList term47477 = new ArrayList();
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        ((ArrayList) term47477).add((Object)null);
        Object term47475 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term47476 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term47476, term47476.getClass(), "extendsBound", null);
        setField(term47476, term47476.getClass(), "superBound", null);
        setField(term47475, term47475.getClass(), "wildcard", term47476);
        setField(term47475, term47475.getClass(), "generic", term47477);
        setField(term47475, term47475.getClass(), "qualified", "");
        setField(term47475, term47475.getClass(), "dimension", "");
        ArrayList term47463 = new ArrayList();
        ((ArrayList) term47463).add(term47465);
        ((ArrayList) term47463).add(term47472);
        ((ArrayList) term47463).add(term47473);
        ((ArrayList) term47463).add(term47474);
        ((ArrayList) term47463).add(term47472);
        ((ArrayList) term47463).add(term47475);
        ((ArrayList) term47463).add(term47473);
        ((ArrayList) term47463).add(term47475);
        ((ArrayList) term47463).add(term47474);
        Object term47486 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47486, term47486.getClass(), "argument", null);
        setField(term47486, term47486.getClass(), "name", null);
        setField(term47486, term47486.getClass(), "qualified", null);
        Object term47487 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47487, term47487.getClass(), "argument", null);
        setField(term47487, term47487.getClass(), "name", null);
        setField(term47487, term47487.getClass(), "qualified", null);
        Object term47488 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47488, term47488.getClass(), "argument", null);
        setField(term47488, term47488.getClass(), "name", null);
        setField(term47488, term47488.getClass(), "qualified", null);
        Object term47489 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47489, term47489.getClass(), "argument", null);
        setField(term47489, term47489.getClass(), "name", null);
        setField(term47489, term47489.getClass(), "qualified", null);
        ArrayList term47484 = new ArrayList();
        ((ArrayList) term47484).add(term47486);
        ((ArrayList) term47484).add(term47487);
        ((ArrayList) term47484).add(term47486);
        ((ArrayList) term47484).add(term47487);
        ((ArrayList) term47484).add(term47487);
        ((ArrayList) term47484).add(term47488);
        ((ArrayList) term47484).add(term47489);
        Boolean term47540 = new Boolean(false);
        Boolean term47542 = new Boolean(true);
        Boolean term47544 = new Boolean(false);
        Boolean term47546 = new Boolean(false);
        Boolean term47548 = new Boolean(true);
        Boolean term47550 = new Boolean(false);
        Boolean term47552 = new Boolean(true);
        term47424 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term47462 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47424, term47424.getClass(), "comment", "RuVKbBXpPM");
        setField(term47424, term47424.getClass(), "tag", term47437);
        setField(term47424, term47424.getClass(), "parameter", term47447);
        setField(term47462, term47462.getClass(), "wildcard", null);
        setField(term47462, term47462.getClass(), "generic", null);
        setField(term47462, term47462.getClass(), "qualified", null);
        setField(term47462, term47462.getClass(), "dimension", null);
        setField(term47424, term47424.getClass(), "_return", term47462);
        setField(term47424, term47424.getClass(), "exception", term47463);
        setField(term47424, term47424.getClass(), "annotation", term47484);
        setField(term47424, term47424.getClass(), "name", "FDsDERydnn");
        setField(term47424, term47424.getClass(), "signature", "ZjduxHIcKO");
        setField(term47424, term47424.getClass(), "qualified", "DwCqcKOGtF");
        setField(term47424, term47424.getClass(), "scope", "bIcEXrRgBz");
        setField(term47424, term47424.getClass(), "_abstract", term47540);
        setField(term47424, term47424.getClass(), "_final", term47542);
        setField(term47424, term47424.getClass(), "included", term47544);
        setField(term47424, term47424.getClass(), "_native", term47546);
        setField(term47424, term47424.getClass(), "_synchronized", term47548);
        setField(term47424, term47424.getClass(), "_static", term47550);
        setField(term47424, term47424.getClass(), "varArgs", term47552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term47424, args);
    }

};


