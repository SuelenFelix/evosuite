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

public class TypeInfo_getQualified_7866423634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44934;

    public TypeInfo_getQualified_7866423634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44938 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44938, term44938.getClass(), "wildcard", null);
        setField(term44938, term44938.getClass(), "generic", null);
        setField(term44938, term44938.getClass(), "qualified", null);
        setField(term44938, term44938.getClass(), "dimension", null);
        Object term44939 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44939, term44939.getClass(), "wildcard", null);
        setField(term44939, term44939.getClass(), "generic", null);
        setField(term44939, term44939.getClass(), "qualified", null);
        setField(term44939, term44939.getClass(), "dimension", null);
        Object term44940 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44940, term44940.getClass(), "wildcard", null);
        setField(term44940, term44940.getClass(), "generic", null);
        setField(term44940, term44940.getClass(), "qualified", null);
        setField(term44940, term44940.getClass(), "dimension", null);
        Object term44941 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44941, term44941.getClass(), "wildcard", null);
        setField(term44941, term44941.getClass(), "generic", null);
        setField(term44941, term44941.getClass(), "qualified", null);
        setField(term44941, term44941.getClass(), "dimension", null);
        Object term44942 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44942, term44942.getClass(), "wildcard", null);
        setField(term44942, term44942.getClass(), "generic", null);
        setField(term44942, term44942.getClass(), "qualified", null);
        setField(term44942, term44942.getClass(), "dimension", null);
        ArrayList term44936 = new ArrayList();
        ((ArrayList) term44936).add(term44938);
        ((ArrayList) term44936).add(term44939);
        ((ArrayList) term44936).add(term44938);
        ((ArrayList) term44936).add(term44940);
        ((ArrayList) term44936).add(term44941);
        ((ArrayList) term44936).add(term44934);
        ((ArrayList) term44936).add(term44942);
        Object term44947 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44947, term44947.getClass(), "wildcard", null);
        setField(term44947, term44947.getClass(), "generic", null);
        setField(term44947, term44947.getClass(), "qualified", null);
        setField(term44947, term44947.getClass(), "dimension", null);
        ArrayList term44945 = new ArrayList();
        ((ArrayList) term44945).add(term44947);
        ArrayList term44954 = new ArrayList();
        ((ArrayList) term44954).add((Object)null);
        ((ArrayList) term44954).add((Object)null);
        ((ArrayList) term44954).add((Object)null);
        ((ArrayList) term44954).add((Object)null);
        ((ArrayList) term44954).add((Object)null);
        Object term44952 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44953 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44953, term44953.getClass(), "extendsBound", null);
        setField(term44953, term44953.getClass(), "superBound", null);
        setField(term44952, term44952.getClass(), "wildcard", term44953);
        setField(term44952, term44952.getClass(), "generic", term44954);
        setField(term44952, term44952.getClass(), "qualified", "");
        setField(term44952, term44952.getClass(), "dimension", "");
        Object term44959 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44959, term44959.getClass(), "wildcard", null);
        setField(term44959, term44959.getClass(), "generic", null);
        setField(term44959, term44959.getClass(), "qualified", null);
        setField(term44959, term44959.getClass(), "dimension", null);
        ArrayList term44950 = new ArrayList();
        ((ArrayList) term44950).add(term44952);
        ((ArrayList) term44950).add(term44947);
        ((ArrayList) term44950).add(term44947);
        ((ArrayList) term44950).add(term44940);
        ((ArrayList) term44950).add(term44939);
        ((ArrayList) term44950).add(term44959);
        term44934 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44935 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44935, term44935.getClass(), "extendsBound", term44936);
        setField(term44935, term44935.getClass(), "superBound", term44945);
        setField(term44934, term44934.getClass(), "wildcard", term44935);
        setField(term44934, term44934.getClass(), "generic", term44950);
        setField(term44934, term44934.getClass(), "qualified", "qTcWAllCTZ");
        setField(term44934, term44934.getClass(), "dimension", "wDuJRgZGiN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualified", argTypes, term44934, args);
    }

};


