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

public class UserDTO_setMeetingid_182790544613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4806;
     Object term4887;

    public UserDTO_setMeetingid_182790544613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4821 = new Integer(1953277050);
        ArrayList term4819 = new ArrayList();
        ((ArrayList) term4819).add(term4821);
        Integer term4825 = new Integer(1283079251);
        term4806 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4806, term4806.getClass(), "Type", "XJJNClzHRf");
        setField(term4806, term4806.getClass(), "idList", term4819);
        setField(term4806, term4806.getClass(), "meetingid", term4825);
        setField(term4806, term4806.getClass(), "email", "HDaezxQfQR");
        setField(term4806, term4806.getClass(), "username", "iikZEapDlu");
        setField(term4806, term4806.getClass(), "base64Face", "nhoHrZfnIN");
        setField(term4806, term4806.getClass(), "oldpassword", "ZkMALXpEAZ");
        setField(term4806, term4806.getClass(), "newpassword", "tXfQjSqDzN");
        term4887 = new Integer(-523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4887;
        callMethod(klass, "setMeetingid", argTypes, term4806, args);
    }

};


