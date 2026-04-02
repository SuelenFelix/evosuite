package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Account_getPassword_156626717012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5805;

    public Account_getPassword_156626717012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5805 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        setField(term5805, term5805.getClass(), "domain", null);
        setField(term5805, term5805.getClass(), "username", null);
        setField(term5805, term5805.getClass(), "password", null);
        setField(term5805, term5805.getClass(), "id", null);
        setBooleanField(term5805, term5805.getClass(), "enabled", false);
        setField(term5805, term5805.getClass(), "created", null);
        setField(term5805, term5805.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term5805, args);
    }

};


