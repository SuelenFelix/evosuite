package ru.smartup.timetracker.email.template.impl;

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
import static ru.smartup.timetracker.email.template.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SuccessFreezeTemplate_getTemplate_4572070484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;

    public SuccessFreezeTemplate_getTemplate_4572070484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.SuccessFreezeTemplate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.SuccessFreezeTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getTemplate", argTypes, term746, args);
    }

};


