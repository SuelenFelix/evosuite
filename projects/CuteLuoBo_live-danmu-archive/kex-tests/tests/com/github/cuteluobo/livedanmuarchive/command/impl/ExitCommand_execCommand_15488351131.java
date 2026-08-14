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
import java.lang.Object;

public class ExitCommand_execCommand_15488351131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1890;
     Object term1958;

    public ExitCommand_execCommand_15488351131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1890 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExitCommand"));
        Object[] term1897 = (Object[]) newArray("java.lang.String", 3);
        setField(term1890, term1890.getClass(), "commandName", "stop");
        setElement(term1897, 0, "NRdvgJlhkX");
        setElement(term1897, 1, "uuaPigETmJ");
        setElement(term1897, 2, "MxlszYVzRf");
        setField(term1890, term1890.getClass(), "CommandSecondName", term1897);
        setField(term1890, term1890.getClass(), "commandDescription", "-Nbk@b\tg\uFFFBN\uFFA1Rv^ \uFF90\uFFFAQ\u000Bz\uFF8F^");
        term1958 = (Object[]) newArray("java.lang.String", 4);
        setElement(term1958, 0, "LQFpaHEwXR");
        setElement(term1958, 1, "oVcInYnLWB");
        setElement(term1958, 2, "aJlieCFVtF");
        setElement(term1958, 3, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.command.impl.ExitCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1958;
        callMethod(klass, "execCommand", argTypes, term1890, args);
    }

};


