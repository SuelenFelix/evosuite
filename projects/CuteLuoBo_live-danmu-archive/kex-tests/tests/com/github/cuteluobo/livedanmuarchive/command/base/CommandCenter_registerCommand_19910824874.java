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
import java.lang.Boolean;

public class CommandCenter_registerCommand_19910824874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43697;
     Object term43698;

    public CommandCenter_registerCommand_19910824874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43697 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter"));
        setField(term43697, term43697.getClass(), "logger", null);
        setField(term43697, term43697.getClass(), "console", null);
        setField(term43697, term43697.getClass(), "scanner", null);
        setField(term43697, term43697.getClass(), "helpTip", null);
        setField(term43697, term43697.getClass(), "commandMap", null);
        term43698 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.CommandCenter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.command.base.ICommand");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43698;
        callMethod(klass, "registerCommand", argTypes, term43697, args);
    }

};


