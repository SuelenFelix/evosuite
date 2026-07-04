package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMeeting_getStartTime_151336359228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41031;

    public UserMeeting_getStartTime_151336359228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41031 = newInstance(Class.forName("com.org.model.UserMeeting"));
        setField(term41031, term41031.getClass(), "id", null);
        setField(term41031, term41031.getClass(), "umPower", null);
        setField(term41031, term41031.getClass(), "createTime", null);
        setField(term41031, term41031.getClass(), "userId", null);
        setField(term41031, term41031.getClass(), "meetingId", null);
        setField(term41031, term41031.getClass(), "updateTime", null);
        setField(term41031, term41031.getClass(), "startTime", null);
        setField(term41031, term41031.getClass(), "state", null);
        setField(term41031, term41031.getClass(), "endTime", null);
        setField(term41031, term41031.getClass(), "deleted", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term41031, args);
    }

};


