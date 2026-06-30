package kyungseo.poc.simple.web.appcore.util;

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
import static kyungseo.poc.simple.web.appcore.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DateUtil_minutesDiff_158061035218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1387;
     Object term1389;

    public DateUtil_minutesDiff_158061035218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1387 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1387, term1387.getClass(), "fastTime", 1606045635837L);
        setField(term1387, term1387.getClass(), "cdate", null);
        term1389 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1389, term1389.getClass(), "fastTime", 1442639565302L);
        setField(term1389, term1389.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.DateUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term1387;
        args[1] = term1389;
        callMethod(klass, "minutesDiff", argTypes, null, args);
    }

};


