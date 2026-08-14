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

public class SearchRequest_hashCode_49157723811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18201;

    public SearchRequest_hashCode_49157723811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18255 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term18254 = ((Class) term18255).getDeclaredField((String) "DOUBLE");
        ((Field) term18254).setAccessible(true);
        Object enum56 = ((Field) term18254).get((Object) null);
        ArrayList term18210 = new ArrayList();
        ((ArrayList) term18210).add((Object)null);
        Object term18204 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term18208 = newInstance(Class.forName("java.lang.Object"));
        Object term18209 = newInstance(Class.forName("java.lang.Object"));
        setField(term18204, term18204.getClass(), "key", "");
        setField(term18204, term18204.getClass(), "operator", null);
        setField(term18204, term18204.getClass(), "fieldType", enum56);
        setField(term18204, term18204.getClass(), "value", term18208);
        setField(term18204, term18204.getClass(), "valueTo", term18209);
        setField(term18204, term18204.getClass(), "values", term18210);
        Class<? extends Object> term18560 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term18559 = ((Class) term18560).getDeclaredField((String) "LONG");
        ((Field) term18559).setAccessible(true);
        Object enum57 = ((Field) term18559).get((Object) null);
        ArrayList term18219 = new ArrayList();
        Object term18213 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term18217 = newInstance(Class.forName("java.lang.Object"));
        Object term18218 = newInstance(Class.forName("java.lang.Object"));
        setField(term18213, term18213.getClass(), "key", "");
        setField(term18213, term18213.getClass(), "operator", null);
        setField(term18213, term18213.getClass(), "fieldType", enum57);
        setField(term18213, term18213.getClass(), "value", term18217);
        setField(term18213, term18213.getClass(), "valueTo", term18218);
        setField(term18213, term18213.getClass(), "values", term18219);
        ArrayList term18226 = new ArrayList();
        ((ArrayList) term18226).add((Object)null);
        Object term18222 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term18224 = newInstance(Class.forName("java.lang.Object"));
        Object term18225 = newInstance(Class.forName("java.lang.Object"));
        setField(term18222, term18222.getClass(), "key", "");
        setField(term18222, term18222.getClass(), "operator", null);
        setField(term18222, term18222.getClass(), "fieldType", enum57);
        setField(term18222, term18222.getClass(), "value", term18224);
        setField(term18222, term18222.getClass(), "valueTo", term18225);
        setField(term18222, term18222.getClass(), "values", term18226);
        Class<? extends Object> term18859 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term18858 = ((Class) term18859).getDeclaredField((String) "BOOLEAN");
        ((Field) term18858).setAccessible(true);
        Object enum58 = ((Field) term18858).get((Object) null);
        ArrayList term18235 = new ArrayList();
        ((ArrayList) term18235).add((Object)null);
        ((ArrayList) term18235).add((Object)null);
        ((ArrayList) term18235).add((Object)null);
        ((ArrayList) term18235).add((Object)null);
        ((ArrayList) term18235).add((Object)null);
        Object term18229 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term18233 = newInstance(Class.forName("java.lang.Object"));
        Object term18234 = newInstance(Class.forName("java.lang.Object"));
        setField(term18229, term18229.getClass(), "key", "");
        setField(term18229, term18229.getClass(), "operator", null);
        setField(term18229, term18229.getClass(), "fieldType", enum58);
        setField(term18229, term18229.getClass(), "value", term18233);
        setField(term18229, term18229.getClass(), "valueTo", term18234);
        setField(term18229, term18229.getClass(), "values", term18235);
        ArrayList term18202 = new ArrayList();
        ((ArrayList) term18202).add(term18204);
        ((ArrayList) term18202).add(term18213);
        ((ArrayList) term18202).add(term18222);
        ((ArrayList) term18202).add(term18229);
        Object term18242 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term18242, term18242.getClass(), "key", "");
        setField(term18242, term18242.getClass(), "direction", null);
        Object term18244 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term18244, term18244.getClass(), "key", "");
        setField(term18244, term18244.getClass(), "direction", null);
        Object term18246 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term18246, term18246.getClass(), "key", "");
        setField(term18246, term18246.getClass(), "direction", null);
        ArrayList term18240 = new ArrayList();
        ((ArrayList) term18240).add(term18242);
        ((ArrayList) term18240).add(term18244);
        ((ArrayList) term18240).add(term18246);
        Integer term18250 = new Integer(-2068769794);
        Integer term18252 = new Integer(-117576464);
        term18201 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term18201, term18201.getClass(), "filters", term18202);
        setField(term18201, term18201.getClass(), "sorts", term18240);
        setField(term18201, term18201.getClass(), "page", term18250);
        setField(term18201, term18201.getClass(), "size", term18252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18201, args);
    }

};


