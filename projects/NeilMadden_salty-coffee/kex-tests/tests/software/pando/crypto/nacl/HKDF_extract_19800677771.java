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

public class HKDF_extract_19800677771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9670;
     Object term9685;
     Object term9687;

    public HKDF_extract_19800677771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9670 = newInstance(Class.forName("software.pando.crypto.nacl.HKDF"));
        setIntField(term9670, term9670.getClass(), "saltLenBytes", 1358829571);
        setIntField(term9670, term9670.getClass(), "tagLenBytes", 991356662);
        setField(term9670, term9670.getClass(), "hmacAlgorithm", "fhkbdRViHi");
        term9685 = (byte[]) newByteArray(1);
        setByteElement(term9685, 0, (byte) -115);
        term9687 = (byte[]) newByteArray(4);
        setByteElement(term9687, 0, (byte) -87);
        setByteElement(term9687, 1, (byte) 16);
        setByteElement(term9687, 2, (byte) 62);
        setByteElement(term9687, 3, (byte) 43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.HKDF");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9685;
        args[1] = term9687;
        callMethod(klass, "extract", argTypes, term9670, args);
    }

};


