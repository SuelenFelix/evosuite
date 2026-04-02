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

public class OAuthToken_setTokentype_12006337098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public OAuthToken_setTokentype_12006337098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term660, term660.getClass(), "access_token", "TEParAifyi");
        setField(term660, term660.getClass(), "token_type", "OWDIEULEFu");
        setField(term660, term660.getClass(), "refresh_token", "dWRymuLBtr");
        setIntField(term660, term660.getClass(), "expires_in", 1585847225);
        setField(term660, term660.getClass(), "scope", "AijpHYOFuy");
        setIntField(term660, term660.getClass(), "refresh_token_expires_in", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setToken_type", argTypes, term660, args);
    }

};


