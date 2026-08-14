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

public class SearchRequest_SearchRequestBuilder_build_8232151895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25008;

    public SearchRequest_SearchRequestBuilder_build_8232151895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25049 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term25048 = ((Class) term25049).getDeclaredField((String) "CHAR");
        ((Field) term25048).setAccessible(true);
        Object enum77 = ((Field) term25048).get((Object) null);
        ArrayList term25017 = new ArrayList();
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        ((ArrayList) term25017).add((Object)null);
        Object term25011 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term25015 = newInstance(Class.forName("java.lang.Object"));
        Object term25016 = newInstance(Class.forName("java.lang.Object"));
        setField(term25011, term25011.getClass(), "key", "");
        setField(term25011, term25011.getClass(), "operator", null);
        setField(term25011, term25011.getClass(), "fieldType", enum77);
        setField(term25011, term25011.getClass(), "value", term25015);
        setField(term25011, term25011.getClass(), "valueTo", term25016);
        setField(term25011, term25011.getClass(), "values", term25017);
        Class<? extends Object> term25348 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term25347 = ((Class) term25348).getDeclaredField((String) "DATE");
        ((Field) term25347).setAccessible(true);
        Object enum78 = ((Field) term25347).get((Object) null);
        ArrayList term25025 = new ArrayList();
        ((ArrayList) term25025).add((Object)null);
        ((ArrayList) term25025).add((Object)null);
        ((ArrayList) term25025).add((Object)null);
        ((ArrayList) term25025).add((Object)null);
        ((ArrayList) term25025).add((Object)null);
        ((ArrayList) term25025).add((Object)null);
        Object term25020 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term25024 = newInstance(Class.forName("java.lang.Object"));
        setField(term25020, term25020.getClass(), "key", "");
        setField(term25020, term25020.getClass(), "operator", null);
        setField(term25020, term25020.getClass(), "fieldType", enum78);
        setField(term25020, term25020.getClass(), "value", term25024);
        setField(term25020, term25020.getClass(), "valueTo", term25015);
        setField(term25020, term25020.getClass(), "values", term25025);
        ArrayList term25009 = new ArrayList();
        ((ArrayList) term25009).add(term25011);
        ((ArrayList) term25009).add(term25020);
        Object term25032 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25032, term25032.getClass(), "key", "");
        setField(term25032, term25032.getClass(), "direction", null);
        Object term25034 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25034, term25034.getClass(), "key", "");
        setField(term25034, term25034.getClass(), "direction", null);
        Object term25036 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25036, term25036.getClass(), "key", "");
        setField(term25036, term25036.getClass(), "direction", null);
        Object term25038 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25038, term25038.getClass(), "key", "");
        setField(term25038, term25038.getClass(), "direction", null);
        Object term25040 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25040, term25040.getClass(), "key", "");
        setField(term25040, term25040.getClass(), "direction", null);
        ArrayList term25030 = new ArrayList();
        ((ArrayList) term25030).add(term25032);
        ((ArrayList) term25030).add(term25034);
        ((ArrayList) term25030).add(term25036);
        ((ArrayList) term25030).add(term25038);
        ((ArrayList) term25030).add(term25040);
        Integer term25044 = new Integer(-1145578966);
        Integer term25046 = new Integer(679763016);
        term25008 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder"));
        setField(term25008, term25008.getClass(), "filters", term25009);
        setField(term25008, term25008.getClass(), "sorts", term25030);
        setField(term25008, term25008.getClass(), "page", term25044);
        setField(term25008, term25008.getClass(), "size", term25046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term25008, args);
    }

};


