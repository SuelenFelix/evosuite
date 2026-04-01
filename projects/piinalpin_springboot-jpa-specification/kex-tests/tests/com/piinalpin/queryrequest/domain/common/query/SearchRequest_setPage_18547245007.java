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

public class SearchRequest_setPage_18547245007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13075;
     Object term13148;

    public SearchRequest_setPage_18547245007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13151 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term13150 = ((Class) term13151).getDeclaredField((String) "LONG");
        ((Field) term13150).setAccessible(true);
        Object enum40 = ((Field) term13150).get((Object) null);
        ArrayList term13084 = new ArrayList();
        ((ArrayList) term13084).add((Object)null);
        ((ArrayList) term13084).add((Object)null);
        ((ArrayList) term13084).add((Object)null);
        ((ArrayList) term13084).add((Object)null);
        ((ArrayList) term13084).add((Object)null);
        ((ArrayList) term13084).add((Object)null);
        Object term13078 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term13082 = newInstance(Class.forName("java.lang.Object"));
        Object term13083 = newInstance(Class.forName("java.lang.Object"));
        setField(term13078, term13078.getClass(), "key", "");
        setField(term13078, term13078.getClass(), "operator", null);
        setField(term13078, term13078.getClass(), "fieldType", enum40);
        setField(term13078, term13078.getClass(), "value", term13082);
        setField(term13078, term13078.getClass(), "valueTo", term13083);
        setField(term13078, term13078.getClass(), "values", term13084);
        Class<? extends Object> term13450 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term13449 = ((Class) term13450).getDeclaredField((String) "DOUBLE");
        ((Field) term13449).setAccessible(true);
        Object enum41 = ((Field) term13449).get((Object) null);
        ArrayList term13093 = new ArrayList();
        ((ArrayList) term13093).add((Object)null);
        ((ArrayList) term13093).add((Object)null);
        ((ArrayList) term13093).add((Object)null);
        ((ArrayList) term13093).add((Object)null);
        ((ArrayList) term13093).add((Object)null);
        ((ArrayList) term13093).add((Object)null);
        Object term13087 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term13091 = newInstance(Class.forName("java.lang.Object"));
        Object term13092 = newInstance(Class.forName("java.lang.Object"));
        setField(term13087, term13087.getClass(), "key", "");
        setField(term13087, term13087.getClass(), "operator", null);
        setField(term13087, term13087.getClass(), "fieldType", enum41);
        setField(term13087, term13087.getClass(), "value", term13091);
        setField(term13087, term13087.getClass(), "valueTo", term13092);
        setField(term13087, term13087.getClass(), "values", term13093);
        ArrayList term13098 = new ArrayList();
        Object term13096 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term13096, term13096.getClass(), "key", "");
        setField(term13096, term13096.getClass(), "operator", null);
        setField(term13096, term13096.getClass(), "fieldType", enum40);
        setField(term13096, term13096.getClass(), "value", term13083);
        setField(term13096, term13096.getClass(), "valueTo", term13092);
        setField(term13096, term13096.getClass(), "values", term13098);
        ArrayList term13104 = new ArrayList();
        ((ArrayList) term13104).add((Object)null);
        ((ArrayList) term13104).add((Object)null);
        ((ArrayList) term13104).add((Object)null);
        ((ArrayList) term13104).add((Object)null);
        ((ArrayList) term13104).add((Object)null);
        ((ArrayList) term13104).add((Object)null);
        Object term13101 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term13103 = newInstance(Class.forName("java.lang.Object"));
        setField(term13101, term13101.getClass(), "key", "");
        setField(term13101, term13101.getClass(), "operator", null);
        setField(term13101, term13101.getClass(), "fieldType", enum40);
        setField(term13101, term13101.getClass(), "value", term13103);
        setField(term13101, term13101.getClass(), "valueTo", term13103);
        setField(term13101, term13101.getClass(), "values", term13104);
        Class<? extends Object> term13755 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term13754 = ((Class) term13755).getDeclaredField((String) "BOOLEAN");
        ((Field) term13754).setAccessible(true);
        Object enum42 = ((Field) term13754).get((Object) null);
        ArrayList term13111 = new ArrayList();
        ((ArrayList) term13111).add((Object)null);
        ((ArrayList) term13111).add((Object)null);
        ((ArrayList) term13111).add((Object)null);
        ((ArrayList) term13111).add((Object)null);
        ((ArrayList) term13111).add((Object)null);
        Object term13107 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term13107, term13107.getClass(), "key", "");
        setField(term13107, term13107.getClass(), "operator", null);
        setField(term13107, term13107.getClass(), "fieldType", enum42);
        setField(term13107, term13107.getClass(), "value", term13103);
        setField(term13107, term13107.getClass(), "valueTo", term13092);
        setField(term13107, term13107.getClass(), "values", term13111);
        ArrayList term13117 = new ArrayList();
        ((ArrayList) term13117).add((Object)null);
        Object term13114 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term13116 = newInstance(Class.forName("java.lang.Object"));
        setField(term13114, term13114.getClass(), "key", "");
        setField(term13114, term13114.getClass(), "operator", null);
        setField(term13114, term13114.getClass(), "fieldType", enum42);
        setField(term13114, term13114.getClass(), "value", term13116);
        setField(term13114, term13114.getClass(), "valueTo", term13116);
        setField(term13114, term13114.getClass(), "values", term13117);
        ArrayList term13123 = new ArrayList();
        Object term13120 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term13122 = newInstance(Class.forName("java.lang.Object"));
        setField(term13120, term13120.getClass(), "key", "");
        setField(term13120, term13120.getClass(), "operator", null);
        setField(term13120, term13120.getClass(), "fieldType", enum42);
        setField(term13120, term13120.getClass(), "value", term13092);
        setField(term13120, term13120.getClass(), "valueTo", term13122);
        setField(term13120, term13120.getClass(), "values", term13123);
        ArrayList term13076 = new ArrayList();
        ((ArrayList) term13076).add(term13078);
        ((ArrayList) term13076).add(term13087);
        ((ArrayList) term13076).add(term13096);
        ((ArrayList) term13076).add(term13101);
        ((ArrayList) term13076).add(term13107);
        ((ArrayList) term13076).add(term13114);
        ((ArrayList) term13076).add(term13120);
        Object term13130 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13130, term13130.getClass(), "key", "");
        setField(term13130, term13130.getClass(), "direction", null);
        Object term13132 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13132, term13132.getClass(), "key", "");
        setField(term13132, term13132.getClass(), "direction", null);
        Object term13134 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13134, term13134.getClass(), "key", "");
        setField(term13134, term13134.getClass(), "direction", null);
        Object term13136 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13136, term13136.getClass(), "key", "");
        setField(term13136, term13136.getClass(), "direction", null);
        Object term13138 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13138, term13138.getClass(), "key", "");
        setField(term13138, term13138.getClass(), "direction", null);
        Object term13140 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term13140, term13140.getClass(), "key", "");
        setField(term13140, term13140.getClass(), "direction", null);
        ArrayList term13128 = new ArrayList();
        ((ArrayList) term13128).add(term13130);
        ((ArrayList) term13128).add(term13132);
        ((ArrayList) term13128).add(term13134);
        ((ArrayList) term13128).add(term13136);
        ((ArrayList) term13128).add(term13138);
        ((ArrayList) term13128).add(term13140);
        Integer term13144 = new Integer(1134449235);
        Integer term13146 = new Integer(-883034806);
        term13075 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term13075, term13075.getClass(), "filters", term13076);
        setField(term13075, term13075.getClass(), "sorts", term13128);
        setField(term13075, term13075.getClass(), "page", term13144);
        setField(term13075, term13075.getClass(), "size", term13146);
        term13148 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13148;
        callMethod(klass, "setPage", argTypes, term13075, args);
    }

};


