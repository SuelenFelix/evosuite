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

public class RelatedEntitiesFoundException_getEntities_6683480104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320687;

    public RelatedEntitiesFoundException_getEntities_6683480104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320687 = newInstance(Class.forName("ru.smartup.timetracker.exception.RelatedEntitiesFoundException"));
        setField(term320687, term320687.getClass(), "errorCode", null);
        setField(term320687, term320687.getClass(), "entities", null);
        setField(term320687, term320687.getClass(), "backtrace", null);
        setField(term320687, term320687.getClass(), "detailMessage", null);
        setField(term320687, term320687.getClass(), "cause", null);
        setField(term320687, term320687.getClass(), "stackTrace", null);
        setIntField(term320687, term320687.getClass(), "depth", 0);
        setField(term320687, term320687.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.RelatedEntitiesFoundException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntities", argTypes, term320687, args);
    }

};


