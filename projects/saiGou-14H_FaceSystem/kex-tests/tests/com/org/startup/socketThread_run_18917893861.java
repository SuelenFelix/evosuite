package com.org.startup;

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
import static com.org.startup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class socketThread_run_18917893861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public socketThread_run_18917893861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48 = new Integer(568599855);
        term23 = newInstance(Class.forName("com.org.startup.socketThread"));
        setField(term23, term23.getClass(), "message", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "pythonMessage", "MuLcgQHgqz");
        setField(term23, term23.getClass(), "meetingid", term48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.startup.socketThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term23, args);
    }

};


