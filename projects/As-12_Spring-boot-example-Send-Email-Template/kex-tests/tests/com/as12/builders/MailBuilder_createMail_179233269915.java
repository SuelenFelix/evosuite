package com.as12.builders;

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
import static com.as12.builders.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MailBuilder_createMail_179233269915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;

    public MailBuilder_createMail_179233269915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1086 = newInstance(Class.forName("com.as12.builders.MailBuilder"));
        setField(term1086, term1086.getClass(), "subject", null);
        setField(term1086, term1086.getClass(), "mailTo", null);
        setField(term1086, term1086.getClass(), "mailFrom", null);
        setField(term1086, term1086.getClass(), "template", null);
        setField(term1086, term1086.getClass(), "velocityContext", null);
        setField(term1086, term1086.getClass(), "velocityEngine", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.builders.MailBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createMail", argTypes, term1086, args);
    }

};


