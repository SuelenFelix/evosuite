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

public class GenericResponseBody_setTimestamp_206690695815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6970;
     Object term7020;

    public GenericResponseBody_setTimestamp_206690695815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6970 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term7009 = newInstance(Class.forName("java.lang.Object"));
        Object term7010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7015 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6970, term6970.getClass(), "state", -203030934);
        setBooleanField(term6970, term6970.getClass(), "success", false);
        setField(term6970, term6970.getClass(), "message", "xOcJIiQQDu");
        setField(term6970, term6970.getClass(), "error", "GVizqqzXpy");
        setField(term6970, term6970.getClass(), "fieldErrors", "JqXGgAhZPl");
        setField(term6970, term6970.getClass(), "data", term7009);
        setIntField(term7011, term7011.getClass(), "year", 2025);
        setShortField(term7011, term7011.getClass(), "month", (short) 3);
        setShortField(term7011, term7011.getClass(), "day", (short) 9);
        setField(term7010, term7010.getClass(), "date", term7011);
        setByteField(term7015, term7015.getClass(), "hour", (byte) 5);
        setByteField(term7015, term7015.getClass(), "minute", (byte) 49);
        setByteField(term7015, term7015.getClass(), "second", (byte) 12);
        setIntField(term7015, term7015.getClass(), "nano", 791695028);
        setField(term7010, term7010.getClass(), "time", term7015);
        setField(term6970, term6970.getClass(), "timestamp", term7010);
        term7020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7025 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7021, term7021.getClass(), "year", 2023);
        setShortField(term7021, term7021.getClass(), "month", (short) 9);
        setShortField(term7021, term7021.getClass(), "day", (short) 23);
        setField(term7020, term7020.getClass(), "date", term7021);
        setByteField(term7025, term7025.getClass(), "hour", (byte) 12);
        setByteField(term7025, term7025.getClass(), "minute", (byte) 55);
        setByteField(term7025, term7025.getClass(), "second", (byte) 58);
        setIntField(term7025, term7025.getClass(), "nano", 159178396);
        setField(term7020, term7020.getClass(), "time", term7025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term7020;
        callMethod(klass, "setTimestamp", argTypes, term6970, args);
    }

};


