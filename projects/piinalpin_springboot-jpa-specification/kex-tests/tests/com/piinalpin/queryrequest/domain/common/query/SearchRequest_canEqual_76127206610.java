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

public class SearchRequest_canEqual_76127206610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16615;
     Object term16684;

    public SearchRequest_canEqual_76127206610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16686 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term16685 = ((Class) term16686).getDeclaredField((String) "STRING");
        ((Field) term16685).setAccessible(true);
        Object enum51 = ((Field) term16685).get((Object) null);
        ArrayList term16624 = new ArrayList();
        ((ArrayList) term16624).add((Object)null);
        ((ArrayList) term16624).add((Object)null);
        ((ArrayList) term16624).add((Object)null);
        Object term16618 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term16622 = newInstance(Class.forName("java.lang.Object"));
        Object term16623 = newInstance(Class.forName("java.lang.Object"));
        setField(term16618, term16618.getClass(), "key", "");
        setField(term16618, term16618.getClass(), "operator", null);
        setField(term16618, term16618.getClass(), "fieldType", enum51);
        setField(term16618, term16618.getClass(), "value", term16622);
        setField(term16618, term16618.getClass(), "valueTo", term16623);
        setField(term16618, term16618.getClass(), "values", term16624);
        Class<? extends Object> term16991 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term16990 = ((Class) term16991).getDeclaredField((String) "DOUBLE");
        ((Field) term16990).setAccessible(true);
        Object enum52 = ((Field) term16990).get((Object) null);
        ArrayList term16633 = new ArrayList();
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        ((ArrayList) term16633).add((Object)null);
        Object term16627 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term16631 = newInstance(Class.forName("java.lang.Object"));
        Object term16632 = newInstance(Class.forName("java.lang.Object"));
        setField(term16627, term16627.getClass(), "key", "");
        setField(term16627, term16627.getClass(), "operator", null);
        setField(term16627, term16627.getClass(), "fieldType", enum52);
        setField(term16627, term16627.getClass(), "value", term16631);
        setField(term16627, term16627.getClass(), "valueTo", term16632);
        setField(term16627, term16627.getClass(), "values", term16633);
        Class<? extends Object> term17296 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term17295 = ((Class) term17296).getDeclaredField((String) "INTEGER");
        ((Field) term17295).setAccessible(true);
        Object enum53 = ((Field) term17295).get((Object) null);
        ArrayList term16641 = new ArrayList();
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        ((ArrayList) term16641).add((Object)null);
        Object term16636 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term16640 = newInstance(Class.forName("java.lang.Object"));
        setField(term16636, term16636.getClass(), "key", "");
        setField(term16636, term16636.getClass(), "operator", null);
        setField(term16636, term16636.getClass(), "fieldType", enum53);
        setField(term16636, term16636.getClass(), "value", term16640);
        setField(term16636, term16636.getClass(), "valueTo", term16623);
        setField(term16636, term16636.getClass(), "values", term16641);
        Class<? extends Object> term17604 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term17603 = ((Class) term17604).getDeclaredField((String) "CHAR");
        ((Field) term17603).setAccessible(true);
        Object enum54 = ((Field) term17603).get((Object) null);
        ArrayList term16650 = new ArrayList();
        ((ArrayList) term16650).add((Object)null);
        ((ArrayList) term16650).add((Object)null);
        ((ArrayList) term16650).add((Object)null);
        ((ArrayList) term16650).add((Object)null);
        ((ArrayList) term16650).add((Object)null);
        Object term16644 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term16648 = newInstance(Class.forName("java.lang.Object"));
        Object term16649 = newInstance(Class.forName("java.lang.Object"));
        setField(term16644, term16644.getClass(), "key", "");
        setField(term16644, term16644.getClass(), "operator", null);
        setField(term16644, term16644.getClass(), "fieldType", enum54);
        setField(term16644, term16644.getClass(), "value", term16648);
        setField(term16644, term16644.getClass(), "valueTo", term16649);
        setField(term16644, term16644.getClass(), "values", term16650);
        ArrayList term16655 = new ArrayList();
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        ((ArrayList) term16655).add((Object)null);
        Object term16653 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term16653, term16653.getClass(), "key", "");
        setField(term16653, term16653.getClass(), "operator", null);
        setField(term16653, term16653.getClass(), "fieldType", enum54);
        setField(term16653, term16653.getClass(), "value", term16649);
        setField(term16653, term16653.getClass(), "valueTo", term16623);
        setField(term16653, term16653.getClass(), "values", term16655);
        ArrayList term16660 = new ArrayList();
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        ((ArrayList) term16660).add((Object)null);
        Object term16658 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term16658, term16658.getClass(), "key", "");
        setField(term16658, term16658.getClass(), "operator", null);
        setField(term16658, term16658.getClass(), "fieldType", enum54);
        setField(term16658, term16658.getClass(), "value", term16631);
        setField(term16658, term16658.getClass(), "valueTo", term16631);
        setField(term16658, term16658.getClass(), "values", term16660);
        Class<? extends Object> term17903 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term17902 = ((Class) term17903).getDeclaredField((String) "DATE");
        ((Field) term17902).setAccessible(true);
        Object enum55 = ((Field) term17902).get((Object) null);
        ArrayList term16667 = new ArrayList();
        ((ArrayList) term16667).add((Object)null);
        ((ArrayList) term16667).add((Object)null);
        ((ArrayList) term16667).add((Object)null);
        ((ArrayList) term16667).add((Object)null);
        Object term16663 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term16663, term16663.getClass(), "key", "");
        setField(term16663, term16663.getClass(), "operator", null);
        setField(term16663, term16663.getClass(), "fieldType", enum55);
        setField(term16663, term16663.getClass(), "value", term16623);
        setField(term16663, term16663.getClass(), "valueTo", term16649);
        setField(term16663, term16663.getClass(), "values", term16667);
        ArrayList term16616 = new ArrayList();
        ((ArrayList) term16616).add(term16618);
        ((ArrayList) term16616).add(term16627);
        ((ArrayList) term16616).add(term16636);
        ((ArrayList) term16616).add(term16644);
        ((ArrayList) term16616).add(term16653);
        ((ArrayList) term16616).add(term16658);
        ((ArrayList) term16616).add(term16663);
        Object term16674 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term16674, term16674.getClass(), "key", "");
        setField(term16674, term16674.getClass(), "direction", null);
        Object term16676 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term16676, term16676.getClass(), "key", "");
        setField(term16676, term16676.getClass(), "direction", null);
        ArrayList term16672 = new ArrayList();
        ((ArrayList) term16672).add(term16674);
        ((ArrayList) term16672).add(term16676);
        Integer term16680 = new Integer(-655067527);
        Integer term16682 = new Integer(-6029667);
        term16615 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term16615, term16615.getClass(), "filters", term16616);
        setField(term16615, term16615.getClass(), "sorts", term16672);
        setField(term16615, term16615.getClass(), "page", term16680);
        setField(term16615, term16615.getClass(), "size", term16682);
        term16684 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16684;
        callMethod(klass, "canEqual", argTypes, term16615, args);
    }

};


