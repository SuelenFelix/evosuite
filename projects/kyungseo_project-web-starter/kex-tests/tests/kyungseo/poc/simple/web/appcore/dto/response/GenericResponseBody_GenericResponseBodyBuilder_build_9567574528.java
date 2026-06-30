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

public class GenericResponseBody_GenericResponseBodyBuilder_build_9567574528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;

    public GenericResponseBody_GenericResponseBodyBuilder_build_9567574528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        Object term681 = newInstance(Class.forName("java.lang.Object"));
        Object term682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term687 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term642, term642.getClass(), "state", 1227103734);
        setBooleanField(term642, term642.getClass(), "success", false);
        setField(term642, term642.getClass(), "message", "BYqFIqCKAV");
        setField(term642, term642.getClass(), "error", "vrQLuWIDJX");
        setField(term642, term642.getClass(), "fieldErrors", "flxyYxBRtu");
        setField(term642, term642.getClass(), "data", term681);
        setIntField(term683, term683.getClass(), "year", 2029);
        setShortField(term683, term683.getClass(), "month", (short) 8);
        setShortField(term683, term683.getClass(), "day", (short) 29);
        setField(term682, term682.getClass(), "date", term683);
        setByteField(term687, term687.getClass(), "hour", (byte) 15);
        setByteField(term687, term687.getClass(), "minute", (byte) 50);
        setByteField(term687, term687.getClass(), "second", (byte) 1);
        setIntField(term687, term687.getClass(), "nano", 277971904);
        setField(term682, term682.getClass(), "time", term687);
        setField(term642, term642.getClass(), "timestamp", term682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term642, args);
    }

};


