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

public class EnumConstant_getAnnotation_4355812164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7642;

    public EnumConstant_getAnnotation_4355812164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7657 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7657, term7657.getClass(), "name", "");
        setField(term7657, term7657.getClass(), "text", "");
        Object term7660 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7660, term7660.getClass(), "name", "");
        setField(term7660, term7660.getClass(), "text", "");
        ArrayList term7655 = new ArrayList();
        ((ArrayList) term7655).add(term7657);
        ((ArrayList) term7655).add(term7660);
        ArrayList term7668 = new ArrayList();
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        ((ArrayList) term7668).add((Object)null);
        Object term7667 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7667, term7667.getClass(), "argument", term7668);
        setField(term7667, term7667.getClass(), "name", "");
        setField(term7667, term7667.getClass(), "qualified", "");
        ArrayList term7665 = new ArrayList();
        ((ArrayList) term7665).add(term7667);
        term7642 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7642, term7642.getClass(), "comment", "SMZbMLuReo");
        setField(term7642, term7642.getClass(), "tag", term7655);
        setField(term7642, term7642.getClass(), "annotation", term7665);
        setField(term7642, term7642.getClass(), "name", "lvQpEwdZeM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term7642, args);
    }

};


