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

public class AccountChangeRequest_setDomainId_133042979410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3972;
     Object term4015;

    public AccountChangeRequest_setDomainId_133042979410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3973 = new Long(-5216789073301458893L);
        Long term4011 = new Long(-1832940336320585644L);
        Boolean term4013 = new Boolean(true);
        term3972 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3972, term3972.getClass(), "id", term3973);
        setField(term3972, term3972.getClass(), "username", "aNWLJdrZMq");
        setField(term3972, term3972.getClass(), "password", "HHmNoYxIGj");
        setField(term3972, term3972.getClass(), "confirmPassword", "PtirvZmsGt");
        setField(term3972, term3972.getClass(), "domainId", term4011);
        setField(term3972, term3972.getClass(), "enabled", term4013);
        term4015 = new Long(-8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4015;
        callMethod(klass, "setDomainId", argTypes, term3972, args);
    }

};


