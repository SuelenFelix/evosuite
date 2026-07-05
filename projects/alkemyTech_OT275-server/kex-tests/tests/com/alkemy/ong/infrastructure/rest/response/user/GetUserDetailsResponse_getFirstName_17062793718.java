package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GetUserDetailsResponse_getFirstName_17062793718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904;

    public GetUserDetailsResponse_getFirstName_17062793718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term905 = new Long(-7237588299778557629L);
        term904 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse"));
        setField(term904, term904.getClass(), "id", term905);
        setField(term904, term904.getClass(), "firstName", "wSQxaModmm");
        setField(term904, term904.getClass(), "lastName", "UlajhuVLaP");
        setField(term904, term904.getClass(), "email", "gGSMzuGICf");
        setField(term904, term904.getClass(), "imageUrl", "hxCBltsObl");
        setField(term904, term904.getClass(), "role", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term904, args);
    }

};


