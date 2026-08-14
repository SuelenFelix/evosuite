package software.pando.crypto.nacl;

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
import static software.pando.crypto.nacl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CryptoBox_fromDetached_150621144513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;
     Object term1361;
     Object term1363;

    public CryptoBox_fromDetached_150621144513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1356 = (byte[]) newByteArray(4);
        setByteElement(term1356, 0, (byte) 53);
        setByteElement(term1356, 1, (byte) 44);
        setByteElement(term1356, 2, (byte) 49);
        setByteElement(term1356, 3, (byte) 114);
        term1361 = (byte[]) newByteArray(1);
        setByteElement(term1361, 0, (byte) -81);
        term1363 = (byte[]) newByteArray(1);
        setByteElement(term1363, 0, (byte) 127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1356;
        args[1] = term1361;
        args[2] = term1363;
        callMethod(klass, "fromDetached", argTypes, null, args);
    }

};


