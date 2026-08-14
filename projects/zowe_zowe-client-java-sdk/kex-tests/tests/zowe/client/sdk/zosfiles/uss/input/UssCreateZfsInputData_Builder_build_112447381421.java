package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssCreateZfsInputData_Builder_build_112447381421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53793;

    public UssCreateZfsInputData_Builder_build_112447381421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53793 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53793, term53793.getClass(), "owner", null);
        setField(term53793, term53793.getClass(), "group", null);
        setField(term53793, term53793.getClass(), "perms", null);
        setField(term53793, term53793.getClass(), "cylsPri", null);
        setField(term53793, term53793.getClass(), "cylsSec", null);
        setField(term53793, term53793.getClass(), "storageClass", null);
        setField(term53793, term53793.getClass(), "managementClass", null);
        setField(term53793, term53793.getClass(), "dataClass", null);
        setField(term53793, term53793.getClass(), "volumes", null);
        setField(term53793, term53793.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term53793, args);
    }

};


