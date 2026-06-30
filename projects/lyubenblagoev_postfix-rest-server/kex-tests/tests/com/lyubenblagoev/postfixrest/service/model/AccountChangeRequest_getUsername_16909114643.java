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

public class AccountChangeRequest_getUsername_16909114643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3395;

    public AccountChangeRequest_getUsername_16909114643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3396 = new Long(4474998035090263139L);
        Long term3434 = new Long(2848819812340321742L);
        Boolean term3436 = new Boolean(true);
        term3395 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3395, term3395.getClass(), "id", term3396);
        setField(term3395, term3395.getClass(), "username", "AKNapTAfmD");
        setField(term3395, term3395.getClass(), "password", "xJgPlLxpgC");
        setField(term3395, term3395.getClass(), "confirmPassword", "EYtfuJaxiM");
        setField(term3395, term3395.getClass(), "domainId", term3434);
        setField(term3395, term3395.getClass(), "enabled", term3436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term3395, args);
    }

};


