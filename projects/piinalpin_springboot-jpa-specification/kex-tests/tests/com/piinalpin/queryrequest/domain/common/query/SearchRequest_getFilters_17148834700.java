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

public class SearchRequest_getFilters_17148834700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4783;

    public SearchRequest_getFilters_17148834700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4851 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term4850 = ((Class) term4851).getDeclaredField((String) "DATE");
        ((Field) term4850).setAccessible(true);
        Object enum14 = ((Field) term4850).get((Object) null);
        ArrayList term4792 = new ArrayList();
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        Object term4786 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term4790 = newInstance(Class.forName("java.lang.Object"));
        Object term4791 = newInstance(Class.forName("java.lang.Object"));
        setField(term4786, term4786.getClass(), "key", "");
        setField(term4786, term4786.getClass(), "operator", null);
        setField(term4786, term4786.getClass(), "fieldType", enum14);
        setField(term4786, term4786.getClass(), "value", term4790);
        setField(term4786, term4786.getClass(), "valueTo", term4791);
        setField(term4786, term4786.getClass(), "values", term4792);
        Class<? extends Object> term5150 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term5149 = ((Class) term5150).getDeclaredField((String) "INTEGER");
        ((Field) term5149).setAccessible(true);
        Object enum15 = ((Field) term5149).get((Object) null);
        ArrayList term4801 = new ArrayList();
        ((ArrayList) term4801).add((Object)null);
        Object term4795 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term4799 = newInstance(Class.forName("java.lang.Object"));
        Object term4800 = newInstance(Class.forName("java.lang.Object"));
        setField(term4795, term4795.getClass(), "key", "");
        setField(term4795, term4795.getClass(), "operator", null);
        setField(term4795, term4795.getClass(), "fieldType", enum15);
        setField(term4795, term4795.getClass(), "value", term4799);
        setField(term4795, term4795.getClass(), "valueTo", term4800);
        setField(term4795, term4795.getClass(), "values", term4801);
        Class<? extends Object> term5458 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term5457 = ((Class) term5458).getDeclaredField((String) "STRING");
        ((Field) term5457).setAccessible(true);
        Object enum16 = ((Field) term5457).get((Object) null);
        ArrayList term4809 = new ArrayList();
        ((ArrayList) term4809).add((Object)null);
        ((ArrayList) term4809).add((Object)null);
        ((ArrayList) term4809).add((Object)null);
        ((ArrayList) term4809).add((Object)null);
        ((ArrayList) term4809).add((Object)null);
        ((ArrayList) term4809).add((Object)null);
        Object term4804 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term4808 = newInstance(Class.forName("java.lang.Object"));
        setField(term4804, term4804.getClass(), "key", "");
        setField(term4804, term4804.getClass(), "operator", null);
        setField(term4804, term4804.getClass(), "fieldType", enum16);
        setField(term4804, term4804.getClass(), "value", term4790);
        setField(term4804, term4804.getClass(), "valueTo", term4808);
        setField(term4804, term4804.getClass(), "values", term4809);
        Class<? extends Object> term5763 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term5762 = ((Class) term5763).getDeclaredField((String) "LONG");
        ((Field) term5762).setAccessible(true);
        Object enum17 = ((Field) term5762).get((Object) null);
        ArrayList term4817 = new ArrayList();
        ((ArrayList) term4817).add((Object)null);
        ((ArrayList) term4817).add((Object)null);
        ((ArrayList) term4817).add((Object)null);
        ((ArrayList) term4817).add((Object)null);
        ((ArrayList) term4817).add((Object)null);
        Object term4812 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term4816 = newInstance(Class.forName("java.lang.Object"));
        setField(term4812, term4812.getClass(), "key", "");
        setField(term4812, term4812.getClass(), "operator", null);
        setField(term4812, term4812.getClass(), "fieldType", enum17);
        setField(term4812, term4812.getClass(), "value", term4816);
        setField(term4812, term4812.getClass(), "valueTo", term4799);
        setField(term4812, term4812.getClass(), "values", term4817);
        ArrayList term4822 = new ArrayList();
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        Object term4820 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term4820, term4820.getClass(), "key", "");
        setField(term4820, term4820.getClass(), "operator", null);
        setField(term4820, term4820.getClass(), "fieldType", enum17);
        setField(term4820, term4820.getClass(), "value", term4799);
        setField(term4820, term4820.getClass(), "valueTo", term4799);
        setField(term4820, term4820.getClass(), "values", term4822);
        Class<? extends Object> term6062 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term6061 = ((Class) term6062).getDeclaredField((String) "DOUBLE");
        ((Field) term6061).setAccessible(true);
        Object enum18 = ((Field) term6061).get((Object) null);
        ArrayList term4831 = new ArrayList();
        ((ArrayList) term4831).add((Object)null);
        ((ArrayList) term4831).add((Object)null);
        Object term4825 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term4829 = newInstance(Class.forName("java.lang.Object"));
        Object term4830 = newInstance(Class.forName("java.lang.Object"));
        setField(term4825, term4825.getClass(), "key", "");
        setField(term4825, term4825.getClass(), "operator", null);
        setField(term4825, term4825.getClass(), "fieldType", enum18);
        setField(term4825, term4825.getClass(), "value", term4829);
        setField(term4825, term4825.getClass(), "valueTo", term4830);
        setField(term4825, term4825.getClass(), "values", term4831);
        ArrayList term4784 = new ArrayList();
        ((ArrayList) term4784).add(term4786);
        ((ArrayList) term4784).add(term4795);
        ((ArrayList) term4784).add(term4804);
        ((ArrayList) term4784).add(term4812);
        ((ArrayList) term4784).add(term4820);
        ((ArrayList) term4784).add(term4825);
        Object term4838 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term4838, term4838.getClass(), "key", "");
        setField(term4838, term4838.getClass(), "direction", null);
        Object term4840 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term4840, term4840.getClass(), "key", "");
        setField(term4840, term4840.getClass(), "direction", null);
        Object term4842 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term4842, term4842.getClass(), "key", "");
        setField(term4842, term4842.getClass(), "direction", null);
        ArrayList term4836 = new ArrayList();
        ((ArrayList) term4836).add(term4838);
        ((ArrayList) term4836).add(term4840);
        ((ArrayList) term4836).add(term4842);
        Integer term4846 = new Integer(568599855);
        Integer term4848 = new Integer(1162663216);
        term4783 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term4783, term4783.getClass(), "filters", term4784);
        setField(term4783, term4783.getClass(), "sorts", term4836);
        setField(term4783, term4783.getClass(), "page", term4846);
        setField(term4783, term4783.getClass(), "size", term4848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilters", argTypes, term4783, args);
    }

};


