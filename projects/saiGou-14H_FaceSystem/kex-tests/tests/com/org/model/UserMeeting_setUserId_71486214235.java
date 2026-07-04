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

public class UserMeeting_setUserId_71486214235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41038;

    public UserMeeting_setUserId_71486214235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41038 = newInstance(Class.forName("com.org.model.UserMeeting"));
        setField(term41038, term41038.getClass(), "id", null);
        setField(term41038, term41038.getClass(), "umPower", null);
        setField(term41038, term41038.getClass(), "createTime", null);
        setField(term41038, term41038.getClass(), "userId", null);
        setField(term41038, term41038.getClass(), "meetingId", null);
        setField(term41038, term41038.getClass(), "updateTime", null);
        setField(term41038, term41038.getClass(), "startTime", null);
        setField(term41038, term41038.getClass(), "state", null);
        setField(term41038, term41038.getClass(), "endTime", null);
        setField(term41038, term41038.getClass(), "deleted", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserId", argTypes, term41038, args);
    }

};


