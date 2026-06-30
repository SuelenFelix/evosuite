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
import java.lang.Boolean;

public class GenericResponseBody_GenericResponseBodyBuilder_success_181635658012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807;
     Object term810;

    public GenericResponseBody_GenericResponseBodyBuilder_success_181635658012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder"));
        setIntField(term807, term807.getClass(), "state", 0);
        setBooleanField(term807, term807.getClass(), "success", false);
        setField(term807, term807.getClass(), "message", null);
        setField(term807, term807.getClass(), "error", null);
        setField(term807, term807.getClass(), "fieldErrors", null);
        setField(term807, term807.getClass(), "data", null);
        setField(term807, term807.getClass(), "timestamp", null);
        term810 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody$GenericResponseBodyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term810;
        callMethod(klass, "success", argTypes, term807, args);
    }

};


