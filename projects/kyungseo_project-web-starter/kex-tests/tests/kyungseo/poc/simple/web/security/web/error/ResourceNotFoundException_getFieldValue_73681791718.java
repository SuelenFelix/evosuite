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

public class ResourceNotFoundException_getFieldValue_73681791718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61614;

    public ResourceNotFoundException_getFieldValue_73681791718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61614 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException"));
        setField(term61614, term61614.getClass(), "resourceName", null);
        setField(term61614, term61614.getClass(), "fieldName", null);
        setField(term61614, term61614.getClass(), "fieldValue", null);
        setField(term61614, term61614.getClass(), "backtrace", null);
        setField(term61614, term61614.getClass(), "detailMessage", null);
        setField(term61614, term61614.getClass(), "cause", null);
        setField(term61614, term61614.getClass(), "stackTrace", null);
        setIntField(term61614, term61614.getClass(), "depth", 0);
        setField(term61614, term61614.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.ResourceNotFoundException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldValue", argTypes, term61614, args);
    }

};


