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

public class Constructor_setSignature_88294104710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2414;

    public Constructor_setSignature_88294104710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2429 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2429, term2429.getClass(), "name", "");
        setField(term2429, term2429.getClass(), "text", "");
        Object term2432 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2432, term2432.getClass(), "name", "");
        setField(term2432, term2432.getClass(), "text", "");
        Object term2435 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2435, term2435.getClass(), "name", "");
        setField(term2435, term2435.getClass(), "text", "");
        Object term2438 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2438, term2438.getClass(), "name", "");
        setField(term2438, term2438.getClass(), "text", "");
        Object term2441 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2441, term2441.getClass(), "name", "");
        setField(term2441, term2441.getClass(), "text", "");
        Object term2444 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2444, term2444.getClass(), "name", "");
        setField(term2444, term2444.getClass(), "text", "");
        Object term2447 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2447, term2447.getClass(), "name", "");
        setField(term2447, term2447.getClass(), "text", "");
        Object term2450 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2450, term2450.getClass(), "name", "");
        setField(term2450, term2450.getClass(), "text", "");
        Object term2453 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term2453, term2453.getClass(), "name", "");
        setField(term2453, term2453.getClass(), "text", "");
        ArrayList term2427 = new ArrayList();
        ((ArrayList) term2427).add(term2429);
        ((ArrayList) term2427).add(term2432);
        ((ArrayList) term2427).add(term2435);
        ((ArrayList) term2427).add(term2438);
        ((ArrayList) term2427).add(term2441);
        ((ArrayList) term2427).add(term2444);
        ((ArrayList) term2427).add(term2447);
        ((ArrayList) term2427).add(term2450);
        ((ArrayList) term2427).add(term2453);
        ArrayList term2458 = new ArrayList();
        ArrayList term2466 = new ArrayList();
        ((ArrayList) term2466).add((Object)null);
        ((ArrayList) term2466).add((Object)null);
        Object term2464 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term2465 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term2465, term2465.getClass(), "extendsBound", null);
        setField(term2465, term2465.getClass(), "superBound", null);
        setField(term2464, term2464.getClass(), "wildcard", term2465);
        setField(term2464, term2464.getClass(), "generic", term2466);
        setField(term2464, term2464.getClass(), "qualified", "");
        setField(term2464, term2464.getClass(), "dimension", "");
        Object term2471 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term2471, term2471.getClass(), "wildcard", null);
        setField(term2471, term2471.getClass(), "generic", null);
        setField(term2471, term2471.getClass(), "qualified", null);
        setField(term2471, term2471.getClass(), "dimension", null);
        Object term2472 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term2472, term2472.getClass(), "wildcard", null);
        setField(term2472, term2472.getClass(), "generic", null);
        setField(term2472, term2472.getClass(), "qualified", null);
        setField(term2472, term2472.getClass(), "dimension", null);
        Object term2473 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term2473, term2473.getClass(), "wildcard", null);
        setField(term2473, term2473.getClass(), "generic", null);
        setField(term2473, term2473.getClass(), "qualified", null);
        setField(term2473, term2473.getClass(), "dimension", null);
        Object term2474 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term2474, term2474.getClass(), "wildcard", null);
        setField(term2474, term2474.getClass(), "generic", null);
        setField(term2474, term2474.getClass(), "qualified", null);
        setField(term2474, term2474.getClass(), "dimension", null);
        ArrayList term2477 = new ArrayList();
        ((ArrayList) term2477).add((Object)null);
        ((ArrayList) term2477).add((Object)null);
        Object term2475 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term2476 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term2476, term2476.getClass(), "extendsBound", null);
        setField(term2476, term2476.getClass(), "superBound", null);
        setField(term2475, term2475.getClass(), "wildcard", term2476);
        setField(term2475, term2475.getClass(), "generic", term2477);
        setField(term2475, term2475.getClass(), "qualified", "");
        setField(term2475, term2475.getClass(), "dimension", "");
        ArrayList term2484 = new ArrayList();
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        ((ArrayList) term2484).add((Object)null);
        Object term2482 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term2483 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term2483, term2483.getClass(), "extendsBound", null);
        setField(term2483, term2483.getClass(), "superBound", null);
        setField(term2482, term2482.getClass(), "wildcard", term2483);
        setField(term2482, term2482.getClass(), "generic", term2484);
        setField(term2482, term2482.getClass(), "qualified", "");
        setField(term2482, term2482.getClass(), "dimension", "");
        ArrayList term2462 = new ArrayList();
        ((ArrayList) term2462).add(term2464);
        ((ArrayList) term2462).add(term2471);
        ((ArrayList) term2462).add(term2472);
        ((ArrayList) term2462).add(term2473);
        ((ArrayList) term2462).add(term2474);
        ((ArrayList) term2462).add(term2475);
        ((ArrayList) term2462).add(term2482);
        ((ArrayList) term2462).add(term2472);
        ArrayList term2494 = new ArrayList();
        ((ArrayList) term2494).add((Object)null);
        ((ArrayList) term2494).add((Object)null);
        ((ArrayList) term2494).add((Object)null);
        ((ArrayList) term2494).add((Object)null);
        Object term2493 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term2493, term2493.getClass(), "argument", term2494);
        setField(term2493, term2493.getClass(), "name", "");
        setField(term2493, term2493.getClass(), "qualified", "");
        ArrayList term2491 = new ArrayList();
        ((ArrayList) term2491).add(term2493);
        Boolean term2549 = new Boolean(false);
        Boolean term2551 = new Boolean(true);
        Boolean term2553 = new Boolean(true);
        Boolean term2555 = new Boolean(false);
        Boolean term2557 = new Boolean(true);
        Boolean term2559 = new Boolean(false);
        term2414 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term2414, term2414.getClass(), "comment", "gUQhOyGfzF");
        setField(term2414, term2414.getClass(), "tag", term2427);
        setField(term2414, term2414.getClass(), "parameter", term2458);
        setField(term2414, term2414.getClass(), "exception", term2462);
        setField(term2414, term2414.getClass(), "annotation", term2491);
        setField(term2414, term2414.getClass(), "name", "GLxLHUsuLw");
        setField(term2414, term2414.getClass(), "signature", "HuKdqrrxIm");
        setField(term2414, term2414.getClass(), "qualified", "yJKKddLqMb");
        setField(term2414, term2414.getClass(), "scope", "LWEYaXeKBe");
        setField(term2414, term2414.getClass(), "_final", term2549);
        setField(term2414, term2414.getClass(), "included", term2551);
        setField(term2414, term2414.getClass(), "_native", term2553);
        setField(term2414, term2414.getClass(), "_synchronized", term2555);
        setField(term2414, term2414.getClass(), "_static", term2557);
        setField(term2414, term2414.getClass(), "varArgs", term2559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cNoFvpHBHw";
        callMethod(klass, "setSignature", argTypes, term2414, args);
    }

};


