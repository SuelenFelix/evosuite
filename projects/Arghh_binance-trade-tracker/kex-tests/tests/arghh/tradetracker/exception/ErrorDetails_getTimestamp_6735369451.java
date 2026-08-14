package arghh.tradetracker.exception;

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
import static arghh.tradetracker.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ErrorDetails_getTimestamp_6735369451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public ErrorDetails_getTimestamp_6735369451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("arghh.tradetracker.exception.ErrorDetails"));
        Object term92 = newInstance(Class.forName("java.util.Date"));
        setLongField(term92, term92.getClass(), "fastTime", 1480438351369L);
        setField(term92, term92.getClass(), "cdate", null);
        setField(term91, term91.getClass(), "timestamp", term92);
        setField(term91, term91.getClass(), "message", "jJCZpVmanW");
        setField(term91, term91.getClass(), "details", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.exception.ErrorDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term91, args);
    }

};


