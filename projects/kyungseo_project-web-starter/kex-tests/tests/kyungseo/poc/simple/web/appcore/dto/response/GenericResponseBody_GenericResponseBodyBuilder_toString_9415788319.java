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

public class GenericResponseBody_GenericResponseBodyBuilder_toString_9415788319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722;

    public GenericResponseBody_GenericResponseBodyBuilder_toString_9415788319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term761 = newInstance(Class.forName("java.lang.Object"));
        Object term762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term767 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term722, term722.getClass(), "state", -1339778481);
        setBooleanField(term722, term722.getClass(), "success", true);
        setField(term722, term722.getClass(), "message", "OclPbYPkcH");
        setField(term722, term722.getClass(), "error", "IoAlmYsBwc");
        setField(term722, term722.getClass(), "fieldErrors", "TEParAifyi");
        setField(term722, term722.getClass(), "data", term761);
        setIntField(term763, term763.getClass(), "year", 2022);
        setShortField(term763, term763.getClass(), "month", (short) 11);
        setShortField(term763, term763.getClass(), "day", (short) 16);
        setField(term762, term762.getClass(), "date", term763);
        setByteField(term767, term767.getClass(), "hour", (byte) 15);
        setByteField(term767, term767.getClass(), "minute", (byte) 54);
        setByteField(term767, term767.getClass(), "second", (byte) 2);
        setIntField(term767, term767.getClass(), "nano", 733274103);
        setField(term762, term762.getClass(), "time", term767);
        setField(term722, term722.getClass(), "timestamp", term762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term722, args);
    }

};


