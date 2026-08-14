package com.pgssoft.httpclient.internal.rule;

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
import static com.pgssoft.httpclient.internal.rule.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class RuleBuilder_build_7663225069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public RuleBuilder_build_7663225069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term371 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term372 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term369, term369.getClass(), "size", 493620644);
        setField(term371, term371.getClass(), "item", null);
        setField(term371, term371.getClass(), "next", null);
        setField(term371, term371.getClass(), "prev", null);
        setField(term369, term369.getClass(), "first", term371);
        setField(term372, term372.getClass(), "item", null);
        setField(term372, term372.getClass(), "next", null);
        setField(term372, term372.getClass(), "prev", null);
        setField(term369, term369.getClass(), "last", term372);
        setIntField(term369, term369.getClass(), "modCount", 1328271830);
        Object term374 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term376 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term374, term374.getClass(), "size", 1596070772);
        setField(term376, term376.getClass(), "item", null);
        setField(term376, term376.getClass(), "next", null);
        setField(term376, term376.getClass(), "prev", term372);
        setField(term374, term374.getClass(), "first", term376);
        setField(term374, term374.getClass(), "last", term376);
        setIntField(term374, term374.getClass(), "modCount", 97029295);
        Object term378 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term380 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term378, term378.getClass(), "size", -1371869594);
        setField(term380, term380.getClass(), "item", null);
        setField(term380, term380.getClass(), "next", null);
        setField(term380, term380.getClass(), "prev", term371);
        setField(term378, term378.getClass(), "first", term380);
        setField(term378, term378.getClass(), "last", term372);
        setIntField(term378, term378.getClass(), "modCount", -2095575670);
        ArrayDeque term367 = new ArrayDeque();
        ((ArrayDeque) term367).add(term369);
        ((ArrayDeque) term367).add(term374);
        ((ArrayDeque) term367).add(term378);
        ArrayList term384 = new ArrayList();
        ((ArrayList) term384).add((Object)null);
        HashMap term390 = new HashMap();
        term366 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term388 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term389 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term366, term366.getClass(), "actionBundles", term367);
        setField(term366, term366.getClass(), "conditions", term384);
        setField(term389, term389.getClass(), "matchers", term390);
        setField(term388, term388.getClass(), "parameterConditions", term389);
        setField(term388, term388.getClass(), "referenceCondition", null);
        setField(term388, term388.getClass(), "hostCondition", null);
        setField(term388, term388.getClass(), "pathCondition", null);
        setField(term388, term388.getClass(), "portCondition", null);
        setField(term388, term388.getClass(), "schemaCondition", null);
        setField(term366, term366.getClass(), "urlConditions", term388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term366, args);
    }

};


