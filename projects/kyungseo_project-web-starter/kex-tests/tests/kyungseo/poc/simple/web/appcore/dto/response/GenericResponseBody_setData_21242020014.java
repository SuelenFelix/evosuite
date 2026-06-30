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

public class GenericResponseBody_setData_21242020014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6889;
     Object term6939;

    public GenericResponseBody_setData_21242020014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6889 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6928 = newInstance(Class.forName("java.lang.Object"));
        Object term6929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6934 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6889, term6889.getClass(), "state", -244121226);
        setBooleanField(term6889, term6889.getClass(), "success", false);
        setField(term6889, term6889.getClass(), "message", "PkWMRdJcBb");
        setField(term6889, term6889.getClass(), "error", "jSpAteRute");
        setField(term6889, term6889.getClass(), "fieldErrors", "swZVeJAxjt");
        setField(term6889, term6889.getClass(), "data", term6928);
        setIntField(term6930, term6930.getClass(), "year", 2027);
        setShortField(term6930, term6930.getClass(), "month", (short) 8);
        setShortField(term6930, term6930.getClass(), "day", (short) 26);
        setField(term6929, term6929.getClass(), "date", term6930);
        setByteField(term6934, term6934.getClass(), "hour", (byte) 5);
        setByteField(term6934, term6934.getClass(), "minute", (byte) 11);
        setByteField(term6934, term6934.getClass(), "second", (byte) 9);
        setIntField(term6934, term6934.getClass(), "nano", 219245092);
        setField(term6929, term6929.getClass(), "time", term6934);
        setField(term6889, term6889.getClass(), "timestamp", term6929);
        term6939 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6939;
        callMethod(klass, "setData", argTypes, term6889, args);
    }

};


