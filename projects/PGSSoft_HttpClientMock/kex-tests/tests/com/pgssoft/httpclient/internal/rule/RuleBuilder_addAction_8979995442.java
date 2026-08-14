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

public class RuleBuilder_addAction_8979995442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;

    public RuleBuilder_addAction_8979995442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term94 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term95 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term92, term92.getClass(), "size", 568599855);
        setField(term94, term94.getClass(), "item", null);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "prev", null);
        setField(term92, term92.getClass(), "first", term94);
        setField(term95, term95.getClass(), "item", null);
        setField(term95, term95.getClass(), "next", null);
        setField(term95, term95.getClass(), "prev", null);
        setField(term92, term92.getClass(), "last", term95);
        setIntField(term92, term92.getClass(), "modCount", 1162663216);
        Object term97 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term99 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term97, term97.getClass(), "size", 1484323161);
        setField(term99, term99.getClass(), "item", null);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "prev", term95);
        setField(term97, term97.getClass(), "first", term99);
        setField(term97, term97.getClass(), "last", term99);
        setIntField(term97, term97.getClass(), "modCount", 391863371);
        Object term101 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term103 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term101, term101.getClass(), "size", -1922583790);
        setField(term103, term103.getClass(), "item", null);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "prev", term94);
        setField(term101, term101.getClass(), "first", term103);
        setField(term101, term101.getClass(), "last", term95);
        setIntField(term101, term101.getClass(), "modCount", -616727354);
        Object term105 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term107 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term105, term105.getClass(), "size", -1955890973);
        setField(term105, term105.getClass(), "first", term99);
        setField(term107, term107.getClass(), "item", null);
        setField(term107, term107.getClass(), "next", null);
        setField(term107, term107.getClass(), "prev", null);
        setField(term105, term105.getClass(), "last", term107);
        setIntField(term105, term105.getClass(), "modCount", -2038273078);
        Object term109 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term111 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term109, term109.getClass(), "size", 1227103734);
        setField(term111, term111.getClass(), "item", null);
        setField(term111, term111.getClass(), "next", null);
        setField(term111, term111.getClass(), "prev", null);
        setField(term109, term109.getClass(), "first", term111);
        setField(term109, term109.getClass(), "last", term103);
        setIntField(term109, term109.getClass(), "modCount", -1339778481);
        ArrayDeque term90 = new ArrayDeque();
        ((ArrayDeque) term90).add(term92);
        ((ArrayDeque) term90).add(term97);
        ((ArrayDeque) term90).add(term101);
        ((ArrayDeque) term90).add(term105);
        ((ArrayDeque) term90).add(term109);
        ArrayList term115 = new ArrayList();
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        HashMap term121 = new HashMap();
        term89 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term119 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term120 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term89, term89.getClass(), "actionBundles", term90);
        setField(term89, term89.getClass(), "conditions", term115);
        setField(term120, term120.getClass(), "matchers", term121);
        setField(term119, term119.getClass(), "parameterConditions", term120);
        setField(term119, term119.getClass(), "referenceCondition", null);
        setField(term119, term119.getClass(), "hostCondition", null);
        setField(term119, term119.getClass(), "pathCondition", null);
        setField(term119, term119.getClass(), "portCondition", null);
        setField(term119, term119.getClass(), "schemaCondition", null);
        setField(term89, term89.getClass(), "urlConditions", term119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Action");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAction", argTypes, term89, args);
    }

};


