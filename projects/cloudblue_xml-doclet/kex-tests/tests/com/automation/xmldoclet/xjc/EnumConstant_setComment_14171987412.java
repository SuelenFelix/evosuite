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

public class EnumConstant_setComment_14171987412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7412;

    public EnumConstant_setComment_14171987412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7427 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7427, term7427.getClass(), "name", "");
        setField(term7427, term7427.getClass(), "text", "");
        Object term7430 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7430, term7430.getClass(), "name", "");
        setField(term7430, term7430.getClass(), "text", "");
        Object term7433 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7433, term7433.getClass(), "name", "");
        setField(term7433, term7433.getClass(), "text", "");
        Object term7436 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7436, term7436.getClass(), "name", "");
        setField(term7436, term7436.getClass(), "text", "");
        Object term7439 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7439, term7439.getClass(), "name", "");
        setField(term7439, term7439.getClass(), "text", "");
        Object term7442 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7442, term7442.getClass(), "name", "");
        setField(term7442, term7442.getClass(), "text", "");
        ArrayList term7425 = new ArrayList();
        ((ArrayList) term7425).add(term7427);
        ((ArrayList) term7425).add(term7430);
        ((ArrayList) term7425).add(term7433);
        ((ArrayList) term7425).add(term7436);
        ((ArrayList) term7425).add(term7439);
        ((ArrayList) term7425).add(term7442);
        ArrayList term7450 = new ArrayList();
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        ((ArrayList) term7450).add((Object)null);
        Object term7449 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7449, term7449.getClass(), "argument", term7450);
        setField(term7449, term7449.getClass(), "name", "");
        setField(term7449, term7449.getClass(), "qualified", "");
        ArrayList term7456 = new ArrayList();
        ((ArrayList) term7456).add((Object)null);
        ((ArrayList) term7456).add((Object)null);
        Object term7455 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7455, term7455.getClass(), "argument", term7456);
        setField(term7455, term7455.getClass(), "name", "");
        setField(term7455, term7455.getClass(), "qualified", "");
        ArrayList term7462 = new ArrayList();
        ((ArrayList) term7462).add((Object)null);
        ((ArrayList) term7462).add((Object)null);
        ((ArrayList) term7462).add((Object)null);
        Object term7461 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7461, term7461.getClass(), "argument", term7462);
        setField(term7461, term7461.getClass(), "name", "");
        setField(term7461, term7461.getClass(), "qualified", "");
        ArrayList term7468 = new ArrayList();
        ((ArrayList) term7468).add((Object)null);
        Object term7467 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7467, term7467.getClass(), "argument", term7468);
        setField(term7467, term7467.getClass(), "name", "");
        setField(term7467, term7467.getClass(), "qualified", "");
        ArrayList term7447 = new ArrayList();
        ((ArrayList) term7447).add(term7449);
        ((ArrayList) term7447).add(term7455);
        ((ArrayList) term7447).add(term7461);
        ((ArrayList) term7447).add(term7467);
        term7412 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7412, term7412.getClass(), "comment", "ePFnljQSHU");
        setField(term7412, term7412.getClass(), "tag", term7425);
        setField(term7412, term7412.getClass(), "annotation", term7447);
        setField(term7412, term7412.getClass(), "name", "mUCxMstoOT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LroMhmrHbv";
        callMethod(klass, "setComment", argTypes, term7412, args);
    }

};


