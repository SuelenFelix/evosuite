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

public class AccountChangeRequest_setPassword_9506372436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3636;

    public AccountChangeRequest_setPassword_9506372436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3637 = new Long(-2177368829816872572L);
        Long term3675 = new Long(-8463029266761149071L);
        Boolean term3677 = new Boolean(true);
        term3636 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3636, term3636.getClass(), "id", term3637);
        setField(term3636, term3636.getClass(), "username", "yVMkkQhvmN");
        setField(term3636, term3636.getClass(), "password", "mvrkADEgpp");
        setField(term3636, term3636.getClass(), "confirmPassword", "pXOkjyeIRb");
        setField(term3636, term3636.getClass(), "domainId", term3675);
        setField(term3636, term3636.getClass(), "enabled", term3677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        callMethod(klass, "setPassword", argTypes, term3636, args);
    }

};


