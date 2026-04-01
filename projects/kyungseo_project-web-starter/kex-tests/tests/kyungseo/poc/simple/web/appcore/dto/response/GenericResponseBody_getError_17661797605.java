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

public class GenericResponseBody_getError_17661797605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6099;

    public GenericResponseBody_getError_17661797605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6099 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6138 = newInstance(Class.forName("java.lang.Object"));
        Object term6139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6144 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6099, term6099.getClass(), "state", 1048535127);
        setBooleanField(term6099, term6099.getClass(), "success", true);
        setField(term6099, term6099.getClass(), "message", "ytSBIKXogI");
        setField(term6099, term6099.getClass(), "error", "nHXjMycHlU");
        setField(term6099, term6099.getClass(), "fieldErrors", "ieCtQFdkii");
        setField(term6099, term6099.getClass(), "data", term6138);
        setIntField(term6140, term6140.getClass(), "year", 2012);
        setShortField(term6140, term6140.getClass(), "month", (short) 2);
        setShortField(term6140, term6140.getClass(), "day", (short) 19);
        setField(term6139, term6139.getClass(), "date", term6140);
        setByteField(term6144, term6144.getClass(), "hour", (byte) 8);
        setByteField(term6144, term6144.getClass(), "minute", (byte) 4);
        setByteField(term6144, term6144.getClass(), "second", (byte) 43);
        setIntField(term6144, term6144.getClass(), "nano", 114930008);
        setField(term6139, term6139.getClass(), "time", term6144);
        setField(term6099, term6099.getClass(), "timestamp", term6139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term6099, args);
    }

};


