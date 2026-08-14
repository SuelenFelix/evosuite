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

public class HttpClientResponseBuilder_doReturn_13030202355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13681;
     Object term13704;

    public HttpClientResponseBuilder_doReturn_13030202355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13685 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13685, term13685.getClass(), "size", 853609788);
        setField(term13685, term13685.getClass(), "first", null);
        setField(term13685, term13685.getClass(), "last", null);
        setIntField(term13685, term13685.getClass(), "modCount", -197820800);
        Object term13688 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term13688, term13688.getClass(), "size", 723812297);
        setField(term13688, term13688.getClass(), "first", null);
        setField(term13688, term13688.getClass(), "last", null);
        setIntField(term13688, term13688.getClass(), "modCount", 1639448749);
        ArrayDeque term13683 = new ArrayDeque();
        ((ArrayDeque) term13683).add(term13685);
        ((ArrayDeque) term13683).add(term13688);
        ArrayList term13693 = new ArrayList();
        HashMap term13699 = new HashMap();
        term13681 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term13682 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term13697 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term13698 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term13682, term13682.getClass(), "actionBundles", term13683);
        setField(term13682, term13682.getClass(), "conditions", term13693);
        setField(term13698, term13698.getClass(), "matchers", term13699);
        setField(term13697, term13697.getClass(), "parameterConditions", term13698);
        setField(term13697, term13697.getClass(), "referenceCondition", null);
        setField(term13697, term13697.getClass(), "hostCondition", null);
        setField(term13697, term13697.getClass(), "pathCondition", null);
        setField(term13697, term13697.getClass(), "portCondition", null);
        setField(term13697, term13697.getClass(), "schemaCondition", null);
        setField(term13682, term13682.getClass(), "urlConditions", term13697);
        setField(term13681, term13681.getClass(), "ruleBuilder", term13682);
        term13704 = new Integer(873659088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13704;
        args[1] = "dEnhdmILtU";
        callMethod(klass, "doReturn", argTypes, term13681, args);
    }

};


