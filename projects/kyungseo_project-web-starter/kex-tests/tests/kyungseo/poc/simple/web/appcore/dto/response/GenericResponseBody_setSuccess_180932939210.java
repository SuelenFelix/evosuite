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
import java.lang.Boolean;

public class GenericResponseBody_setSuccess_180932939210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6501;
     Object term6551;

    public GenericResponseBody_setSuccess_180932939210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6501 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6540 = newInstance(Class.forName("java.lang.Object"));
        Object term6541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6546 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6501, term6501.getClass(), "state", 1135664017);
        setBooleanField(term6501, term6501.getClass(), "success", true);
        setField(term6501, term6501.getClass(), "message", "KoyGrUJeJW");
        setField(term6501, term6501.getClass(), "error", "HqBOwkVqjD");
        setField(term6501, term6501.getClass(), "fieldErrors", "MAcUBcBckh");
        setField(term6501, term6501.getClass(), "data", term6540);
        setIntField(term6542, term6542.getClass(), "year", 2020);
        setShortField(term6542, term6542.getClass(), "month", (short) 7);
        setShortField(term6542, term6542.getClass(), "day", (short) 24);
        setField(term6541, term6541.getClass(), "date", term6542);
        setByteField(term6546, term6546.getClass(), "hour", (byte) 0);
        setByteField(term6546, term6546.getClass(), "minute", (byte) 59);
        setByteField(term6546, term6546.getClass(), "second", (byte) 56);
        setIntField(term6546, term6546.getClass(), "nano", 320219201);
        setField(term6541, term6541.getClass(), "time", term6546);
        setField(term6501, term6501.getClass(), "timestamp", term6541);
        term6551 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6551;
        callMethod(klass, "setSuccess", argTypes, term6501, args);
    }

};


