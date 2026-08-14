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

public class DsnCopy_setUrl_5390112414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;
     Object term143;

    public DsnCopy_setUrl_5390112414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCopy"));
        setField(term142, term142.getClass(), "connection", null);
        setField(term142, term142.getClass(), "request", null);
        term143 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData"));
        setField(term143, term143.getClass(), "fromVolser", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "fromDataSet", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "toVolser", "hRNSzYYIrc");
        setField(term143, term143.getClass(), "toDataSet", "RMFIsYGgne");
        setBooleanField(term143, term143.getClass(), "replace", true);
        setBooleanField(term143, term143.getClass(), "copyAllMembers", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCopy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Object[] args = new Object[1];
        args[0] = term143;
        callMethod(klass, "setUrl", argTypes, term142, args);
    }

};


