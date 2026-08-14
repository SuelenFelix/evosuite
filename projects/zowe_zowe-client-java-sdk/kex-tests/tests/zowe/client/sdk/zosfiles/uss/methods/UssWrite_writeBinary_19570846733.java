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

public class UssWrite_writeBinary_19570846733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;
     Object term2612;

    public UssWrite_writeBinary_19570846733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2599 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        setField(term2599, term2599.getClass(), "connection", null);
        setField(term2599, term2599.getClass(), "request", null);
        term2612 = (byte[]) newByteArray(4);
        setByteElement(term2612, 0, (byte) 47);
        setByteElement(term2612, 1, (byte) 48);
        setByteElement(term2612, 2, (byte) 89);
        setByteElement(term2612, 3, (byte) 75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "IoAlmYsBwc";
        args[1] = term2612;
        callMethod(klass, "writeBinary", argTypes, term2599, args);
    }

};


