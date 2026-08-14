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

public class CommandCenter_getHelpTip_19760150778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87252;

    public CommandCenter_getHelpTip_19760150778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87252 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter"));
        setField(term87252, term87252.getClass(), "logger", null);
        setField(term87252, term87252.getClass(), "console", null);
        setField(term87252, term87252.getClass(), "scanner", null);
        setField(term87252, term87252.getClass(), "helpTip", null);
        setField(term87252, term87252.getClass(), "commandMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpTip", argTypes, term87252, args);
    }

};


