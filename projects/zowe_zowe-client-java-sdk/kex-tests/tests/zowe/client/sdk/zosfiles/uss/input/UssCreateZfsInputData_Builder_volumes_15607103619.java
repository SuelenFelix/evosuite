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

public class UssCreateZfsInputData_Builder_volumes_15607103619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53791;

    public UssCreateZfsInputData_Builder_volumes_15607103619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53791 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53791, term53791.getClass(), "owner", null);
        setField(term53791, term53791.getClass(), "group", null);
        setField(term53791, term53791.getClass(), "perms", null);
        setField(term53791, term53791.getClass(), "cylsPri", null);
        setField(term53791, term53791.getClass(), "cylsSec", null);
        setField(term53791, term53791.getClass(), "storageClass", null);
        setField(term53791, term53791.getClass(), "managementClass", null);
        setField(term53791, term53791.getClass(), "dataClass", null);
        setField(term53791, term53791.getClass(), "volumes", null);
        setField(term53791, term53791.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "volumes", argTypes, term53791, args);
    }

};


