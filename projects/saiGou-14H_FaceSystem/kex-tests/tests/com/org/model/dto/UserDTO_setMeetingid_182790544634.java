package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDTO_setMeetingid_182790544634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6050;

    public UserDTO_setMeetingid_182790544634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6050 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term6050, term6050.getClass(), "Type", null);
        setField(term6050, term6050.getClass(), "idList", null);
        setField(term6050, term6050.getClass(), "meetingid", null);
        setField(term6050, term6050.getClass(), "email", null);
        setField(term6050, term6050.getClass(), "username", null);
        setField(term6050, term6050.getClass(), "base64Face", null);
        setField(term6050, term6050.getClass(), "oldpassword", null);
        setField(term6050, term6050.getClass(), "newpassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMeetingid", argTypes, term6050, args);
    }

};


