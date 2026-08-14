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

public class RuleBuilder_addCondition_104244432014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;

    public RuleBuilder_addCondition_104244432014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder"));
        setField(term397, term397.getClass(), "actionBundles", null);
        setField(term397, term397.getClass(), "conditions", null);
        setField(term397, term397.getClass(), "urlConditions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.RuleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCondition", argTypes, term397, args);
    }

};


