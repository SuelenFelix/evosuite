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

public class FullCommentResponse_getBody_15392410852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public FullCommentResponse_getBody_15392410852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74 = new Long(6375119433582206027L);
        term73 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term112 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term73, term73.getClass(), "id", term74);
        setField(term73, term73.getClass(), "body", "xxtlPwDYFs");
        setField(term73, term73.getClass(), "createdBy", "jJCZpVmanW");
        setField(term73, term73.getClass(), "associatedNews", "EGtDIRbSSb");
        setIntField(term112, term112.getClass(), "nanos", 369000000);
        setLongField(term112, term112.getClass(), "fastTime", 1480427551000L);
        setField(term112, term112.getClass(), "cdate", null);
        setField(term73, term73.getClass(), "createTimestamp", term112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term73, args);
    }

};


