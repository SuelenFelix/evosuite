package com.github.hannotify.elevencrazyjavathings.number10;

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
import static com.github.hannotify.elevencrazyjavathings.number10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Talk_init_14993763120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public Talk_init_14993763120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("java.time.LocalTime"));
        setByteField(term26, term26.getClass(), "hour", (byte) 12);
        setByteField(term26, term26.getClass(), "minute", (byte) 32);
        setByteField(term26, term26.getClass(), "second", (byte) 20);
        setIntField(term26, term26.getClass(), "nano", 132387463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number10.Talk");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalTime");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term26;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


