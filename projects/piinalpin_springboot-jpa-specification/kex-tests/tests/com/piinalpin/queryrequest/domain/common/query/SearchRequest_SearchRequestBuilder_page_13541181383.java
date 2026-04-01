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

public class SearchRequest_SearchRequestBuilder_page_13541181383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23103;
     Object term23158;

    public SearchRequest_SearchRequestBuilder_page_13541181383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23161 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term23160 = ((Class) term23161).getDeclaredField((String) "STRING");
        ((Field) term23160).setAccessible(true);
        Object enum71 = ((Field) term23160).get((Object) null);
        ArrayList term23112 = new ArrayList();
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        ((ArrayList) term23112).add((Object)null);
        Object term23106 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term23110 = newInstance(Class.forName("java.lang.Object"));
        Object term23111 = newInstance(Class.forName("java.lang.Object"));
        setField(term23106, term23106.getClass(), "key", "");
        setField(term23106, term23106.getClass(), "operator", null);
        setField(term23106, term23106.getClass(), "fieldType", enum71);
        setField(term23106, term23106.getClass(), "value", term23110);
        setField(term23106, term23106.getClass(), "valueTo", term23111);
        setField(term23106, term23106.getClass(), "values", term23112);
        Class<? extends Object> term23466 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term23465 = ((Class) term23466).getDeclaredField((String) "LONG");
        ((Field) term23465).setAccessible(true);
        Object enum72 = ((Field) term23465).get((Object) null);
        ArrayList term23120 = new ArrayList();
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        ((ArrayList) term23120).add((Object)null);
        Object term23115 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term23119 = newInstance(Class.forName("java.lang.Object"));
        setField(term23115, term23115.getClass(), "key", "");
        setField(term23115, term23115.getClass(), "operator", null);
        setField(term23115, term23115.getClass(), "fieldType", enum72);
        setField(term23115, term23115.getClass(), "value", term23119);
        setField(term23115, term23115.getClass(), "valueTo", term23110);
        setField(term23115, term23115.getClass(), "values", term23120);
        Class<? extends Object> term23765 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term23764 = ((Class) term23765).getDeclaredField((String) "DOUBLE");
        ((Field) term23764).setAccessible(true);
        Object enum73 = ((Field) term23764).get((Object) null);
        ArrayList term23129 = new ArrayList();
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        ((ArrayList) term23129).add((Object)null);
        Object term23123 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term23127 = newInstance(Class.forName("java.lang.Object"));
        Object term23128 = newInstance(Class.forName("java.lang.Object"));
        setField(term23123, term23123.getClass(), "key", "");
        setField(term23123, term23123.getClass(), "operator", null);
        setField(term23123, term23123.getClass(), "fieldType", enum73);
        setField(term23123, term23123.getClass(), "value", term23127);
        setField(term23123, term23123.getClass(), "valueTo", term23128);
        setField(term23123, term23123.getClass(), "values", term23129);
        Class<? extends Object> term24070 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term24069 = ((Class) term24070).getDeclaredField((String) "CHAR");
        ((Field) term24069).setAccessible(true);
        Object enum74 = ((Field) term24069).get((Object) null);
        ArrayList term23136 = new ArrayList();
        ((ArrayList) term23136).add((Object)null);
        ((ArrayList) term23136).add((Object)null);
        ((ArrayList) term23136).add((Object)null);
        ((ArrayList) term23136).add((Object)null);
        ((ArrayList) term23136).add((Object)null);
        Object term23132 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term23132, term23132.getClass(), "key", "");
        setField(term23132, term23132.getClass(), "operator", null);
        setField(term23132, term23132.getClass(), "fieldType", enum74);
        setField(term23132, term23132.getClass(), "value", term23127);
        setField(term23132, term23132.getClass(), "valueTo", term23111);
        setField(term23132, term23132.getClass(), "values", term23136);
        ArrayList term23143 = new ArrayList();
        ((ArrayList) term23143).add((Object)null);
        Object term23139 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term23141 = newInstance(Class.forName("java.lang.Object"));
        Object term23142 = newInstance(Class.forName("java.lang.Object"));
        setField(term23139, term23139.getClass(), "key", "");
        setField(term23139, term23139.getClass(), "operator", null);
        setField(term23139, term23139.getClass(), "fieldType", enum73);
        setField(term23139, term23139.getClass(), "value", term23141);
        setField(term23139, term23139.getClass(), "valueTo", term23142);
        setField(term23139, term23139.getClass(), "values", term23143);
        ArrayList term23104 = new ArrayList();
        ((ArrayList) term23104).add(term23106);
        ((ArrayList) term23104).add(term23115);
        ((ArrayList) term23104).add(term23123);
        ((ArrayList) term23104).add(term23132);
        ((ArrayList) term23104).add(term23139);
        Object term23150 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term23150, term23150.getClass(), "key", "");
        setField(term23150, term23150.getClass(), "direction", null);
        ArrayList term23148 = new ArrayList();
        ((ArrayList) term23148).add(term23150);
        Integer term23154 = new Integer(-73683645);
        Integer term23156 = new Integer(-226514366);
        term23103 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder"));
        setField(term23103, term23103.getClass(), "filters", term23104);
        setField(term23103, term23103.getClass(), "sorts", term23148);
        setField(term23103, term23103.getClass(), "page", term23154);
        setField(term23103, term23103.getClass(), "size", term23156);
        term23158 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term23158;
        callMethod(klass, "page", argTypes, term23103, args);
    }

};


