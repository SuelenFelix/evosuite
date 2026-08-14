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

public class HttpClientVerifyBuilder_called_99182394515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19959;

    public HttpClientVerifyBuilder_called_99182394515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19963 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19963, term19963.getClass(), "size", -675283917);
        setField(term19963, term19963.getClass(), "first", null);
        setField(term19963, term19963.getClass(), "last", null);
        setIntField(term19963, term19963.getClass(), "modCount", -2093862988);
        Object term19966 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19966, term19966.getClass(), "size", 1337828646);
        setField(term19966, term19966.getClass(), "first", null);
        setField(term19966, term19966.getClass(), "last", null);
        setIntField(term19966, term19966.getClass(), "modCount", 532666604);
        Object term19969 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19969, term19969.getClass(), "size", -13725716);
        setField(term19969, term19969.getClass(), "first", null);
        setField(term19969, term19969.getClass(), "last", null);
        setIntField(term19969, term19969.getClass(), "modCount", -1695750603);
        Object term19972 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19972, term19972.getClass(), "size", 63677360);
        setField(term19972, term19972.getClass(), "first", null);
        setField(term19972, term19972.getClass(), "last", null);
        setIntField(term19972, term19972.getClass(), "modCount", 1478914037);
        Object term19975 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19975, term19975.getClass(), "size", 1630231519);
        setField(term19975, term19975.getClass(), "first", null);
        setField(term19975, term19975.getClass(), "last", null);
        setIntField(term19975, term19975.getClass(), "modCount", 1460702778);
        Object term19978 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19978, term19978.getClass(), "size", -1398142433);
        setField(term19978, term19978.getClass(), "first", null);
        setField(term19978, term19978.getClass(), "last", null);
        setIntField(term19978, term19978.getClass(), "modCount", -1112119058);
        Object term19981 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19981, term19981.getClass(), "size", 2073858334);
        setField(term19981, term19981.getClass(), "first", null);
        setField(term19981, term19981.getClass(), "last", null);
        setIntField(term19981, term19981.getClass(), "modCount", -1693535639);
        Object term19984 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19984, term19984.getClass(), "size", 1344744036);
        setField(term19984, term19984.getClass(), "first", null);
        setField(term19984, term19984.getClass(), "last", null);
        setIntField(term19984, term19984.getClass(), "modCount", -98060427);
        Object term19987 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term19987, term19987.getClass(), "size", -1272268399);
        setField(term19987, term19987.getClass(), "first", null);
        setField(term19987, term19987.getClass(), "last", null);
        setIntField(term19987, term19987.getClass(), "modCount", 1120271104);
        ArrayDeque term19961 = new ArrayDeque();
        ((ArrayDeque) term19961).add(term19963);
        ((ArrayDeque) term19961).add(term19966);
        ((ArrayDeque) term19961).add(term19969);
        ((ArrayDeque) term19961).add(term19972);
        ((ArrayDeque) term19961).add(term19975);
        ((ArrayDeque) term19961).add(term19978);
        ((ArrayDeque) term19961).add(term19981);
        ((ArrayDeque) term19961).add(term19984);
        ((ArrayDeque) term19961).add(term19987);
        ArrayList term19992 = new ArrayList();
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        ((ArrayList) term19992).add((Object)null);
        HashMap term19998 = new HashMap();
        ArrayList term20003 = new ArrayList();
        ((ArrayList) term20003).add((Object)null);
        ((ArrayList) term20003).add((Object)null);
        ((ArrayList) term20003).add((Object)null);
        term19959 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        Object term19960 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term19996 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term19997 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term19960, term19960.getClass(), "actionBundles", term19961);
        setField(term19960, term19960.getClass(), "conditions", term19992);
        setField(term19997, term19997.getClass(), "matchers", term19998);
        setField(term19996, term19996.getClass(), "parameterConditions", term19997);
        setField(term19996, term19996.getClass(), "referenceCondition", null);
        setField(term19996, term19996.getClass(), "hostCondition", null);
        setField(term19996, term19996.getClass(), "pathCondition", null);
        setField(term19996, term19996.getClass(), "portCondition", null);
        setField(term19996, term19996.getClass(), "schemaCondition", null);
        setField(term19960, term19960.getClass(), "urlConditions", term19996);
        setField(term19959, term19959.getClass(), "ruleBuilder", term19960);
        setField(term19959, term19959.getClass(), "requests", term20003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "called", argTypes, term19959, args);
    }

};


