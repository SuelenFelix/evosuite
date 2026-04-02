package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserChangeRequest_getId_20158925742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2237;

    public UserChangeRequest_getId_20158925742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2238 = new Long(-5248475803419977214L);
        term2237 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest"));
        setField(term2237, term2237.getClass(), "id", term2238);
        setField(term2237, term2237.getClass(), "email", "VgZnGoIFwQ");
        setField(term2237, term2237.getClass(), "password", "jUbSRrkrYZ");
        setField(term2237, term2237.getClass(), "passwordConfirmation", "bWWfajKbEX");
        setField(term2237, term2237.getClass(), "oldPassword", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2237, args);
    }

};


