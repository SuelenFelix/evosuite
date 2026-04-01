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

public class SearchRequest_SearchRequestBuilder_toString_8018962806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25646;

    public SearchRequest_SearchRequestBuilder_toString_8018962806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25701 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term25700 = ((Class) term25701).getDeclaredField((String) "DOUBLE");
        ((Field) term25700).setAccessible(true);
        Object enum79 = ((Field) term25700).get((Object) null);
        ArrayList term25655 = new ArrayList();
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        ((ArrayList) term25655).add((Object)null);
        Object term25649 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term25653 = newInstance(Class.forName("java.lang.Object"));
        Object term25654 = newInstance(Class.forName("java.lang.Object"));
        setField(term25649, term25649.getClass(), "key", "");
        setField(term25649, term25649.getClass(), "operator", null);
        setField(term25649, term25649.getClass(), "fieldType", enum79);
        setField(term25649, term25649.getClass(), "value", term25653);
        setField(term25649, term25649.getClass(), "valueTo", term25654);
        setField(term25649, term25649.getClass(), "values", term25655);
        Class<? extends Object> term26006 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term26005 = ((Class) term26006).getDeclaredField((String) "STRING");
        ((Field) term26005).setAccessible(true);
        Object enum80 = ((Field) term26005).get((Object) null);
        ArrayList term25663 = new ArrayList();
        ((ArrayList) term25663).add((Object)null);
        ((ArrayList) term25663).add((Object)null);
        ((ArrayList) term25663).add((Object)null);
        Object term25658 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term25662 = newInstance(Class.forName("java.lang.Object"));
        setField(term25658, term25658.getClass(), "key", "");
        setField(term25658, term25658.getClass(), "operator", null);
        setField(term25658, term25658.getClass(), "fieldType", enum80);
        setField(term25658, term25658.getClass(), "value", term25662);
        setField(term25658, term25658.getClass(), "valueTo", term25653);
        setField(term25658, term25658.getClass(), "values", term25663);
        Class<? extends Object> term26311 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term26310 = ((Class) term26311).getDeclaredField((String) "CHAR");
        ((Field) term26310).setAccessible(true);
        Object enum81 = ((Field) term26310).get((Object) null);
        ArrayList term25671 = new ArrayList();
        ((ArrayList) term25671).add((Object)null);
        ((ArrayList) term25671).add((Object)null);
        ((ArrayList) term25671).add((Object)null);
        Object term25666 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term25670 = newInstance(Class.forName("java.lang.Object"));
        setField(term25666, term25666.getClass(), "key", "");
        setField(term25666, term25666.getClass(), "operator", null);
        setField(term25666, term25666.getClass(), "fieldType", enum81);
        setField(term25666, term25666.getClass(), "value", term25654);
        setField(term25666, term25666.getClass(), "valueTo", term25670);
        setField(term25666, term25666.getClass(), "values", term25671);
        ArrayList term25647 = new ArrayList();
        ((ArrayList) term25647).add(term25649);
        ((ArrayList) term25647).add(term25658);
        ((ArrayList) term25647).add(term25666);
        Object term25678 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25678, term25678.getClass(), "key", "");
        setField(term25678, term25678.getClass(), "direction", null);
        Object term25680 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25680, term25680.getClass(), "key", "");
        setField(term25680, term25680.getClass(), "direction", null);
        Object term25682 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25682, term25682.getClass(), "key", "");
        setField(term25682, term25682.getClass(), "direction", null);
        Object term25684 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25684, term25684.getClass(), "key", "");
        setField(term25684, term25684.getClass(), "direction", null);
        Object term25686 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25686, term25686.getClass(), "key", "");
        setField(term25686, term25686.getClass(), "direction", null);
        Object term25688 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25688, term25688.getClass(), "key", "");
        setField(term25688, term25688.getClass(), "direction", null);
        Object term25690 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25690, term25690.getClass(), "key", "");
        setField(term25690, term25690.getClass(), "direction", null);
        Object term25692 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term25692, term25692.getClass(), "key", "");
        setField(term25692, term25692.getClass(), "direction", null);
        ArrayList term25676 = new ArrayList();
        ((ArrayList) term25676).add(term25678);
        ((ArrayList) term25676).add(term25680);
        ((ArrayList) term25676).add(term25682);
        ((ArrayList) term25676).add(term25684);
        ((ArrayList) term25676).add(term25686);
        ((ArrayList) term25676).add(term25688);
        ((ArrayList) term25676).add(term25690);
        ((ArrayList) term25676).add(term25692);
        Integer term25696 = new Integer(1962444399);
        Integer term25698 = new Integer(767834723);
        term25646 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder"));
        setField(term25646, term25646.getClass(), "filters", term25647);
        setField(term25646, term25646.getClass(), "sorts", term25676);
        setField(term25646, term25646.getClass(), "page", term25696);
        setField(term25646, term25646.getClass(), "size", term25698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25646, args);
    }

};


