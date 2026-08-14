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

public class Method_setStatic_133448132539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51554;
     Object term51699;

    public Method_setStatic_133448132539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51569 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51569, term51569.getClass(), "name", "");
        setField(term51569, term51569.getClass(), "text", "");
        Object term51572 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51572, term51572.getClass(), "name", "");
        setField(term51572, term51572.getClass(), "text", "");
        Object term51575 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51575, term51575.getClass(), "name", "");
        setField(term51575, term51575.getClass(), "text", "");
        Object term51578 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51578, term51578.getClass(), "name", "");
        setField(term51578, term51578.getClass(), "text", "");
        Object term51581 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51581, term51581.getClass(), "name", "");
        setField(term51581, term51581.getClass(), "text", "");
        Object term51584 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51584, term51584.getClass(), "name", "");
        setField(term51584, term51584.getClass(), "text", "");
        Object term51587 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51587, term51587.getClass(), "name", "");
        setField(term51587, term51587.getClass(), "text", "");
        Object term51590 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term51590, term51590.getClass(), "name", "");
        setField(term51590, term51590.getClass(), "text", "");
        ArrayList term51567 = new ArrayList();
        ((ArrayList) term51567).add(term51569);
        ((ArrayList) term51567).add(term51572);
        ((ArrayList) term51567).add(term51575);
        ((ArrayList) term51567).add(term51578);
        ((ArrayList) term51567).add(term51581);
        ((ArrayList) term51567).add(term51584);
        ((ArrayList) term51567).add(term51587);
        ((ArrayList) term51567).add(term51590);
        ArrayList term51599 = new ArrayList();
        ((ArrayList) term51599).add((Object)null);
        Object term51597 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term51598 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51598, term51598.getClass(), "wildcard", null);
        setField(term51598, term51598.getClass(), "generic", null);
        setField(term51598, term51598.getClass(), "qualified", null);
        setField(term51598, term51598.getClass(), "dimension", null);
        setField(term51597, term51597.getClass(), "type", term51598);
        setField(term51597, term51597.getClass(), "annotation", term51599);
        setField(term51597, term51597.getClass(), "name", "");
        ArrayList term51605 = new ArrayList();
        ((ArrayList) term51605).add((Object)null);
        ((ArrayList) term51605).add((Object)null);
        ((ArrayList) term51605).add((Object)null);
        ((ArrayList) term51605).add((Object)null);
        ((ArrayList) term51605).add((Object)null);
        ((ArrayList) term51605).add((Object)null);
        Object term51603 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term51604 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51604, term51604.getClass(), "wildcard", null);
        setField(term51604, term51604.getClass(), "generic", null);
        setField(term51604, term51604.getClass(), "qualified", null);
        setField(term51604, term51604.getClass(), "dimension", null);
        setField(term51603, term51603.getClass(), "type", term51604);
        setField(term51603, term51603.getClass(), "annotation", term51605);
        setField(term51603, term51603.getClass(), "name", "");
        ArrayList term51595 = new ArrayList();
        ((ArrayList) term51595).add(term51597);
        ((ArrayList) term51595).add(term51603);
        ArrayList term51615 = new ArrayList();
        ((ArrayList) term51615).add((Object)null);
        ((ArrayList) term51615).add((Object)null);
        ((ArrayList) term51615).add((Object)null);
        ((ArrayList) term51615).add((Object)null);
        ((ArrayList) term51615).add((Object)null);
        ((ArrayList) term51615).add((Object)null);
        Object term51613 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term51614 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term51614, term51614.getClass(), "extendsBound", null);
        setField(term51614, term51614.getClass(), "superBound", null);
        setField(term51613, term51613.getClass(), "wildcard", term51614);
        setField(term51613, term51613.getClass(), "generic", term51615);
        setField(term51613, term51613.getClass(), "qualified", "");
        setField(term51613, term51613.getClass(), "dimension", "");
        Object term51620 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51620, term51620.getClass(), "wildcard", null);
        setField(term51620, term51620.getClass(), "generic", null);
        setField(term51620, term51620.getClass(), "qualified", null);
        setField(term51620, term51620.getClass(), "dimension", null);
        Object term51621 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term51621, term51621.getClass(), "wildcard", null);
        setField(term51621, term51621.getClass(), "generic", null);
        setField(term51621, term51621.getClass(), "qualified", null);
        setField(term51621, term51621.getClass(), "dimension", null);
        ArrayList term51611 = new ArrayList();
        ((ArrayList) term51611).add(term51613);
        ((ArrayList) term51611).add(term51620);
        ((ArrayList) term51611).add(term51620);
        ((ArrayList) term51611).add(term51598);
        ((ArrayList) term51611).add(term51621);
        ((ArrayList) term51611).add(term51604);
        Object term51626 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51626, term51626.getClass(), "argument", null);
        setField(term51626, term51626.getClass(), "name", null);
        setField(term51626, term51626.getClass(), "qualified", null);
        Object term51627 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51627, term51627.getClass(), "argument", null);
        setField(term51627, term51627.getClass(), "name", null);
        setField(term51627, term51627.getClass(), "qualified", null);
        Object term51628 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51628, term51628.getClass(), "argument", null);
        setField(term51628, term51628.getClass(), "name", null);
        setField(term51628, term51628.getClass(), "qualified", null);
        ArrayList term51630 = new ArrayList();
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        ((ArrayList) term51630).add((Object)null);
        Object term51629 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term51629, term51629.getClass(), "argument", term51630);
        setField(term51629, term51629.getClass(), "name", "");
        setField(term51629, term51629.getClass(), "qualified", "");
        ArrayList term51624 = new ArrayList();
        ((ArrayList) term51624).add(term51626);
        ((ArrayList) term51624).add(term51627);
        ((ArrayList) term51624).add(term51628);
        ((ArrayList) term51624).add(term51629);
        Boolean term51685 = new Boolean(true);
        Boolean term51687 = new Boolean(false);
        Boolean term51689 = new Boolean(true);
        Boolean term51691 = new Boolean(true);
        Boolean term51693 = new Boolean(true);
        Boolean term51695 = new Boolean(false);
        Boolean term51697 = new Boolean(true);
        term51554 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term51554, term51554.getClass(), "comment", "kStgIiOhIN");
        setField(term51554, term51554.getClass(), "tag", term51567);
        setField(term51554, term51554.getClass(), "parameter", term51595);
        setField(term51554, term51554.getClass(), "_return", term51598);
        setField(term51554, term51554.getClass(), "exception", term51611);
        setField(term51554, term51554.getClass(), "annotation", term51624);
        setField(term51554, term51554.getClass(), "name", "HIcHkKIOQU");
        setField(term51554, term51554.getClass(), "signature", "luyFcSEFSG");
        setField(term51554, term51554.getClass(), "qualified", "dYLwyvAzhx");
        setField(term51554, term51554.getClass(), "scope", "YVlUwcmySO");
        setField(term51554, term51554.getClass(), "_abstract", term51685);
        setField(term51554, term51554.getClass(), "_final", term51687);
        setField(term51554, term51554.getClass(), "included", term51689);
        setField(term51554, term51554.getClass(), "_native", term51691);
        setField(term51554, term51554.getClass(), "_synchronized", term51693);
        setField(term51554, term51554.getClass(), "_static", term51695);
        setField(term51554, term51554.getClass(), "varArgs", term51697);
        term51699 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term51699;
        callMethod(klass, "setStatic", argTypes, term51554, args);
    }

};


