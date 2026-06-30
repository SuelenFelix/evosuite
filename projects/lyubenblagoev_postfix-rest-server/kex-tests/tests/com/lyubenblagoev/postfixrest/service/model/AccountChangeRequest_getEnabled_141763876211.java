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

public class AccountChangeRequest_getEnabled_141763876211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4047;

    public AccountChangeRequest_getEnabled_141763876211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4048 = new Long(-9040825890007374809L);
        Long term4086 = new Long(1368340889161782793L);
        Boolean term4088 = new Boolean(true);
        term4047 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term4047, term4047.getClass(), "id", term4048);
        setField(term4047, term4047.getClass(), "username", "HWkpTmtlrc");
        setField(term4047, term4047.getClass(), "password", "hMmaoREuCK");
        setField(term4047, term4047.getClass(), "confirmPassword", "VeDtgDzGAN");
        setField(term4047, term4047.getClass(), "domainId", term4086);
        setField(term4047, term4047.getClass(), "enabled", term4088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term4047, args);
    }

};


