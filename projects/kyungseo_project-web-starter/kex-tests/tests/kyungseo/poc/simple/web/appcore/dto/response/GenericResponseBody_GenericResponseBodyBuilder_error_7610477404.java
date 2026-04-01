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

public class GenericResponseBody_GenericResponseBodyBuilder_error_7610477404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public GenericResponseBody_GenericResponseBodyBuilder_error_7610477404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term306 = newInstance(Class.forName("java.lang.Object"));
        Object term307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term267, term267.getClass(), "state", -1922583790);
        setBooleanField(term267, term267.getClass(), "success", true);
        setField(term267, term267.getClass(), "message", "NRdvgJlhkX");
        setField(term267, term267.getClass(), "error", "uuaPigETmJ");
        setField(term267, term267.getClass(), "fieldErrors", "MxlszYVzRf");
        setField(term267, term267.getClass(), "data", term306);
        setIntField(term308, term308.getClass(), "year", 2015);
        setShortField(term308, term308.getClass(), "month", (short) 4);
        setShortField(term308, term308.getClass(), "day", (short) 14);
        setField(term307, term307.getClass(), "date", term308);
        setByteField(term312, term312.getClass(), "hour", (byte) 18);
        setByteField(term312, term312.getClass(), "minute", (byte) 24);
        setByteField(term312, term312.getClass(), "second", (byte) 32);
        setIntField(term312, term312.getClass(), "nano", 369233818);
        setField(term307, term307.getClass(), "time", term312);
        setField(term267, term267.getClass(), "timestamp", term307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "error", argTypes, term267, args);
    }

};


