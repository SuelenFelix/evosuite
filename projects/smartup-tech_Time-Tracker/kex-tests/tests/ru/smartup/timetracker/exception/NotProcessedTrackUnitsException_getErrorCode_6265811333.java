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

public class NotProcessedTrackUnitsException_getErrorCode_6265811333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119616;

    public NotProcessedTrackUnitsException_getErrorCode_6265811333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119616 = newInstance(Class.forName("ru.smartup.timetracker.exception.NotProcessedTrackUnitsException"));
        setField(term119616, term119616.getClass(), "errorCode", null);
        setField(term119616, term119616.getClass(), "backtrace", null);
        setField(term119616, term119616.getClass(), "detailMessage", null);
        setField(term119616, term119616.getClass(), "cause", null);
        setField(term119616, term119616.getClass(), "stackTrace", null);
        setIntField(term119616, term119616.getClass(), "depth", 0);
        setField(term119616, term119616.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.NotProcessedTrackUnitsException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCode", argTypes, term119616, args);
    }

};


