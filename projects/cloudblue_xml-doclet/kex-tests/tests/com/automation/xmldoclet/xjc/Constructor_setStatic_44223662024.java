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

public class Constructor_setStatic_44223662024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5408;
     Object term5541;

    public Constructor_setStatic_44223662024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5423 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term5423, term5423.getClass(), "name", "");
        setField(term5423, term5423.getClass(), "text", "");
        ArrayList term5421 = new ArrayList();
        ((ArrayList) term5421).add(term5423);
        ArrayList term5432 = new ArrayList();
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        ((ArrayList) term5432).add((Object)null);
        Object term5430 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term5431 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5431, term5431.getClass(), "wildcard", null);
        setField(term5431, term5431.getClass(), "generic", null);
        setField(term5431, term5431.getClass(), "qualified", null);
        setField(term5431, term5431.getClass(), "dimension", null);
        setField(term5430, term5430.getClass(), "type", term5431);
        setField(term5430, term5430.getClass(), "annotation", term5432);
        setField(term5430, term5430.getClass(), "name", "");
        ArrayList term5428 = new ArrayList();
        ((ArrayList) term5428).add(term5430);
        Object term5440 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5440, term5440.getClass(), "wildcard", null);
        setField(term5440, term5440.getClass(), "generic", null);
        setField(term5440, term5440.getClass(), "qualified", null);
        setField(term5440, term5440.getClass(), "dimension", null);
        Object term5441 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5441, term5441.getClass(), "wildcard", null);
        setField(term5441, term5441.getClass(), "generic", null);
        setField(term5441, term5441.getClass(), "qualified", null);
        setField(term5441, term5441.getClass(), "dimension", null);
        Object term5442 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5442, term5442.getClass(), "wildcard", null);
        setField(term5442, term5442.getClass(), "generic", null);
        setField(term5442, term5442.getClass(), "qualified", null);
        setField(term5442, term5442.getClass(), "dimension", null);
        ArrayList term5445 = new ArrayList();
        ((ArrayList) term5445).add((Object)null);
        ((ArrayList) term5445).add((Object)null);
        ((ArrayList) term5445).add((Object)null);
        ((ArrayList) term5445).add((Object)null);
        ((ArrayList) term5445).add((Object)null);
        ((ArrayList) term5445).add((Object)null);
        Object term5443 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term5444 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term5444, term5444.getClass(), "extendsBound", null);
        setField(term5444, term5444.getClass(), "superBound", null);
        setField(term5443, term5443.getClass(), "wildcard", term5444);
        setField(term5443, term5443.getClass(), "generic", term5445);
        setField(term5443, term5443.getClass(), "qualified", "");
        setField(term5443, term5443.getClass(), "dimension", "");
        ArrayList term5452 = new ArrayList();
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        Object term5450 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term5451 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term5451, term5451.getClass(), "extendsBound", null);
        setField(term5451, term5451.getClass(), "superBound", null);
        setField(term5450, term5450.getClass(), "wildcard", term5451);
        setField(term5450, term5450.getClass(), "generic", term5452);
        setField(term5450, term5450.getClass(), "qualified", "");
        setField(term5450, term5450.getClass(), "dimension", "");
        Object term5457 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term5457, term5457.getClass(), "wildcard", null);
        setField(term5457, term5457.getClass(), "generic", null);
        setField(term5457, term5457.getClass(), "qualified", null);
        setField(term5457, term5457.getClass(), "dimension", null);
        ArrayList term5460 = new ArrayList();
        ((ArrayList) term5460).add((Object)null);
        Object term5458 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term5459 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term5459, term5459.getClass(), "extendsBound", null);
        setField(term5459, term5459.getClass(), "superBound", null);
        setField(term5458, term5458.getClass(), "wildcard", term5459);
        setField(term5458, term5458.getClass(), "generic", term5460);
        setField(term5458, term5458.getClass(), "qualified", "");
        setField(term5458, term5458.getClass(), "dimension", "");
        ArrayList term5438 = new ArrayList();
        ((ArrayList) term5438).add(term5440);
        ((ArrayList) term5438).add(term5441);
        ((ArrayList) term5438).add(term5442);
        ((ArrayList) term5438).add(term5443);
        ((ArrayList) term5438).add(term5450);
        ((ArrayList) term5438).add(term5457);
        ((ArrayList) term5438).add(term5458);
        Object term5469 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term5469, term5469.getClass(), "argument", null);
        setField(term5469, term5469.getClass(), "name", null);
        setField(term5469, term5469.getClass(), "qualified", null);
        Object term5470 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term5470, term5470.getClass(), "argument", null);
        setField(term5470, term5470.getClass(), "name", null);
        setField(term5470, term5470.getClass(), "qualified", null);
        ArrayList term5472 = new ArrayList();
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        Object term5471 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term5471, term5471.getClass(), "argument", term5472);
        setField(term5471, term5471.getClass(), "name", "");
        setField(term5471, term5471.getClass(), "qualified", "");
        Object term5477 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term5477, term5477.getClass(), "argument", null);
        setField(term5477, term5477.getClass(), "name", null);
        setField(term5477, term5477.getClass(), "qualified", null);
        Object term5478 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term5478, term5478.getClass(), "argument", null);
        setField(term5478, term5478.getClass(), "name", null);
        setField(term5478, term5478.getClass(), "qualified", null);
        ArrayList term5467 = new ArrayList();
        ((ArrayList) term5467).add(term5469);
        ((ArrayList) term5467).add(term5470);
        ((ArrayList) term5467).add(term5471);
        ((ArrayList) term5467).add(term5469);
        ((ArrayList) term5467).add(term5477);
        ((ArrayList) term5467).add(term5478);
        Boolean term5529 = new Boolean(false);
        Boolean term5531 = new Boolean(false);
        Boolean term5533 = new Boolean(false);
        Boolean term5535 = new Boolean(true);
        Boolean term5537 = new Boolean(false);
        Boolean term5539 = new Boolean(true);
        term5408 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term5408, term5408.getClass(), "comment", "ADhJCRgHaS");
        setField(term5408, term5408.getClass(), "tag", term5421);
        setField(term5408, term5408.getClass(), "parameter", term5428);
        setField(term5408, term5408.getClass(), "exception", term5438);
        setField(term5408, term5408.getClass(), "annotation", term5467);
        setField(term5408, term5408.getClass(), "name", "qqUAzxxpNB");
        setField(term5408, term5408.getClass(), "signature", "WqaQxuPbzr");
        setField(term5408, term5408.getClass(), "qualified", "bjLZqJqmnv");
        setField(term5408, term5408.getClass(), "scope", "TPbMBzbcHs");
        setField(term5408, term5408.getClass(), "_final", term5529);
        setField(term5408, term5408.getClass(), "included", term5531);
        setField(term5408, term5408.getClass(), "_native", term5533);
        setField(term5408, term5408.getClass(), "_synchronized", term5535);
        setField(term5408, term5408.getClass(), "_static", term5537);
        setField(term5408, term5408.getClass(), "varArgs", term5539);
        term5541 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term5541;
        callMethod(klass, "setStatic", argTypes, term5408, args);
    }

};


