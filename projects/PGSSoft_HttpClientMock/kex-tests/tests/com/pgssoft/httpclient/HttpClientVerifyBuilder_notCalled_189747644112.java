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

public class HttpClientVerifyBuilder_notCalled_189747644112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19843;

    public HttpClientVerifyBuilder_notCalled_189747644112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19847 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19847, term19847.getClass(), "size", -365784998);
        setField(term19847, term19847.getClass(), "first", null);
        setField(term19847, term19847.getClass(), "last", null);
        setIntField(term19847, term19847.getClass(), "modCount", -1893236300);
        Object term19850 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19850, term19850.getClass(), "size", -1858909368);
        setField(term19850, term19850.getClass(), "first", null);
        setField(term19850, term19850.getClass(), "last", null);
        setIntField(term19850, term19850.getClass(), "modCount", -280113263);
        Object term19853 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19853, term19853.getClass(), "size", 529625347);
        setField(term19853, term19853.getClass(), "first", null);
        setField(term19853, term19853.getClass(), "last", null);
        setIntField(term19853, term19853.getClass(), "modCount", 1409095253);
        Object term19856 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19856, term19856.getClass(), "size", 315179039);
        setField(term19856, term19856.getClass(), "first", null);
        setField(term19856, term19856.getClass(), "last", null);
        setIntField(term19856, term19856.getClass(), "modCount", -1835923897);
        Object term19859 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19859, term19859.getClass(), "size", -341287775);
        setField(term19859, term19859.getClass(), "first", null);
        setField(term19859, term19859.getClass(), "last", null);
        setIntField(term19859, term19859.getClass(), "modCount", -1651110911);
        Object term19862 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19862, term19862.getClass(), "size", -1934033808);
        setField(term19862, term19862.getClass(), "first", null);
        setField(term19862, term19862.getClass(), "last", null);
        setIntField(term19862, term19862.getClass(), "modCount", 950322609);
        Object term19865 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19865, term19865.getClass(), "size", -2023791789);
        setField(term19865, term19865.getClass(), "first", null);
        setField(term19865, term19865.getClass(), "last", null);
        setIntField(term19865, term19865.getClass(), "modCount", 353974456);
        Object term19868 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19868, term19868.getClass(), "size", -485108462);
        setField(term19868, term19868.getClass(), "first", null);
        setField(term19868, term19868.getClass(), "last", null);
        setIntField(term19868, term19868.getClass(), "modCount", 1418551216);
        Object term19871 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19871, term19871.getClass(), "size", -626779272);
        setField(term19871, term19871.getClass(), "first", null);
        setField(term19871, term19871.getClass(), "last", null);
        setIntField(term19871, term19871.getClass(), "modCount", -1150062870);
        ArrayDeque term19845 = new ArrayDeque();
        ((ArrayDeque) term19845).add(term19847);
        ((ArrayDeque) term19845).add(term19850);
        ((ArrayDeque) term19845).add(term19853);
        ((ArrayDeque) term19845).add(term19856);
        ((ArrayDeque) term19845).add(term19859);
        ((ArrayDeque) term19845).add(term19862);
        ((ArrayDeque) term19845).add(term19865);
        ((ArrayDeque) term19845).add(term19868);
        ((ArrayDeque) term19845).add(term19871);
        ArrayList term19876 = new ArrayList();
        HashMap term19882 = new HashMap();
        ArrayList term19887 = new ArrayList();
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        ((ArrayList) term19887).add((Object)null);
        term19843 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19844 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19880 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19881 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19844, term19844.getClass(), "actionBundles", term19845);
        setField(term19844, term19844.getClass(), "conditions", term19876);
        setField(term19881, term19881.getClass(), "matchers", term19882);
        setField(term19880, term19880.getClass(), "parameterConditions", term19881);
        setField(term19880, term19880.getClass(), "referenceCondition", null);
        setField(term19880, term19880.getClass(), "hostCondition", null);
        setField(term19880, term19880.getClass(), "pathCondition", null);
        setField(term19880, term19880.getClass(), "portCondition", null);
        setField(term19880, term19880.getClass(), "schemaCondition", null);
        setField(term19844, term19844.getClass(), "urlConditions", term19880);
        setField(term19843, term19843.getClass(), "ruleBuilder", term19844);
        setField(term19843, term19843.getClass(), "requests", term19887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "notCalled", argTypes, term19843, args);
    }

};


