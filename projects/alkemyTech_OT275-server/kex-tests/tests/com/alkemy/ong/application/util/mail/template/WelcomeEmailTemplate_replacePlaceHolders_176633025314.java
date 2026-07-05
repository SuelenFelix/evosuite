package com.alkemy.ong.application.util.mail.template;

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
import static com.alkemy.ong.application.util.mail.template.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WelcomeEmailTemplate_replacePlaceHolders_176633025314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764;

    public WelcomeEmailTemplate_replacePlaceHolders_176633025314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1764 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        setField(term1764, term1764.getClass(), "addressContact", null);
        setField(term1764, term1764.getClass(), "organization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replacePlaceHolders", argTypes, term1764, args);
    }

};


