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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FilterRequest_FilterRequestBuilder_build_3880957717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29156;

    public FilterRequest_FilterRequestBuilder_build_3880957717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29198 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term29197 = ((Class) term29198).getDeclaredField((String) "CHAR");
        ((Field) term29197).setAccessible(true);
        Object enum89 = ((Field) term29197).get((Object) null);
        Object term29181 = newInstance(Class.forName("java.lang.Object"));
        Object term29182 = newInstance(Class.forName("java.lang.Object"));
        Object term29183 = newInstance(Class.forName("java.lang.Object"));
        Object term29184 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term29179 = new ArrayList();
        ((ArrayList) term29179).add(term29181);
        ((ArrayList) term29179).add(term29182);
        ((ArrayList) term29179).add(term29183);
        ((ArrayList) term29179).add(term29184);
        term29156 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term29177 = newInstance(Class.forName("java.lang.Object"));
        Object term29178 = newInstance(Class.forName("java.lang.Object"));
        setField(term29156, term29156.getClass(), "key", "CFyoseFGLF");
        setField(term29156, term29156.getClass(), "operator", null);
        setField(term29156, term29156.getClass(), "fieldType", enum89);
        setField(term29156, term29156.getClass(), "value", term29177);
        setField(term29156, term29156.getClass(), "valueTo", term29178);
        setField(term29156, term29156.getClass(), "values", term29179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term29156, args);
    }

};


