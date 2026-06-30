package com.alkemy.ong.infrastructure.rest.response.comment;

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
import static com.alkemy.ong.infrastructure.rest.response.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class FullCommentResponse_getCreatedBy_13127126603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public FullCommentResponse_getCreatedBy_13127126603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146 = new Long(-8257434502486459194L);
        term145 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term184 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term145, term145.getClass(), "id", term146);
        setField(term145, term145.getClass(), "body", "SzjVpOQTyS");
        setField(term145, term145.getClass(), "createdBy", "MjGYSRKTNF");
        setField(term145, term145.getClass(), "associatedNews", "hRNSzYYIrc");
        setIntField(term184, term184.getClass(), "nanos", 830000000);
        setLongField(term184, term184.getClass(), "fastTime", 1610929382000L);
        setField(term184, term184.getClass(), "cdate", null);
        setField(term145, term145.getClass(), "createTimestamp", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term145, args);
    }

};


