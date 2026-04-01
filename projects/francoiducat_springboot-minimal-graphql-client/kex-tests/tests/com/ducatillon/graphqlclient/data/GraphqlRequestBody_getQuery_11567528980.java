package com.ducatillon.graphqlclient.data;

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
import static com.ducatillon.graphqlclient.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphqlRequestBody_getQuery_11567528980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GraphqlRequestBody_getQuery_11567528980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.GraphqlRequestBody"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        setField(term1, term1.getClass(), "query", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "variables", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.GraphqlRequestBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuery", argTypes, term1, args);
    }

};


