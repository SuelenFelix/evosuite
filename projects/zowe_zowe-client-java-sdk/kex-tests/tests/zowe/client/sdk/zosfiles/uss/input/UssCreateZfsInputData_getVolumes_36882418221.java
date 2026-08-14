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

public class UssCreateZfsInputData_getVolumes_36882418221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50198;

    public UssCreateZfsInputData_getVolumes_36882418221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50198 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term50198, term50198.getClass(), "owner", null);
        setField(term50198, term50198.getClass(), "group", null);
        setField(term50198, term50198.getClass(), "perms", null);
        setField(term50198, term50198.getClass(), "cylsPri", null);
        setField(term50198, term50198.getClass(), "cylsSec", null);
        setField(term50198, term50198.getClass(), "storageClass", null);
        setField(term50198, term50198.getClass(), "managementClass", null);
        setField(term50198, term50198.getClass(), "dataClass", null);
        setField(term50198, term50198.getClass(), "volumes", null);
        setField(term50198, term50198.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolumes", argTypes, term50198, args);
    }

};


