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

public class FullCommentResponse_getCreateTimestamp_771178105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public FullCommentResponse_getCreateTimestamp_771178105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290 = new Long(5270370404989704783L);
        term289 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse"));
        Object term328 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term289, term289.getClass(), "id", term290);
        setField(term289, term289.getClass(), "body", "MxlszYVzRf");
        setField(term289, term289.getClass(), "createdBy", "LQFpaHEwXR");
        setField(term289, term289.getClass(), "associatedNews", "oVcInYnLWB");
        setIntField(term328, term328.getClass(), "nanos", 302000000);
        setLongField(term328, term328.getClass(), "fastTime", 1442628765000L);
        setField(term328, term328.getClass(), "cdate", null);
        setField(term289, term289.getClass(), "createTimestamp", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.FullCommentResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term289, args);
    }

};


