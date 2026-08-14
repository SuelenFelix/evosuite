package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssGet_getText_15996678113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5525;

    public UssGet_getText_15996678113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5525 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssGet"));
        setField(term5525, term5525.getClass(), "connection", null);
        setField(term5525, term5525.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        callMethod(klass, "getText", argTypes, term5525, args);
    }

};


