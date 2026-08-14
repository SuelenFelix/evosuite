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

public class ErrorDetails_getDetails_2362350923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;

    public ErrorDetails_getDetails_2362350923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("arghh.tradetracker.exception.ErrorDetails"));
        Object term186 = newInstance(Class.forName("java.util.Date"));
        setLongField(term186, term186.getClass(), "fastTime", 1606045635837L);
        setField(term186, term186.getClass(), "cdate", null);
        setField(term185, term185.getClass(), "timestamp", term186);
        setField(term185, term185.getClass(), "message", "hRNSzYYIrc");
        setField(term185, term185.getClass(), "details", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.exception.ErrorDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term185, args);
    }

};


