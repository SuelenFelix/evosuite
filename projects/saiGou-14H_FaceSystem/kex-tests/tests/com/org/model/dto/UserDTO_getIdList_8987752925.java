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

public class UserDTO_getIdList_8987752925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6041;

    public UserDTO_getIdList_8987752925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6041 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term6041, term6041.getClass(), "Type", null);
        setField(term6041, term6041.getClass(), "idList", null);
        setField(term6041, term6041.getClass(), "meetingid", null);
        setField(term6041, term6041.getClass(), "email", null);
        setField(term6041, term6041.getClass(), "username", null);
        setField(term6041, term6041.getClass(), "base64Face", null);
        setField(term6041, term6041.getClass(), "oldpassword", null);
        setField(term6041, term6041.getClass(), "newpassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdList", argTypes, term6041, args);
    }

};


