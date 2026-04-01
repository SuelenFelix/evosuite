package com.rnd.aws.model;

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
import static com.rnd.aws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ErrorModel_setField_7725475906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712;

    public ErrorModel_setField_7725475906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712 = newInstance(Class.forName("com.rnd.aws.model.ErrorModel"));
        setField(term712, term712.getClass(), "message", "aJlieCFVtF");
        setField(term712, term712.getClass(), "field", "ZiaGIbnzTs");
        setField(term712, term712.getClass(), "description", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rnd.aws.model.ErrorModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setField", argTypes, term712, args);
    }

};


