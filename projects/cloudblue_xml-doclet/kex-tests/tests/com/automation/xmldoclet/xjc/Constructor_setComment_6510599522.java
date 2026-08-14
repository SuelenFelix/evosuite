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

public class Constructor_setComment_6510599522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public Constructor_setComment_6510599522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term732 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term732, term732.getClass(), "name", "");
        setField(term732, term732.getClass(), "text", "");
        Object term735 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term735, term735.getClass(), "name", "");
        setField(term735, term735.getClass(), "text", "");
        ArrayList term730 = new ArrayList();
        ((ArrayList) term730).add(term732);
        ((ArrayList) term730).add(term735);
        ArrayList term740 = new ArrayList();
        ArrayList term744 = new ArrayList();
        ArrayList term751 = new ArrayList();
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        Object term750 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term750, term750.getClass(), "argument", term751);
        setField(term750, term750.getClass(), "name", "");
        setField(term750, term750.getClass(), "qualified", "");
        ArrayList term757 = new ArrayList();
        ((ArrayList) term757).add((Object)null);
        ((ArrayList) term757).add((Object)null);
        ((ArrayList) term757).add((Object)null);
        Object term756 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term756, term756.getClass(), "argument", term757);
        setField(term756, term756.getClass(), "name", "");
        setField(term756, term756.getClass(), "qualified", "");
        ArrayList term763 = new ArrayList();
        Object term762 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term762, term762.getClass(), "argument", term763);
        setField(term762, term762.getClass(), "name", "");
        setField(term762, term762.getClass(), "qualified", "");
        ArrayList term769 = new ArrayList();
        ((ArrayList) term769).add((Object)null);
        ((ArrayList) term769).add((Object)null);
        ((ArrayList) term769).add((Object)null);
        ((ArrayList) term769).add((Object)null);
        Object term768 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term768, term768.getClass(), "argument", term769);
        setField(term768, term768.getClass(), "name", "");
        setField(term768, term768.getClass(), "qualified", "");
        ArrayList term775 = new ArrayList();
        ((ArrayList) term775).add((Object)null);
        ((ArrayList) term775).add((Object)null);
        ((ArrayList) term775).add((Object)null);
        ((ArrayList) term775).add((Object)null);
        Object term774 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term774, term774.getClass(), "argument", term775);
        setField(term774, term774.getClass(), "name", "");
        setField(term774, term774.getClass(), "qualified", "");
        ArrayList term748 = new ArrayList();
        ((ArrayList) term748).add(term750);
        ((ArrayList) term748).add(term756);
        ((ArrayList) term748).add(term762);
        ((ArrayList) term748).add(term768);
        ((ArrayList) term748).add(term774);
        Boolean term830 = new Boolean(false);
        Boolean term832 = new Boolean(true);
        Boolean term834 = new Boolean(false);
        Boolean term836 = new Boolean(false);
        Boolean term838 = new Boolean(true);
        Boolean term840 = new Boolean(true);
        term717 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term717, term717.getClass(), "comment", "tKmrUDURku");
        setField(term717, term717.getClass(), "tag", term730);
        setField(term717, term717.getClass(), "parameter", term740);
        setField(term717, term717.getClass(), "exception", term744);
        setField(term717, term717.getClass(), "annotation", term748);
        setField(term717, term717.getClass(), "name", "ceCWHUTQUM");
        setField(term717, term717.getClass(), "signature", "LrqwfrKKtS");
        setField(term717, term717.getClass(), "qualified", "ZUdnQXfzCI");
        setField(term717, term717.getClass(), "scope", "EULDrUNQvw");
        setField(term717, term717.getClass(), "_final", term830);
        setField(term717, term717.getClass(), "included", term832);
        setField(term717, term717.getClass(), "_native", term834);
        setField(term717, term717.getClass(), "_synchronized", term836);
        setField(term717, term717.getClass(), "_static", term838);
        setField(term717, term717.getClass(), "varArgs", term840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BtvAvsJSei";
        callMethod(klass, "setComment", argTypes, term717, args);
    }

};


