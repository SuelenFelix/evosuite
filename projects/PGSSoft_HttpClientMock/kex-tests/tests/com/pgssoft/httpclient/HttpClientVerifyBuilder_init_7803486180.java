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
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HttpClientVerifyBuilder_init_7803486180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19215;
     Object term19267;

    public HttpClientVerifyBuilder_init_7803486180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19218 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19220 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term19221 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19218, term19218.getClass(), "size", 178847646);
        setField(term19220, term19220.getClass(), "item", null);
        setField(term19220, term19220.getClass(), "next", null);
        setField(term19220, term19220.getClass(), "prev", null);
        setField(term19218, term19218.getClass(), "first", term19220);
        setField(term19221, term19221.getClass(), "item", null);
        setField(term19221, term19221.getClass(), "next", null);
        setField(term19221, term19221.getClass(), "prev", null);
        setField(term19218, term19218.getClass(), "last", term19221);
        setIntField(term19218, term19218.getClass(), "modCount", 273590437);
        Object term19223 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19225 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19223, term19223.getClass(), "size", -348612876);
        setField(term19225, term19225.getClass(), "item", null);
        setField(term19225, term19225.getClass(), "next", null);
        setField(term19225, term19225.getClass(), "prev", term19221);
        setField(term19223, term19223.getClass(), "first", term19225);
        setField(term19223, term19223.getClass(), "last", term19225);
        setIntField(term19223, term19223.getClass(), "modCount", 1302807565);
        Object term19227 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19229 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19227, term19227.getClass(), "size", -838848221);
        setField(term19229, term19229.getClass(), "item", null);
        setField(term19229, term19229.getClass(), "next", null);
        setField(term19229, term19229.getClass(), "prev", term19220);
        setField(term19227, term19227.getClass(), "first", term19229);
        setField(term19227, term19227.getClass(), "last", term19221);
        setIntField(term19227, term19227.getClass(), "modCount", 1163761623);
        Object term19231 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19233 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19231, term19231.getClass(), "size", 718742281);
        setField(term19231, term19231.getClass(), "first", term19225);
        setField(term19233, term19233.getClass(), "item", null);
        setField(term19233, term19233.getClass(), "next", null);
        setField(term19233, term19233.getClass(), "prev", null);
        setField(term19231, term19231.getClass(), "last", term19233);
        setIntField(term19231, term19231.getClass(), "modCount", 1532723756);
        Object term19235 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19237 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19235, term19235.getClass(), "size", -124088550);
        setField(term19237, term19237.getClass(), "item", null);
        setField(term19237, term19237.getClass(), "next", null);
        setField(term19237, term19237.getClass(), "prev", null);
        setField(term19235, term19235.getClass(), "first", term19237);
        setField(term19235, term19235.getClass(), "last", term19229);
        setIntField(term19235, term19235.getClass(), "modCount", 777492093);
        Object term19239 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19239, term19239.getClass(), "size", 1414025609);
        setField(term19239, term19239.getClass(), "first", term19225);
        setField(term19239, term19239.getClass(), "last", term19221);
        setIntField(term19239, term19239.getClass(), "modCount", 255145822);
        Object term19242 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19244 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19242, term19242.getClass(), "size", -573608449);
        setField(term19242, term19242.getClass(), "first", term19221);
        setField(term19244, term19244.getClass(), "item", null);
        setField(term19244, term19244.getClass(), "next", term19229);
        setField(term19244, term19244.getClass(), "prev", term19233);
        setField(term19242, term19242.getClass(), "last", term19244);
        setIntField(term19242, term19242.getClass(), "modCount", -1660057757);
        Object term19246 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19246, term19246.getClass(), "size", 1816273440);
        setField(term19246, term19246.getClass(), "first", term19229);
        setField(term19246, term19246.getClass(), "last", term19229);
        setIntField(term19246, term19246.getClass(), "modCount", -96541009);
        Object term19249 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term19251 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term19252 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term19249, term19249.getClass(), "size", -43719302);
        setField(term19251, term19251.getClass(), "item", null);
        setField(term19251, term19251.getClass(), "next", term19237);
        setField(term19251, term19251.getClass(), "prev", term19251);
        setField(term19249, term19249.getClass(), "first", term19251);
        setField(term19252, term19252.getClass(), "item", null);
        setField(term19252, term19252.getClass(), "next", term19225);
        setField(term19252, term19252.getClass(), "prev", term19225);
        setField(term19249, term19249.getClass(), "last", term19252);
        setIntField(term19249, term19249.getClass(), "modCount", 1024134939);
        ArrayDeque term19216 = new ArrayDeque();
        ((ArrayDeque) term19216).add(term19218);
        ((ArrayDeque) term19216).add(term19223);
        ((ArrayDeque) term19216).add(term19227);
        ((ArrayDeque) term19216).add(term19231);
        ((ArrayDeque) term19216).add(term19235);
        ((ArrayDeque) term19216).add(term19239);
        ((ArrayDeque) term19216).add(term19242);
        ((ArrayDeque) term19216).add(term19246);
        ((ArrayDeque) term19216).add(term19249);
        ArrayList term19256 = new ArrayList();
        ((ArrayList) term19256).add((Object)null);
        ((ArrayList) term19256).add((Object)null);
        HashMap term19262 = new HashMap();
        term19215 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19260 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19261 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19215, term19215.getClass(), "actionBundles", term19216);
        setField(term19215, term19215.getClass(), "conditions", term19256);
        setField(term19261, term19261.getClass(), "matchers", term19262);
        setField(term19260, term19260.getClass(), "parameterConditions", term19261);
        setField(term19260, term19260.getClass(), "referenceCondition", null);
        setField(term19260, term19260.getClass(), "hostCondition", null);
        setField(term19260, term19260.getClass(), "pathCondition", null);
        setField(term19260, term19260.getClass(), "portCondition", null);
        setField(term19260, term19260.getClass(), "schemaCondition", null);
        setField(term19215, term19215.getClass(), "urlConditions", term19260);
        term19267 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term19215;
        args[1] = term19267;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


