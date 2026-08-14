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
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpClientVerifyBuilder_withReference_12407607033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19426;

    public HttpClientVerifyBuilder_withReference_12407607033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19430 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19430, term19430.getClass(), "size", -497534255);
        setField(term19430, term19430.getClass(), "first", null);
        setField(term19430, term19430.getClass(), "last", null);
        setIntField(term19430, term19430.getClass(), "modCount", 1588942911);
        Object term19433 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19433, term19433.getClass(), "size", -2129828854);
        setField(term19433, term19433.getClass(), "first", null);
        setField(term19433, term19433.getClass(), "last", null);
        setIntField(term19433, term19433.getClass(), "modCount", -47438786);
        Object term19436 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19436, term19436.getClass(), "size", -1955400589);
        setField(term19436, term19436.getClass(), "first", null);
        setField(term19436, term19436.getClass(), "last", null);
        setIntField(term19436, term19436.getClass(), "modCount", 626179200);
        Object term19439 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19439, term19439.getClass(), "size", -511077684);
        setField(term19439, term19439.getClass(), "first", null);
        setField(term19439, term19439.getClass(), "last", null);
        setIntField(term19439, term19439.getClass(), "modCount", -711507760);
        Object term19442 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19442, term19442.getClass(), "size", 1053773809);
        setField(term19442, term19442.getClass(), "first", null);
        setField(term19442, term19442.getClass(), "last", null);
        setIntField(term19442, term19442.getClass(), "modCount", 924127883);
        Object term19445 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19445, term19445.getClass(), "size", -751079123);
        setField(term19445, term19445.getClass(), "first", null);
        setField(term19445, term19445.getClass(), "last", null);
        setIntField(term19445, term19445.getClass(), "modCount", -110837188);
        Object term19448 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19448, term19448.getClass(), "size", -271094506);
        setField(term19448, term19448.getClass(), "first", null);
        setField(term19448, term19448.getClass(), "last", null);
        setIntField(term19448, term19448.getClass(), "modCount", 455632030);
        Object term19451 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19451, term19451.getClass(), "size", -1632929393);
        setField(term19451, term19451.getClass(), "first", null);
        setField(term19451, term19451.getClass(), "last", null);
        setIntField(term19451, term19451.getClass(), "modCount", -431440129);
        Object term19454 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19454, term19454.getClass(), "size", -763576148);
        setField(term19454, term19454.getClass(), "first", null);
        setField(term19454, term19454.getClass(), "last", null);
        setIntField(term19454, term19454.getClass(), "modCount", 1568948514);
        ArrayDeque term19428 = new ArrayDeque();
        ((ArrayDeque) term19428).add(term19430);
        ((ArrayDeque) term19428).add(term19433);
        ((ArrayDeque) term19428).add(term19436);
        ((ArrayDeque) term19428).add(term19439);
        ((ArrayDeque) term19428).add(term19442);
        ((ArrayDeque) term19428).add(term19445);
        ((ArrayDeque) term19428).add(term19448);
        ((ArrayDeque) term19428).add(term19451);
        ((ArrayDeque) term19428).add(term19454);
        ArrayList term19459 = new ArrayList();
        ((ArrayList) term19459).add((Object)null);
        ((ArrayList) term19459).add((Object)null);
        ((ArrayList) term19459).add((Object)null);
        ((ArrayList) term19459).add((Object)null);
        ((ArrayList) term19459).add((Object)null);
        HashMap term19465 = new HashMap();
        ArrayList term19470 = new ArrayList();
        term19426 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19427 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19463 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19464 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19427, term19427.getClass(), "actionBundles", term19428);
        setField(term19427, term19427.getClass(), "conditions", term19459);
        setField(term19464, term19464.getClass(), "matchers", term19465);
        setField(term19463, term19463.getClass(), "parameterConditions", term19464);
        setField(term19463, term19463.getClass(), "referenceCondition", null);
        setField(term19463, term19463.getClass(), "hostCondition", null);
        setField(term19463, term19463.getClass(), "pathCondition", null);
        setField(term19463, term19463.getClass(), "portCondition", null);
        setField(term19463, term19463.getClass(), "schemaCondition", null);
        setField(term19427, term19427.getClass(), "urlConditions", term19463);
        setField(term19426, term19426.getClass(), "ruleBuilder", term19427);
        setField(term19426, term19426.getClass(), "requests", term19470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "withReference", argTypes, term19426, args);
    }

};


