package com.ducatillon.graphqlclient;

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
import static com.ducatillon.graphqlclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphqlClientApplication_main_3448583241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;

    public GraphqlClientApplication_main_3448583241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635 = (Object[]) newArray("java.lang.String", 5);
        setElement(term635, 0, "kBdSllIBVz");
        setElement(term635, 1, "TJmVBGfTML");
        setElement(term635, 2, "tPlsykYBqO");
        setElement(term635, 3, "bLPjGVBhlX");
        setElement(term635, 4, "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.GraphqlClientApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term635;
        callMethod(klass, "main", argTypes, null, args);
    }

};


