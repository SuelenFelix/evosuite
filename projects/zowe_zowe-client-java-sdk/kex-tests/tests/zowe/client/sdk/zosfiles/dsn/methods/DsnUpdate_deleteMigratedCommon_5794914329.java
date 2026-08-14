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
import java.lang.Boolean;

public class DsnUpdate_deleteMigratedCommon_5794914329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3577;
     Object term3590;
     Object term3592;

    public DsnUpdate_deleteMigratedCommon_5794914329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3577 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnUpdate"));
        setField(term3577, term3577.getClass(), "connection", null);
        setField(term3577, term3577.getClass(), "request", null);
        term3590 = new Boolean(false);
        term3592 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnUpdate");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Boolean");
        argTypes[2] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[3];
        args[0] = "cAPeiZHKGJ";
        args[1] = term3590;
        args[2] = term3592;
        callMethod(klass, "deleteMigratedCommon", argTypes, term3577, args);
    }

};


