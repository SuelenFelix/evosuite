package com.pfa.app.controller.web;

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
import static com.pfa.app.controller.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CredentialController_init_3405410320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CredentialController_init_3405410320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.controller.web.CredentialController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.pfa.app.service.CredentialService");
        argTypes[1] = Class.forName("com.pfa.app.util.email.EmailUtil");
        argTypes[2] = Class.forName("com.pfa.app.util.sms.SmsUtil");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


