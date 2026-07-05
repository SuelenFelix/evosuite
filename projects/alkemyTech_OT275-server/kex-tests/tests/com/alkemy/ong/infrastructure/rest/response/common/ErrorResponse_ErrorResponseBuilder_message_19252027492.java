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

public class ErrorResponse_ErrorResponseBuilder_message_19252027492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public ErrorResponse_ErrorResponseBuilder_message_19252027492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term155 = new ArrayList();
        ((ArrayList) term155).add("MjGYSRKTNF");
        ((ArrayList) term155).add("hRNSzYYIrc");
        ((ArrayList) term155).add("RMFIsYGgne");
        ((ArrayList) term155).add("NRdvgJlhkX");
        term141 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder"));
        setIntField(term141, term141.getClass(), "statusCode", 1484323161);
        setField(term141, term141.getClass(), "message", "SzjVpOQTyS");
        setField(term141, term141.getClass(), "moreInfo", term155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse$ErrorResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "message", argTypes, term141, args);
    }

};


