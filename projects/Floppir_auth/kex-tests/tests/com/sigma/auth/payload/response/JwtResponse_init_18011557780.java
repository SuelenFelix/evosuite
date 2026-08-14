package com.sigma.auth.payload.response;

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
import static com.sigma.auth.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class JwtResponse_init_18011557780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;

    public JwtResponse_init_18011557780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1237 = new LinkedList();
        ((LinkedList) term1237).add("MLqYREekMl");
        ((LinkedList) term1237).add("ytSBIKXogI");
        ((LinkedList) term1237).add("");
        ((LinkedList) term1237).add((Object)null);
        ((LinkedList) term1237).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = "UoYtihxVaS";
        args[1] = "JDswTTCZHV";
        args[2] = "onpbIeEKoi";
        args[3] = "YRHGsAkhxb";
        args[4] = "ffYhPOzlUs";
        args[5] = term1237;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


