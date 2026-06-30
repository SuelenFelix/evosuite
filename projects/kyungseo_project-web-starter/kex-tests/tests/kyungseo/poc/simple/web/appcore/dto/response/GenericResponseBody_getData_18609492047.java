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

public class GenericResponseBody_getData_18609492047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6259;

    public GenericResponseBody_getData_18609492047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6259 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6298 = newInstance(Class.forName("java.lang.Object"));
        Object term6299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6304 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6259, term6259.getClass(), "state", -6029667);
        setBooleanField(term6259, term6259.getClass(), "success", false);
        setField(term6259, term6259.getClass(), "message", "fhkbdRViHi");
        setField(term6259, term6259.getClass(), "error", "uWHnvSvaPl");
        setField(term6259, term6259.getClass(), "fieldErrors", "kBdSllIBVz");
        setField(term6259, term6259.getClass(), "data", term6298);
        setIntField(term6300, term6300.getClass(), "year", 2015);
        setShortField(term6300, term6300.getClass(), "month", (short) 9);
        setShortField(term6300, term6300.getClass(), "day", (short) 16);
        setField(term6299, term6299.getClass(), "date", term6300);
        setByteField(term6304, term6304.getClass(), "hour", (byte) 6);
        setByteField(term6304, term6304.getClass(), "minute", (byte) 19);
        setByteField(term6304, term6304.getClass(), "second", (byte) 42);
        setIntField(term6304, term6304.getClass(), "nano", 630084975);
        setField(term6299, term6299.getClass(), "time", term6304);
        setField(term6259, term6259.getClass(), "timestamp", term6299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term6259, args);
    }

};


