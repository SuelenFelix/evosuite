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

public class GenericResponseBody_GenericResponseBodyBuilder_message_7220757733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public GenericResponseBody_GenericResponseBodyBuilder_message_7220757733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        Object term205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term165, term165.getClass(), "state", 391863371);
        setBooleanField(term165, term165.getClass(), "success", false);
        setField(term165, term165.getClass(), "message", "SzjVpOQTyS");
        setField(term165, term165.getClass(), "error", "MjGYSRKTNF");
        setField(term165, term165.getClass(), "fieldErrors", "hRNSzYYIrc");
        setField(term165, term165.getClass(), "data", term204);
        setIntField(term206, term206.getClass(), "year", 2015);
        setShortField(term206, term206.getClass(), "month", (short) 9);
        setShortField(term206, term206.getClass(), "day", (short) 19);
        setField(term205, term205.getClass(), "date", term206);
        setByteField(term210, term210.getClass(), "hour", (byte) 9);
        setByteField(term210, term210.getClass(), "minute", (byte) 4);
        setByteField(term210, term210.getClass(), "second", (byte) 10);
        setIntField(term210, term210.getClass(), "nano", 401765865);
        setField(term205, term205.getClass(), "time", term210);
        setField(term165, term165.getClass(), "timestamp", term205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "message", argTypes, term165, args);
    }

};


