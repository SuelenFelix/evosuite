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

public class GenericResponseBody_GenericResponseBodyBuilder_timestamp_121520435817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;

    public GenericResponseBody_GenericResponseBodyBuilder_timestamp_121520435817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        setIntField(term824, term824.getClass(), "state", 0);
        setBooleanField(term824, term824.getClass(), "success", false);
        setField(term824, term824.getClass(), "message", null);
        setField(term824, term824.getClass(), "error", null);
        setField(term824, term824.getClass(), "fieldErrors", null);
        setField(term824, term824.getClass(), "data", null);
        setField(term824, term824.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "timestamp", argTypes, term824, args);
    }

};


