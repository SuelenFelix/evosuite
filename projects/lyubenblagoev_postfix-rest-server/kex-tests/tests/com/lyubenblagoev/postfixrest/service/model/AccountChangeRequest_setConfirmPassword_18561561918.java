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
import java.lang.Boolean;

public class AccountChangeRequest_setConfirmPassword_18561561918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3804;

    public AccountChangeRequest_setConfirmPassword_18561561918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3805 = new Long(2135754395358000892L);
        Long term3843 = new Long(-8085190702504231560L);
        Boolean term3845 = new Boolean(false);
        term3804 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3804, term3804.getClass(), "id", term3805);
        setField(term3804, term3804.getClass(), "username", "WHcwFgsGFC");
        setField(term3804, term3804.getClass(), "password", "HzqpegHiRq");
        setField(term3804, term3804.getClass(), "confirmPassword", "jwsfVjMoJT");
        setField(term3804, term3804.getClass(), "domainId", term3843);
        setField(term3804, term3804.getClass(), "enabled", term3845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        callMethod(klass, "setConfirmPassword", argTypes, term3804, args);
    }

};


