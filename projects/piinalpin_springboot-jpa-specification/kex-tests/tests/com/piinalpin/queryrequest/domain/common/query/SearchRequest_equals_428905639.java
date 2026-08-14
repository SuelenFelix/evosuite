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

public class SearchRequest_equals_428905639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15335;
     Object term15406;

    public SearchRequest_equals_428905639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15408 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term15407 = ((Class) term15408).getDeclaredField((String) "STRING");
        ((Field) term15407).setAccessible(true);
        Object enum47 = ((Field) term15407).get((Object) null);
        ArrayList term15344 = new ArrayList();
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        ((ArrayList) term15344).add((Object)null);
        Object term15338 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term15342 = newInstance(Class.forName("java.lang.Object"));
        Object term15343 = newInstance(Class.forName("java.lang.Object"));
        setField(term15338, term15338.getClass(), "key", "");
        setField(term15338, term15338.getClass(), "operator", null);
        setField(term15338, term15338.getClass(), "fieldType", enum47);
        setField(term15338, term15338.getClass(), "value", term15342);
        setField(term15338, term15338.getClass(), "valueTo", term15343);
        setField(term15338, term15338.getClass(), "values", term15344);
        ArrayList term15350 = new ArrayList();
        Object term15347 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term15349 = newInstance(Class.forName("java.lang.Object"));
        setField(term15347, term15347.getClass(), "key", "");
        setField(term15347, term15347.getClass(), "operator", null);
        setField(term15347, term15347.getClass(), "fieldType", enum47);
        setField(term15347, term15347.getClass(), "value", term15349);
        setField(term15347, term15347.getClass(), "valueTo", term15342);
        setField(term15347, term15347.getClass(), "values", term15350);
        Class<? extends Object> term15713 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term15712 = ((Class) term15713).getDeclaredField((String) "LONG");
        ((Field) term15712).setAccessible(true);
        Object enum48 = ((Field) term15712).get((Object) null);
        ArrayList term15359 = new ArrayList();
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        ((ArrayList) term15359).add((Object)null);
        Object term15353 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term15357 = newInstance(Class.forName("java.lang.Object"));
        Object term15358 = newInstance(Class.forName("java.lang.Object"));
        setField(term15353, term15353.getClass(), "key", "");
        setField(term15353, term15353.getClass(), "operator", null);
        setField(term15353, term15353.getClass(), "fieldType", enum48);
        setField(term15353, term15353.getClass(), "value", term15357);
        setField(term15353, term15353.getClass(), "valueTo", term15358);
        setField(term15353, term15353.getClass(), "values", term15359);
        Class<? extends Object> term16012 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term16011 = ((Class) term16012).getDeclaredField((String) "DOUBLE");
        ((Field) term16011).setAccessible(true);
        Object enum49 = ((Field) term16011).get((Object) null);
        ArrayList term15367 = new ArrayList();
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        ((ArrayList) term15367).add((Object)null);
        Object term15362 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term15366 = newInstance(Class.forName("java.lang.Object"));
        setField(term15362, term15362.getClass(), "key", "");
        setField(term15362, term15362.getClass(), "operator", null);
        setField(term15362, term15362.getClass(), "fieldType", enum49);
        setField(term15362, term15362.getClass(), "value", term15357);
        setField(term15362, term15362.getClass(), "valueTo", term15366);
        setField(term15362, term15362.getClass(), "values", term15367);
        Class<? extends Object> term16317 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term16316 = ((Class) term16317).getDeclaredField((String) "DATE");
        ((Field) term16316).setAccessible(true);
        Object enum50 = ((Field) term16316).get((Object) null);
        ArrayList term15375 = new ArrayList();
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        ((ArrayList) term15375).add((Object)null);
        Object term15370 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term15374 = newInstance(Class.forName("java.lang.Object"));
        setField(term15370, term15370.getClass(), "key", "");
        setField(term15370, term15370.getClass(), "operator", null);
        setField(term15370, term15370.getClass(), "fieldType", enum50);
        setField(term15370, term15370.getClass(), "value", term15374);
        setField(term15370, term15370.getClass(), "valueTo", term15349);
        setField(term15370, term15370.getClass(), "values", term15375);
        ArrayList term15336 = new ArrayList();
        ((ArrayList) term15336).add(term15338);
        ((ArrayList) term15336).add(term15347);
        ((ArrayList) term15336).add(term15353);
        ((ArrayList) term15336).add(term15362);
        ((ArrayList) term15336).add(term15370);
        Object term15382 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15382, term15382.getClass(), "key", "");
        setField(term15382, term15382.getClass(), "direction", null);
        Object term15384 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15384, term15384.getClass(), "key", "");
        setField(term15384, term15384.getClass(), "direction", null);
        Object term15386 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15386, term15386.getClass(), "key", "");
        setField(term15386, term15386.getClass(), "direction", null);
        Object term15388 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15388, term15388.getClass(), "key", "");
        setField(term15388, term15388.getClass(), "direction", null);
        Object term15390 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15390, term15390.getClass(), "key", "");
        setField(term15390, term15390.getClass(), "direction", null);
        Object term15392 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15392, term15392.getClass(), "key", "");
        setField(term15392, term15392.getClass(), "direction", null);
        Object term15394 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15394, term15394.getClass(), "key", "");
        setField(term15394, term15394.getClass(), "direction", null);
        Object term15396 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15396, term15396.getClass(), "key", "");
        setField(term15396, term15396.getClass(), "direction", null);
        Object term15398 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term15398, term15398.getClass(), "key", "");
        setField(term15398, term15398.getClass(), "direction", null);
        ArrayList term15380 = new ArrayList();
        ((ArrayList) term15380).add(term15382);
        ((ArrayList) term15380).add(term15384);
        ((ArrayList) term15380).add(term15386);
        ((ArrayList) term15380).add(term15388);
        ((ArrayList) term15380).add(term15390);
        ((ArrayList) term15380).add(term15392);
        ((ArrayList) term15380).add(term15394);
        ((ArrayList) term15380).add(term15396);
        ((ArrayList) term15380).add(term15398);
        Integer term15402 = new Integer(1622346318);
        Integer term15404 = new Integer(1048535127);
        term15335 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term15335, term15335.getClass(), "filters", term15336);
        setField(term15335, term15335.getClass(), "sorts", term15380);
        setField(term15335, term15335.getClass(), "page", term15402);
        setField(term15335, term15335.getClass(), "size", term15404);
        term15406 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15406;
        callMethod(klass, "equals", argTypes, term15335, args);
    }

};


