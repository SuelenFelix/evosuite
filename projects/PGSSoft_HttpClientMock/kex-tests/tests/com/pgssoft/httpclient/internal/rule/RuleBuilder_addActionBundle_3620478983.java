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

public class RuleBuilder_addActionBundle_3620478983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public RuleBuilder_addActionBundle_3620478983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term131 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term132 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term129, term129.getClass(), "size", 1725571209);
        setField(term131, term131.getClass(), "item", null);
        setField(term131, term131.getClass(), "next", null);
        setField(term131, term131.getClass(), "prev", null);
        setField(term129, term129.getClass(), "first", term131);
        setField(term132, term132.getClass(), "item", null);
        setField(term132, term132.getClass(), "next", null);
        setField(term132, term132.getClass(), "prev", null);
        setField(term129, term129.getClass(), "last", term132);
        setIntField(term129, term129.getClass(), "modCount", -522618178);
        Object term134 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term136 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term134, term134.getClass(), "size", 1134449235);
        setField(term136, term136.getClass(), "item", null);
        setField(term136, term136.getClass(), "next", null);
        setField(term136, term136.getClass(), "prev", term132);
        setField(term134, term134.getClass(), "first", term136);
        setField(term134, term134.getClass(), "last", term136);
        setIntField(term134, term134.getClass(), "modCount", -883034806);
        Object term138 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term140 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term138, term138.getClass(), "size", 1585847225);
        setField(term140, term140.getClass(), "item", null);
        setField(term140, term140.getClass(), "next", null);
        setField(term140, term140.getClass(), "prev", term131);
        setField(term138, term138.getClass(), "first", term140);
        setField(term138, term138.getClass(), "last", term132);
        setIntField(term138, term138.getClass(), "modCount", 597278769);
        ArrayDeque term127 = new ArrayDeque();
        ((ArrayDeque) term127).add(term129);
        ((ArrayDeque) term127).add(term134);
        ((ArrayDeque) term127).add(term138);
        ArrayList term144 = new ArrayList();
        ((ArrayList) term144).add((Object)null);
        ((ArrayList) term144).add((Object)null);
        ((ArrayList) term144).add((Object)null);
        ((ArrayList) term144).add((Object)null);
        HashMap term150 = new HashMap();
        term126 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term148 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term149 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term126, term126.getClass(), "actionBundles", term127);
        setField(term126, term126.getClass(), "conditions", term144);
        setField(term149, term149.getClass(), "matchers", term150);
        setField(term148, term148.getClass(), "parameterConditions", term149);
        setField(term148, term148.getClass(), "referenceCondition", null);
        setField(term148, term148.getClass(), "hostCondition", null);
        setField(term148, term148.getClass(), "pathCondition", null);
        setField(term148, term148.getClass(), "portCondition", null);
        setField(term148, term148.getClass(), "schemaCondition", null);
        setField(term126, term126.getClass(), "urlConditions", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Action");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addActionBundle", argTypes, term126, args);
    }

};


