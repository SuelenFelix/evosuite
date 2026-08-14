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

public class Mail_toString_187785590235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3168;

    public Mail_toString_187785590235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3168 = newInstance(Class.forName("com.as12.models.Mail"));
        setField(term3168, term3168.getClass(), "mailFrom", null);
        setField(term3168, term3168.getClass(), "mailTo", null);
        setField(term3168, term3168.getClass(), "mailCc", null);
        setField(term3168, term3168.getClass(), "mailBcc", null);
        setField(term3168, term3168.getClass(), "mailSubject", null);
        setField(term3168, term3168.getClass(), "mailContent", null);
        setField(term3168, term3168.getClass(), "templateName", null);
        setField(term3168, term3168.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.models.Mail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3168, args);
    }

};


