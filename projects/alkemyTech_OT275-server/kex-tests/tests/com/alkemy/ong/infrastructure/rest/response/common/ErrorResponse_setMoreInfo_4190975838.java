package com.alkemy.ong.infrastructure.rest.response.common;

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
import static com.alkemy.ong.infrastructure.rest.response.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class ErrorResponse_setMoreInfo_4190975838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2028;
     Object term2058;

    public ErrorResponse_setMoreInfo_4190975838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2042 = new ArrayList();
        ((ArrayList) term2042).add("jSpAteRute");
        term2028 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse"));
        setIntField(term2028, term2028.getClass(), "statusCode", -1145578966);
        setField(term2028, term2028.getClass(), "message", "PkWMRdJcBb");
        setField(term2028, term2028.getClass(), "moreInfo", term2042);
        term2058 = new LinkedList();
        ((LinkedList) term2058).add("swZVeJAxjt");
        ((LinkedList) term2058).add("xOcJIiQQDu");
        ((LinkedList) term2058).add("");
        ((LinkedList) term2058).add((Object)null);
        ((LinkedList) term2058).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2058;
        callMethod(klass, "setMoreInfo", argTypes, term2028, args);
    }

};


