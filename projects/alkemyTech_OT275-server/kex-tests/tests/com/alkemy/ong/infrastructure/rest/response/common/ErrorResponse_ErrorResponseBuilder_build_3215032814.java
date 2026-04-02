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

public class ErrorResponse_ErrorResponseBuilder_build_3215032814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public ErrorResponse_ErrorResponseBuilder_build_3215032814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term390 = new ArrayList();
        ((ArrayList) term390).add("tbcdzjIfER");
        ((ArrayList) term390).add("HyxfbSQYBe");
        ((ArrayList) term390).add("pCTimMblYc");
        ((ArrayList) term390).add("hNxWaHcfhY");
        ((ArrayList) term390).add("RkybSrpybU");
        term376 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder"));
        setIntField(term376, term376.getClass(), "statusCode", -1922583790);
        setField(term376, term376.getClass(), "message", "ZiaGIbnzTs");
        setField(term376, term376.getClass(), "moreInfo", term390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term376, args);
    }

};


