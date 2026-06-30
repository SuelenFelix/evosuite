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

public class ErrorResponse_getMessage_6831599764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;

    public ErrorResponse_getMessage_6831599764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1488 = new ArrayList();
        ((ArrayList) term1488).add("uWHnvSvaPl");
        ((ArrayList) term1488).add("kBdSllIBVz");
        ((ArrayList) term1488).add("TJmVBGfTML");
        ((ArrayList) term1488).add("tPlsykYBqO");
        ((ArrayList) term1488).add("bLPjGVBhlX");
        ((ArrayList) term1488).add("whBvTVIIlC");
        ((ArrayList) term1488).add("IgRJUzaCwW");
        ((ArrayList) term1488).add("JUmudUmaaV");
        ((ArrayList) term1488).add("KoyGrUJeJW");
        term1474 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse"));
        setIntField(term1474, term1474.getClass(), "statusCode", -226514366);
        setField(term1474, term1474.getClass(), "message", "fhkbdRViHi");
        setField(term1474, term1474.getClass(), "moreInfo", term1488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term1474, args);
    }

};


