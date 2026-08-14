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

public class HttpClientMockBuilder_withBody_12514879768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5346;

    public HttpClientMockBuilder_withBody_12514879768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5350 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5350, term5350.getClass(), "size", -1476117762);
        setField(term5350, term5350.getClass(), "first", null);
        setField(term5350, term5350.getClass(), "last", null);
        setIntField(term5350, term5350.getClass(), "modCount", -341962980);
        Object term5353 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5353, term5353.getClass(), "size", 1532716628);
        setField(term5353, term5353.getClass(), "first", null);
        setField(term5353, term5353.getClass(), "last", null);
        setIntField(term5353, term5353.getClass(), "modCount", -1801760683);
        Object term5356 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5356, term5356.getClass(), "size", 1141317871);
        setField(term5356, term5356.getClass(), "first", null);
        setField(term5356, term5356.getClass(), "last", null);
        setIntField(term5356, term5356.getClass(), "modCount", 890669485);
        Object term5359 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5359, term5359.getClass(), "size", 691577392);
        setField(term5359, term5359.getClass(), "first", null);
        setField(term5359, term5359.getClass(), "last", null);
        setIntField(term5359, term5359.getClass(), "modCount", -893623680);
        Object term5362 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5362, term5362.getClass(), "size", -1963434938);
        setField(term5362, term5362.getClass(), "first", null);
        setField(term5362, term5362.getClass(), "last", null);
        setIntField(term5362, term5362.getClass(), "modCount", 906181092);
        Object term5365 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5365, term5365.getClass(), "size", 1045657203);
        setField(term5365, term5365.getClass(), "first", null);
        setField(term5365, term5365.getClass(), "last", null);
        setIntField(term5365, term5365.getClass(), "modCount", 1386130016);
        Object term5368 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5368, term5368.getClass(), "size", 1072005683);
        setField(term5368, term5368.getClass(), "first", null);
        setField(term5368, term5368.getClass(), "last", null);
        setIntField(term5368, term5368.getClass(), "modCount", 1861318859);
        Object term5371 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term5371, term5371.getClass(), "size", 1474524152);
        setField(term5371, term5371.getClass(), "first", null);
        setField(term5371, term5371.getClass(), "last", null);
        setIntField(term5371, term5371.getClass(), "modCount", 568954359);
        ArrayDeque term5348 = new ArrayDeque();
        ((ArrayDeque) term5348).add(term5350);
        ((ArrayDeque) term5348).add(term5353);
        ((ArrayDeque) term5348).add(term5356);
        ((ArrayDeque) term5348).add(term5359);
        ((ArrayDeque) term5348).add(term5362);
        ((ArrayDeque) term5348).add(term5365);
        ((ArrayDeque) term5348).add(term5368);
        ((ArrayDeque) term5348).add(term5371);
        ArrayList term5376 = new ArrayList();
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        ((ArrayList) term5376).add((Object)null);
        HashMap term5382 = new HashMap();
        ArrayDeque term5389 = new ArrayDeque();
        ((ArrayDeque) term5389).add((Object)null);
        ((ArrayDeque) term5389).add((Object)null);
        ((ArrayDeque) term5389).add((Object)null);
        ((ArrayDeque) term5389).add(term5356);
        ((ArrayDeque) term5389).add(term5368);
        ((ArrayDeque) term5389).add(term5365);
        ((ArrayDeque) term5389).add(term5353);
        ArrayList term5393 = new ArrayList();
        ((ArrayList) term5393).add((Object)null);
        ((ArrayList) term5393).add((Object)null);
        ((ArrayList) term5393).add((Object)null);
        term5346 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder"));
        Object term5347 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5380 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5381 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        Object term5387 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term5388 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term5397 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5398 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5347, term5347.getClass(), "actionBundles", term5348);
        setField(term5347, term5347.getClass(), "conditions", term5376);
        setField(term5381, term5381.getClass(), "matchers", term5382);
        setField(term5380, term5380.getClass(), "parameterConditions", term5381);
        setField(term5380, term5380.getClass(), "referenceCondition", null);
        setField(term5380, term5380.getClass(), "hostCondition", null);
        setField(term5380, term5380.getClass(), "pathCondition", null);
        setField(term5380, term5380.getClass(), "portCondition", null);
        setField(term5380, term5380.getClass(), "schemaCondition", null);
        setField(term5347, term5347.getClass(), "urlConditions", term5380);
        setField(term5346, term5346.getClass(), "ruleBuilder", term5347);
        setField(term5388, term5388.getClass(), "actionBundles", term5389);
        setField(term5388, term5388.getClass(), "conditions", term5393);
        setField(term5398, term5398.getClass(), "matchers", null);
        setField(term5397, term5397.getClass(), "parameterConditions", term5398);
        setField(term5397, term5397.getClass(), "referenceCondition", null);
        setField(term5397, term5397.getClass(), "hostCondition", null);
        setField(term5397, term5397.getClass(), "pathCondition", null);
        setField(term5397, term5397.getClass(), "portCondition", null);
        setField(term5397, term5397.getClass(), "schemaCondition", null);
        setField(term5388, term5388.getClass(), "urlConditions", term5397);
        setField(term5387, term5387.getClass(), "ruleBuilder", term5388);
        setField(term5346, term5346.getClass(), "responseBuilder", term5387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMockBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withBody", argTypes, term5346, args);
    }

};


