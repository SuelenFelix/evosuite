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

public class GenericResponseBody_setFieldErrors_204308936313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6787;

    public GenericResponseBody_setFieldErrors_204308936313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6787 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6826 = newInstance(Class.forName("java.lang.Object"));
        Object term6827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6832 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6787, term6787.getClass(), "state", -1275173084);
        setBooleanField(term6787, term6787.getClass(), "success", false);
        setField(term6787, term6787.getClass(), "message", "cAPeiZHKGJ");
        setField(term6787, term6787.getClass(), "error", "LvJFtLBaxj");
        setField(term6787, term6787.getClass(), "fieldErrors", "PHvxnGHptP");
        setField(term6787, term6787.getClass(), "data", term6826);
        setIntField(term6828, term6828.getClass(), "year", 2015);
        setShortField(term6828, term6828.getClass(), "month", (short) 3);
        setShortField(term6828, term6828.getClass(), "day", (short) 10);
        setField(term6827, term6827.getClass(), "date", term6828);
        setByteField(term6832, term6832.getClass(), "hour", (byte) 23);
        setByteField(term6832, term6832.getClass(), "minute", (byte) 34);
        setByteField(term6832, term6832.getClass(), "second", (byte) 44);
        setIntField(term6832, term6832.getClass(), "nano", 587322824);
        setField(term6827, term6827.getClass(), "time", term6832);
        setField(term6787, term6787.getClass(), "timestamp", term6827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TimdotUuNC";
        callMethod(klass, "setFieldErrors", argTypes, term6787, args);
    }

};


