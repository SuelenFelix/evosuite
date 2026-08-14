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

public class Rule_debug_13327522953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;
     Object term515;

    public Rule_debug_13327522953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term481 = new HashMap();
        ArrayList term486 = new ArrayList();
        ((ArrayList) term486).add((Object)null);
        Object term493 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term495 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term496 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term493, term493.getClass(), "size", -1465035361);
        setField(term495, term495.getClass(), "item", null);
        setField(term495, term495.getClass(), "next", null);
        setField(term495, term495.getClass(), "prev", null);
        setField(term493, term493.getClass(), "first", term495);
        setField(term496, term496.getClass(), "item", null);
        setField(term496, term496.getClass(), "next", null);
        setField(term496, term496.getClass(), "prev", null);
        setField(term493, term493.getClass(), "last", term496);
        setIntField(term493, term493.getClass(), "modCount", 1090617576);
        Object term499 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term499, term499.getClass(), "size", -1547384488);
        setField(term499, term499.getClass(), "first", null);
        setField(term499, term499.getClass(), "last", null);
        setIntField(term499, term499.getClass(), "modCount", 1442160736);
        LinkedList term490 = new LinkedList();
        ((LinkedList) term490).add(term493);
        ((LinkedList) term490).add(term499);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        ((LinkedList) term490).add((Object)null);
        term478 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term479 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term480 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term480, term480.getClass(), "matchers", term481);
        setField(term479, term479.getClass(), "parameterConditions", term480);
        setField(term479, term479.getClass(), "referenceCondition", null);
        setField(term479, term479.getClass(), "hostCondition", null);
        setField(term479, term479.getClass(), "pathCondition", null);
        setField(term479, term479.getClass(), "portCondition", null);
        setField(term479, term479.getClass(), "schemaCondition", null);
        setField(term478, term478.getClass(), "urlConditions", term479);
        setField(term478, term478.getClass(), "conditions", term486);
        setField(term478, term478.getClass(), "actionBundles", term490);
        term515 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term515;
        callMethod(klass, "debug", argTypes, term478, args);
    }

};


