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

public class RuleBuilder_addCondition_10424443204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;

    public RuleBuilder_addCondition_10424443204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term158 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term160 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term161 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term158, term158.getClass(), "size", -1685132342);
        setField(term160, term160.getClass(), "item", null);
        setField(term160, term160.getClass(), "next", null);
        setField(term160, term160.getClass(), "prev", null);
        setField(term158, term158.getClass(), "first", term160);
        setField(term161, term161.getClass(), "item", null);
        setField(term161, term161.getClass(), "next", null);
        setField(term161, term161.getClass(), "prev", null);
        setField(term158, term158.getClass(), "last", term161);
        setIntField(term158, term158.getClass(), "modCount", -1456670397);
        ArrayDeque term156 = new ArrayDeque();
        ((ArrayDeque) term156).add(term158);
        ArrayList term165 = new ArrayList();
        ((ArrayList) term165).add((Object)null);
        ((ArrayList) term165).add((Object)null);
        ((ArrayList) term165).add((Object)null);
        ((ArrayList) term165).add((Object)null);
        ((ArrayList) term165).add((Object)null);
        ((ArrayList) term165).add((Object)null);
        HashMap term171 = new HashMap();
        term155 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term169 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term170 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term155, term155.getClass(), "actionBundles", term156);
        setField(term155, term155.getClass(), "conditions", term165);
        setField(term170, term170.getClass(), "matchers", term171);
        setField(term169, term169.getClass(), "parameterConditions", term170);
        setField(term169, term169.getClass(), "referenceCondition", null);
        setField(term169, term169.getClass(), "hostCondition", null);
        setField(term169, term169.getClass(), "pathCondition", null);
        setField(term169, term169.getClass(), "portCondition", null);
        setField(term169, term169.getClass(), "schemaCondition", null);
        setField(term155, term155.getClass(), "urlConditions", term169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCondition", argTypes, term155, args);
    }

};


