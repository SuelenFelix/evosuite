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

public class Method_setSignature_177518575215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48008;

    public Method_setSignature_177518575215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48023 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48023, term48023.getClass(), "name", "");
        setField(term48023, term48023.getClass(), "text", "");
        Object term48026 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48026, term48026.getClass(), "name", "");
        setField(term48026, term48026.getClass(), "text", "");
        Object term48029 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48029, term48029.getClass(), "name", "");
        setField(term48029, term48029.getClass(), "text", "");
        Object term48032 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48032, term48032.getClass(), "name", "");
        setField(term48032, term48032.getClass(), "text", "");
        Object term48035 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48035, term48035.getClass(), "name", "");
        setField(term48035, term48035.getClass(), "text", "");
        Object term48038 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48038, term48038.getClass(), "name", "");
        setField(term48038, term48038.getClass(), "text", "");
        Object term48041 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48041, term48041.getClass(), "name", "");
        setField(term48041, term48041.getClass(), "text", "");
        Object term48044 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48044, term48044.getClass(), "name", "");
        setField(term48044, term48044.getClass(), "text", "");
        Object term48047 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48047, term48047.getClass(), "name", "");
        setField(term48047, term48047.getClass(), "text", "");
        ArrayList term48021 = new ArrayList();
        ((ArrayList) term48021).add(term48023);
        ((ArrayList) term48021).add(term48026);
        ((ArrayList) term48021).add(term48029);
        ((ArrayList) term48021).add(term48032);
        ((ArrayList) term48021).add(term48035);
        ((ArrayList) term48021).add(term48038);
        ((ArrayList) term48021).add(term48041);
        ((ArrayList) term48021).add(term48044);
        ((ArrayList) term48021).add(term48047);
        ArrayList term48052 = new ArrayList();
        ArrayList term48058 = new ArrayList();
        ((ArrayList) term48058).add((Object)null);
        ((ArrayList) term48058).add((Object)null);
        ((ArrayList) term48058).add((Object)null);
        ArrayList term48062 = new ArrayList();
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        ((ArrayList) term48062).add((Object)null);
        Object term48068 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48068, term48068.getClass(), "wildcard", null);
        setField(term48068, term48068.getClass(), "generic", null);
        setField(term48068, term48068.getClass(), "qualified", null);
        setField(term48068, term48068.getClass(), "dimension", null);
        ArrayList term48066 = new ArrayList();
        ((ArrayList) term48066).add(term48068);
        ArrayList term48095 = new ArrayList();
        ArrayList term48102 = new ArrayList();
        ((ArrayList) term48102).add((Object)null);
        ((ArrayList) term48102).add((Object)null);
        Object term48101 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term48101, term48101.getClass(), "argument", term48102);
        setField(term48101, term48101.getClass(), "name", "");
        setField(term48101, term48101.getClass(), "qualified", "");
        ArrayList term48099 = new ArrayList();
        ((ArrayList) term48099).add(term48101);
        Boolean term48157 = new Boolean(false);
        Boolean term48159 = new Boolean(false);
        Boolean term48161 = new Boolean(false);
        Boolean term48163 = new Boolean(false);
        Boolean term48165 = new Boolean(false);
        Boolean term48167 = new Boolean(true);
        Boolean term48169 = new Boolean(false);
        term48008 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term48056 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term48057 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term48008, term48008.getClass(), "comment", "NSvOlTAkKY");
        setField(term48008, term48008.getClass(), "tag", term48021);
        setField(term48008, term48008.getClass(), "parameter", term48052);
        setField(term48057, term48057.getClass(), "extendsBound", term48058);
        setField(term48057, term48057.getClass(), "superBound", term48062);
        setField(term48056, term48056.getClass(), "wildcard", term48057);
        setField(term48056, term48056.getClass(), "generic", term48066);
        setField(term48056, term48056.getClass(), "qualified", "okoFqYtOMs");
        setField(term48056, term48056.getClass(), "dimension", "rQCKeIAEgH");
        setField(term48008, term48008.getClass(), "_return", term48056);
        setField(term48008, term48008.getClass(), "exception", term48095);
        setField(term48008, term48008.getClass(), "annotation", term48099);
        setField(term48008, term48008.getClass(), "name", "oJVubRePTj");
        setField(term48008, term48008.getClass(), "signature", "hWhgYafufK");
        setField(term48008, term48008.getClass(), "qualified", "XHhvhypIdm");
        setField(term48008, term48008.getClass(), "scope", "qXGGYUxcmf");
        setField(term48008, term48008.getClass(), "_abstract", term48157);
        setField(term48008, term48008.getClass(), "_final", term48159);
        setField(term48008, term48008.getClass(), "included", term48161);
        setField(term48008, term48008.getClass(), "_native", term48163);
        setField(term48008, term48008.getClass(), "_synchronized", term48165);
        setField(term48008, term48008.getClass(), "_static", term48167);
        setField(term48008, term48008.getClass(), "varArgs", term48169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BPtbbFBqSo";
        callMethod(klass, "setSignature", argTypes, term48008, args);
    }

};


