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

public class JwtResponse_JwtResponseBuilder_username_16273725905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9741;

    public JwtResponse_JwtResponseBuilder_username_16273725905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9814 = new ArrayList();
        ((ArrayList) term9814).add("oKwCDqywym");
        ((ArrayList) term9814).add("zjZYTddemL");
        ((ArrayList) term9814).add("QtrylgCLiF");
        ((ArrayList) term9814).add("orEuhCStGM");
        term9741 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term9741, term9741.getClass(), "token", "IkpjUOuWQU");
        setField(term9741, term9741.getClass(), "type", "boSSpezHeU");
        setField(term9741, term9741.getClass(), "refreshToken", "OUeBWNTQDh");
        setField(term9741, term9741.getClass(), "id", "gltJarNuUk");
        setField(term9741, term9741.getClass(), "username", "ZwZIDwYcSW");
        setField(term9741, term9741.getClass(), "email", "sOdkipUKRu");
        setField(term9741, term9741.getClass(), "roles", term9814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HhEaSXWvrY";
        callMethod(klass, "username", argTypes, term9741, args);
    }

};


