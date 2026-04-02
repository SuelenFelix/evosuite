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

public class Method_setScope_31708320421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48893;

    public Method_setScope_31708320421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48908 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48908, term48908.getClass(), "name", "");
        setField(term48908, term48908.getClass(), "text", "");
        Object term48911 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48911, term48911.getClass(), "name", "");
        setField(term48911, term48911.getClass(), "text", "");
        ArrayList term48906 = new ArrayList();
        ((ArrayList) term48906).add(term48908);
        ((ArrayList) term48906).add(term48911);
        ArrayList term48920 = new ArrayList();
        ((ArrayList) term48920).add((Object)null);
        ((ArrayList) term48920).add((Object)null);
        ((ArrayList) term48920).add((Object)null);
        ((ArrayList) term48920).add((Object)null);
        Object term48918 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term48919 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48919, term48919.getClass(), "wildcard", null);
        setField(term48919, term48919.getClass(), "generic", null);
        setField(term48919, term48919.getClass(), "qualified", null);
        setField(term48919, term48919.getClass(), "dimension", null);
        setField(term48918, term48918.getClass(), "type", term48919);
        setField(term48918, term48918.getClass(), "annotation", term48920);
        setField(term48918, term48918.getClass(), "name", "");
        ArrayList term48926 = new ArrayList();
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        ((ArrayList) term48926).add((Object)null);
        Object term48924 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term48925 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48925, term48925.getClass(), "wildcard", null);
        setField(term48925, term48925.getClass(), "generic", null);
        setField(term48925, term48925.getClass(), "qualified", null);
        setField(term48925, term48925.getClass(), "dimension", null);
        setField(term48924, term48924.getClass(), "type", term48925);
        setField(term48924, term48924.getClass(), "annotation", term48926);
        setField(term48924, term48924.getClass(), "name", "");
        ArrayList term48916 = new ArrayList();
        ((ArrayList) term48916).add(term48918);
        ((ArrayList) term48916).add(term48924);
        Object term48935 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48935, term48935.getClass(), "wildcard", null);
        setField(term48935, term48935.getClass(), "generic", null);
        setField(term48935, term48935.getClass(), "qualified", null);
        setField(term48935, term48935.getClass(), "dimension", null);
        ArrayList term48933 = new ArrayList();
        ((ArrayList) term48933).add(term48935);
        Object term48940 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term48940, term48940.getClass(), "argument", null);
        setField(term48940, term48940.getClass(), "name", null);
        setField(term48940, term48940.getClass(), "qualified", null);
        ArrayList term48938 = new ArrayList();
        ((ArrayList) term48938).add(term48940);
        Boolean term48991 = new Boolean(false);
        Boolean term48993 = new Boolean(false);
        Boolean term48995 = new Boolean(true);
        Boolean term48997 = new Boolean(false);
        Boolean term48999 = new Boolean(true);
        Boolean term49001 = new Boolean(true);
        Boolean term49003 = new Boolean(true);
        term48893 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term48932 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48893, term48893.getClass(), "comment", "lEsDNPiXxm");
        setField(term48893, term48893.getClass(), "tag", term48906);
        setField(term48893, term48893.getClass(), "parameter", term48916);
        setField(term48932, term48932.getClass(), "wildcard", null);
        setField(term48932, term48932.getClass(), "generic", null);
        setField(term48932, term48932.getClass(), "qualified", null);
        setField(term48932, term48932.getClass(), "dimension", null);
        setField(term48893, term48893.getClass(), "_return", term48932);
        setField(term48893, term48893.getClass(), "exception", term48933);
        setField(term48893, term48893.getClass(), "annotation", term48938);
        setField(term48893, term48893.getClass(), "name", "BCYPvvqrrs");
        setField(term48893, term48893.getClass(), "signature", "BZJrDPszsn");
        setField(term48893, term48893.getClass(), "qualified", "cSJlAITYRY");
        setField(term48893, term48893.getClass(), "scope", "XuyPJzqInD");
        setField(term48893, term48893.getClass(), "_abstract", term48991);
        setField(term48893, term48893.getClass(), "_final", term48993);
        setField(term48893, term48893.getClass(), "included", term48995);
        setField(term48893, term48893.getClass(), "_native", term48997);
        setField(term48893, term48893.getClass(), "_synchronized", term48999);
        setField(term48893, term48893.getClass(), "_static", term49001);
        setField(term48893, term48893.getClass(), "varArgs", term49003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UxaAGtRgCD";
        callMethod(klass, "setScope", argTypes, term48893, args);
    }

};


