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

public class SearchRequest_getPage_6013036823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7317;

    public SearchRequest_getPage_6013036823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7375 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term7374 = ((Class) term7375).getDeclaredField((String) "DOUBLE");
        ((Field) term7374).setAccessible(true);
        Object enum22 = ((Field) term7374).get((Object) null);
        ArrayList term7326 = new ArrayList();
        ((ArrayList) term7326).add((Object)null);
        ((ArrayList) term7326).add((Object)null);
        ((ArrayList) term7326).add((Object)null);
        Object term7320 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term7324 = newInstance(Class.forName("java.lang.Object"));
        Object term7325 = newInstance(Class.forName("java.lang.Object"));
        setField(term7320, term7320.getClass(), "key", "");
        setField(term7320, term7320.getClass(), "operator", null);
        setField(term7320, term7320.getClass(), "fieldType", enum22);
        setField(term7320, term7320.getClass(), "value", term7324);
        setField(term7320, term7320.getClass(), "valueTo", term7325);
        setField(term7320, term7320.getClass(), "values", term7326);
        Class<? extends Object> term7680 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term7679 = ((Class) term7680).getDeclaredField((String) "CHAR");
        ((Field) term7679).setAccessible(true);
        Object enum23 = ((Field) term7679).get((Object) null);
        ArrayList term7335 = new ArrayList();
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        ((ArrayList) term7335).add((Object)null);
        Object term7329 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term7333 = newInstance(Class.forName("java.lang.Object"));
        Object term7334 = newInstance(Class.forName("java.lang.Object"));
        setField(term7329, term7329.getClass(), "key", "");
        setField(term7329, term7329.getClass(), "operator", null);
        setField(term7329, term7329.getClass(), "fieldType", enum23);
        setField(term7329, term7329.getClass(), "value", term7333);
        setField(term7329, term7329.getClass(), "valueTo", term7334);
        setField(term7329, term7329.getClass(), "values", term7335);
        Class<? extends Object> term7979 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term7978 = ((Class) term7979).getDeclaredField((String) "INTEGER");
        ((Field) term7978).setAccessible(true);
        Object enum24 = ((Field) term7978).get((Object) null);
        ArrayList term7343 = new ArrayList();
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        Object term7338 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term7342 = newInstance(Class.forName("java.lang.Object"));
        setField(term7338, term7338.getClass(), "key", "");
        setField(term7338, term7338.getClass(), "operator", null);
        setField(term7338, term7338.getClass(), "fieldType", enum24);
        setField(term7338, term7338.getClass(), "value", term7342);
        setField(term7338, term7338.getClass(), "valueTo", term7325);
        setField(term7338, term7338.getClass(), "values", term7343);
        Class<? extends Object> term8287 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term8286 = ((Class) term8287).getDeclaredField((String) "LONG");
        ((Field) term8286).setAccessible(true);
        Object enum25 = ((Field) term8286).get((Object) null);
        ArrayList term7351 = new ArrayList();
        ((ArrayList) term7351).add((Object)null);
        ((ArrayList) term7351).add((Object)null);
        ((ArrayList) term7351).add((Object)null);
        ((ArrayList) term7351).add((Object)null);
        ((ArrayList) term7351).add((Object)null);
        ((ArrayList) term7351).add((Object)null);
        Object term7346 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term7350 = newInstance(Class.forName("java.lang.Object"));
        setField(term7346, term7346.getClass(), "key", "");
        setField(term7346, term7346.getClass(), "operator", null);
        setField(term7346, term7346.getClass(), "fieldType", enum25);
        setField(term7346, term7346.getClass(), "value", term7350);
        setField(term7346, term7346.getClass(), "valueTo", term7350);
        setField(term7346, term7346.getClass(), "values", term7351);
        ArrayList term7357 = new ArrayList();
        ((ArrayList) term7357).add((Object)null);
        ((ArrayList) term7357).add((Object)null);
        ((ArrayList) term7357).add((Object)null);
        ((ArrayList) term7357).add((Object)null);
        ((ArrayList) term7357).add((Object)null);
        ((ArrayList) term7357).add((Object)null);
        Object term7354 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term7356 = newInstance(Class.forName("java.lang.Object"));
        setField(term7354, term7354.getClass(), "key", "");
        setField(term7354, term7354.getClass(), "operator", null);
        setField(term7354, term7354.getClass(), "fieldType", enum23);
        setField(term7354, term7354.getClass(), "value", term7350);
        setField(term7354, term7354.getClass(), "valueTo", term7356);
        setField(term7354, term7354.getClass(), "values", term7357);
        ArrayList term7318 = new ArrayList();
        ((ArrayList) term7318).add(term7320);
        ((ArrayList) term7318).add(term7329);
        ((ArrayList) term7318).add(term7338);
        ((ArrayList) term7318).add(term7346);
        ((ArrayList) term7318).add(term7354);
        Object term7364 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term7364, term7364.getClass(), "key", "");
        setField(term7364, term7364.getClass(), "direction", null);
        Object term7366 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term7366, term7366.getClass(), "key", "");
        setField(term7366, term7366.getClass(), "direction", null);
        ArrayList term7362 = new ArrayList();
        ((ArrayList) term7362).add(term7364);
        ((ArrayList) term7362).add(term7366);
        Integer term7370 = new Integer(-1922583790);
        Integer term7372 = new Integer(-616727354);
        term7317 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term7317, term7317.getClass(), "filters", term7318);
        setField(term7317, term7317.getClass(), "sorts", term7362);
        setField(term7317, term7317.getClass(), "page", term7370);
        setField(term7317, term7317.getClass(), "size", term7372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPage", argTypes, term7317, args);
    }

};


