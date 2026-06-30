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

public class GenericResponseBody_GenericResponseBodyBuilder_state_10269481421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term51;

    public GenericResponseBody_GenericResponseBodyBuilder_state_10269481421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term40 = newInstance(Class.forName("java.lang.Object"));
        Object term41 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1, term1.getClass(), "state", 568599855);
        setBooleanField(term1, term1.getClass(), "success", false);
        setField(term1, term1.getClass(), "message", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "error", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "fieldErrors", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "data", term40);
        setIntField(term42, term42.getClass(), "year", 2012);
        setShortField(term42, term42.getClass(), "month", (short) 8);
        setShortField(term42, term42.getClass(), "day", (short) 25);
        setField(term41, term41.getClass(), "date", term42);
        setByteField(term46, term46.getClass(), "hour", (byte) 5);
        setByteField(term46, term46.getClass(), "minute", (byte) 20);
        setByteField(term46, term46.getClass(), "second", (byte) 50);
        setIntField(term46, term46.getClass(), "nano", 345595912);
        setField(term41, term41.getClass(), "time", term46);
        setField(term1, term1.getClass(), "timestamp", term41);
        term51 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51;
        callMethod(klass, "state", argTypes, term1, args);
    }

};


