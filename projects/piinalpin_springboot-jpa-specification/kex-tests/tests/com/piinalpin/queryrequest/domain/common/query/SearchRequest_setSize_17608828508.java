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

public class SearchRequest_setSize_17608828508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14062;
     Object term14131;

    public SearchRequest_setSize_17608828508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14134 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term14133 = ((Class) term14134).getDeclaredField((String) "LONG");
        ((Field) term14133).setAccessible(true);
        Object enum43 = ((Field) term14133).get((Object) null);
        ArrayList term14071 = new ArrayList();
        ((ArrayList) term14071).add((Object)null);
        ((ArrayList) term14071).add((Object)null);
        ((ArrayList) term14071).add((Object)null);
        ((ArrayList) term14071).add((Object)null);
        Object term14065 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term14069 = newInstance(Class.forName("java.lang.Object"));
        Object term14070 = newInstance(Class.forName("java.lang.Object"));
        setField(term14065, term14065.getClass(), "key", "");
        setField(term14065, term14065.getClass(), "operator", null);
        setField(term14065, term14065.getClass(), "fieldType", enum43);
        setField(term14065, term14065.getClass(), "value", term14069);
        setField(term14065, term14065.getClass(), "valueTo", term14070);
        setField(term14065, term14065.getClass(), "values", term14071);
        Class<? extends Object> term14433 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term14432 = ((Class) term14433).getDeclaredField((String) "DATE");
        ((Field) term14432).setAccessible(true);
        Object enum44 = ((Field) term14432).get((Object) null);
        ArrayList term14080 = new ArrayList();
        ((ArrayList) term14080).add((Object)null);
        ((ArrayList) term14080).add((Object)null);
        ((ArrayList) term14080).add((Object)null);
        Object term14074 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term14078 = newInstance(Class.forName("java.lang.Object"));
        Object term14079 = newInstance(Class.forName("java.lang.Object"));
        setField(term14074, term14074.getClass(), "key", "");
        setField(term14074, term14074.getClass(), "operator", null);
        setField(term14074, term14074.getClass(), "fieldType", enum44);
        setField(term14074, term14074.getClass(), "value", term14078);
        setField(term14074, term14074.getClass(), "valueTo", term14079);
        setField(term14074, term14074.getClass(), "values", term14080);
        Class<? extends Object> term14732 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term14731 = ((Class) term14732).getDeclaredField((String) "CHAR");
        ((Field) term14731).setAccessible(true);
        Object enum45 = ((Field) term14731).get((Object) null);
        ArrayList term14088 = new ArrayList();
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        ((ArrayList) term14088).add((Object)null);
        Object term14083 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term14087 = newInstance(Class.forName("java.lang.Object"));
        setField(term14083, term14083.getClass(), "key", "");
        setField(term14083, term14083.getClass(), "operator", null);
        setField(term14083, term14083.getClass(), "fieldType", enum45);
        setField(term14083, term14083.getClass(), "value", term14087);
        setField(term14083, term14083.getClass(), "valueTo", term14069);
        setField(term14083, term14083.getClass(), "values", term14088);
        Class<? extends Object> term15031 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term15030 = ((Class) term15031).getDeclaredField((String) "STRING");
        ((Field) term15030).setAccessible(true);
        Object enum46 = ((Field) term15030).get((Object) null);
        ArrayList term14096 = new ArrayList();
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        ((ArrayList) term14096).add((Object)null);
        Object term14091 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term14095 = newInstance(Class.forName("java.lang.Object"));
        setField(term14091, term14091.getClass(), "key", "");
        setField(term14091, term14091.getClass(), "operator", null);
        setField(term14091, term14091.getClass(), "fieldType", enum46);
        setField(term14091, term14091.getClass(), "value", term14095);
        setField(term14091, term14091.getClass(), "valueTo", term14079);
        setField(term14091, term14091.getClass(), "values", term14096);
        ArrayList term14102 = new ArrayList();
        ((ArrayList) term14102).add((Object)null);
        Object term14099 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term14101 = newInstance(Class.forName("java.lang.Object"));
        setField(term14099, term14099.getClass(), "key", "");
        setField(term14099, term14099.getClass(), "operator", null);
        setField(term14099, term14099.getClass(), "fieldType", enum44);
        setField(term14099, term14099.getClass(), "value", term14101);
        setField(term14099, term14099.getClass(), "valueTo", term14070);
        setField(term14099, term14099.getClass(), "values", term14102);
        ArrayList term14063 = new ArrayList();
        ((ArrayList) term14063).add(term14065);
        ((ArrayList) term14063).add(term14074);
        ((ArrayList) term14063).add(term14083);
        ((ArrayList) term14063).add(term14091);
        ((ArrayList) term14063).add(term14099);
        Object term14109 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14109, term14109.getClass(), "key", "");
        setField(term14109, term14109.getClass(), "direction", null);
        Object term14111 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14111, term14111.getClass(), "key", "");
        setField(term14111, term14111.getClass(), "direction", null);
        Object term14113 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14113, term14113.getClass(), "key", "");
        setField(term14113, term14113.getClass(), "direction", null);
        Object term14115 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14115, term14115.getClass(), "key", "");
        setField(term14115, term14115.getClass(), "direction", null);
        Object term14117 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14117, term14117.getClass(), "key", "");
        setField(term14117, term14117.getClass(), "direction", null);
        Object term14119 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14119, term14119.getClass(), "key", "");
        setField(term14119, term14119.getClass(), "direction", null);
        Object term14121 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14121, term14121.getClass(), "key", "");
        setField(term14121, term14121.getClass(), "direction", null);
        Object term14123 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term14123, term14123.getClass(), "key", "");
        setField(term14123, term14123.getClass(), "direction", null);
        ArrayList term14107 = new ArrayList();
        ((ArrayList) term14107).add(term14109);
        ((ArrayList) term14107).add(term14111);
        ((ArrayList) term14107).add(term14113);
        ((ArrayList) term14107).add(term14115);
        ((ArrayList) term14107).add(term14117);
        ((ArrayList) term14107).add(term14119);
        ((ArrayList) term14107).add(term14121);
        ((ArrayList) term14107).add(term14123);
        Integer term14127 = new Integer(597278769);
        Integer term14129 = new Integer(-1685132342);
        term14062 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term14062, term14062.getClass(), "filters", term14063);
        setField(term14062, term14062.getClass(), "sorts", term14107);
        setField(term14062, term14062.getClass(), "page", term14127);
        setField(term14062, term14062.getClass(), "size", term14129);
        term14131 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14131;
        callMethod(klass, "setSize", argTypes, term14062, args);
    }

};


