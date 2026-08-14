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

public class Interface_getAnnotation_19316138307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10236;

    public Interface_getAnnotation_19316138307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10251 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term10251, term10251.getClass(), "name", "");
        setField(term10251, term10251.getClass(), "text", "");
        Object term10254 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term10254, term10254.getClass(), "name", "");
        setField(term10254, term10254.getClass(), "text", "");
        Object term10257 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term10257, term10257.getClass(), "name", "");
        setField(term10257, term10257.getClass(), "text", "");
        ArrayList term10249 = new ArrayList();
        ((ArrayList) term10249).add(term10251);
        ((ArrayList) term10249).add(term10254);
        ((ArrayList) term10249).add(term10257);
        ArrayList term10265 = new ArrayList();
        ((ArrayList) term10265).add((Object)null);
        ((ArrayList) term10265).add((Object)null);
        ((ArrayList) term10265).add((Object)null);
        ((ArrayList) term10265).add((Object)null);
        Object term10264 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeParameter"));
        setField(term10264, term10264.getClass(), "bound", term10265);
        setField(term10264, term10264.getClass(), "name", "");
        ArrayList term10270 = new ArrayList();
        Object term10269 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeParameter"));
        setField(term10269, term10269.getClass(), "bound", term10270);
        setField(term10269, term10269.getClass(), "name", "");
        ArrayList term10275 = new ArrayList();
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        ((ArrayList) term10275).add((Object)null);
        Object term10274 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeParameter"));
        setField(term10274, term10274.getClass(), "bound", term10275);
        setField(term10274, term10274.getClass(), "name", "");
        ArrayList term10262 = new ArrayList();
        ((ArrayList) term10262).add(term10264);
        ((ArrayList) term10262).add(term10269);
        ((ArrayList) term10262).add(term10274);
        ArrayList term10285 = new ArrayList();
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        ((ArrayList) term10285).add((Object)null);
        Object term10283 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term10284 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term10284, term10284.getClass(), "extendsBound", null);
        setField(term10284, term10284.getClass(), "superBound", null);
        setField(term10283, term10283.getClass(), "wildcard", term10284);
        setField(term10283, term10283.getClass(), "generic", term10285);
        setField(term10283, term10283.getClass(), "qualified", "");
        setField(term10283, term10283.getClass(), "dimension", "");
        Object term10290 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term10290, term10290.getClass(), "wildcard", null);
        setField(term10290, term10290.getClass(), "generic", null);
        setField(term10290, term10290.getClass(), "qualified", null);
        setField(term10290, term10290.getClass(), "dimension", null);
        ArrayList term10281 = new ArrayList();
        ((ArrayList) term10281).add(term10283);
        ((ArrayList) term10281).add(term10290);
        ArrayList term10293 = new ArrayList();
        ArrayList term10297 = new ArrayList();
        ArrayList term10301 = new ArrayList();
        Boolean term10341 = new Boolean(true);
        term10236 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term10236, term10236.getClass(), "comment", "RReQXZQnIR");
        setField(term10236, term10236.getClass(), "tag", term10249);
        setField(term10236, term10236.getClass(), "generic", term10262);
        setField(term10236, term10236.getClass(), "_interface", term10281);
        setField(term10236, term10236.getClass(), "method", term10293);
        setField(term10236, term10236.getClass(), "annotation", term10297);
        setField(term10236, term10236.getClass(), "field", term10301);
        setField(term10236, term10236.getClass(), "name", "BSdXqptUKz");
        setField(term10236, term10236.getClass(), "qualified", "UtzMtwAaid");
        setField(term10236, term10236.getClass(), "scope", "bchxgKxuUf");
        setField(term10236, term10236.getClass(), "included", term10341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term10236, args);
    }

};


