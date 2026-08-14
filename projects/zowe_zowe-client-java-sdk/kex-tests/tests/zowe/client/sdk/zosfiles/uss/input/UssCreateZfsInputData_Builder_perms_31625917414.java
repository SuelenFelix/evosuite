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

public class UssCreateZfsInputData_Builder_perms_31625917414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53786;

    public UssCreateZfsInputData_Builder_perms_31625917414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53786 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53786, term53786.getClass(), "owner", null);
        setField(term53786, term53786.getClass(), "group", null);
        setField(term53786, term53786.getClass(), "perms", null);
        setField(term53786, term53786.getClass(), "cylsPri", null);
        setField(term53786, term53786.getClass(), "cylsSec", null);
        setField(term53786, term53786.getClass(), "storageClass", null);
        setField(term53786, term53786.getClass(), "managementClass", null);
        setField(term53786, term53786.getClass(), "dataClass", null);
        setField(term53786, term53786.getClass(), "volumes", null);
        setField(term53786, term53786.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "perms", argTypes, term53786, args);
    }

};


