package com.as12.models;

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
import static com.as12.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mail_getMailSubject_569406619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;

    public Mail_getMailSubject_569406619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1489 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term1489, term1489.getClass(), "mailFrom", "ieCtQFdkii");
        setField(term1489, term1489.getClass(), "mailTo", "dEnhdmILtU");
        setField(term1489, term1489.getClass(), "mailCc", "hoicvmsovO");
        setField(term1489, term1489.getClass(), "mailBcc", "eqJfYWRaEL");
        setField(term1489, term1489.getClass(), "mailSubject", "fhkbdRViHi");
        setField(term1489, term1489.getClass(), "mailContent", "uWHnvSvaPl");
        setField(term1489, term1489.getClass(), "templateName", "kBdSllIBVz");
        setField(term1489, term1489.getClass(), "contentType", "text/html");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMailSubject", argTypes, term1489, args);
    }

};


