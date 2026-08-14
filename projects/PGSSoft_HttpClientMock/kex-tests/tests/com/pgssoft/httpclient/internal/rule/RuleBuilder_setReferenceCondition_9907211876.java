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

public class RuleBuilder_setReferenceCondition_9907211876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public RuleBuilder_setReferenceCondition_9907211876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term226 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term228 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term229 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term226, term226.getClass(), "size", -2068769794);
        setField(term228, term228.getClass(), "item", null);
        setField(term228, term228.getClass(), "next", null);
        setField(term228, term228.getClass(), "prev", null);
        setField(term226, term226.getClass(), "first", term228);
        setField(term229, term229.getClass(), "item", null);
        setField(term229, term229.getClass(), "next", null);
        setField(term229, term229.getClass(), "prev", null);
        setField(term226, term226.getClass(), "last", term229);
        setIntField(term226, term226.getClass(), "modCount", -117576464);
        Object term231 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term233 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term231, term231.getClass(), "size", -1007160944);
        setField(term233, term233.getClass(), "item", null);
        setField(term233, term233.getClass(), "next", null);
        setField(term233, term233.getClass(), "prev", term229);
        setField(term231, term231.getClass(), "first", term233);
        setField(term231, term231.getClass(), "last", term233);
        setIntField(term231, term231.getClass(), "modCount", 1135664017);
        Object term235 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term237 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term235, term235.getClass(), "size", 590364439);
        setField(term237, term237.getClass(), "item", null);
        setField(term237, term237.getClass(), "next", null);
        setField(term237, term237.getClass(), "prev", term228);
        setField(term235, term235.getClass(), "first", term237);
        setField(term235, term235.getClass(), "last", term229);
        setIntField(term235, term235.getClass(), "modCount", 865208305);
        Object term239 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term241 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term239, term239.getClass(), "size", -1275173084);
        setField(term239, term239.getClass(), "first", term233);
        setField(term241, term241.getClass(), "item", null);
        setField(term241, term241.getClass(), "next", null);
        setField(term241, term241.getClass(), "prev", null);
        setField(term239, term239.getClass(), "last", term241);
        setIntField(term239, term239.getClass(), "modCount", -244121226);
        Object term243 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term245 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term243, term243.getClass(), "size", -203030934);
        setField(term245, term245.getClass(), "item", null);
        setField(term245, term245.getClass(), "next", null);
        setField(term245, term245.getClass(), "prev", null);
        setField(term243, term243.getClass(), "first", term245);
        setField(term243, term243.getClass(), "last", term237);
        setIntField(term243, term243.getClass(), "modCount", -1179120542);
        Object term247 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term247, term247.getClass(), "size", -73683645);
        setField(term247, term247.getClass(), "first", term233);
        setField(term247, term247.getClass(), "last", term229);
        setIntField(term247, term247.getClass(), "modCount", -226514366);
        Object term250 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term252 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term250, term250.getClass(), "size", 1193880199);
        setField(term250, term250.getClass(), "first", term229);
        setField(term252, term252.getClass(), "item", null);
        setField(term252, term252.getClass(), "next", term237);
        setField(term252, term252.getClass(), "prev", term241);
        setField(term250, term250.getClass(), "last", term252);
        setIntField(term250, term250.getClass(), "modCount", -1087774327);
        ArrayDeque term224 = new ArrayDeque();
        ((ArrayDeque) term224).add(term226);
        ((ArrayDeque) term224).add(term231);
        ((ArrayDeque) term224).add(term235);
        ((ArrayDeque) term224).add(term239);
        ((ArrayDeque) term224).add(term243);
        ((ArrayDeque) term224).add(term247);
        ((ArrayDeque) term224).add(term250);
        ArrayList term256 = new ArrayList();
        ((ArrayList) term256).add((Object)null);
        HashMap term262 = new HashMap();
        term223 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term260 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term261 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term223, term223.getClass(), "actionBundles", term224);
        setField(term223, term223.getClass(), "conditions", term256);
        setField(term261, term261.getClass(), "matchers", term262);
        setField(term260, term260.getClass(), "parameterConditions", term261);
        setField(term260, term260.getClass(), "referenceCondition", null);
        setField(term260, term260.getClass(), "hostCondition", null);
        setField(term260, term260.getClass(), "pathCondition", null);
        setField(term260, term260.getClass(), "portCondition", null);
        setField(term260, term260.getClass(), "schemaCondition", null);
        setField(term223, term223.getClass(), "urlConditions", term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setReferenceCondition", argTypes, term223, args);
    }

};


