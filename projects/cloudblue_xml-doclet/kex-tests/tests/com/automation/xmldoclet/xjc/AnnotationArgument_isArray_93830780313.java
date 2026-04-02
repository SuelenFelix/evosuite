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

public class AnnotationArgument_isArray_93830780313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54124;

    public AnnotationArgument_isArray_93830780313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54127 = new ArrayList();
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ((ArrayList) term54127).add((Object)null);
        ArrayList term54131 = new ArrayList();
        ((ArrayList) term54131).add((Object)null);
        ((ArrayList) term54131).add((Object)null);
        ((ArrayList) term54131).add((Object)null);
        ((ArrayList) term54131).add((Object)null);
        ((ArrayList) term54131).add((Object)null);
        ((ArrayList) term54131).add((Object)null);
        ArrayList term54135 = new ArrayList();
        ArrayList term54163 = new ArrayList();
        ((ArrayList) term54163).add("jTNrBMgZcO");
        ((ArrayList) term54163).add("vVEcDVlQKB");
        ((ArrayList) term54163).add("nsuWliUVNL");
        ((ArrayList) term54163).add("VbhrNSVDEg");
        ((ArrayList) term54163).add("JxOjGBrwRh");
        ArrayList term54230 = new ArrayList();
        ((ArrayList) term54230).add((Object)null);
        ((ArrayList) term54230).add((Object)null);
        ((ArrayList) term54230).add((Object)null);
        ((ArrayList) term54230).add((Object)null);
        Object term54229 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term54229, term54229.getClass(), "argument", term54230);
        setField(term54229, term54229.getClass(), "name", "");
        setField(term54229, term54229.getClass(), "qualified", "");
        ArrayList term54227 = new ArrayList();
        ((ArrayList) term54227).add(term54229);
        Boolean term54249 = new Boolean(true);
        Boolean term54251 = new Boolean(true);
        term54124 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term54125 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term54126 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term54126, term54126.getClass(), "extendsBound", term54127);
        setField(term54126, term54126.getClass(), "superBound", term54131);
        setField(term54125, term54125.getClass(), "wildcard", term54126);
        setField(term54125, term54125.getClass(), "generic", term54135);
        setField(term54125, term54125.getClass(), "qualified", "cmIiVkHcZM");
        setField(term54125, term54125.getClass(), "dimension", "JpRFMRiemu");
        setField(term54124, term54124.getClass(), "type", term54125);
        setField(term54124, term54124.getClass(), "value", term54163);
        setField(term54124, term54124.getClass(), "annotation", term54227);
        setField(term54124, term54124.getClass(), "name", "fWPoEUReeY");
        setField(term54124, term54124.getClass(), "primitive", term54249);
        setField(term54124, term54124.getClass(), "array", term54251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArray", argTypes, term54124, args);
    }

};


