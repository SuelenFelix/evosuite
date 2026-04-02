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

public class AccountChangeRequest_getPasswordConfirmation_10702671347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3731;

    public AccountChangeRequest_getPasswordConfirmation_10702671347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3732 = new Long(3133860696238261492L);
        Long term3770 = new Long(7247160664318067468L);
        Boolean term3772 = new Boolean(true);
        term3731 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3731, term3731.getClass(), "id", term3732);
        setField(term3731, term3731.getClass(), "username", "EeBVbzjcCI");
        setField(term3731, term3731.getClass(), "password", "UfQtPRyWRC");
        setField(term3731, term3731.getClass(), "confirmPassword", "FPvxVzzSvD");
        setField(term3731, term3731.getClass(), "domainId", term3770);
        setField(term3731, term3731.getClass(), "enabled", term3772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordConfirmation", argTypes, term3731, args);
    }

};


