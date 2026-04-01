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

public class GenericResponseBody_GenericResponseBodyBuilder_data_3988713046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term521;

    public GenericResponseBody_GenericResponseBodyBuilder_data_3988713046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term510 = newInstance(Class.forName("java.lang.Object"));
        Object term511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term516 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term471, term471.getClass(), "state", -1955890973);
        setBooleanField(term471, term471.getClass(), "success", true);
        setField(term471, term471.getClass(), "message", "HyxfbSQYBe");
        setField(term471, term471.getClass(), "error", "pCTimMblYc");
        setField(term471, term471.getClass(), "fieldErrors", "hNxWaHcfhY");
        setField(term471, term471.getClass(), "data", term510);
        setIntField(term512, term512.getClass(), "year", 2026);
        setShortField(term512, term512.getClass(), "month", (short) 12);
        setShortField(term512, term512.getClass(), "day", (short) 14);
        setField(term511, term511.getClass(), "date", term512);
        setByteField(term516, term516.getClass(), "hour", (byte) 16);
        setByteField(term516, term516.getClass(), "minute", (byte) 34);
        setByteField(term516, term516.getClass(), "second", (byte) 9);
        setIntField(term516, term516.getClass(), "nano", 518326996);
        setField(term511, term511.getClass(), "time", term516);
        setField(term471, term471.getClass(), "timestamp", term511);
        term521 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term521;
        callMethod(klass, "data", argTypes, term471, args);
    }

};


