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

public class JwtResponse_setId_153810225713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5048;

    public JwtResponse_setId_153810225713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5117 = new ArrayList();
        ((ArrayList) term5117).add("NnpwZBUTvx");
        ((ArrayList) term5117).add("tlQSNgTkQX");
        ((ArrayList) term5117).add("PCipZnmBOF");
        ((ArrayList) term5117).add("zcorEihhLK");
        ((ArrayList) term5117).add("GrqozDKFOk");
        term5048 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term5048, term5048.getClass(), "token", "RMsXuyzKJV");
        setField(term5048, term5048.getClass(), "type", "Bearer");
        setField(term5048, term5048.getClass(), "refreshToken", "FwPbDZcHmB");
        setField(term5048, term5048.getClass(), "id", "hOncybyCAH");
        setField(term5048, term5048.getClass(), "username", "QduALnDSVo");
        setField(term5048, term5048.getClass(), "email", "izPpKDErnQ");
        setField(term5048, term5048.getClass(), "roles", term5117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFyoseFGLF";
        callMethod(klass, "setId", argTypes, term5048, args);
    }

};


