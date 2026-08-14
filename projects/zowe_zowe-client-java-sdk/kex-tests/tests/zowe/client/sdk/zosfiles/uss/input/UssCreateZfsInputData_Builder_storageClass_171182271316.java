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

public class UssCreateZfsInputData_Builder_storageClass_171182271316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53788;

    public UssCreateZfsInputData_Builder_storageClass_171182271316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53788 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53788, term53788.getClass(), "owner", null);
        setField(term53788, term53788.getClass(), "group", null);
        setField(term53788, term53788.getClass(), "perms", null);
        setField(term53788, term53788.getClass(), "cylsPri", null);
        setField(term53788, term53788.getClass(), "cylsSec", null);
        setField(term53788, term53788.getClass(), "storageClass", null);
        setField(term53788, term53788.getClass(), "managementClass", null);
        setField(term53788, term53788.getClass(), "dataClass", null);
        setField(term53788, term53788.getClass(), "volumes", null);
        setField(term53788, term53788.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "storageClass", argTypes, term53788, args);
    }

};


