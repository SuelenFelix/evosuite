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

public class FullCommentResponse_setBody_1806354837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public FullCommentResponse_setBody_1806354837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term436 = new Long(6811161968424632369L);
        term435 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term474 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term435, term435.getClass(), "id", term436);
        setField(term435, term435.getClass(), "body", "HyxfbSQYBe");
        setField(term435, term435.getClass(), "createdBy", "pCTimMblYc");
        setField(term435, term435.getClass(), "associatedNews", "hNxWaHcfhY");
        setIntField(term474, term474.getClass(), "nanos", 389000000);
        setLongField(term474, term474.getClass(), "fastTime", 1429013051000L);
        setField(term474, term474.getClass(), "cdate", null);
        setField(term435, term435.getClass(), "createTimestamp", term474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setBody", argTypes, term435, args);
    }

};


