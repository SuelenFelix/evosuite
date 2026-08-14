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
import java.lang.Integer;

public class HttpClientResponseBuilder_doReturnStatus_2194150269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13820;
     Object term13864;

    public HttpClientResponseBuilder_doReturnStatus_2194150269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13824 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13824, term13824.getClass(), "size", 1351900243);
        setField(term13824, term13824.getClass(), "first", null);
        setField(term13824, term13824.getClass(), "last", null);
        setIntField(term13824, term13824.getClass(), "modCount", -330897705);
        Object term13827 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13827, term13827.getClass(), "size", 1065595802);
        setField(term13827, term13827.getClass(), "first", null);
        setField(term13827, term13827.getClass(), "last", null);
        setIntField(term13827, term13827.getClass(), "modCount", 21031843);
        Object term13830 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13830, term13830.getClass(), "size", -380787857);
        setField(term13830, term13830.getClass(), "first", null);
        setField(term13830, term13830.getClass(), "last", null);
        setIntField(term13830, term13830.getClass(), "modCount", 319853052);
        Object term13833 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13833, term13833.getClass(), "size", -1097563716);
        setField(term13833, term13833.getClass(), "first", null);
        setField(term13833, term13833.getClass(), "last", null);
        setIntField(term13833, term13833.getClass(), "modCount", 1572907769);
        Object term13836 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13836, term13836.getClass(), "size", 1608016787);
        setField(term13836, term13836.getClass(), "first", null);
        setField(term13836, term13836.getClass(), "last", null);
        setIntField(term13836, term13836.getClass(), "modCount", -516303035);
        Object term13839 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13839, term13839.getClass(), "size", -2143043890);
        setField(term13839, term13839.getClass(), "first", null);
        setField(term13839, term13839.getClass(), "last", null);
        setIntField(term13839, term13839.getClass(), "modCount", -2138825831);
        Object term13842 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13842, term13842.getClass(), "size", 1454781562);
        setField(term13842, term13842.getClass(), "first", null);
        setField(term13842, term13842.getClass(), "last", null);
        setIntField(term13842, term13842.getClass(), "modCount", -27944011);
        Object term13845 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13845, term13845.getClass(), "size", -20614472);
        setField(term13845, term13845.getClass(), "first", null);
        setField(term13845, term13845.getClass(), "last", null);
        setIntField(term13845, term13845.getClass(), "modCount", 1126618861);
        Object term13848 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13848, term13848.getClass(), "size", 947449400);
        setField(term13848, term13848.getClass(), "first", null);
        setField(term13848, term13848.getClass(), "last", null);
        setIntField(term13848, term13848.getClass(), "modCount", -763799087);
        ArrayDeque term13822 = new ArrayDeque();
        ((ArrayDeque) term13822).add(term13824);
        ((ArrayDeque) term13822).add(term13827);
        ((ArrayDeque) term13822).add(term13830);
        ((ArrayDeque) term13822).add(term13833);
        ((ArrayDeque) term13822).add(term13836);
        ((ArrayDeque) term13822).add(term13839);
        ((ArrayDeque) term13822).add(term13842);
        ((ArrayDeque) term13822).add(term13845);
        ((ArrayDeque) term13822).add(term13848);
        ArrayList term13853 = new ArrayList();
        ((ArrayList) term13853).add((Object)null);
        ((ArrayList) term13853).add((Object)null);
        ((ArrayList) term13853).add((Object)null);
        ((ArrayList) term13853).add((Object)null);
        ((ArrayList) term13853).add((Object)null);
        ((ArrayList) term13853).add((Object)null);
        HashMap term13859 = new HashMap();
        term13820 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13821 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13857 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13858 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13821, term13821.getClass(), "actionBundles", term13822);
        setField(term13821, term13821.getClass(), "conditions", term13853);
        setField(term13858, term13858.getClass(), "matchers", term13859);
        setField(term13857, term13857.getClass(), "parameterConditions", term13858);
        setField(term13857, term13857.getClass(), "referenceCondition", null);
        setField(term13857, term13857.getClass(), "hostCondition", null);
        setField(term13857, term13857.getClass(), "pathCondition", null);
        setField(term13857, term13857.getClass(), "portCondition", null);
        setField(term13857, term13857.getClass(), "schemaCondition", null);
        setField(term13821, term13821.getClass(), "urlConditions", term13857);
        setField(term13820, term13820.getClass(), "ruleBuilder", term13821);
        term13864 = new Integer(1207142014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13864;
        callMethod(klass, "doReturnStatus", argTypes, term13820, args);
    }

};


