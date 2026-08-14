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

public class HttpClientResponseBuilder_doReturnXML_177853053614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17005;

    public HttpClientResponseBuilder_doReturnXML_177853053614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17009 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17009, term17009.getClass(), "size", -1428063820);
        setField(term17009, term17009.getClass(), "first", null);
        setField(term17009, term17009.getClass(), "last", null);
        setIntField(term17009, term17009.getClass(), "modCount", -1271375703);
        Object term17012 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17012, term17012.getClass(), "size", 1136208236);
        setField(term17012, term17012.getClass(), "first", null);
        setField(term17012, term17012.getClass(), "last", null);
        setIntField(term17012, term17012.getClass(), "modCount", -1220630391);
        Object term17015 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17015, term17015.getClass(), "size", -995822131);
        setField(term17015, term17015.getClass(), "first", null);
        setField(term17015, term17015.getClass(), "last", null);
        setIntField(term17015, term17015.getClass(), "modCount", -687282231);
        Object term17018 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17018, term17018.getClass(), "size", 1200440315);
        setField(term17018, term17018.getClass(), "first", null);
        setField(term17018, term17018.getClass(), "last", null);
        setIntField(term17018, term17018.getClass(), "modCount", 40571662);
        Object term17021 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17021, term17021.getClass(), "size", 1863910269);
        setField(term17021, term17021.getClass(), "first", null);
        setField(term17021, term17021.getClass(), "last", null);
        setIntField(term17021, term17021.getClass(), "modCount", 864645689);
        Object term17024 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term17024, term17024.getClass(), "size", 279384872);
        setField(term17024, term17024.getClass(), "first", null);
        setField(term17024, term17024.getClass(), "last", null);
        setIntField(term17024, term17024.getClass(), "modCount", 1427305953);
        ArrayDeque term17007 = new ArrayDeque();
        ((ArrayDeque) term17007).add(term17009);
        ((ArrayDeque) term17007).add(term17012);
        ((ArrayDeque) term17007).add(term17015);
        ((ArrayDeque) term17007).add(term17018);
        ((ArrayDeque) term17007).add(term17021);
        ((ArrayDeque) term17007).add(term17024);
        ArrayList term17029 = new ArrayList();
        ((ArrayList) term17029).add((Object)null);
        ((ArrayList) term17029).add((Object)null);
        ((ArrayList) term17029).add((Object)null);
        ((ArrayList) term17029).add((Object)null);
        HashMap term17035 = new HashMap();
        term17005 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder"));
        Object term17006 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term17033 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term17034 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term17006, term17006.getClass(), "actionBundles", term17007);
        setField(term17006, term17006.getClass(), "conditions", term17029);
        setField(term17034, term17034.getClass(), "matchers", term17035);
        setField(term17033, term17033.getClass(), "parameterConditions", term17034);
        setField(term17033, term17033.getClass(), "referenceCondition", null);
        setField(term17033, term17033.getClass(), "hostCondition", null);
        setField(term17033, term17033.getClass(), "pathCondition", null);
        setField(term17033, term17033.getClass(), "portCondition", null);
        setField(term17033, term17033.getClass(), "schemaCondition", null);
        setField(term17006, term17006.getClass(), "urlConditions", term17033);
        setField(term17005, term17005.getClass(), "ruleBuilder", term17006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "doReturnXML", argTypes, term17005, args);
    }

};


