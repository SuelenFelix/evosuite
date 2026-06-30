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

public class ResourceNotFoundException_getResourceName_121065957516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61610;

    public ResourceNotFoundException_getResourceName_121065957516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61610 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException"));
        setField(term61610, term61610.getClass(), "resourceName", null);
        setField(term61610, term61610.getClass(), "fieldName", null);
        setField(term61610, term61610.getClass(), "fieldValue", null);
        setField(term61610, term61610.getClass(), "backtrace", null);
        setField(term61610, term61610.getClass(), "detailMessage", null);
        setField(term61610, term61610.getClass(), "cause", null);
        setField(term61610, term61610.getClass(), "stackTrace", null);
        setIntField(term61610, term61610.getClass(), "depth", 0);
        setField(term61610, term61610.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResourceName", argTypes, term61610, args);
    }

};


