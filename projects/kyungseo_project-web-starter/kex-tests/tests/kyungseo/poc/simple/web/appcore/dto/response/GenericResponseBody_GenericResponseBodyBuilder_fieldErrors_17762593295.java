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

public class GenericResponseBody_GenericResponseBodyBuilder_fieldErrors_17762593295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public GenericResponseBody_GenericResponseBodyBuilder_fieldErrors_17762593295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term408 = newInstance(Class.forName("java.lang.Object"));
        Object term409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term369, term369.getClass(), "state", -616727354);
        setBooleanField(term369, term369.getClass(), "success", true);
        setField(term369, term369.getClass(), "message", "oVcInYnLWB");
        setField(term369, term369.getClass(), "error", "aJlieCFVtF");
        setField(term369, term369.getClass(), "fieldErrors", "ZiaGIbnzTs");
        setField(term369, term369.getClass(), "data", term408);
        setIntField(term410, term410.getClass(), "year", 2022);
        setShortField(term410, term410.getClass(), "month", (short) 2);
        setShortField(term410, term410.getClass(), "day", (short) 26);
        setField(term409, term409.getClass(), "date", term410);
        setByteField(term414, term414.getClass(), "hour", (byte) 11);
        setByteField(term414, term414.getClass(), "minute", (byte) 42);
        setByteField(term414, term414.getClass(), "second", (byte) 15);
        setIntField(term414, term414.getClass(), "nano", 377731937);
        setField(term409, term409.getClass(), "time", term414);
        setField(term369, term369.getClass(), "timestamp", term409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "fieldErrors", argTypes, term369, args);
    }

};


