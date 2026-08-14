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

public class ErrorDetails_getDetails_2362350927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;

    public ErrorDetails_getDetails_2362350927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("arghh.tradetracker.exception.ErrorDetails"));
        setField(term234, term234.getClass(), "timestamp", null);
        setField(term234, term234.getClass(), "message", null);
        setField(term234, term234.getClass(), "details", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.exception.ErrorDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term234, args);
    }

};


