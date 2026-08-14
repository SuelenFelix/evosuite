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

public class RuleBuilder_setPathCondition_6645007358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;

    public RuleBuilder_setPathCondition_6645007358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term332 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term334 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term335 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term332, term332.getClass(), "size", 579005622);
        setField(term334, term334.getClass(), "item", null);
        setField(term334, term334.getClass(), "next", null);
        setField(term334, term334.getClass(), "prev", null);
        setField(term332, term332.getClass(), "first", term334);
        setField(term335, term335.getClass(), "item", null);
        setField(term335, term335.getClass(), "next", null);
        setField(term335, term335.getClass(), "prev", null);
        setField(term332, term332.getClass(), "last", term335);
        setIntField(term332, term332.getClass(), "modCount", -14890619);
        Object term337 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term339 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term337, term337.getClass(), "size", 1632125673);
        setField(term339, term339.getClass(), "item", null);
        setField(term339, term339.getClass(), "next", null);
        setField(term339, term339.getClass(), "prev", term335);
        setField(term337, term337.getClass(), "first", term339);
        setField(term337, term337.getClass(), "last", term339);
        setIntField(term337, term337.getClass(), "modCount", 454281060);
        Object term341 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term343 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term341, term341.getClass(), "size", -1786399638);
        setField(term343, term343.getClass(), "item", null);
        setField(term343, term343.getClass(), "next", null);
        setField(term343, term343.getClass(), "prev", term334);
        setField(term341, term341.getClass(), "first", term343);
        setField(term341, term341.getClass(), "last", term335);
        setIntField(term341, term341.getClass(), "modCount", 2055867847);
        Object term345 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term347 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term345, term345.getClass(), "size", -1048298087);
        setField(term345, term345.getClass(), "first", term339);
        setField(term347, term347.getClass(), "item", null);
        setField(term347, term347.getClass(), "next", null);
        setField(term347, term347.getClass(), "prev", null);
        setField(term345, term345.getClass(), "last", term347);
        setIntField(term345, term345.getClass(), "modCount", 292681826);
        Object term349 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.ActionBundle"));
        Object term351 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setIntField(term349, term349.getClass(), "size", 458147407);
        setField(term351, term351.getClass(), "item", null);
        setField(term351, term351.getClass(), "next", null);
        setField(term351, term351.getClass(), "prev", null);
        setField(term349, term349.getClass(), "first", term351);
        setField(term349, term349.getClass(), "last", term343);
        setIntField(term349, term349.getClass(), "modCount", -184153539);
        ArrayDeque term330 = new ArrayDeque();
        ((ArrayDeque) term330).add(term332);
        ((ArrayDeque) term330).add(term337);
        ((ArrayDeque) term330).add(term341);
        ((ArrayDeque) term330).add(term345);
        ((ArrayDeque) term330).add(term349);
        ArrayList term355 = new ArrayList();
        ((ArrayList) term355).add((Object)null);
        ((ArrayList) term355).add((Object)null);
        HashMap term361 = new HashMap();
        term329 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        Object term359 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term360 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term329, term329.getClass(), "actionBundles", term330);
        setField(term329, term329.getClass(), "conditions", term355);
        setField(term360, term360.getClass(), "matchers", term361);
        setField(term359, term359.getClass(), "parameterConditions", term360);
        setField(term359, term359.getClass(), "referenceCondition", null);
        setField(term359, term359.getClass(), "hostCondition", null);
        setField(term359, term359.getClass(), "pathCondition", null);
        setField(term359, term359.getClass(), "portCondition", null);
        setField(term359, term359.getClass(), "schemaCondition", null);
        setField(term329, term329.getClass(), "urlConditions", term359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPathCondition", argTypes, term329, args);
    }

};


