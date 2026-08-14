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

public class Rule_matches_13134544131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public Rule_matches_13134544131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term419 = new HashMap();
        ArrayList term424 = new ArrayList();
        ((ArrayList) term424).add((Object)null);
        ((ArrayList) term424).add((Object)null);
        Object term431 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term433 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term434 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term431, term431.getClass(), "size", 1225272962);
        setField(term433, term433.getClass(), "item", null);
        setField(term433, term433.getClass(), "next", null);
        setField(term433, term433.getClass(), "prev", null);
        setField(term431, term431.getClass(), "first", term433);
        setField(term434, term434.getClass(), "item", null);
        setField(term434, term434.getClass(), "next", null);
        setField(term434, term434.getClass(), "prev", null);
        setField(term431, term431.getClass(), "last", term434);
        setIntField(term431, term431.getClass(), "modCount", 1324040357);
        Object term437 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term437, term437.getClass(), "size", -1588772968);
        setField(term437, term437.getClass(), "first", null);
        setField(term437, term437.getClass(), "last", null);
        setIntField(term437, term437.getClass(), "modCount", -93135961);
        LinkedList term428 = new LinkedList();
        ((LinkedList) term428).add(term431);
        ((LinkedList) term428).add(term437);
        ((LinkedList) term428).add((Object)null);
        ((LinkedList) term428).add((Object)null);
        ((LinkedList) term428).add((Object)null);
        ((LinkedList) term428).add((Object)null);
        ((LinkedList) term428).add((Object)null);
        ((LinkedList) term428).add((Object)null);
        term416 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term417 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term418 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term418, term418.getClass(), "matchers", term419);
        setField(term417, term417.getClass(), "parameterConditions", term418);
        setField(term417, term417.getClass(), "referenceCondition", null);
        setField(term417, term417.getClass(), "hostCondition", null);
        setField(term417, term417.getClass(), "pathCondition", null);
        setField(term417, term417.getClass(), "portCondition", null);
        setField(term417, term417.getClass(), "schemaCondition", null);
        setField(term416, term416.getClass(), "urlConditions", term417);
        setField(term416, term416.getClass(), "conditions", term424);
        setField(term416, term416.getClass(), "actionBundles", term428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matches", argTypes, term416, args);
    }

};


