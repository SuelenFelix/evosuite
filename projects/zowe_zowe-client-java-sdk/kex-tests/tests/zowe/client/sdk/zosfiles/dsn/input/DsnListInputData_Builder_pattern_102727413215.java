package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DsnListInputData_Builder_pattern_102727413215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22271;

    public DsnListInputData_Builder_pattern_102727413215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22271 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term22271, term22271.getClass(), "volume", null);
        setField(term22271, term22271.getClass(), "attribute", null);
        setField(term22271, term22271.getClass(), "maxLength", null);
        setField(term22271, term22271.getClass(), "start", null);
        setField(term22271, term22271.getClass(), "recall", null);
        setField(term22271, term22271.getClass(), "pattern", null);
        setField(term22271, term22271.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pattern", argTypes, term22271, args);
    }

};


