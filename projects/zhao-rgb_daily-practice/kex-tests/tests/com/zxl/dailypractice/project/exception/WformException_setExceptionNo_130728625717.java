package com.zxl.dailypractice.project.exception;

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
import static com.zxl.dailypractice.project.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class WformException_setExceptionNo_130728625717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21196;
     Object term21199;

    public WformException_setExceptionNo_130728625717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21196 = newInstance(Class.forName("com.zxl.dailypractice.project.exception.WformException"));
        setIntField(term21196, term21196.getClass(), "exceptionNo", 0);
        setField(term21196, term21196.getClass(), "exceptionMsg", null);
        setField(term21196, term21196.getClass(), "backtrace", null);
        setField(term21196, term21196.getClass(), "detailMessage", null);
        setField(term21196, term21196.getClass(), "cause", null);
        setField(term21196, term21196.getClass(), "stackTrace", null);
        setIntField(term21196, term21196.getClass(), "depth", 0);
        setField(term21196, term21196.getClass(), "suppressedExceptions", null);
        term21199 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.exception.WformException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21199;
        callMethod(klass, "setExceptionNo", argTypes, term21196, args);
    }

};


