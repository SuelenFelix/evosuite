package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class JwtResponse_JwtResponseBuilder_refreshToken_18521049223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9203;

    public JwtResponse_JwtResponseBuilder_refreshToken_18521049223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9276 = new ArrayList();
        ((ArrayList) term9276).add("dtGZCsKXbW");
        ((ArrayList) term9276).add("bdyhHbDAmJ");
        ((ArrayList) term9276).add("BBXiTNHqGE");
        ((ArrayList) term9276).add("IEYhJmgCVd");
        ((ArrayList) term9276).add("KSJeYkkvpk");
        term9203 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term9203, term9203.getClass(), "token", "cSHGbqKqlN");
        setField(term9203, term9203.getClass(), "type", "pFAfANnxup");
        setField(term9203, term9203.getClass(), "refreshToken", "FbSIUZyBXZ");
        setField(term9203, term9203.getClass(), "id", "mhQDwIyrRi");
        setField(term9203, term9203.getClass(), "username", "HpZXWDPhlg");
        setField(term9203, term9203.getClass(), "email", "lBOokzEPfe");
        setField(term9203, term9203.getClass(), "roles", term9276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qUtkFGMNUV";
        callMethod(klass, "refreshToken", argTypes, term9203, args);
    }

};


