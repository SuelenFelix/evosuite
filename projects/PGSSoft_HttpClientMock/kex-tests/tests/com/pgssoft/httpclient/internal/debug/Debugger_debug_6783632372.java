package com.pgssoft.httpclient.internal.debug;

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
import static com.pgssoft.httpclient.internal.debug.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Debugger_debug_6783632372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Debugger_debug_6783632372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        ArrayList term8 = new ArrayList();
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        LinkedList term12 = new LinkedList();
        Object term5 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term6 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term7 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term7, term7.getClass(), "matchers", null);
        setField(term6, term6.getClass(), "parameterConditions", term7);
        setField(term6, term6.getClass(), "referenceCondition", null);
        setField(term6, term6.getClass(), "hostCondition", null);
        setField(term6, term6.getClass(), "pathCondition", null);
        setField(term6, term6.getClass(), "portCondition", null);
        setField(term6, term6.getClass(), "schemaCondition", null);
        setField(term5, term5.getClass(), "urlConditions", term6);
        setField(term5, term5.getClass(), "conditions", term8);
        setField(term5, term5.getClass(), "actionBundles", term12);
        ArrayList term18 = new ArrayList();
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        LinkedList term21 = new LinkedList();
        ((LinkedList) term21).add((Object)null);
        ((LinkedList) term21).add((Object)null);
        ((LinkedList) term21).add((Object)null);
        ((LinkedList) term21).add((Object)null);
        ((LinkedList) term21).add((Object)null);
        Object term16 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        Object term17 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        setField(term17, term17.getClass(), "parameterConditions", null);
        setField(term17, term17.getClass(), "referenceCondition", null);
        setField(term17, term17.getClass(), "hostCondition", null);
        setField(term17, term17.getClass(), "pathCondition", null);
        setField(term17, term17.getClass(), "portCondition", null);
        setField(term17, term17.getClass(), "schemaCondition", null);
        setField(term16, term16.getClass(), "urlConditions", term17);
        setField(term16, term16.getClass(), "conditions", term18);
        setField(term16, term16.getClass(), "actionBundles", term21);
        Object term25 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        setField(term25, term25.getClass(), "urlConditions", null);
        setField(term25, term25.getClass(), "conditions", null);
        setField(term25, term25.getClass(), "actionBundles", null);
        term2 = new LinkedList();
        ((LinkedList) term2).add(term5);
        ((LinkedList) term2).add(term16);
        ((LinkedList) term2).add(term25);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = null;
        callMethod(klass, "debug", argTypes, term1, args);
    }

};


