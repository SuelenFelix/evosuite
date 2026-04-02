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

public class OAuthToken_getScope_14760697255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;

    public OAuthToken_getScope_14760697255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term365, term365.getClass(), "access_token", "ZiaGIbnzTs");
        setField(term365, term365.getClass(), "token_type", "tbcdzjIfER");
        setField(term365, term365.getClass(), "refresh_token", "HyxfbSQYBe");
        setIntField(term365, term365.getClass(), "expires_in", 1227103734);
        setField(term365, term365.getClass(), "scope", "pCTimMblYc");
        setIntField(term365, term365.getClass(), "refresh_token_expires_in", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term365, args);
    }

};


