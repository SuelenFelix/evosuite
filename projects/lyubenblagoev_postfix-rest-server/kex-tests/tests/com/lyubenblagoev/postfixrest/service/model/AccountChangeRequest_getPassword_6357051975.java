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

public class AccountChangeRequest_getPassword_6357051975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;

    public AccountChangeRequest_getPassword_6357051975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3564 = new Long(6689117472719450333L);
        Long term3602 = new Long(5836128569274066678L);
        Boolean term3604 = new Boolean(false);
        term3563 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3563, term3563.getClass(), "id", term3564);
        setField(term3563, term3563.getClass(), "username", "PznxWXsZME");
        setField(term3563, term3563.getClass(), "password", "ZzIujlwVsw");
        setField(term3563, term3563.getClass(), "confirmPassword", "LWyEaeIyAo");
        setField(term3563, term3563.getClass(), "domainId", term3602);
        setField(term3563, term3563.getClass(), "enabled", term3604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3563, args);
    }

};


