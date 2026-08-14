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

public class UssCreateZfsInputData_toString_159063253823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50200;

    public UssCreateZfsInputData_toString_159063253823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50200 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term50200, term50200.getClass(), "owner", null);
        setField(term50200, term50200.getClass(), "group", null);
        setField(term50200, term50200.getClass(), "perms", null);
        setField(term50200, term50200.getClass(), "cylsPri", null);
        setField(term50200, term50200.getClass(), "cylsSec", null);
        setField(term50200, term50200.getClass(), "storageClass", null);
        setField(term50200, term50200.getClass(), "managementClass", null);
        setField(term50200, term50200.getClass(), "dataClass", null);
        setField(term50200, term50200.getClass(), "volumes", null);
        setField(term50200, term50200.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term50200, args);
    }

};


