package com.github.cuteluobo.livedanmuarchive.listener.impl;

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
import static com.github.cuteluobo.livedanmuarchive.listener.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuClientStopListener_doEvent_11156663563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784;

    public DanMuClientStopListener_doEvent_11156663563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.impl.DanMuClientStopListener"));
        setField(term784, term784.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.impl.DanMuClientStopListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doEvent", argTypes, term784, args);
    }

};


