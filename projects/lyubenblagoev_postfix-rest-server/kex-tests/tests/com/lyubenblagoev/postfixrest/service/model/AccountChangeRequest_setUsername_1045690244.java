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

public class AccountChangeRequest_setUsername_1045690244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;

    public AccountChangeRequest_setUsername_1045690244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3469 = new Long(-8876856890348836498L);
        Long term3507 = new Long(846579494941632714L);
        Boolean term3509 = new Boolean(false);
        term3468 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3468, term3468.getClass(), "id", term3469);
        setField(term3468, term3468.getClass(), "username", "gCWtLVKVVe");
        setField(term3468, term3468.getClass(), "password", "fWKJoSoCwE");
        setField(term3468, term3468.getClass(), "confirmPassword", "wfaXBpWAUH");
        setField(term3468, term3468.getClass(), "domainId", term3507);
        setField(term3468, term3468.getClass(), "enabled", term3509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VMeAzAHwZj";
        callMethod(klass, "setUsername", argTypes, term3468, args);
    }

};


