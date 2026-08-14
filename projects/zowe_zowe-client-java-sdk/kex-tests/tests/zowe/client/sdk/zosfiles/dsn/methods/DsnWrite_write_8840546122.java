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

public class DsnWrite_write_8840546122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3698;

    public DsnWrite_write_8840546122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3698 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnWrite"));
        setField(term3698, term3698.getClass(), "connection", null);
        setField(term3698, term3698.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnWrite");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "PkWMRdJcBb";
        args[1] = "jSpAteRute";
        args[2] = "swZVeJAxjt";
        callMethod(klass, "write", argTypes, term3698, args);
    }

};


