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

public class GetUserResponse_getRole_137415602210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5225;

    public GetUserResponse_getRole_137415602210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5226 = new Long(-2068172595987555756L);
        term5225 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term5225, term5225.getClass(), "id", term5226);
        setField(term5225, term5225.getClass(), "firstName", "beAMpkroCQ");
        setField(term5225, term5225.getClass(), "lastName", "uSUvKAyuvd");
        setField(term5225, term5225.getClass(), "email", "onQLVONGuf");
        setField(term5225, term5225.getClass(), "role", "SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term5225, args);
    }

};


