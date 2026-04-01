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

public class GenericResponseBody_getState_8638215482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5859;

    public GenericResponseBody_getState_8638215482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5859 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term5898 = newInstance(Class.forName("java.lang.Object"));
        Object term5899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5904 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5859, term5859.getClass(), "state", -1685132342);
        setBooleanField(term5859, term5859.getClass(), "success", true);
        setField(term5859, term5859.getClass(), "message", "jDtqGUpnZN");
        setField(term5859, term5859.getClass(), "error", "nGKItKLYNC");
        setField(term5859, term5859.getClass(), "fieldErrors", "UiUYnPrcCi");
        setField(term5859, term5859.getClass(), "data", term5898);
        setIntField(term5900, term5900.getClass(), "year", 2018);
        setShortField(term5900, term5900.getClass(), "month", (short) 9);
        setShortField(term5900, term5900.getClass(), "day", (short) 28);
        setField(term5899, term5899.getClass(), "date", term5900);
        setByteField(term5904, term5904.getClass(), "hour", (byte) 3);
        setByteField(term5904, term5904.getClass(), "minute", (byte) 37);
        setByteField(term5904, term5904.getClass(), "second", (byte) 46);
        setIntField(term5904, term5904.getClass(), "nano", 763326845);
        setField(term5899, term5899.getClass(), "time", term5904);
        setField(term5859, term5859.getClass(), "timestamp", term5899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term5859, args);
    }

};


