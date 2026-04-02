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

public class OAuthToken_canEqual_89832177314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1277;
     Object term1328;

    public OAuthToken_canEqual_89832177314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1277 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1277, term1277.getClass(), "access_token", "ffYhPOzlUs");
        setField(term1277, term1277.getClass(), "token_type", "MLqYREekMl");
        setField(term1277, term1277.getClass(), "refresh_token", "ytSBIKXogI");
        setIntField(term1277, term1277.getClass(), "expires_in", -1275173084);
        setField(term1277, term1277.getClass(), "scope", "nHXjMycHlU");
        setIntField(term1277, term1277.getClass(), "refresh_token_expires_in", -244121226);
        term1328 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1328;
        callMethod(klass, "canEqual", argTypes, term1277, args);
    }

};


