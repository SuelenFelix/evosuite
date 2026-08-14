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

public class MailBuilder_AddContext_55975631914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;

    public MailBuilder_AddContext_55975631914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1085 = newInstance(Class.forName("com.as12.builders.MailBuilder"));
        setField(term1085, term1085.getClass(), "subject", null);
        setField(term1085, term1085.getClass(), "mailTo", null);
        setField(term1085, term1085.getClass(), "mailFrom", null);
        setField(term1085, term1085.getClass(), "template", null);
        setField(term1085, term1085.getClass(), "velocityContext", null);
        setField(term1085, term1085.getClass(), "velocityEngine", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.as12.builders.MailBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "AddContext", argTypes, term1085, args);
    }

};


