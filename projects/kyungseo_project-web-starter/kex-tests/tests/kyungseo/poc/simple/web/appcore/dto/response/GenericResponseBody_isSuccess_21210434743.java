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

public class GenericResponseBody_isSuccess_21210434743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5939;

    public GenericResponseBody_isSuccess_21210434743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5939 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term5978 = newInstance(Class.forName("java.lang.Object"));
        Object term5979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5984 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5939, term5939.getClass(), "state", -1456670397);
        setBooleanField(term5939, term5939.getClass(), "success", false);
        setField(term5939, term5939.getClass(), "message", "UoYtihxVaS");
        setField(term5939, term5939.getClass(), "error", "JDswTTCZHV");
        setField(term5939, term5939.getClass(), "fieldErrors", "onpbIeEKoi");
        setField(term5939, term5939.getClass(), "data", term5978);
        setIntField(term5980, term5980.getClass(), "year", 2012);
        setShortField(term5980, term5980.getClass(), "month", (short) 9);
        setShortField(term5980, term5980.getClass(), "day", (short) 11);
        setField(term5979, term5979.getClass(), "date", term5980);
        setByteField(term5984, term5984.getClass(), "hour", (byte) 22);
        setByteField(term5984, term5984.getClass(), "minute", (byte) 10);
        setByteField(term5984, term5984.getClass(), "second", (byte) 8);
        setIntField(term5984, term5984.getClass(), "nano", 380008862);
        setField(term5979, term5979.getClass(), "time", term5984);
        setField(term5939, term5939.getClass(), "timestamp", term5979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term5939, args);
    }

};


