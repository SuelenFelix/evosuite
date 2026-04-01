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

public class SearchRequest_toString_100233692812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19166;

    public SearchRequest_toString_100233692812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19227 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term19226 = ((Class) term19227).getDeclaredField((String) "DOUBLE");
        ((Field) term19226).setAccessible(true);
        Object enum59 = ((Field) term19226).get((Object) null);
        ArrayList term19175 = new ArrayList();
        ((ArrayList) term19175).add((Object)null);
        ((ArrayList) term19175).add((Object)null);
        ((ArrayList) term19175).add((Object)null);
        ((ArrayList) term19175).add((Object)null);
        Object term19169 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term19173 = newInstance(Class.forName("java.lang.Object"));
        Object term19174 = newInstance(Class.forName("java.lang.Object"));
        setField(term19169, term19169.getClass(), "key", "");
        setField(term19169, term19169.getClass(), "operator", null);
        setField(term19169, term19169.getClass(), "fieldType", enum59);
        setField(term19169, term19169.getClass(), "value", term19173);
        setField(term19169, term19169.getClass(), "valueTo", term19174);
        setField(term19169, term19169.getClass(), "values", term19175);
        Class<? extends Object> term19532 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term19531 = ((Class) term19532).getDeclaredField((String) "DATE");
        ((Field) term19531).setAccessible(true);
        Object enum60 = ((Field) term19531).get((Object) null);
        ArrayList term19184 = new ArrayList();
        ((ArrayList) term19184).add((Object)null);
        ((ArrayList) term19184).add((Object)null);
        ((ArrayList) term19184).add((Object)null);
        Object term19178 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term19182 = newInstance(Class.forName("java.lang.Object"));
        Object term19183 = newInstance(Class.forName("java.lang.Object"));
        setField(term19178, term19178.getClass(), "key", "");
        setField(term19178, term19178.getClass(), "operator", null);
        setField(term19178, term19178.getClass(), "fieldType", enum60);
        setField(term19178, term19178.getClass(), "value", term19182);
        setField(term19178, term19178.getClass(), "valueTo", term19183);
        setField(term19178, term19178.getClass(), "values", term19184);
        Class<? extends Object> term19831 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term19830 = ((Class) term19831).getDeclaredField((String) "CHAR");
        ((Field) term19830).setAccessible(true);
        Object enum61 = ((Field) term19830).get((Object) null);
        ArrayList term19192 = new ArrayList();
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        ((ArrayList) term19192).add((Object)null);
        Object term19187 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term19191 = newInstance(Class.forName("java.lang.Object"));
        setField(term19187, term19187.getClass(), "key", "");
        setField(term19187, term19187.getClass(), "operator", null);
        setField(term19187, term19187.getClass(), "fieldType", enum61);
        setField(term19187, term19187.getClass(), "value", term19191);
        setField(term19187, term19187.getClass(), "valueTo", term19173);
        setField(term19187, term19187.getClass(), "values", term19192);
        Class<? extends Object> term20130 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term20129 = ((Class) term20130).getDeclaredField((String) "STRING");
        ((Field) term20129).setAccessible(true);
        Object enum62 = ((Field) term20129).get((Object) null);
        ArrayList term19201 = new ArrayList();
        ((ArrayList) term19201).add((Object)null);
        Object term19195 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term19199 = newInstance(Class.forName("java.lang.Object"));
        Object term19200 = newInstance(Class.forName("java.lang.Object"));
        setField(term19195, term19195.getClass(), "key", "");
        setField(term19195, term19195.getClass(), "operator", null);
        setField(term19195, term19195.getClass(), "fieldType", enum62);
        setField(term19195, term19195.getClass(), "value", term19199);
        setField(term19195, term19195.getClass(), "valueTo", term19200);
        setField(term19195, term19195.getClass(), "values", term19201);
        ArrayList term19167 = new ArrayList();
        ((ArrayList) term19167).add(term19169);
        ((ArrayList) term19167).add(term19178);
        ((ArrayList) term19167).add(term19187);
        ((ArrayList) term19167).add(term19195);
        Object term19208 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19208, term19208.getClass(), "key", "");
        setField(term19208, term19208.getClass(), "direction", null);
        Object term19210 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19210, term19210.getClass(), "key", "");
        setField(term19210, term19210.getClass(), "direction", null);
        Object term19212 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19212, term19212.getClass(), "key", "");
        setField(term19212, term19212.getClass(), "direction", null);
        Object term19214 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19214, term19214.getClass(), "key", "");
        setField(term19214, term19214.getClass(), "direction", null);
        Object term19216 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19216, term19216.getClass(), "key", "");
        setField(term19216, term19216.getClass(), "direction", null);
        Object term19218 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term19218, term19218.getClass(), "key", "");
        setField(term19218, term19218.getClass(), "direction", null);
        ArrayList term19206 = new ArrayList();
        ((ArrayList) term19206).add(term19208);
        ((ArrayList) term19206).add(term19210);
        ((ArrayList) term19206).add(term19212);
        ((ArrayList) term19206).add(term19214);
        ((ArrayList) term19206).add(term19216);
        ((ArrayList) term19206).add(term19218);
        Integer term19222 = new Integer(-1007160944);
        Integer term19224 = new Integer(1135664017);
        term19166 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term19166, term19166.getClass(), "filters", term19167);
        setField(term19166, term19166.getClass(), "sorts", term19206);
        setField(term19166, term19166.getClass(), "page", term19222);
        setField(term19166, term19166.getClass(), "size", term19224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19166, args);
    }

};


