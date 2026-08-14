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

public class RuleBuilder_setParameterCondition_11026814385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public RuleBuilder_setParameterCondition_11026814385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term181 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term182 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term179, term179.getClass(), "size", 1622346318);
        setField(term181, term181.getClass(), "item", null);
        setField(term181, term181.getClass(), "next", null);
        setField(term181, term181.getClass(), "prev", null);
        setField(term179, term179.getClass(), "first", term181);
        setField(term182, term182.getClass(), "item", null);
        setField(term182, term182.getClass(), "next", null);
        setField(term182, term182.getClass(), "prev", null);
        setField(term179, term179.getClass(), "last", term182);
        setIntField(term179, term179.getClass(), "modCount", 1048535127);
        Object term184 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term186 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term184, term184.getClass(), "size", -655067527);
        setField(term186, term186.getClass(), "item", null);
        setField(term186, term186.getClass(), "next", null);
        setField(term186, term186.getClass(), "prev", term182);
        setField(term184, term184.getClass(), "first", term186);
        setField(term184, term184.getClass(), "last", term186);
        setIntField(term184, term184.getClass(), "modCount", -6029667);
        ArrayDeque term177 = new ArrayDeque();
        ((ArrayDeque) term177).add(term179);
        ((ArrayDeque) term177).add(term184);
        ArrayList term190 = new ArrayList();
        ((ArrayList) term190).add((Object)null);
        ((ArrayList) term190).add((Object)null);
        ((ArrayList) term190).add((Object)null);
        ((ArrayList) term190).add((Object)null);
        ((ArrayList) term190).add((Object)null);
        ((ArrayList) term190).add((Object)null);
        HashMap term196 = new HashMap();
        term176 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term194 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term195 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term176, term176.getClass(), "actionBundles", term177);
        setField(term176, term176.getClass(), "conditions", term190);
        setField(term195, term195.getClass(), "matchers", term196);
        setField(term194, term194.getClass(), "parameterConditions", term195);
        setField(term194, term194.getClass(), "referenceCondition", null);
        setField(term194, term194.getClass(), "hostCondition", null);
        setField(term194, term194.getClass(), "pathCondition", null);
        setField(term194, term194.getClass(), "portCondition", null);
        setField(term194, term194.getClass(), "schemaCondition", null);
        setField(term176, term176.getClass(), "urlConditions", term194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = null;
        callMethod(klass, "setParameterCondition", argTypes, term176, args);
    }

};


