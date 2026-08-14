package zowe.client.sdk.zosfiles.uss.input.factory;

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
import static zowe.client.sdk.zosfiles.uss.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssSetAclInputData_Builder_build_99794114215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4970;

    public UssSetAclInputData_Builder_build_99794114215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4970 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term4970, term4970.getClass(), "abort", false);
        setField(term4970, term4970.getClass(), "links", null);
        setField(term4970, term4970.getClass(), "deleteType", null);
        setField(term4970, term4970.getClass(), "set", null);
        setField(term4970, term4970.getClass(), "modify", null);
        setField(term4970, term4970.getClass(), "delete", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4970, args);
    }

};


