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

public class SearchRequest_SearchRequestBuilder_size_12602764884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24368;
     Object term24399;

    public SearchRequest_SearchRequestBuilder_size_12602764884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24402 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term24401 = ((Class) term24402).getDeclaredField((String) "LONG");
        ((Field) term24401).setAccessible(true);
        Object enum75 = ((Field) term24401).get((Object) null);
        ArrayList term24377 = new ArrayList();
        Object term24371 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term24375 = newInstance(Class.forName("java.lang.Object"));
        Object term24376 = newInstance(Class.forName("java.lang.Object"));
        setField(term24371, term24371.getClass(), "key", "");
        setField(term24371, term24371.getClass(), "operator", null);
        setField(term24371, term24371.getClass(), "fieldType", enum75);
        setField(term24371, term24371.getClass(), "value", term24375);
        setField(term24371, term24371.getClass(), "valueTo", term24376);
        setField(term24371, term24371.getClass(), "values", term24377);
        Class<? extends Object> term24701 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term24700 = ((Class) term24701).getDeclaredField((String) "INTEGER");
        ((Field) term24700).setAccessible(true);
        Object enum76 = ((Field) term24700).get((Object) null);
        ArrayList term24386 = new ArrayList();
        ((ArrayList) term24386).add((Object)null);
        ((ArrayList) term24386).add((Object)null);
        ((ArrayList) term24386).add((Object)null);
        Object term24380 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term24384 = newInstance(Class.forName("java.lang.Object"));
        Object term24385 = newInstance(Class.forName("java.lang.Object"));
        setField(term24380, term24380.getClass(), "key", "");
        setField(term24380, term24380.getClass(), "operator", null);
        setField(term24380, term24380.getClass(), "fieldType", enum76);
        setField(term24380, term24380.getClass(), "value", term24384);
        setField(term24380, term24380.getClass(), "valueTo", term24385);
        setField(term24380, term24380.getClass(), "values", term24386);
        ArrayList term24369 = new ArrayList();
        ((ArrayList) term24369).add(term24371);
        ((ArrayList) term24369).add(term24380);
        ArrayList term24391 = new ArrayList();
        Integer term24395 = new Integer(-1087774327);
        Integer term24397 = new Integer(-1530420153);
        term24368 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder"));
        setField(term24368, term24368.getClass(), "filters", term24369);
        setField(term24368, term24368.getClass(), "sorts", term24391);
        setField(term24368, term24368.getClass(), "page", term24395);
        setField(term24368, term24368.getClass(), "size", term24397);
        term24399 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term24399;
        callMethod(klass, "size", argTypes, term24368, args);
    }

};


