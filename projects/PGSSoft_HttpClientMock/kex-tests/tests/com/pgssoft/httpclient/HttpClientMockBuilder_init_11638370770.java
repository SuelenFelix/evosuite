package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpClientMockBuilder_init_11638370770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4862;

    public HttpClientMockBuilder_init_11638370770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4865 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term4867 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term4868 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term4865, term4865.getClass(), "size", 1162663216);
        setField(term4867, term4867.getClass(), "item", null);
        setField(term4867, term4867.getClass(), "next", null);
        setField(term4867, term4867.getClass(), "prev", null);
        setField(term4865, term4865.getClass(), "first", term4867);
        setField(term4868, term4868.getClass(), "item", null);
        setField(term4868, term4868.getClass(), "next", null);
        setField(term4868, term4868.getClass(), "prev", null);
        setField(term4865, term4865.getClass(), "last", term4868);
        setIntField(term4865, term4865.getClass(), "modCount", 1484323161);
        Object term4870 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term4872 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term4870, term4870.getClass(), "size", 391863371);
        setField(term4872, term4872.getClass(), "item", null);
        setField(term4872, term4872.getClass(), "next", null);
        setField(term4872, term4872.getClass(), "prev", term4868);
        setField(term4870, term4870.getClass(), "first", term4872);
        setField(term4870, term4870.getClass(), "last", term4872);
        setIntField(term4870, term4870.getClass(), "modCount", -1922583790);
        ArrayDeque term4863 = new ArrayDeque();
        ((ArrayDeque) term4863).add(term4865);
        ((ArrayDeque) term4863).add(term4870);
        ArrayList term4876 = new ArrayList();
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        ((ArrayList) term4876).add((Object)null);
        HashMap term4882 = new HashMap();
        term4862 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term4880 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term4881 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term4862, term4862.getClass(), "actionBundles", term4863);
        setField(term4862, term4862.getClass(), "conditions", term4876);
        setField(term4881, term4881.getClass(), "matchers", term4882);
        setField(term4880, term4880.getClass(), "parameterConditions", term4881);
        setField(term4880, term4880.getClass(), "referenceCondition", null);
        setField(term4880, term4880.getClass(), "hostCondition", null);
        setField(term4880, term4880.getClass(), "pathCondition", null);
        setField(term4880, term4880.getClass(), "portCondition", null);
        setField(term4880, term4880.getClass(), "schemaCondition", null);
        setField(term4862, term4862.getClass(), "urlConditions", term4880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Object[] args = new Object[1];
        args[0] = term4862;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


