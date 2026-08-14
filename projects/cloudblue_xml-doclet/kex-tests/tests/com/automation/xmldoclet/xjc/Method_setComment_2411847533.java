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

public class Method_setComment_2411847533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45795;

    public Method_setComment_2411847533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45810 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term45810, term45810.getClass(), "name", "");
        setField(term45810, term45810.getClass(), "text", "");
        Object term45813 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term45813, term45813.getClass(), "name", "");
        setField(term45813, term45813.getClass(), "text", "");
        Object term45816 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term45816, term45816.getClass(), "name", "");
        setField(term45816, term45816.getClass(), "text", "");
        Object term45819 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term45819, term45819.getClass(), "name", "");
        setField(term45819, term45819.getClass(), "text", "");
        ArrayList term45808 = new ArrayList();
        ((ArrayList) term45808).add(term45810);
        ((ArrayList) term45808).add(term45813);
        ((ArrayList) term45808).add(term45816);
        ((ArrayList) term45808).add(term45819);
        ArrayList term45828 = new ArrayList();
        ((ArrayList) term45828).add((Object)null);
        ((ArrayList) term45828).add((Object)null);
        ((ArrayList) term45828).add((Object)null);
        Object term45826 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term45827 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45827, term45827.getClass(), "wildcard", null);
        setField(term45827, term45827.getClass(), "generic", null);
        setField(term45827, term45827.getClass(), "qualified", null);
        setField(term45827, term45827.getClass(), "dimension", null);
        setField(term45826, term45826.getClass(), "type", term45827);
        setField(term45826, term45826.getClass(), "annotation", term45828);
        setField(term45826, term45826.getClass(), "name", "");
        ArrayList term45834 = new ArrayList();
        ((ArrayList) term45834).add((Object)null);
        ((ArrayList) term45834).add((Object)null);
        ((ArrayList) term45834).add((Object)null);
        ((ArrayList) term45834).add((Object)null);
        Object term45832 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term45833 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45833, term45833.getClass(), "wildcard", null);
        setField(term45833, term45833.getClass(), "generic", null);
        setField(term45833, term45833.getClass(), "qualified", null);
        setField(term45833, term45833.getClass(), "dimension", null);
        setField(term45832, term45832.getClass(), "type", term45833);
        setField(term45832, term45832.getClass(), "annotation", term45834);
        setField(term45832, term45832.getClass(), "name", "");
        ArrayList term45840 = new ArrayList();
        Object term45838 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term45839 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45839, term45839.getClass(), "wildcard", null);
        setField(term45839, term45839.getClass(), "generic", null);
        setField(term45839, term45839.getClass(), "qualified", null);
        setField(term45839, term45839.getClass(), "dimension", null);
        setField(term45838, term45838.getClass(), "type", term45839);
        setField(term45838, term45838.getClass(), "annotation", term45840);
        setField(term45838, term45838.getClass(), "name", "");
        ArrayList term45845 = new ArrayList();
        Object term45844 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term45844, term45844.getClass(), "type", term45839);
        setField(term45844, term45844.getClass(), "annotation", term45845);
        setField(term45844, term45844.getClass(), "name", "");
        ArrayList term45850 = new ArrayList();
        ((ArrayList) term45850).add((Object)null);
        ((ArrayList) term45850).add((Object)null);
        ((ArrayList) term45850).add((Object)null);
        Object term45849 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term45849, term45849.getClass(), "type", term45827);
        setField(term45849, term45849.getClass(), "annotation", term45850);
        setField(term45849, term45849.getClass(), "name", "");
        ArrayList term45824 = new ArrayList();
        ((ArrayList) term45824).add(term45826);
        ((ArrayList) term45824).add(term45832);
        ((ArrayList) term45824).add(term45838);
        ((ArrayList) term45824).add(term45844);
        ((ArrayList) term45824).add(term45849);
        ArrayList term45857 = new ArrayList();
        ((ArrayList) term45857).add(term45839);
        ArrayList term45864 = new ArrayList();
        ((ArrayList) term45864).add((Object)null);
        ((ArrayList) term45864).add((Object)null);
        ((ArrayList) term45864).add((Object)null);
        ((ArrayList) term45864).add((Object)null);
        ((ArrayList) term45864).add((Object)null);
        ((ArrayList) term45864).add((Object)null);
        Object term45863 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term45863, term45863.getClass(), "argument", term45864);
        setField(term45863, term45863.getClass(), "name", "");
        setField(term45863, term45863.getClass(), "qualified", "");
        Object term45869 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term45869, term45869.getClass(), "argument", null);
        setField(term45869, term45869.getClass(), "name", null);
        setField(term45869, term45869.getClass(), "qualified", null);
        Object term45870 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term45870, term45870.getClass(), "argument", null);
        setField(term45870, term45870.getClass(), "name", null);
        setField(term45870, term45870.getClass(), "qualified", null);
        Object term45871 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term45871, term45871.getClass(), "argument", null);
        setField(term45871, term45871.getClass(), "name", null);
        setField(term45871, term45871.getClass(), "qualified", null);
        ArrayList term45861 = new ArrayList();
        ((ArrayList) term45861).add(term45863);
        ((ArrayList) term45861).add(term45869);
        ((ArrayList) term45861).add(term45870);
        ((ArrayList) term45861).add(term45871);
        ((ArrayList) term45861).add(term45869);
        Boolean term45922 = new Boolean(false);
        Boolean term45924 = new Boolean(true);
        Boolean term45926 = new Boolean(true);
        Boolean term45928 = new Boolean(false);
        Boolean term45930 = new Boolean(true);
        Boolean term45932 = new Boolean(true);
        Boolean term45934 = new Boolean(true);
        term45795 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term45856 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45795, term45795.getClass(), "comment", "wRFPyxStsS");
        setField(term45795, term45795.getClass(), "tag", term45808);
        setField(term45795, term45795.getClass(), "parameter", term45824);
        setField(term45856, term45856.getClass(), "wildcard", null);
        setField(term45856, term45856.getClass(), "generic", null);
        setField(term45856, term45856.getClass(), "qualified", null);
        setField(term45856, term45856.getClass(), "dimension", null);
        setField(term45795, term45795.getClass(), "_return", term45856);
        setField(term45795, term45795.getClass(), "exception", term45857);
        setField(term45795, term45795.getClass(), "annotation", term45861);
        setField(term45795, term45795.getClass(), "name", "niLVFBKddn");
        setField(term45795, term45795.getClass(), "signature", "RAVbhREWXK");
        setField(term45795, term45795.getClass(), "qualified", "xPvCaGqquj");
        setField(term45795, term45795.getClass(), "scope", "VfmYbZwVXs");
        setField(term45795, term45795.getClass(), "_abstract", term45922);
        setField(term45795, term45795.getClass(), "_final", term45924);
        setField(term45795, term45795.getClass(), "included", term45926);
        setField(term45795, term45795.getClass(), "_native", term45928);
        setField(term45795, term45795.getClass(), "_synchronized", term45930);
        setField(term45795, term45795.getClass(), "_static", term45932);
        setField(term45795, term45795.getClass(), "varArgs", term45934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yRkDLKiBXi";
        callMethod(klass, "setComment", argTypes, term45795, args);
    }

};


