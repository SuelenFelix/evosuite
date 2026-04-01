package com.piinalpin.queryrequest.domain.common.query;

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
import static com.piinalpin.queryrequest.domain.common.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.LinkedList;

public class SearchRequest_setFilters_2396415685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10171;
     Object term10229;

    public SearchRequest_setFilters_2396415685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10233 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term10232 = ((Class) term10233).getDeclaredField((String) "LONG");
        ((Field) term10232).setAccessible(true);
        Object enum31 = ((Field) term10232).get((Object) null);
        ArrayList term10180 = new ArrayList();
        Object term10174 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term10178 = newInstance(Class.forName("java.lang.Object"));
        Object term10179 = newInstance(Class.forName("java.lang.Object"));
        setField(term10174, term10174.getClass(), "key", "");
        setField(term10174, term10174.getClass(), "operator", null);
        setField(term10174, term10174.getClass(), "fieldType", enum31);
        setField(term10174, term10174.getClass(), "value", term10178);
        setField(term10174, term10174.getClass(), "valueTo", term10179);
        setField(term10174, term10174.getClass(), "values", term10180);
        Class<? extends Object> term10532 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term10531 = ((Class) term10532).getDeclaredField((String) "DATE");
        ((Field) term10531).setAccessible(true);
        Object enum32 = ((Field) term10531).get((Object) null);
        ArrayList term10189 = new ArrayList();
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        ((ArrayList) term10189).add((Object)null);
        Object term10183 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term10187 = newInstance(Class.forName("java.lang.Object"));
        Object term10188 = newInstance(Class.forName("java.lang.Object"));
        setField(term10183, term10183.getClass(), "key", "");
        setField(term10183, term10183.getClass(), "operator", null);
        setField(term10183, term10183.getClass(), "fieldType", enum32);
        setField(term10183, term10183.getClass(), "value", term10187);
        setField(term10183, term10183.getClass(), "valueTo", term10188);
        setField(term10183, term10183.getClass(), "values", term10189);
        Class<? extends Object> term10831 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term10830 = ((Class) term10831).getDeclaredField((String) "DOUBLE");
        ((Field) term10830).setAccessible(true);
        Object enum33 = ((Field) term10830).get((Object) null);
        ArrayList term10197 = new ArrayList();
        ((ArrayList) term10197).add((Object)null);
        ((ArrayList) term10197).add((Object)null);
        Object term10192 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term10196 = newInstance(Class.forName("java.lang.Object"));
        setField(term10192, term10192.getClass(), "key", "");
        setField(term10192, term10192.getClass(), "operator", null);
        setField(term10192, term10192.getClass(), "fieldType", enum33);
        setField(term10192, term10192.getClass(), "value", term10196);
        setField(term10192, term10192.getClass(), "valueTo", term10178);
        setField(term10192, term10192.getClass(), "values", term10197);
        Class<? extends Object> term11136 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term11135 = ((Class) term11136).getDeclaredField((String) "STRING");
        ((Field) term11135).setAccessible(true);
        Object enum34 = ((Field) term11135).get((Object) null);
        ArrayList term10204 = new ArrayList();
        ((ArrayList) term10204).add((Object)null);
        Object term10200 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term10200, term10200.getClass(), "key", "");
        setField(term10200, term10200.getClass(), "operator", null);
        setField(term10200, term10200.getClass(), "fieldType", enum34);
        setField(term10200, term10200.getClass(), "value", term10179);
        setField(term10200, term10200.getClass(), "valueTo", term10179);
        setField(term10200, term10200.getClass(), "values", term10204);
        ArrayList term10172 = new ArrayList();
        ((ArrayList) term10172).add(term10174);
        ((ArrayList) term10172).add(term10183);
        ((ArrayList) term10172).add(term10192);
        ((ArrayList) term10172).add(term10200);
        Object term10211 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10211, term10211.getClass(), "key", "");
        setField(term10211, term10211.getClass(), "direction", null);
        Object term10213 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10213, term10213.getClass(), "key", "");
        setField(term10213, term10213.getClass(), "direction", null);
        Object term10215 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10215, term10215.getClass(), "key", "");
        setField(term10215, term10215.getClass(), "direction", null);
        Object term10217 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10217, term10217.getClass(), "key", "");
        setField(term10217, term10217.getClass(), "direction", null);
        Object term10219 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10219, term10219.getClass(), "key", "");
        setField(term10219, term10219.getClass(), "direction", null);
        Object term10221 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term10221, term10221.getClass(), "key", "");
        setField(term10221, term10221.getClass(), "direction", null);
        ArrayList term10209 = new ArrayList();
        ((ArrayList) term10209).add(term10211);
        ((ArrayList) term10209).add(term10213);
        ((ArrayList) term10209).add(term10215);
        ((ArrayList) term10209).add(term10217);
        ((ArrayList) term10209).add(term10219);
        ((ArrayList) term10209).add(term10221);
        Integer term10225 = new Integer(1227103734);
        Integer term10227 = new Integer(-1339778481);
        term10171 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term10171, term10171.getClass(), "filters", term10172);
        setField(term10171, term10171.getClass(), "sorts", term10209);
        setField(term10171, term10171.getClass(), "page", term10225);
        setField(term10171, term10171.getClass(), "size", term10227);
        term10229 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10229;
        callMethod(klass, "setFilters", argTypes, term10171, args);
    }

};


