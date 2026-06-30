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

public class WformException_getExceptionMsg_107357517618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21201;

    public WformException_getExceptionMsg_107357517618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21201 = newInstance(Class.forName("com.zxl.dailypractice.project.exception.WformException"));
        setIntField(term21201, term21201.getClass(), "exceptionNo", 0);
        setField(term21201, term21201.getClass(), "exceptionMsg", null);
        setField(term21201, term21201.getClass(), "backtrace", null);
        setField(term21201, term21201.getClass(), "detailMessage", null);
        setField(term21201, term21201.getClass(), "cause", null);
        setField(term21201, term21201.getClass(), "stackTrace", null);
        setIntField(term21201, term21201.getClass(), "depth", 0);
        setField(term21201, term21201.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.exception.WformException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionMsg", argTypes, term21201, args);
    }

};


