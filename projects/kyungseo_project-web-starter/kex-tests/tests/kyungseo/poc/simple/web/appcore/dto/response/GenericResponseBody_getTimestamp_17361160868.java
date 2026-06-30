package kyungseo.poc.simple.web.appcore.dto.response;

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
import static kyungseo.poc.simple.web.appcore.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GenericResponseBody_getTimestamp_17361160868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6339;

    public GenericResponseBody_getTimestamp_17361160868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6339 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6378 = newInstance(Class.forName("java.lang.Object"));
        Object term6379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6384 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6339, term6339.getClass(), "state", -2068769794);
        setBooleanField(term6339, term6339.getClass(), "success", false);
        setField(term6339, term6339.getClass(), "message", "TJmVBGfTML");
        setField(term6339, term6339.getClass(), "error", "tPlsykYBqO");
        setField(term6339, term6339.getClass(), "fieldErrors", "bLPjGVBhlX");
        setField(term6339, term6339.getClass(), "data", term6378);
        setIntField(term6380, term6380.getClass(), "year", 2029);
        setShortField(term6380, term6380.getClass(), "month", (short) 6);
        setShortField(term6380, term6380.getClass(), "day", (short) 23);
        setField(term6379, term6379.getClass(), "date", term6380);
        setByteField(term6384, term6384.getClass(), "hour", (byte) 21);
        setByteField(term6384, term6384.getClass(), "minute", (byte) 55);
        setByteField(term6384, term6384.getClass(), "second", (byte) 27);
        setIntField(term6384, term6384.getClass(), "nano", 66889274);
        setField(term6379, term6379.getClass(), "time", term6384);
        setField(term6339, term6339.getClass(), "timestamp", term6379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term6339, args);
    }

};


