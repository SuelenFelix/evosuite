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

public class GenericResponseBody_setMessage_5279444911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6583;

    public GenericResponseBody_setMessage_5279444911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6583 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        Object term6622 = newInstance(Class.forName("java.lang.Object"));
        Object term6623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6628 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6583, term6583.getClass(), "state", 590364439);
        setBooleanField(term6583, term6583.getClass(), "success", true);
        setField(term6583, term6583.getClass(), "message", "oVgzLbrsFr");
        setField(term6583, term6583.getClass(), "error", "vQVyKLdtaz");
        setField(term6583, term6583.getClass(), "fieldErrors", "OWKQODBLzb");
        setField(term6583, term6583.getClass(), "data", term6622);
        setIntField(term6624, term6624.getClass(), "year", 2014);
        setShortField(term6624, term6624.getClass(), "month", (short) 7);
        setShortField(term6624, term6624.getClass(), "day", (short) 13);
        setField(term6623, term6623.getClass(), "date", term6624);
        setByteField(term6628, term6628.getClass(), "hour", (byte) 21);
        setByteField(term6628, term6628.getClass(), "minute", (byte) 46);
        setByteField(term6628, term6628.getClass(), "second", (byte) 0);
        setIntField(term6628, term6628.getClass(), "nano", 887884128);
        setField(term6623, term6623.getClass(), "time", term6628);
        setField(term6583, term6583.getClass(), "timestamp", term6623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setMessage", argTypes, term6583, args);
    }

};


