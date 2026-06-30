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

public class GenericResponseBody_getMessage_7586865754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6019;

    public GenericResponseBody_getMessage_7586865754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6019 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6058 = newInstance(Class.forName("java.lang.Object"));
        Object term6059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6064 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6019, term6019.getClass(), "state", 1622346318);
        setBooleanField(term6019, term6019.getClass(), "success", false);
        setField(term6019, term6019.getClass(), "message", "YRHGsAkhxb");
        setField(term6019, term6019.getClass(), "error", "ffYhPOzlUs");
        setField(term6019, term6019.getClass(), "fieldErrors", "MLqYREekMl");
        setField(term6019, term6019.getClass(), "data", term6058);
        setIntField(term6060, term6060.getClass(), "year", 2021);
        setShortField(term6060, term6060.getClass(), "month", (short) 9);
        setShortField(term6060, term6060.getClass(), "day", (short) 7);
        setField(term6059, term6059.getClass(), "date", term6060);
        setByteField(term6064, term6064.getClass(), "hour", (byte) 5);
        setByteField(term6064, term6064.getClass(), "minute", (byte) 25);
        setByteField(term6064, term6064.getClass(), "second", (byte) 7);
        setIntField(term6064, term6064.getClass(), "nano", 755924076);
        setField(term6059, term6059.getClass(), "time", term6064);
        setField(term6019, term6019.getClass(), "timestamp", term6059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term6019, args);
    }

};


