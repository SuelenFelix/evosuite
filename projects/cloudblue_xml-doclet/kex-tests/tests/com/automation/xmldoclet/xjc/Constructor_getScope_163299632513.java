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

public class Constructor_getScope_163299632513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3080;

    public Constructor_getScope_163299632513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3095 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3095, term3095.getClass(), "name", "");
        setField(term3095, term3095.getClass(), "text", "");
        Object term3098 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3098, term3098.getClass(), "name", "");
        setField(term3098, term3098.getClass(), "text", "");
        ArrayList term3093 = new ArrayList();
        ((ArrayList) term3093).add(term3095);
        ((ArrayList) term3093).add(term3098);
        ArrayList term3107 = new ArrayList();
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        ((ArrayList) term3107).add((Object)null);
        Object term3105 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3106 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3106, term3106.getClass(), "wildcard", null);
        setField(term3106, term3106.getClass(), "generic", null);
        setField(term3106, term3106.getClass(), "qualified", null);
        setField(term3106, term3106.getClass(), "dimension", null);
        setField(term3105, term3105.getClass(), "type", term3106);
        setField(term3105, term3105.getClass(), "annotation", term3107);
        setField(term3105, term3105.getClass(), "name", "");
        ArrayList term3113 = new ArrayList();
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        Object term3111 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3112 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3112, term3112.getClass(), "wildcard", null);
        setField(term3112, term3112.getClass(), "generic", null);
        setField(term3112, term3112.getClass(), "qualified", null);
        setField(term3112, term3112.getClass(), "dimension", null);
        setField(term3111, term3111.getClass(), "type", term3112);
        setField(term3111, term3111.getClass(), "annotation", term3113);
        setField(term3111, term3111.getClass(), "name", "");
        ArrayList term3119 = new ArrayList();
        ((ArrayList) term3119).add((Object)null);
        ((ArrayList) term3119).add((Object)null);
        ((ArrayList) term3119).add((Object)null);
        Object term3117 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3118 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3118, term3118.getClass(), "wildcard", null);
        setField(term3118, term3118.getClass(), "generic", null);
        setField(term3118, term3118.getClass(), "qualified", null);
        setField(term3118, term3118.getClass(), "dimension", null);
        setField(term3117, term3117.getClass(), "type", term3118);
        setField(term3117, term3117.getClass(), "annotation", term3119);
        setField(term3117, term3117.getClass(), "name", "");
        ArrayList term3125 = new ArrayList();
        ((ArrayList) term3125).add((Object)null);
        ((ArrayList) term3125).add((Object)null);
        ((ArrayList) term3125).add((Object)null);
        ((ArrayList) term3125).add((Object)null);
        Object term3123 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3124 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3124, term3124.getClass(), "wildcard", null);
        setField(term3124, term3124.getClass(), "generic", null);
        setField(term3124, term3124.getClass(), "qualified", null);
        setField(term3124, term3124.getClass(), "dimension", null);
        setField(term3123, term3123.getClass(), "type", term3124);
        setField(term3123, term3123.getClass(), "annotation", term3125);
        setField(term3123, term3123.getClass(), "name", "");
        ArrayList term3130 = new ArrayList();
        Object term3129 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term3129, term3129.getClass(), "type", term3106);
        setField(term3129, term3129.getClass(), "annotation", term3130);
        setField(term3129, term3129.getClass(), "name", "");
        ArrayList term3135 = new ArrayList();
        Object term3134 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term3134, term3134.getClass(), "type", term3124);
        setField(term3134, term3134.getClass(), "annotation", term3135);
        setField(term3134, term3134.getClass(), "name", "");
        ArrayList term3103 = new ArrayList();
        ((ArrayList) term3103).add(term3105);
        ((ArrayList) term3103).add(term3111);
        ((ArrayList) term3103).add(term3117);
        ((ArrayList) term3103).add(term3123);
        ((ArrayList) term3103).add(term3129);
        ((ArrayList) term3103).add(term3134);
        Object term3143 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3143, term3143.getClass(), "wildcard", null);
        setField(term3143, term3143.getClass(), "generic", null);
        setField(term3143, term3143.getClass(), "qualified", null);
        setField(term3143, term3143.getClass(), "dimension", null);
        Object term3144 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3144, term3144.getClass(), "wildcard", null);
        setField(term3144, term3144.getClass(), "generic", null);
        setField(term3144, term3144.getClass(), "qualified", null);
        setField(term3144, term3144.getClass(), "dimension", null);
        ArrayList term3147 = new ArrayList();
        Object term3145 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term3146 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term3146, term3146.getClass(), "extendsBound", null);
        setField(term3146, term3146.getClass(), "superBound", null);
        setField(term3145, term3145.getClass(), "wildcard", term3146);
        setField(term3145, term3145.getClass(), "generic", term3147);
        setField(term3145, term3145.getClass(), "qualified", "");
        setField(term3145, term3145.getClass(), "dimension", "");
        ArrayList term3141 = new ArrayList();
        ((ArrayList) term3141).add(term3118);
        ((ArrayList) term3141).add(term3143);
        ((ArrayList) term3141).add(term3112);
        ((ArrayList) term3141).add(term3144);
        ((ArrayList) term3141).add(term3145);
        ((ArrayList) term3141).add(term3112);
        Object term3156 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3156, term3156.getClass(), "argument", null);
        setField(term3156, term3156.getClass(), "name", null);
        setField(term3156, term3156.getClass(), "qualified", null);
        Object term3157 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3157, term3157.getClass(), "argument", null);
        setField(term3157, term3157.getClass(), "name", null);
        setField(term3157, term3157.getClass(), "qualified", null);
        ArrayList term3154 = new ArrayList();
        ((ArrayList) term3154).add(term3156);
        ((ArrayList) term3154).add(term3157);
        Boolean term3208 = new Boolean(false);
        Boolean term3210 = new Boolean(false);
        Boolean term3212 = new Boolean(false);
        Boolean term3214 = new Boolean(false);
        Boolean term3216 = new Boolean(true);
        Boolean term3218 = new Boolean(true);
        term3080 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term3080, term3080.getClass(), "comment", "nxEbLIApFc");
        setField(term3080, term3080.getClass(), "tag", term3093);
        setField(term3080, term3080.getClass(), "parameter", term3103);
        setField(term3080, term3080.getClass(), "exception", term3141);
        setField(term3080, term3080.getClass(), "annotation", term3154);
        setField(term3080, term3080.getClass(), "name", "GmtlSgqKcI");
        setField(term3080, term3080.getClass(), "signature", "ssSbvPoMjB");
        setField(term3080, term3080.getClass(), "qualified", "mhRVADhaKm");
        setField(term3080, term3080.getClass(), "scope", "rLldJrTAay");
        setField(term3080, term3080.getClass(), "_final", term3208);
        setField(term3080, term3080.getClass(), "included", term3210);
        setField(term3080, term3080.getClass(), "_native", term3212);
        setField(term3080, term3080.getClass(), "_synchronized", term3214);
        setField(term3080, term3080.getClass(), "_static", term3216);
        setField(term3080, term3080.getClass(), "varArgs", term3218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term3080, args);
    }

};


