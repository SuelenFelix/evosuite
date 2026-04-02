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

public class Method_setSignature_177518575216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50272;

    public Method_setSignature_177518575216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50287 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term50287, term50287.getClass(), "name", "");
        setField(term50287, term50287.getClass(), "text", "");
        ArrayList term50285 = new ArrayList();
        ((ArrayList) term50285).add(term50287);
        ArrayList term50296 = new ArrayList();
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        ((ArrayList) term50296).add((Object)null);
        Object term50294 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term50295 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term50295, term50295.getClass(), "wildcard", null);
        setField(term50295, term50295.getClass(), "generic", null);
        setField(term50295, term50295.getClass(), "qualified", null);
        setField(term50295, term50295.getClass(), "dimension", null);
        setField(term50294, term50294.getClass(), "type", term50295);
        setField(term50294, term50294.getClass(), "annotation", term50296);
        setField(term50294, term50294.getClass(), "name", "");
        ArrayList term50301 = new ArrayList();
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        Object term50300 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term50300, term50300.getClass(), "type", term50295);
        setField(term50300, term50300.getClass(), "annotation", term50301);
        setField(term50300, term50300.getClass(), "name", "");
        ArrayList term50307 = new ArrayList();
        Object term50305 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term50306 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term50306, term50306.getClass(), "wildcard", null);
        setField(term50306, term50306.getClass(), "generic", null);
        setField(term50306, term50306.getClass(), "qualified", null);
        setField(term50306, term50306.getClass(), "dimension", null);
        setField(term50305, term50305.getClass(), "type", term50306);
        setField(term50305, term50305.getClass(), "annotation", term50307);
        setField(term50305, term50305.getClass(), "name", "");
        ArrayList term50313 = new ArrayList();
        ((ArrayList) term50313).add((Object)null);
        ((ArrayList) term50313).add((Object)null);
        ((ArrayList) term50313).add((Object)null);
        ((ArrayList) term50313).add((Object)null);
        Object term50311 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term50312 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term50312, term50312.getClass(), "wildcard", null);
        setField(term50312, term50312.getClass(), "generic", null);
        setField(term50312, term50312.getClass(), "qualified", null);
        setField(term50312, term50312.getClass(), "dimension", null);
        setField(term50311, term50311.getClass(), "type", term50312);
        setField(term50311, term50311.getClass(), "annotation", term50313);
        setField(term50311, term50311.getClass(), "name", "");
        ArrayList term50292 = new ArrayList();
        ((ArrayList) term50292).add(term50294);
        ((ArrayList) term50292).add(term50300);
        ((ArrayList) term50292).add(term50305);
        ((ArrayList) term50292).add(term50311);
        ArrayList term50319 = new ArrayList();
        ((ArrayList) term50319).add(term50306);
        ((ArrayList) term50319).add(term50312);
        Object term50325 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term50325, term50325.getClass(), "argument", null);
        setField(term50325, term50325.getClass(), "name", null);
        setField(term50325, term50325.getClass(), "qualified", null);
        ArrayList term50323 = new ArrayList();
        ((ArrayList) term50323).add(term50325);
        Boolean term50376 = new Boolean(true);
        Boolean term50378 = new Boolean(true);
        Boolean term50380 = new Boolean(true);
        Boolean term50382 = new Boolean(true);
        Boolean term50384 = new Boolean(true);
        Boolean term50386 = new Boolean(false);
        Boolean term50388 = new Boolean(false);
        term50272 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term50272, term50272.getClass(), "comment", "DbZfZUUysG");
        setField(term50272, term50272.getClass(), "tag", term50285);
        setField(term50272, term50272.getClass(), "parameter", term50292);
        setField(term50272, term50272.getClass(), "_return", term50312);
        setField(term50272, term50272.getClass(), "exception", term50319);
        setField(term50272, term50272.getClass(), "annotation", term50323);
        setField(term50272, term50272.getClass(), "name", "BuwwEApIZv");
        setField(term50272, term50272.getClass(), "signature", "oHCMKpyZVd");
        setField(term50272, term50272.getClass(), "qualified", "qRNCDMoKQR");
        setField(term50272, term50272.getClass(), "scope", "vKqzVdQzNk");
        setField(term50272, term50272.getClass(), "_abstract", term50376);
        setField(term50272, term50272.getClass(), "_final", term50378);
        setField(term50272, term50272.getClass(), "included", term50380);
        setField(term50272, term50272.getClass(), "_native", term50382);
        setField(term50272, term50272.getClass(), "_synchronized", term50384);
        setField(term50272, term50272.getClass(), "_static", term50386);
        setField(term50272, term50272.getClass(), "varArgs", term50388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gBEgwuowLO";
        callMethod(klass, "setSignature", argTypes, term50272, args);
    }

};


