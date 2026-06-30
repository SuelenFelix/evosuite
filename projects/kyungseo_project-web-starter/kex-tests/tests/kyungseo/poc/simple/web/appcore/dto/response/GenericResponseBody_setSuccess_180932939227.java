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

public class GenericResponseBody_setSuccess_180932939227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7173;
     Object term7176;

    public GenericResponseBody_setSuccess_180932939227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7173 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody"));
        setIntField(term7173, term7173.getClass(), "state", 0);
        setBooleanField(term7173, term7173.getClass(), "success", false);
        setField(term7173, term7173.getClass(), "message", null);
        setField(term7173, term7173.getClass(), "error", null);
        setField(term7173, term7173.getClass(), "fieldErrors", null);
        setField(term7173, term7173.getClass(), "data", null);
        setField(term7173, term7173.getClass(), "timestamp", null);
        term7176 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7176;
        callMethod(klass, "setSuccess", argTypes, term7173, args);
    }

};


