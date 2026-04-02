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
import java.lang.Integer;

public class ErrorResponse_ErrorResponseBuilder_statusCode_12982850561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term79;

    public ErrorResponse_ErrorResponseBuilder_statusCode_12982850561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15 = new ArrayList();
        ((ArrayList) term15).add("sjlJAEtRrb");
        ((ArrayList) term15).add("MuLcgQHgqz");
        ((ArrayList) term15).add("xxtlPwDYFs");
        ((ArrayList) term15).add("jJCZpVmanW");
        ((ArrayList) term15).add("EGtDIRbSSb");
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder"));
        setIntField(term1, term1.getClass(), "statusCode", 568599855);
        setField(term1, term1.getClass(), "message", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "moreInfo", term15);
        term79 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term79;
        callMethod(klass, "statusCode", argTypes, term1, args);
    }

};


