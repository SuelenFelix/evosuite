package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;

public class LoggerRateLimiter_shouldPrintMessage_2466566631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10908;
     Object term10914;

    public LoggerRateLimiter_shouldPrintMessage_2466566631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10909 = new HashMap();
        term10908 = newInstance(Class.forName("leetcode.LoggerRateLimiter"));
        setField(term10908, term10908.getClass(), "messageTime", term10909);
        term10914 = new Integer(-2006508013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.LoggerRateLimiter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term10914;
        args[1] = "lCyLIcSuom";
        callMethod(klass, "shouldPrintMessage", argTypes, term10908, args);
    }

};


