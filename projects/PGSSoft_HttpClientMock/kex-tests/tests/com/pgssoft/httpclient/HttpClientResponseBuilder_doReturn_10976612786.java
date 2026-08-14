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

public class HttpClientResponseBuilder_doReturn_10976612786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13728;

    public HttpClientResponseBuilder_doReturn_10976612786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13732 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13732, term13732.getClass(), "size", -975748721);
        setField(term13732, term13732.getClass(), "first", null);
        setField(term13732, term13732.getClass(), "last", null);
        setIntField(term13732, term13732.getClass(), "modCount", 433248783);
        Object term13735 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13735, term13735.getClass(), "size", -507944154);
        setField(term13735, term13735.getClass(), "first", null);
        setField(term13735, term13735.getClass(), "last", null);
        setIntField(term13735, term13735.getClass(), "modCount", -1736183862);
        Object term13738 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13738, term13738.getClass(), "size", 897010381);
        setField(term13738, term13738.getClass(), "first", null);
        setField(term13738, term13738.getClass(), "last", null);
        setIntField(term13738, term13738.getClass(), "modCount", -15712667);
        ArrayDeque term13730 = new ArrayDeque();
        ((ArrayDeque) term13730).add(term13732);
        ((ArrayDeque) term13730).add(term13735);
        ((ArrayDeque) term13730).add(term13738);
        ArrayList term13743 = new ArrayList();
        HashMap term13749 = new HashMap();
        term13728 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13729 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13747 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13748 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13729, term13729.getClass(), "actionBundles", term13730);
        setField(term13729, term13729.getClass(), "conditions", term13743);
        setField(term13748, term13748.getClass(), "matchers", term13749);
        setField(term13747, term13747.getClass(), "parameterConditions", term13748);
        setField(term13747, term13747.getClass(), "referenceCondition", null);
        setField(term13747, term13747.getClass(), "hostCondition", null);
        setField(term13747, term13747.getClass(), "pathCondition", null);
        setField(term13747, term13747.getClass(), "portCondition", null);
        setField(term13747, term13747.getClass(), "schemaCondition", null);
        setField(term13729, term13729.getClass(), "urlConditions", term13747);
        setField(term13728, term13728.getClass(), "ruleBuilder", term13729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "hoicvmsovO";
        args[1] = null;
        callMethod(klass, "doReturn", argTypes, term13728, args);
    }

};


