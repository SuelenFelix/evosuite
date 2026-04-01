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

public class GenericResponseBody_setError_134251134412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6685;

    public GenericResponseBody_setError_134251134412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6685 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6724 = newInstance(Class.forName("java.lang.Object"));
        Object term6725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6730 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6685, term6685.getClass(), "state", 865208305);
        setBooleanField(term6685, term6685.getClass(), "success", true);
        setField(term6685, term6685.getClass(), "message", "idgaQsnJpQ");
        setField(term6685, term6685.getClass(), "error", "VgZnGoIFwQ");
        setField(term6685, term6685.getClass(), "fieldErrors", "jUbSRrkrYZ");
        setField(term6685, term6685.getClass(), "data", term6724);
        setIntField(term6726, term6726.getClass(), "year", 2023);
        setShortField(term6726, term6726.getClass(), "month", (short) 3);
        setShortField(term6726, term6726.getClass(), "day", (short) 7);
        setField(term6725, term6725.getClass(), "date", term6726);
        setByteField(term6730, term6730.getClass(), "hour", (byte) 21);
        setByteField(term6730, term6730.getClass(), "minute", (byte) 15);
        setByteField(term6730, term6730.getClass(), "second", (byte) 43);
        setIntField(term6730, term6730.getClass(), "nano", 639721472);
        setField(term6725, term6725.getClass(), "time", term6730);
        setField(term6685, term6685.getClass(), "timestamp", term6725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setError", argTypes, term6685, args);
    }

};


