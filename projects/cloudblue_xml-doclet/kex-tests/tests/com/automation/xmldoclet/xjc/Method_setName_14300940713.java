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

public class Method_setName_14300940713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49825;

    public Method_setName_14300940713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term49838 = new ArrayList();
        ArrayList term49846 = new ArrayList();
        ((ArrayList) term49846).add((Object)null);
        ((ArrayList) term49846).add((Object)null);
        ((ArrayList) term49846).add((Object)null);
        ((ArrayList) term49846).add((Object)null);
        Object term49844 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term49845 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term49845, term49845.getClass(), "wildcard", null);
        setField(term49845, term49845.getClass(), "generic", null);
        setField(term49845, term49845.getClass(), "qualified", null);
        setField(term49845, term49845.getClass(), "dimension", null);
        setField(term49844, term49844.getClass(), "type", term49845);
        setField(term49844, term49844.getClass(), "annotation", term49846);
        setField(term49844, term49844.getClass(), "name", "");
        ArrayList term49852 = new ArrayList();
        ((ArrayList) term49852).add((Object)null);
        ((ArrayList) term49852).add((Object)null);
        Object term49850 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term49851 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term49851, term49851.getClass(), "wildcard", null);
        setField(term49851, term49851.getClass(), "generic", null);
        setField(term49851, term49851.getClass(), "qualified", null);
        setField(term49851, term49851.getClass(), "dimension", null);
        setField(term49850, term49850.getClass(), "type", term49851);
        setField(term49850, term49850.getClass(), "annotation", term49852);
        setField(term49850, term49850.getClass(), "name", "");
        ArrayList term49858 = new ArrayList();
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        Object term49856 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term49857 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term49857, term49857.getClass(), "wildcard", null);
        setField(term49857, term49857.getClass(), "generic", null);
        setField(term49857, term49857.getClass(), "qualified", null);
        setField(term49857, term49857.getClass(), "dimension", null);
        setField(term49856, term49856.getClass(), "type", term49857);
        setField(term49856, term49856.getClass(), "annotation", term49858);
        setField(term49856, term49856.getClass(), "name", "");
        ArrayList term49842 = new ArrayList();
        ((ArrayList) term49842).add(term49844);
        ((ArrayList) term49842).add(term49850);
        ((ArrayList) term49842).add(term49856);
        ArrayList term49869 = new ArrayList();
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        ((ArrayList) term49869).add((Object)null);
        Object term49867 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term49868 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term49868, term49868.getClass(), "extendsBound", null);
        setField(term49868, term49868.getClass(), "superBound", null);
        setField(term49867, term49867.getClass(), "wildcard", term49868);
        setField(term49867, term49867.getClass(), "generic", term49869);
        setField(term49867, term49867.getClass(), "qualified", "");
        setField(term49867, term49867.getClass(), "dimension", "");
        ArrayList term49865 = new ArrayList();
        ((ArrayList) term49865).add(term49867);
        ((ArrayList) term49865).add(term49857);
        ((ArrayList) term49865).add(term49851);
        Object term49878 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49878, term49878.getClass(), "argument", null);
        setField(term49878, term49878.getClass(), "name", null);
        setField(term49878, term49878.getClass(), "qualified", null);
        Object term49879 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49879, term49879.getClass(), "argument", null);
        setField(term49879, term49879.getClass(), "name", null);
        setField(term49879, term49879.getClass(), "qualified", null);
        Object term49880 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49880, term49880.getClass(), "argument", null);
        setField(term49880, term49880.getClass(), "name", null);
        setField(term49880, term49880.getClass(), "qualified", null);
        ArrayList term49882 = new ArrayList();
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        ((ArrayList) term49882).add((Object)null);
        Object term49881 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49881, term49881.getClass(), "argument", term49882);
        setField(term49881, term49881.getClass(), "name", "");
        setField(term49881, term49881.getClass(), "qualified", "");
        ArrayList term49888 = new ArrayList();
        ((ArrayList) term49888).add((Object)null);
        ((ArrayList) term49888).add((Object)null);
        ((ArrayList) term49888).add((Object)null);
        ((ArrayList) term49888).add((Object)null);
        Object term49887 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49887, term49887.getClass(), "argument", term49888);
        setField(term49887, term49887.getClass(), "name", "");
        setField(term49887, term49887.getClass(), "qualified", "");
        ArrayList term49876 = new ArrayList();
        ((ArrayList) term49876).add(term49878);
        ((ArrayList) term49876).add(term49879);
        ((ArrayList) term49876).add(term49880);
        ((ArrayList) term49876).add(term49881);
        ((ArrayList) term49876).add(term49887);
        Boolean term49943 = new Boolean(false);
        Boolean term49945 = new Boolean(false);
        Boolean term49947 = new Boolean(false);
        Boolean term49949 = new Boolean(false);
        Boolean term49951 = new Boolean(true);
        Boolean term49953 = new Boolean(false);
        Boolean term49955 = new Boolean(true);
        term49825 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term49864 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term49825, term49825.getClass(), "comment", "sisFpOXUaC");
        setField(term49825, term49825.getClass(), "tag", term49838);
        setField(term49825, term49825.getClass(), "parameter", term49842);
        setField(term49864, term49864.getClass(), "wildcard", null);
        setField(term49864, term49864.getClass(), "generic", null);
        setField(term49864, term49864.getClass(), "qualified", null);
        setField(term49864, term49864.getClass(), "dimension", null);
        setField(term49825, term49825.getClass(), "_return", term49864);
        setField(term49825, term49825.getClass(), "exception", term49865);
        setField(term49825, term49825.getClass(), "annotation", term49876);
        setField(term49825, term49825.getClass(), "name", "znLEnjvyfk");
        setField(term49825, term49825.getClass(), "signature", "hVupfwPluh");
        setField(term49825, term49825.getClass(), "qualified", "SeIvLSQqTP");
        setField(term49825, term49825.getClass(), "scope", "ikSrUEOnWu");
        setField(term49825, term49825.getClass(), "_abstract", term49943);
        setField(term49825, term49825.getClass(), "_final", term49945);
        setField(term49825, term49825.getClass(), "included", term49947);
        setField(term49825, term49825.getClass(), "_native", term49949);
        setField(term49825, term49825.getClass(), "_synchronized", term49951);
        setField(term49825, term49825.getClass(), "_static", term49953);
        setField(term49825, term49825.getClass(), "varArgs", term49955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJMtuZdFTA";
        callMethod(klass, "setName", argTypes, term49825, args);
    }

};


