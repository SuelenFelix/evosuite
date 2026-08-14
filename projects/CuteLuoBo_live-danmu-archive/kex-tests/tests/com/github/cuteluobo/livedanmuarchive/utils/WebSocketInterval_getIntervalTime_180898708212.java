package com.github.cuteluobo.livedanmuarchive.utils;

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
import static com.github.cuteluobo.livedanmuarchive.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WebSocketInterval_getIntervalTime_180898708212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;

    public WebSocketInterval_getIntervalTime_180898708212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        setField(term21, term21.getClass(), "logger", null);
        setField(term21, term21.getClass(), "intervalRun", null);
        setIntField(term21, term21.getClass(), "intervalTime", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntervalTime", argTypes, term21, args);
    }

};


