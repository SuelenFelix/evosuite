package kyungseo.poc.simple.web.security.web.error;

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
import static kyungseo.poc.simple.web.security.web.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResourceNotFoundException_setResourceName_208996689719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61616;

    public ResourceNotFoundException_setResourceName_208996689719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61616 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException"));
        setField(term61616, term61616.getClass(), "resourceName", null);
        setField(term61616, term61616.getClass(), "fieldName", null);
        setField(term61616, term61616.getClass(), "fieldValue", null);
        setField(term61616, term61616.getClass(), "backtrace", null);
        setField(term61616, term61616.getClass(), "detailMessage", null);
        setField(term61616, term61616.getClass(), "cause", null);
        setField(term61616, term61616.getClass(), "stackTrace", null);
        setIntField(term61616, term61616.getClass(), "depth", 0);
        setField(term61616, term61616.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResourceName", argTypes, term61616, args);
    }

};


