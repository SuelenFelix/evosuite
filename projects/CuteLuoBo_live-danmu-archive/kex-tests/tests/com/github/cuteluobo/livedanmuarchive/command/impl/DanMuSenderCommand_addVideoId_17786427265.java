package com.github.cuteluobo.livedanmuarchive.command.impl;

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
import static com.github.cuteluobo.livedanmuarchive.command.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuSenderCommand_addVideoId_17786427265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3395;

    public DanMuSenderCommand_addVideoId_17786427265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3395 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand"));
        setField(term3395, term3395.getClass(), "logger", null);
        setField(term3395, term3395.getClass(), "subCommandMap", null);
        setField(term3395, term3395.getClass(), "commandName", null);
        setField(term3395, term3395.getClass(), "CommandSecondName", null);
        setField(term3395, term3395.getClass(), "commandDescription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.DanMuSenderCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addVideoId", argTypes, term3395, args);
    }

};


