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
import java.lang.Integer;

public class GenericResponseBody_setState_10766109429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6419;
     Object term6469;

    public GenericResponseBody_setState_10766109429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6419 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6458 = newInstance(Class.forName("java.lang.Object"));
        Object term6459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6464 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6419, term6419.getClass(), "state", -117576464);
        setBooleanField(term6419, term6419.getClass(), "success", true);
        setField(term6419, term6419.getClass(), "message", "whBvTVIIlC");
        setField(term6419, term6419.getClass(), "error", "IgRJUzaCwW");
        setField(term6419, term6419.getClass(), "fieldErrors", "JUmudUmaaV");
        setField(term6419, term6419.getClass(), "data", term6458);
        setIntField(term6460, term6460.getClass(), "year", 2017);
        setShortField(term6460, term6460.getClass(), "month", (short) 3);
        setShortField(term6460, term6460.getClass(), "day", (short) 5);
        setField(term6459, term6459.getClass(), "date", term6460);
        setByteField(term6464, term6464.getClass(), "hour", (byte) 20);
        setByteField(term6464, term6464.getClass(), "minute", (byte) 34);
        setByteField(term6464, term6464.getClass(), "second", (byte) 55);
        setIntField(term6464, term6464.getClass(), "nano", 78024496);
        setField(term6459, term6459.getClass(), "time", term6464);
        setField(term6419, term6419.getClass(), "timestamp", term6459);
        term6469 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6469;
        callMethod(klass, "setState", argTypes, term6419, args);
    }

};


