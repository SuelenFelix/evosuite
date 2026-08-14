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

public class UssCreateZfsInputData_getGroup_165739455914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50191;

    public UssCreateZfsInputData_getGroup_165739455914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50191 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term50191, term50191.getClass(), "owner", null);
        setField(term50191, term50191.getClass(), "group", null);
        setField(term50191, term50191.getClass(), "perms", null);
        setField(term50191, term50191.getClass(), "cylsPri", null);
        setField(term50191, term50191.getClass(), "cylsSec", null);
        setField(term50191, term50191.getClass(), "storageClass", null);
        setField(term50191, term50191.getClass(), "managementClass", null);
        setField(term50191, term50191.getClass(), "dataClass", null);
        setField(term50191, term50191.getClass(), "volumes", null);
        setField(term50191, term50191.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term50191, args);
    }

};


