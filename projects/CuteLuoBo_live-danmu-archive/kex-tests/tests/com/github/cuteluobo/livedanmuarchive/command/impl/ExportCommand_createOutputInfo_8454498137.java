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
import java.lang.Integer;
import java.lang.Long;

public class ExportCommand_createOutputInfo_8454498137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;
     Object term1880;
     Object term1882;
     Object term1884;
     Object term1886;
     Object term1888;

    public ExportCommand_createOutputInfo_8454498137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1879 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand"));
        setField(term1879, term1879.getClass(), "logger", null);
        setField(term1879, term1879.getClass(), "subCommandMap", null);
        setField(term1879, term1879.getClass(), "commandName", null);
        setField(term1879, term1879.getClass(), "CommandSecondName", null);
        setField(term1879, term1879.getClass(), "commandDescription", null);
        term1880 = new Integer(0);
        term1882 = new Long(0L);
        term1884 = new Long(0L);
        term1886 = new Integer(0);
        term1888 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExportCommand");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = term1880;
        args[1] = term1882;
        args[2] = term1884;
        args[3] = term1886;
        args[4] = null;
        args[5] = term1888;
        callMethod(klass, "createOutputInfo", argTypes, term1879, args);
    }

};


