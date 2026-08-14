package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MethodParameter_getType_14475589671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36861;

    public MethodParameter_getType_14475589671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36864 = new ArrayList();
        ArrayList term36868 = new ArrayList();
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        ((ArrayList) term36868).add((Object)null);
        Object term36874 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term36874, term36874.getClass(), "wildcard", null);
        setField(term36874, term36874.getClass(), "generic", null);
        setField(term36874, term36874.getClass(), "qualified", null);
        setField(term36874, term36874.getClass(), "dimension", null);
        Object term36875 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term36875, term36875.getClass(), "wildcard", null);
        setField(term36875, term36875.getClass(), "generic", null);
        setField(term36875, term36875.getClass(), "qualified", null);
        setField(term36875, term36875.getClass(), "dimension", null);
        Object term36876 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term36876, term36876.getClass(), "wildcard", null);
        setField(term36876, term36876.getClass(), "generic", null);
        setField(term36876, term36876.getClass(), "qualified", null);
        setField(term36876, term36876.getClass(), "dimension", null);
        ArrayList term36872 = new ArrayList();
        ((ArrayList) term36872).add(term36874);
        ((ArrayList) term36872).add(term36875);
        ((ArrayList) term36872).add(term36876);
        ArrayList term36906 = new ArrayList();
        ((ArrayList) term36906).add((Object)null);
        ((ArrayList) term36906).add((Object)null);
        ((ArrayList) term36906).add((Object)null);
        Object term36905 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36905, term36905.getClass(), "argument", term36906);
        setField(term36905, term36905.getClass(), "name", "");
        setField(term36905, term36905.getClass(), "qualified", "");
        ArrayList term36912 = new ArrayList();
        ((ArrayList) term36912).add((Object)null);
        Object term36911 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36911, term36911.getClass(), "argument", term36912);
        setField(term36911, term36911.getClass(), "name", "");
        setField(term36911, term36911.getClass(), "qualified", "");
        ArrayList term36918 = new ArrayList();
        ((ArrayList) term36918).add((Object)null);
        ((ArrayList) term36918).add((Object)null);
        Object term36917 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36917, term36917.getClass(), "argument", term36918);
        setField(term36917, term36917.getClass(), "name", "");
        setField(term36917, term36917.getClass(), "qualified", "");
        ArrayList term36924 = new ArrayList();
        ((ArrayList) term36924).add((Object)null);
        ((ArrayList) term36924).add((Object)null);
        ((ArrayList) term36924).add((Object)null);
        ((ArrayList) term36924).add((Object)null);
        Object term36923 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36923, term36923.getClass(), "argument", term36924);
        setField(term36923, term36923.getClass(), "name", "");
        setField(term36923, term36923.getClass(), "qualified", "");
        ArrayList term36930 = new ArrayList();
        ((ArrayList) term36930).add((Object)null);
        ((ArrayList) term36930).add((Object)null);
        Object term36929 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36929, term36929.getClass(), "argument", term36930);
        setField(term36929, term36929.getClass(), "name", "");
        setField(term36929, term36929.getClass(), "qualified", "");
        ArrayList term36936 = new ArrayList();
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        ((ArrayList) term36936).add((Object)null);
        Object term36935 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term36935, term36935.getClass(), "argument", term36936);
        setField(term36935, term36935.getClass(), "name", "");
        setField(term36935, term36935.getClass(), "qualified", "");
        ArrayList term36903 = new ArrayList();
        ((ArrayList) term36903).add(term36905);
        ((ArrayList) term36903).add(term36911);
        ((ArrayList) term36903).add(term36917);
        ((ArrayList) term36903).add(term36911);
        ((ArrayList) term36903).add(term36923);
        ((ArrayList) term36903).add(term36929);
        ((ArrayList) term36903).add(term36923);
        ((ArrayList) term36903).add(term36935);
        ((ArrayList) term36903).add(term36929);
        term36861 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term36862 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term36863 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term36863, term36863.getClass(), "extendsBound", term36864);
        setField(term36863, term36863.getClass(), "superBound", term36868);
        setField(term36862, term36862.getClass(), "wildcard", term36863);
        setField(term36862, term36862.getClass(), "generic", term36872);
        setField(term36862, term36862.getClass(), "qualified", "yidOYxCzaF");
        setField(term36862, term36862.getClass(), "dimension", "fAIiyNXvbk");
        setField(term36861, term36861.getClass(), "type", term36862);
        setField(term36861, term36861.getClass(), "annotation", term36903);
        setField(term36861, term36861.getClass(), "name", "lESuJcSmHp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.MethodParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term36861, args);
    }

};


