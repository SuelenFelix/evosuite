package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DsnList_getResponse_111828787412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2141;

    public DsnList_getResponse_111828787412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2141 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term2141, term2141.getClass(), "connection", null);
        setField(term2141, term2141.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getResponse", argTypes, term2141, args);
    }

};


