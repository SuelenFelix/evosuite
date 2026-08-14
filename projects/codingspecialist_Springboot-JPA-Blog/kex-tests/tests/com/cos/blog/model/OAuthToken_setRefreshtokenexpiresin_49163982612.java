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
import java.lang.Integer;

public class OAuthToken_setRefreshtokenexpiresin_49163982612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092;
     Object term1143;

    public OAuthToken_setRefreshtokenexpiresin_49163982612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1092 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1092, term1092.getClass(), "access_token", "xLbjWUgOIL");
        setField(term1092, term1092.getClass(), "token_type", "jDtqGUpnZN");
        setField(term1092, term1092.getClass(), "refresh_token", "nGKItKLYNC");
        setIntField(term1092, term1092.getClass(), "expires_in", -117576464);
        setField(term1092, term1092.getClass(), "scope", "UiUYnPrcCi");
        setIntField(term1092, term1092.getClass(), "refresh_token_expires_in", -1007160944);
        term1143 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1143;
        callMethod(klass, "setRefresh_token_expires_in", argTypes, term1092, args);
    }

};


