package com.usantatecla.ustumlserver.infrastructure.api.dtos;

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
import static com.usantatecla.ustumlserver.infrastructure.api.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CommandResponseDto_getDirectoryTree_12099659963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public CommandResponseDto_getDirectoryTree_12099659963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.CommandResponseDto"));
        setField(term268, term268.getClass(), "activeMemberID", "MxlszYVzRf");
        setField(term268, term268.getClass(), "plantUML", "LQFpaHEwXR");
        setField(term268, term268.getClass(), "ustUML", "oVcInYnLWB");
        setField(term268, term268.getClass(), "directoryTree", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.CommandResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirectoryTree", argTypes, term268, args);
    }

};


