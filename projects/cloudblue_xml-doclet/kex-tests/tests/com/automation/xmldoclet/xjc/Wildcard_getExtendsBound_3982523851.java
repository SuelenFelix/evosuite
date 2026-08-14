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

public class Wildcard_getExtendsBound_3982523851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7213;

    public Wildcard_getExtendsBound_3982523851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7218 = new ArrayList();
        ((ArrayList) term7218).add((Object)null);
        ((ArrayList) term7218).add((Object)null);
        ((ArrayList) term7218).add((Object)null);
        ((ArrayList) term7218).add((Object)null);
        Object term7216 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7217 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7217, term7217.getClass(), "extendsBound", null);
        setField(term7217, term7217.getClass(), "superBound", null);
        setField(term7216, term7216.getClass(), "wildcard", term7217);
        setField(term7216, term7216.getClass(), "generic", term7218);
        setField(term7216, term7216.getClass(), "qualified", "");
        setField(term7216, term7216.getClass(), "dimension", "");
        Object term7223 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7223, term7223.getClass(), "wildcard", null);
        setField(term7223, term7223.getClass(), "generic", null);
        setField(term7223, term7223.getClass(), "qualified", null);
        setField(term7223, term7223.getClass(), "dimension", null);
        Object term7224 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7224, term7224.getClass(), "wildcard", null);
        setField(term7224, term7224.getClass(), "generic", null);
        setField(term7224, term7224.getClass(), "qualified", null);
        setField(term7224, term7224.getClass(), "dimension", null);
        ArrayList term7227 = new ArrayList();
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        ((ArrayList) term7227).add((Object)null);
        Object term7225 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7226 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7226, term7226.getClass(), "extendsBound", null);
        setField(term7226, term7226.getClass(), "superBound", null);
        setField(term7225, term7225.getClass(), "wildcard", term7226);
        setField(term7225, term7225.getClass(), "generic", term7227);
        setField(term7225, term7225.getClass(), "qualified", "");
        setField(term7225, term7225.getClass(), "dimension", "");
        ArrayList term7234 = new ArrayList();
        ((ArrayList) term7234).add((Object)null);
        ((ArrayList) term7234).add((Object)null);
        ((ArrayList) term7234).add((Object)null);
        ((ArrayList) term7234).add((Object)null);
        Object term7232 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7233 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7233, term7233.getClass(), "extendsBound", null);
        setField(term7233, term7233.getClass(), "superBound", null);
        setField(term7232, term7232.getClass(), "wildcard", term7233);
        setField(term7232, term7232.getClass(), "generic", term7234);
        setField(term7232, term7232.getClass(), "qualified", "");
        setField(term7232, term7232.getClass(), "dimension", "");
        Object term7239 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term7239, term7239.getClass(), "wildcard", null);
        setField(term7239, term7239.getClass(), "generic", null);
        setField(term7239, term7239.getClass(), "qualified", null);
        setField(term7239, term7239.getClass(), "dimension", null);
        ArrayList term7242 = new ArrayList();
        ((ArrayList) term7242).add((Object)null);
        ((ArrayList) term7242).add((Object)null);
        ((ArrayList) term7242).add((Object)null);
        ((ArrayList) term7242).add((Object)null);
        ((ArrayList) term7242).add((Object)null);
        ((ArrayList) term7242).add((Object)null);
        Object term7240 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term7241 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7241, term7241.getClass(), "extendsBound", null);
        setField(term7241, term7241.getClass(), "superBound", null);
        setField(term7240, term7240.getClass(), "wildcard", term7241);
        setField(term7240, term7240.getClass(), "generic", term7242);
        setField(term7240, term7240.getClass(), "qualified", "");
        setField(term7240, term7240.getClass(), "dimension", "");
        ArrayList term7214 = new ArrayList();
        ((ArrayList) term7214).add(term7216);
        ((ArrayList) term7214).add(term7223);
        ((ArrayList) term7214).add(term7224);
        ((ArrayList) term7214).add(term7225);
        ((ArrayList) term7214).add(term7232);
        ((ArrayList) term7214).add(term7225);
        ((ArrayList) term7214).add(term7239);
        ((ArrayList) term7214).add(term7240);
        ArrayList term7249 = new ArrayList();
        ((ArrayList) term7249).add(term7224);
        term7213 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term7213, term7213.getClass(), "extendsBound", term7214);
        setField(term7213, term7213.getClass(), "superBound", term7249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Wildcard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtendsBound", argTypes, term7213, args);
    }

};


