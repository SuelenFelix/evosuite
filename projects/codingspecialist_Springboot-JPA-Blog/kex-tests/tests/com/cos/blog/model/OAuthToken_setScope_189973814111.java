package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OAuthToken_setScope_189973814111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public OAuthToken_setScope_189973814111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term979, term979.getClass(), "access_token", "hxCBltsObl");
        setField(term979, term979.getClass(), "token_type", "BndsHwAFMv");
        setField(term979, term979.getClass(), "refresh_token", "GzFkzHGYFt");
        setIntField(term979, term979.getClass(), "expires_in", -6029667);
        setField(term979, term979.getClass(), "scope", "tShwQLRGNe");
        setIntField(term979, term979.getClass(), "refresh_token_expires_in", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        callMethod(klass, "setScope", argTypes, term979, args);
    }

};


