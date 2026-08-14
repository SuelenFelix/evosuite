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
import java.util.LinkedList;
import java.lang.Object;

public class JwtResponse_init_19767602131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2674;

    public JwtResponse_init_19767602131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2674 = new LinkedList();
        ((LinkedList) term2674).add("fztQhjqwdP");
        ((LinkedList) term2674).add("eVpkWxjuki");
        ((LinkedList) term2674).add("");
        ((LinkedList) term2674).add((Object)null);
        ((LinkedList) term2674).add((Object)null);
        ((LinkedList) term2674).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.List");
        Object[] args = new Object[7];
        args[0] = "vjxIhXHxGR";
        args[1] = "QXzGXbEXMu";
        args[2] = "qxSDVejjiY";
        args[3] = "xBsXSDjXYK";
        args[4] = "sEnIVFtZuQ";
        args[5] = "ZVecLZMLHF";
        args[6] = term2674;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


