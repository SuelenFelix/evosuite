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
import java.util.ArrayList;
import java.lang.Integer;

public class UserDTO_getNewpassword_5842077210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4340;

    public UserDTO_getNewpassword_5842077210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4355 = new Integer(9726679);
        ArrayList term4353 = new ArrayList();
        ((ArrayList) term4353).add(term4355);
        Integer term4359 = new Integer(-25637976);
        term4340 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4340, term4340.getClass(), "Type", "igCAtimmYB");
        setField(term4340, term4340.getClass(), "idList", term4353);
        setField(term4340, term4340.getClass(), "meetingid", term4359);
        setField(term4340, term4340.getClass(), "email", "DyiXbeYIaN");
        setField(term4340, term4340.getClass(), "username", "VGizxZnyHX");
        setField(term4340, term4340.getClass(), "base64Face", "kVEZMHmRtR");
        setField(term4340, term4340.getClass(), "oldpassword", "ekxGuOYIwi");
        setField(term4340, term4340.getClass(), "newpassword", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewpassword", argTypes, term4340, args);
    }

};


