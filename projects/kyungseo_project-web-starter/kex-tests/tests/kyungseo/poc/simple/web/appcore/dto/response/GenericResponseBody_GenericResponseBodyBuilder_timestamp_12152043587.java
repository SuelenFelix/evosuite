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

public class GenericResponseBody_GenericResponseBodyBuilder_timestamp_12152043587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;
     Object term602;

    public GenericResponseBody_GenericResponseBodyBuilder_timestamp_12152043587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term591 = newInstance(Class.forName("java.lang.Object"));
        Object term592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term597 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term552, term552.getClass(), "state", -2038273078);
        setBooleanField(term552, term552.getClass(), "success", true);
        setField(term552, term552.getClass(), "message", "RkybSrpybU");
        setField(term552, term552.getClass(), "error", "xOEqzGAmDU");
        setField(term552, term552.getClass(), "fieldErrors", "eZFUvlxvGV");
        setField(term552, term552.getClass(), "data", term591);
        setIntField(term593, term593.getClass(), "year", 2025);
        setShortField(term593, term593.getClass(), "month", (short) 4);
        setShortField(term593, term593.getClass(), "day", (short) 24);
        setField(term592, term592.getClass(), "date", term593);
        setByteField(term597, term597.getClass(), "hour", (byte) 18);
        setByteField(term597, term597.getClass(), "minute", (byte) 11);
        setByteField(term597, term597.getClass(), "second", (byte) 40);
        setIntField(term597, term597.getClass(), "nano", 137454929);
        setField(term592, term592.getClass(), "time", term597);
        setField(term552, term552.getClass(), "timestamp", term592);
        term602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term607 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term603, term603.getClass(), "year", 2024);
        setShortField(term603, term603.getClass(), "month", (short) 1);
        setShortField(term603, term603.getClass(), "day", (short) 24);
        setField(term602, term602.getClass(), "date", term603);
        setByteField(term607, term607.getClass(), "hour", (byte) 20);
        setByteField(term607, term607.getClass(), "minute", (byte) 28);
        setByteField(term607, term607.getClass(), "second", (byte) 39);
        setIntField(term607, term607.getClass(), "nano", 952728177);
        setField(term602, term602.getClass(), "time", term607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term602;
        callMethod(klass, "timestamp", argTypes, term552, args);
    }

};


