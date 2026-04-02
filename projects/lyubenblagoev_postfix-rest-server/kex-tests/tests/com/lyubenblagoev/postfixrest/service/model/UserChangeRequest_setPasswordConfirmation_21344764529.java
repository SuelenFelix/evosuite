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

public class UserChangeRequest_setPasswordConfirmation_21344764529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2920;

    public UserChangeRequest_setPasswordConfirmation_21344764529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2921 = new Long(7862575738391801707L);
        term2920 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest"));
        setField(term2920, term2920.getClass(), "id", term2921);
        setField(term2920, term2920.getClass(), "email", "SJiQaLvSKv");
        setField(term2920, term2920.getClass(), "password", "OEXDRUKcFl");
        setField(term2920, term2920.getClass(), "passwordConfirmation", "RYdKCNNMBR");
        setField(term2920, term2920.getClass(), "oldPassword", "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvRIxilFMJ";
        callMethod(klass, "setPasswordConfirmation", argTypes, term2920, args);
    }

};


