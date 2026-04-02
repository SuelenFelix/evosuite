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

public class Field_getScope_126355541920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57406;

    public Field_getScope_126355541920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57409 = new ArrayList();
        ((ArrayList) term57409).add((Object)null);
        ((ArrayList) term57409).add((Object)null);
        ((ArrayList) term57409).add((Object)null);
        ((ArrayList) term57409).add((Object)null);
        ((ArrayList) term57409).add((Object)null);
        ((ArrayList) term57409).add((Object)null);
        ArrayList term57413 = new ArrayList();
        ((ArrayList) term57413).add((Object)null);
        ((ArrayList) term57413).add((Object)null);
        ((ArrayList) term57413).add((Object)null);
        ((ArrayList) term57413).add((Object)null);
        ((ArrayList) term57413).add((Object)null);
        ((ArrayList) term57413).add((Object)null);
        Object term57419 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term57419, term57419.getClass(), "wildcard", null);
        setField(term57419, term57419.getClass(), "generic", null);
        setField(term57419, term57419.getClass(), "qualified", null);
        setField(term57419, term57419.getClass(), "dimension", null);
        ArrayList term57417 = new ArrayList();
        ((ArrayList) term57417).add(term57419);
        Object term57460 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57460, term57460.getClass(), "name", "");
        setField(term57460, term57460.getClass(), "text", "");
        Object term57463 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57463, term57463.getClass(), "name", "");
        setField(term57463, term57463.getClass(), "text", "");
        Object term57466 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57466, term57466.getClass(), "name", "");
        setField(term57466, term57466.getClass(), "text", "");
        Object term57469 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57469, term57469.getClass(), "name", "");
        setField(term57469, term57469.getClass(), "text", "");
        Object term57472 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57472, term57472.getClass(), "name", "");
        setField(term57472, term57472.getClass(), "text", "");
        Object term57475 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57475, term57475.getClass(), "name", "");
        setField(term57475, term57475.getClass(), "text", "");
        Object term57478 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57478, term57478.getClass(), "name", "");
        setField(term57478, term57478.getClass(), "text", "");
        Object term57481 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57481, term57481.getClass(), "name", "");
        setField(term57481, term57481.getClass(), "text", "");
        Object term57484 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term57484, term57484.getClass(), "name", "");
        setField(term57484, term57484.getClass(), "text", "");
        ArrayList term57458 = new ArrayList();
        ((ArrayList) term57458).add(term57460);
        ((ArrayList) term57458).add(term57463);
        ((ArrayList) term57458).add(term57466);
        ((ArrayList) term57458).add(term57469);
        ((ArrayList) term57458).add(term57472);
        ((ArrayList) term57458).add(term57475);
        ((ArrayList) term57458).add(term57478);
        ((ArrayList) term57458).add(term57481);
        ((ArrayList) term57458).add(term57484);
        ArrayList term57504 = new ArrayList();
        ((ArrayList) term57504).add((Object)null);
        ((ArrayList) term57504).add((Object)null);
        ((ArrayList) term57504).add((Object)null);
        ((ArrayList) term57504).add((Object)null);
        ((ArrayList) term57504).add((Object)null);
        Object term57503 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term57503, term57503.getClass(), "argument", term57504);
        setField(term57503, term57503.getClass(), "name", "");
        setField(term57503, term57503.getClass(), "qualified", "");
        ArrayList term57510 = new ArrayList();
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        ((ArrayList) term57510).add((Object)null);
        Object term57509 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term57509, term57509.getClass(), "argument", term57510);
        setField(term57509, term57509.getClass(), "name", "");
        setField(term57509, term57509.getClass(), "qualified", "");
        ArrayList term57516 = new ArrayList();
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        ((ArrayList) term57516).add((Object)null);
        Object term57515 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term57515, term57515.getClass(), "argument", term57516);
        setField(term57515, term57515.getClass(), "name", "");
        setField(term57515, term57515.getClass(), "qualified", "");
        ArrayList term57522 = new ArrayList();
        ((ArrayList) term57522).add((Object)null);
        ((ArrayList) term57522).add((Object)null);
        Object term57521 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term57521, term57521.getClass(), "argument", term57522);
        setField(term57521, term57521.getClass(), "name", "");
        setField(term57521, term57521.getClass(), "qualified", "");
        ArrayList term57501 = new ArrayList();
        ((ArrayList) term57501).add(term57503);
        ((ArrayList) term57501).add(term57509);
        ((ArrayList) term57501).add(term57515);
        ((ArrayList) term57501).add(term57521);
        ((ArrayList) term57501).add(term57515);
        ((ArrayList) term57501).add(term57521);
        ((ArrayList) term57501).add(term57515);
        ((ArrayList) term57501).add(term57515);
        Boolean term57565 = new Boolean(false);
        Boolean term57567 = new Boolean(false);
        Boolean term57569 = new Boolean(true);
        Boolean term57571 = new Boolean(false);
        term57406 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term57407 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term57408 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term57408, term57408.getClass(), "extendsBound", term57409);
        setField(term57408, term57408.getClass(), "superBound", term57413);
        setField(term57407, term57407.getClass(), "wildcard", term57408);
        setField(term57407, term57407.getClass(), "generic", term57417);
        setField(term57407, term57407.getClass(), "qualified", "WwoFpFEsws");
        setField(term57407, term57407.getClass(), "dimension", "KvbXoiVLob");
        setField(term57406, term57406.getClass(), "type", term57407);
        setField(term57406, term57406.getClass(), "comment", "YahYuSubgM");
        setField(term57406, term57406.getClass(), "tag", term57458);
        setField(term57406, term57406.getClass(), "constant", "dBHGhVwPBI");
        setField(term57406, term57406.getClass(), "annotation", term57501);
        setField(term57406, term57406.getClass(), "name", "AsbQXTYgub");
        setField(term57406, term57406.getClass(), "qualified", "ytAywnKazX");
        setField(term57406, term57406.getClass(), "scope", "WDjDmEgBhg");
        setField(term57406, term57406.getClass(), "_volatile", term57565);
        setField(term57406, term57406.getClass(), "_transient", term57567);
        setField(term57406, term57406.getClass(), "_static", term57569);
        setField(term57406, term57406.getClass(), "_final", term57571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term57406, args);
    }

};


