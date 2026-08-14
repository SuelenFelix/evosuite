package com.sigma.auth;

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
import static com.sigma.auth.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AuthApplication_main_1212842401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4949;

    public AuthApplication_main_1212842401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4949 = (Object[]) newArray("java.lang.String", 9);
        setElement(term4949, 0, "OYbzXylRWW");
        setElement(term4949, 1, "DSNsTGYXDF");
        setElement(term4949, 2, "sQvGcVjdEx");
        setElement(term4949, 3, "rLHAoqXgPh");
        setElement(term4949, 4, "zUlRdimJtU");
        setElement(term4949, 5, "vwbEQQNQrx");
        setElement(term4949, 6, "xtftXXMbem");
        setElement(term4949, 7, "cudZvLMQon");
        setElement(term4949, 8, "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.AuthApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4949;
        callMethod(klass, "main", argTypes, null, args);
    }

};


