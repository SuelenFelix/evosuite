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

public class OAuthToken_toString_163303652916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;

    public OAuthToken_toString_163303652916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1460 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1460, term1460.getClass(), "access_token", "fhkbdRViHi");
        setField(term1460, term1460.getClass(), "token_type", "uWHnvSvaPl");
        setField(term1460, term1460.getClass(), "refresh_token", "kBdSllIBVz");
        setIntField(term1460, term1460.getClass(), "expires_in", -73683645);
        setField(term1460, term1460.getClass(), "scope", "TJmVBGfTML");
        setIntField(term1460, term1460.getClass(), "refresh_token_expires_in", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1460, args);
    }

};


