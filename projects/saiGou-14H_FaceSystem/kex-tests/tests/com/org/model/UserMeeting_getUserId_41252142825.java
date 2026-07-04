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

public class UserMeeting_getUserId_41252142825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41028;

    public UserMeeting_getUserId_41252142825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41028 = newInstance(Class.forName("com.org.model.UserMeeting"));
        setField(term41028, term41028.getClass(), "id", null);
        setField(term41028, term41028.getClass(), "umPower", null);
        setField(term41028, term41028.getClass(), "createTime", null);
        setField(term41028, term41028.getClass(), "userId", null);
        setField(term41028, term41028.getClass(), "meetingId", null);
        setField(term41028, term41028.getClass(), "updateTime", null);
        setField(term41028, term41028.getClass(), "startTime", null);
        setField(term41028, term41028.getClass(), "state", null);
        setField(term41028, term41028.getClass(), "endTime", null);
        setField(term41028, term41028.getClass(), "deleted", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term41028, args);
    }

};


