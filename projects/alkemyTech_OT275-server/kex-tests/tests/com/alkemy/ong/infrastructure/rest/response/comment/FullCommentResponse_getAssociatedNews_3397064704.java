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

public class FullCommentResponse_getAssociatedNews_3397064704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public FullCommentResponse_getAssociatedNews_3397064704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218 = new Long(-8400487765614892086L);
        term217 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term256 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term217, term217.getClass(), "id", term218);
        setField(term217, term217.getClass(), "body", "RMFIsYGgne");
        setField(term217, term217.getClass(), "createdBy", "NRdvgJlhkX");
        setField(term217, term217.getClass(), "associatedNews", "uuaPigETmJ");
        setIntField(term256, term256.getClass(), "nanos", 837000000);
        setLongField(term256, term256.getClass(), "fastTime", 1606034835000L);
        setField(term256, term256.getClass(), "cdate", null);
        setField(term217, term217.getClass(), "createTimestamp", term256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssociatedNews", argTypes, term217, args);
    }

};


