package com.lyubenblagoev.postfixrest.service;

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
import static com.lyubenblagoev.postfixrest.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class AccountServiceImpl_save_16324944303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327;

    public AccountServiceImpl_save_16324944303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2328 = new Long(6682528376118987775L);
        Long term2366 = new Long(682356318767179819L);
        Boolean term2368 = new Boolean(true);
        term2327 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term2327, term2327.getClass(), "id", term2328);
        setField(term2327, term2327.getClass(), "username", "cAPeiZHKGJ");
        setField(term2327, term2327.getClass(), "password", "LvJFtLBaxj");
        setField(term2327, term2327.getClass(), "confirmPassword", "PHvxnGHptP");
        setField(term2327, term2327.getClass(), "domainId", term2366);
        setField(term2327, term2327.getClass(), "enabled", term2368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.AccountServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Object[] args = new Object[1];
        args[0] = term2327;
        callMethod(klass, "save", argTypes, null, args);
    }

};


