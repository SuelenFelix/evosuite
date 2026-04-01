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

public class GenericResponseBody_getFieldErrors_21461401796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6179;

    public GenericResponseBody_getFieldErrors_21461401796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6179 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6218 = newInstance(Class.forName("java.lang.Object"));
        Object term6219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6224 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6179, term6179.getClass(), "state", -655067527);
        setBooleanField(term6179, term6179.getClass(), "success", true);
        setField(term6179, term6179.getClass(), "message", "dEnhdmILtU");
        setField(term6179, term6179.getClass(), "error", "hoicvmsovO");
        setField(term6179, term6179.getClass(), "fieldErrors", "eqJfYWRaEL");
        setField(term6179, term6179.getClass(), "data", term6218);
        setIntField(term6220, term6220.getClass(), "year", 2017);
        setShortField(term6220, term6220.getClass(), "month", (short) 6);
        setShortField(term6220, term6220.getClass(), "day", (short) 8);
        setField(term6219, term6219.getClass(), "date", term6220);
        setByteField(term6224, term6224.getClass(), "hour", (byte) 0);
        setByteField(term6224, term6224.getClass(), "minute", (byte) 18);
        setByteField(term6224, term6224.getClass(), "second", (byte) 55);
        setIntField(term6224, term6224.getClass(), "nano", 680586717);
        setField(term6219, term6219.getClass(), "time", term6224);
        setField(term6179, term6179.getClass(), "timestamp", term6219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldErrors", argTypes, term6179, args);
    }

};


