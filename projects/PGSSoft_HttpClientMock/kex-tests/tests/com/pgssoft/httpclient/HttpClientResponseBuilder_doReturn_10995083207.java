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

public class HttpClientResponseBuilder_doReturn_10995083207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13776;
     Object term13793;

    public HttpClientResponseBuilder_doReturn_10995083207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term13778 = new ArrayDeque();
        ArrayList term13782 = new ArrayList();
        ((ArrayList) term13782).add((Object)null);
        ((ArrayList) term13782).add((Object)null);
        HashMap term13788 = new HashMap();
        term13776 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13777 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13786 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13787 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13777, term13777.getClass(), "actionBundles", term13778);
        setField(term13777, term13777.getClass(), "conditions", term13782);
        setField(term13787, term13787.getClass(), "matchers", term13788);
        setField(term13786, term13786.getClass(), "parameterConditions", term13787);
        setField(term13786, term13786.getClass(), "referenceCondition", null);
        setField(term13786, term13786.getClass(), "hostCondition", null);
        setField(term13786, term13786.getClass(), "pathCondition", null);
        setField(term13786, term13786.getClass(), "portCondition", null);
        setField(term13786, term13786.getClass(), "schemaCondition", null);
        setField(term13777, term13777.getClass(), "urlConditions", term13786);
        setField(term13776, term13776.getClass(), "ruleBuilder", term13777);
        term13793 = new Integer(1964967720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[3];
        args[0] = term13793;
        args[1] = "eqJfYWRaEL";
        args[2] = null;
        callMethod(klass, "doReturn", argTypes, term13776, args);
    }

};


