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

public class OAuthToken_getRefreshtokenexpiresin_7607268006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;

    public OAuthToken_getRefreshtokenexpiresin_7607268006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term456, term456.getClass(), "access_token", "hNxWaHcfhY");
        setField(term456, term456.getClass(), "token_type", "RkybSrpybU");
        setField(term456, term456.getClass(), "refresh_token", "xOEqzGAmDU");
        setIntField(term456, term456.getClass(), "expires_in", 1725571209);
        setField(term456, term456.getClass(), "scope", "eZFUvlxvGV");
        setIntField(term456, term456.getClass(), "refresh_token_expires_in", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefresh_token_expires_in", argTypes, term456, args);
    }

};


