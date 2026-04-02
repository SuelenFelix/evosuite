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

public class OAuthToken_setRefreshtoken_4527561969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public OAuthToken_setRefreshtoken_4527561969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term773, term773.getClass(), "access_token", "kuTXqwMtDB");
        setField(term773, term773.getClass(), "token_type", "Ghbwtircqb");
        setField(term773, term773.getClass(), "refresh_token", "xrwlQZdwCp");
        setIntField(term773, term773.getClass(), "expires_in", -1685132342);
        setField(term773, term773.getClass(), "scope", "IDCWpPLRkE");
        setIntField(term773, term773.getClass(), "refresh_token_expires_in", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "setRefresh_token", argTypes, term773, args);
    }

};


