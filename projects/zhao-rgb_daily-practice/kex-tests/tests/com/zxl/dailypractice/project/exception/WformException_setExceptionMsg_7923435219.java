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

public class WformException_setExceptionMsg_7923435219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21204;

    public WformException_setExceptionMsg_7923435219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21204 = newInstance(Class.forName("com.zxl.dailypractice.project.exception.WformException"));
        setIntField(term21204, term21204.getClass(), "exceptionNo", 0);
        setField(term21204, term21204.getClass(), "exceptionMsg", null);
        setField(term21204, term21204.getClass(), "backtrace", null);
        setField(term21204, term21204.getClass(), "detailMessage", null);
        setField(term21204, term21204.getClass(), "cause", null);
        setField(term21204, term21204.getClass(), "stackTrace", null);
        setIntField(term21204, term21204.getClass(), "depth", 0);
        setField(term21204, term21204.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.exception.WformException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExceptionMsg", argTypes, term21204, args);
    }

};


