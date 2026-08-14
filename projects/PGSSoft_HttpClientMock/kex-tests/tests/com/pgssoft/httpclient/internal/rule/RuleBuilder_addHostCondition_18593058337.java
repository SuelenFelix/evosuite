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

public class RuleBuilder_addHostCondition_18593058337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public RuleBuilder_addHostCondition_18593058337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term272 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term273 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term270, term270.getClass(), "size", -1530420153);
        setField(term272, term272.getClass(), "item", null);
        setField(term272, term272.getClass(), "next", null);
        setField(term272, term272.getClass(), "prev", null);
        setField(term270, term270.getClass(), "first", term272);
        setField(term273, term273.getClass(), "item", null);
        setField(term273, term273.getClass(), "next", null);
        setField(term273, term273.getClass(), "prev", null);
        setField(term270, term270.getClass(), "last", term273);
        setIntField(term270, term270.getClass(), "modCount", -469968304);
        Object term275 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term277 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term275, term275.getClass(), "size", -1145578966);
        setField(term277, term277.getClass(), "item", null);
        setField(term277, term277.getClass(), "next", null);
        setField(term277, term277.getClass(), "prev", term273);
        setField(term275, term275.getClass(), "first", term277);
        setField(term275, term275.getClass(), "last", term277);
        setIntField(term275, term275.getClass(), "modCount", 679763016);
        Object term279 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term281 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term279, term279.getClass(), "size", 1962444399);
        setField(term281, term281.getClass(), "item", null);
        setField(term281, term281.getClass(), "next", null);
        setField(term281, term281.getClass(), "prev", term272);
        setField(term279, term279.getClass(), "first", term281);
        setField(term279, term279.getClass(), "last", term273);
        setIntField(term279, term279.getClass(), "modCount", 767834723);
        Object term283 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term285 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term283, term283.getClass(), "size", -602026508);
        setField(term283, term283.getClass(), "first", term277);
        setField(term285, term285.getClass(), "item", null);
        setField(term285, term285.getClass(), "next", null);
        setField(term285, term285.getClass(), "prev", null);
        setField(term283, term283.getClass(), "last", term285);
        setIntField(term283, term283.getClass(), "modCount", -157887805);
        Object term287 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term289 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term287, term287.getClass(), "size", 1876565163);
        setField(term289, term289.getClass(), "item", null);
        setField(term289, term289.getClass(), "next", null);
        setField(term289, term289.getClass(), "prev", null);
        setField(term287, term287.getClass(), "first", term289);
        setField(term287, term287.getClass(), "last", term281);
        setIntField(term287, term287.getClass(), "modCount", -817164822);
        Object term291 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term291, term291.getClass(), "size", -1016503459);
        setField(term291, term291.getClass(), "first", term277);
        setField(term291, term291.getClass(), "last", term273);
        setIntField(term291, term291.getClass(), "modCount", -1968847291);
        ArrayDeque term268 = new ArrayDeque();
        ((ArrayDeque) term268).add(term270);
        ((ArrayDeque) term268).add(term275);
        ((ArrayDeque) term268).add(term279);
        ((ArrayDeque) term268).add(term283);
        ((ArrayDeque) term268).add(term287);
        ((ArrayDeque) term268).add(term291);
        ArrayList term296 = new ArrayList();
        ((ArrayList) term296).add((Object)null);
        ((ArrayList) term296).add((Object)null);
        ((ArrayList) term296).add((Object)null);
        ((ArrayList) term296).add((Object)null);
        ((ArrayList) term296).add((Object)null);
        HashMap term302 = new HashMap();
        term267 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term300 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term301 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term267, term267.getClass(), "actionBundles", term268);
        setField(term267, term267.getClass(), "conditions", term296);
        setField(term301, term301.getClass(), "matchers", term302);
        setField(term300, term300.getClass(), "parameterConditions", term301);
        setField(term300, term300.getClass(), "referenceCondition", null);
        setField(term300, term300.getClass(), "hostCondition", null);
        setField(term300, term300.getClass(), "pathCondition", null);
        setField(term300, term300.getClass(), "portCondition", null);
        setField(term300, term300.getClass(), "schemaCondition", null);
        setField(term267, term267.getClass(), "urlConditions", term300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "addHostCondition", argTypes, term267, args);
    }

};


