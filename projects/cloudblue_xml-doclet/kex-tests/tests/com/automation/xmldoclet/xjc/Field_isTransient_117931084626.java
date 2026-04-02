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

public class Field_isTransient_117931084626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58315;

    public Field_isTransient_117931084626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58318 = new ArrayList();
        ArrayList term58322 = new ArrayList();
        ((ArrayList) term58322).add((Object)null);
        ((ArrayList) term58322).add((Object)null);
        ((ArrayList) term58322).add((Object)null);
        Object term58328 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58328, term58328.getClass(), "wildcard", null);
        setField(term58328, term58328.getClass(), "generic", null);
        setField(term58328, term58328.getClass(), "qualified", null);
        setField(term58328, term58328.getClass(), "dimension", null);
        Object term58329 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58329, term58329.getClass(), "wildcard", null);
        setField(term58329, term58329.getClass(), "generic", null);
        setField(term58329, term58329.getClass(), "qualified", null);
        setField(term58329, term58329.getClass(), "dimension", null);
        ArrayList term58326 = new ArrayList();
        ((ArrayList) term58326).add(term58328);
        ((ArrayList) term58326).add(term58329);
        Object term58370 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58370, term58370.getClass(), "name", "");
        setField(term58370, term58370.getClass(), "text", "");
        Object term58373 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58373, term58373.getClass(), "name", "");
        setField(term58373, term58373.getClass(), "text", "");
        Object term58376 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58376, term58376.getClass(), "name", "");
        setField(term58376, term58376.getClass(), "text", "");
        Object term58379 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58379, term58379.getClass(), "name", "");
        setField(term58379, term58379.getClass(), "text", "");
        Object term58382 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58382, term58382.getClass(), "name", "");
        setField(term58382, term58382.getClass(), "text", "");
        Object term58385 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58385, term58385.getClass(), "name", "");
        setField(term58385, term58385.getClass(), "text", "");
        Object term58388 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58388, term58388.getClass(), "name", "");
        setField(term58388, term58388.getClass(), "text", "");
        ArrayList term58368 = new ArrayList();
        ((ArrayList) term58368).add(term58370);
        ((ArrayList) term58368).add(term58373);
        ((ArrayList) term58368).add(term58376);
        ((ArrayList) term58368).add(term58379);
        ((ArrayList) term58368).add(term58382);
        ((ArrayList) term58368).add(term58385);
        ((ArrayList) term58368).add(term58388);
        ArrayList term58408 = new ArrayList();
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        ((ArrayList) term58408).add((Object)null);
        Object term58407 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58407, term58407.getClass(), "argument", term58408);
        setField(term58407, term58407.getClass(), "name", "");
        setField(term58407, term58407.getClass(), "qualified", "");
        ArrayList term58414 = new ArrayList();
        ((ArrayList) term58414).add((Object)null);
        ((ArrayList) term58414).add((Object)null);
        ((ArrayList) term58414).add((Object)null);
        ((ArrayList) term58414).add((Object)null);
        ((ArrayList) term58414).add((Object)null);
        ((ArrayList) term58414).add((Object)null);
        Object term58413 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58413, term58413.getClass(), "argument", term58414);
        setField(term58413, term58413.getClass(), "name", "");
        setField(term58413, term58413.getClass(), "qualified", "");
        ArrayList term58420 = new ArrayList();
        ((ArrayList) term58420).add((Object)null);
        ((ArrayList) term58420).add((Object)null);
        ((ArrayList) term58420).add((Object)null);
        Object term58419 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58419, term58419.getClass(), "argument", term58420);
        setField(term58419, term58419.getClass(), "name", "");
        setField(term58419, term58419.getClass(), "qualified", "");
        ArrayList term58426 = new ArrayList();
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        ((ArrayList) term58426).add((Object)null);
        Object term58425 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58425, term58425.getClass(), "argument", term58426);
        setField(term58425, term58425.getClass(), "name", "");
        setField(term58425, term58425.getClass(), "qualified", "");
        ArrayList term58432 = new ArrayList();
        ((ArrayList) term58432).add((Object)null);
        ((ArrayList) term58432).add((Object)null);
        ((ArrayList) term58432).add((Object)null);
        Object term58431 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58431, term58431.getClass(), "argument", term58432);
        setField(term58431, term58431.getClass(), "name", "");
        setField(term58431, term58431.getClass(), "qualified", "");
        ArrayList term58438 = new ArrayList();
        ((ArrayList) term58438).add((Object)null);
        Object term58437 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58437, term58437.getClass(), "argument", term58438);
        setField(term58437, term58437.getClass(), "name", "");
        setField(term58437, term58437.getClass(), "qualified", "");
        ArrayList term58444 = new ArrayList();
        ((ArrayList) term58444).add((Object)null);
        ((ArrayList) term58444).add((Object)null);
        ((ArrayList) term58444).add((Object)null);
        ((ArrayList) term58444).add((Object)null);
        ((ArrayList) term58444).add((Object)null);
        ((ArrayList) term58444).add((Object)null);
        Object term58443 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58443, term58443.getClass(), "argument", term58444);
        setField(term58443, term58443.getClass(), "name", "");
        setField(term58443, term58443.getClass(), "qualified", "");
        ArrayList term58405 = new ArrayList();
        ((ArrayList) term58405).add(term58407);
        ((ArrayList) term58405).add(term58413);
        ((ArrayList) term58405).add(term58419);
        ((ArrayList) term58405).add(term58419);
        ((ArrayList) term58405).add(term58407);
        ((ArrayList) term58405).add(term58425);
        ((ArrayList) term58405).add(term58431);
        ((ArrayList) term58405).add(term58437);
        ((ArrayList) term58405).add(term58443);
        Boolean term58487 = new Boolean(true);
        Boolean term58489 = new Boolean(false);
        Boolean term58491 = new Boolean(false);
        Boolean term58493 = new Boolean(false);
        term58315 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term58316 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term58317 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term58317, term58317.getClass(), "extendsBound", term58318);
        setField(term58317, term58317.getClass(), "superBound", term58322);
        setField(term58316, term58316.getClass(), "wildcard", term58317);
        setField(term58316, term58316.getClass(), "generic", term58326);
        setField(term58316, term58316.getClass(), "qualified", "yfmhPDewri");
        setField(term58316, term58316.getClass(), "dimension", "WGGRazxPYc");
        setField(term58315, term58315.getClass(), "type", term58316);
        setField(term58315, term58315.getClass(), "comment", "VWJrTQeHVe");
        setField(term58315, term58315.getClass(), "tag", term58368);
        setField(term58315, term58315.getClass(), "constant", "uxKWGNdGhS");
        setField(term58315, term58315.getClass(), "annotation", term58405);
        setField(term58315, term58315.getClass(), "name", "apfEwHrqQO");
        setField(term58315, term58315.getClass(), "qualified", "yrBkDlvxSz");
        setField(term58315, term58315.getClass(), "scope", "FIpshJXErv");
        setField(term58315, term58315.getClass(), "_volatile", term58487);
        setField(term58315, term58315.getClass(), "_transient", term58489);
        setField(term58315, term58315.getClass(), "_static", term58491);
        setField(term58315, term58315.getClass(), "_final", term58493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTransient", argTypes, term58315, args);
    }

};


