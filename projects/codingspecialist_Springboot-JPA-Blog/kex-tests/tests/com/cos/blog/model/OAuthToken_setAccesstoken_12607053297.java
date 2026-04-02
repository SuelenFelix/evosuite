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

public class OAuthToken_setAccesstoken_12607053297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public OAuthToken_setAccesstoken_12607053297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term547, term547.getClass(), "access_token", "BYqFIqCKAV");
        setField(term547, term547.getClass(), "token_type", "vrQLuWIDJX");
        setField(term547, term547.getClass(), "refresh_token", "flxyYxBRtu");
        setIntField(term547, term547.getClass(), "expires_in", 1134449235);
        setField(term547, term547.getClass(), "scope", "OclPbYPkcH");
        setIntField(term547, term547.getClass(), "refresh_token_expires_in", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setAccess_token", argTypes, term547, args);
    }

};


