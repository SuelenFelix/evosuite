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

public class GenericResponseBody_setError_134251134429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7181;

    public GenericResponseBody_setError_134251134429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7181 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        setIntField(term7181, term7181.getClass(), "state", 0);
        setBooleanField(term7181, term7181.getClass(), "success", false);
        setField(term7181, term7181.getClass(), "message", null);
        setField(term7181, term7181.getClass(), "error", null);
        setField(term7181, term7181.getClass(), "fieldErrors", null);
        setField(term7181, term7181.getClass(), "data", null);
        setField(term7181, term7181.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setError", argTypes, term7181, args);
    }

};


