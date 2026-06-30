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

public class GenericResponseBody_toString_31172216616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7060;

    public GenericResponseBody_toString_31172216616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7060 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term7099 = newInstance(Class.forName("java.lang.Object"));
        Object term7100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7105 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7060, term7060.getClass(), "state", -1179120542);
        setBooleanField(term7060, term7060.getClass(), "success", true);
        setField(term7060, term7060.getClass(), "message", "jiKYgYHqIS");
        setField(term7060, term7060.getClass(), "error", "DfISiziTgG");
        setField(term7060, term7060.getClass(), "fieldErrors", "XqgfKFvPSD");
        setField(term7060, term7060.getClass(), "data", term7099);
        setIntField(term7101, term7101.getClass(), "year", 2028);
        setShortField(term7101, term7101.getClass(), "month", (short) 10);
        setShortField(term7101, term7101.getClass(), "day", (short) 1);
        setField(term7100, term7100.getClass(), "date", term7101);
        setByteField(term7105, term7105.getClass(), "hour", (byte) 17);
        setByteField(term7105, term7105.getClass(), "minute", (byte) 29);
        setByteField(term7105, term7105.getClass(), "second", (byte) 30);
        setIntField(term7105, term7105.getClass(), "nano", 845472306);
        setField(term7100, term7100.getClass(), "time", term7105);
        setField(term7060, term7060.getClass(), "timestamp", term7100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7060, args);
    }

};


