package com.github.cuteluobo.livedanmuarchive.command.base;

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
import static com.github.cuteluobo.livedanmuarchive.command.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CommandCenter_startCommandListen_17951372162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21949;

    public CommandCenter_startCommandListen_17951372162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21949 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter"));
        setField(term21949, term21949.getClass(), "logger", null);
        setField(term21949, term21949.getClass(), "console", null);
        setField(term21949, term21949.getClass(), "scanner", null);
        setField(term21949, term21949.getClass(), "helpTip", null);
        setField(term21949, term21949.getClass(), "commandMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "startCommandListen", argTypes, term21949, args);
    }

};


