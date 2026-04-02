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

public class ErrorResponse_ErrorResponseBuilder_moreInfo_3147790023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;
     Object term333;

    public ErrorResponse_ErrorResponseBuilder_moreInfo_3147790023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term293 = new ArrayList();
        ((ArrayList) term293).add("LQFpaHEwXR");
        ((ArrayList) term293).add("oVcInYnLWB");
        ((ArrayList) term293).add("aJlieCFVtF");
        term279 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder"));
        setIntField(term279, term279.getClass(), "statusCode", 391863371);
        setField(term279, term279.getClass(), "message", "MxlszYVzRf");
        setField(term279, term279.getClass(), "moreInfo", term293);
        term333 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term333;
        callMethod(klass, "moreInfo", argTypes, term279, args);
    }

};


