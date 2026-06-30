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

public class GenericResponseBody_GenericResponseBodyBuilder_success_18163565802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term133;

    public GenericResponseBody_GenericResponseBodyBuilder_success_18163565802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term122 = newInstance(Class.forName("java.lang.Object"));
        Object term123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term83, term83.getClass(), "state", 1484323161);
        setBooleanField(term83, term83.getClass(), "success", false);
        setField(term83, term83.getClass(), "message", "xxtlPwDYFs");
        setField(term83, term83.getClass(), "error", "jJCZpVmanW");
        setField(term83, term83.getClass(), "fieldErrors", "EGtDIRbSSb");
        setField(term83, term83.getClass(), "data", term122);
        setIntField(term124, term124.getClass(), "year", 2021);
        setShortField(term124, term124.getClass(), "month", (short) 1);
        setShortField(term124, term124.getClass(), "day", (short) 18);
        setField(term123, term123.getClass(), "date", term124);
        setByteField(term128, term128.getClass(), "hour", (byte) 13);
        setByteField(term128, term128.getClass(), "minute", (byte) 38);
        setByteField(term128, term128.getClass(), "second", (byte) 26);
        setIntField(term128, term128.getClass(), "nano", 544608644);
        setField(term123, term123.getClass(), "time", term128);
        setField(term83, term83.getClass(), "timestamp", term123);
        term133 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term133;
        callMethod(klass, "success", argTypes, term83, args);
    }

};


