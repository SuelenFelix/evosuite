package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserChangeRequest_getPasswordConfirmation_6433088528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2829;

    public UserChangeRequest_getPasswordConfirmation_6433088528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2830 = new Long(9013624480170062917L);
        term2829 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest"));
        setField(term2829, term2829.getClass(), "id", term2830);
        setField(term2829, term2829.getClass(), "email", "sEnIVFtZuQ");
        setField(term2829, term2829.getClass(), "password", "ZVecLZMLHF");
        setField(term2829, term2829.getClass(), "passwordConfirmation", "fztQhjqwdP");
        setField(term2829, term2829.getClass(), "oldPassword", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordConfirmation", argTypes, term2829, args);
    }

};


