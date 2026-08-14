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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Rule_produceResponse_3042138722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;

    public Rule_produceResponse_3042138722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term456 = new HashMap();
        ArrayList term461 = new ArrayList();
        ((ArrayList) term461).add((Object)null);
        ((ArrayList) term461).add((Object)null);
        ((ArrayList) term461).add((Object)null);
        ((ArrayList) term461).add((Object)null);
        ((ArrayList) term461).add((Object)null);
        ((ArrayList) term461).add((Object)null);
        Object term468 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term470 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term471 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term468, term468.getClass(), "size", 972867650);
        setField(term470, term470.getClass(), "item", null);
        setField(term470, term470.getClass(), "next", null);
        setField(term470, term470.getClass(), "prev", null);
        setField(term468, term468.getClass(), "first", term470);
        setField(term471, term471.getClass(), "item", null);
        setField(term471, term471.getClass(), "next", null);
        setField(term471, term471.getClass(), "prev", null);
        setField(term468, term468.getClass(), "last", term471);
        setIntField(term468, term468.getClass(), "modCount", 1655935355);
        Object term474 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term474, term474.getClass(), "size", -481533957);
        setField(term474, term474.getClass(), "first", null);
        setField(term474, term474.getClass(), "last", null);
        setIntField(term474, term474.getClass(), "modCount", 1240914516);
        LinkedList term465 = new LinkedList();
        ((LinkedList) term465).add(term468);
        ((LinkedList) term465).add(term474);
        term453 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term454 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term455 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term455, term455.getClass(), "matchers", term456);
        setField(term454, term454.getClass(), "parameterConditions", term455);
        setField(term454, term454.getClass(), "referenceCondition", null);
        setField(term454, term454.getClass(), "hostCondition", null);
        setField(term454, term454.getClass(), "pathCondition", null);
        setField(term454, term454.getClass(), "portCondition", null);
        setField(term454, term454.getClass(), "schemaCondition", null);
        setField(term453, term453.getClass(), "urlConditions", term454);
        setField(term453, term453.getClass(), "conditions", term461);
        setField(term453, term453.getClass(), "actionBundles", term465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "produceResponse", argTypes, term453, args);
    }

};


