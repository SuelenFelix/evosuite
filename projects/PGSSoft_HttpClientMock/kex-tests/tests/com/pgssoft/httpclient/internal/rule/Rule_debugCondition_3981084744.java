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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Rule_debugCondition_3981084744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term552;

    public Rule_debugCondition_3981084744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term519 = new HashMap();
        ArrayList term524 = new ArrayList();
        ((ArrayList) term524).add((Object)null);
        ((ArrayList) term524).add((Object)null);
        ((ArrayList) term524).add((Object)null);
        Object term531 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term533 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term534 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term531, term531.getClass(), "size", 683666002);
        setField(term533, term533.getClass(), "item", null);
        setField(term533, term533.getClass(), "next", null);
        setField(term533, term533.getClass(), "prev", null);
        setField(term531, term531.getClass(), "first", term533);
        setField(term534, term534.getClass(), "item", null);
        setField(term534, term534.getClass(), "next", null);
        setField(term534, term534.getClass(), "prev", null);
        setField(term531, term531.getClass(), "last", term534);
        setIntField(term531, term531.getClass(), "modCount", 1596213415);
        Object term537 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        setIntField(term537, term537.getClass(), "size", -268815336);
        setField(term537, term537.getClass(), "first", null);
        setField(term537, term537.getClass(), "last", null);
        setIntField(term537, term537.getClass(), "modCount", -1210583429);
        LinkedList term528 = new LinkedList();
        ((LinkedList) term528).add(term531);
        ((LinkedList) term528).add(term537);
        ((LinkedList) term528).add((Object)null);
        ((LinkedList) term528).add((Object)null);
        ((LinkedList) term528).add((Object)null);
        term516 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term517 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term518 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term518, term518.getClass(), "matchers", term519);
        setField(term517, term517.getClass(), "parameterConditions", term518);
        setField(term517, term517.getClass(), "referenceCondition", null);
        setField(term517, term517.getClass(), "hostCondition", null);
        setField(term517, term517.getClass(), "pathCondition", null);
        setField(term517, term517.getClass(), "portCondition", null);
        setField(term517, term517.getClass(), "schemaCondition", null);
        setField(term516, term516.getClass(), "urlConditions", term517);
        setField(term516, term516.getClass(), "conditions", term524);
        setField(term516, term516.getClass(), "actionBundles", term528);
        term552 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        argTypes[1] = Class.forName("java.net.http.HttpRequest");
        argTypes[2] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term552;
        callMethod(klass, "debugCondition", argTypes, term516, args);
    }

};


