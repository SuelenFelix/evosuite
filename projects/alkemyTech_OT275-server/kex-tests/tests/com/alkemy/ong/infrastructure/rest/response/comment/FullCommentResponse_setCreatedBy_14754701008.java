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

public class FullCommentResponse_setCreatedBy_14754701008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;

    public FullCommentResponse_setCreatedBy_14754701008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term530 = new Long(-7237588299778557629L);
        term529 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term568 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term529, term529.getClass(), "id", term530);
        setField(term529, term529.getClass(), "body", "xOEqzGAmDU");
        setField(term529, term529.getClass(), "createdBy", "eZFUvlxvGV");
        setField(term529, term529.getClass(), "associatedNews", "BYqFIqCKAV");
        setIntField(term568, term568.getClass(), "nanos", 288000000);
        setLongField(term568, term568.getClass(), "fastTime", 1495346663000L);
        setField(term568, term568.getClass(), "cdate", null);
        setField(term529, term529.getClass(), "createTimestamp", term568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setCreatedBy", argTypes, term529, args);
    }

};


