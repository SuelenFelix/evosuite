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

public class NotUniqueDataException_getErrorCode_19921482682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20204;

    public NotUniqueDataException_getErrorCode_19921482682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20204 = newInstance(Class.forName("ru.smartup.timetracker.exception.NotUniqueDataException"));
        setField(term20204, term20204.getClass(), "errorCode", null);
        setField(term20204, term20204.getClass(), "backtrace", null);
        setField(term20204, term20204.getClass(), "detailMessage", null);
        setField(term20204, term20204.getClass(), "cause", null);
        setField(term20204, term20204.getClass(), "stackTrace", null);
        setIntField(term20204, term20204.getClass(), "depth", 0);
        setField(term20204, term20204.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.NotUniqueDataException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCode", argTypes, term20204, args);
    }

};


