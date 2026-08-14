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

public class UssCreateZfsInputData_getManagementClass_85095236019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50196;

    public UssCreateZfsInputData_getManagementClass_85095236019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50196 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term50196, term50196.getClass(), "owner", null);
        setField(term50196, term50196.getClass(), "group", null);
        setField(term50196, term50196.getClass(), "perms", null);
        setField(term50196, term50196.getClass(), "cylsPri", null);
        setField(term50196, term50196.getClass(), "cylsSec", null);
        setField(term50196, term50196.getClass(), "storageClass", null);
        setField(term50196, term50196.getClass(), "managementClass", null);
        setField(term50196, term50196.getClass(), "dataClass", null);
        setField(term50196, term50196.getClass(), "volumes", null);
        setField(term50196, term50196.getClass(), "timeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getManagementClass", argTypes, term50196, args);
    }

};


