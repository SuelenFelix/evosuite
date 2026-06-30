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

public class AccountChangeRequest_getDomainId_3855903329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3899;

    public AccountChangeRequest_getDomainId_3855903329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3900 = new Long(1672578078364590450L);
        Long term3938 = new Long(4949335493504695457L);
        Boolean term3940 = new Boolean(false);
        term3899 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term3899, term3899.getClass(), "id", term3900);
        setField(term3899, term3899.getClass(), "username", "MwwjNtdOFT");
        setField(term3899, term3899.getClass(), "password", "VYkqXKVlAJ");
        setField(term3899, term3899.getClass(), "confirmPassword", "XkIoWJRNwN");
        setField(term3899, term3899.getClass(), "domainId", term3938);
        setField(term3899, term3899.getClass(), "enabled", term3940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomainId", argTypes, term3899, args);
    }

};


