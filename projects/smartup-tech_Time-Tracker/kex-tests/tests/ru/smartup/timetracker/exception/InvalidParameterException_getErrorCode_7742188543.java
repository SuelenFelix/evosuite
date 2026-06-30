package ru.smartup.timetracker.exception;

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
import static ru.smartup.timetracker.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InvalidParameterException_getErrorCode_7742188543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;

    public InvalidParameterException_getErrorCode_7742188543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10639 = newInstance(Class.forName("ru.smartup.timetracker.exception.InvalidParameterException"));
        setField(term10639, term10639.getClass(), "errorCode", null);
        setField(term10639, term10639.getClass(), "backtrace", null);
        setField(term10639, term10639.getClass(), "detailMessage", null);
        setField(term10639, term10639.getClass(), "cause", null);
        setField(term10639, term10639.getClass(), "stackTrace", null);
        setIntField(term10639, term10639.getClass(), "depth", 0);
        setField(term10639, term10639.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.InvalidParameterException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCode", argTypes, term10639, args);
    }

};


