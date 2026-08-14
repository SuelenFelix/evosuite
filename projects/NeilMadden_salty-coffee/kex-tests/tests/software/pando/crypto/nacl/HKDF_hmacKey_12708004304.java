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

public class HKDF_hmacKey_12708004304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9795;
     Object term9810;

    public HKDF_hmacKey_12708004304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9795 = newInstance(Class.forName("software.pando.crypto.nacl.HKDF"));
        setIntField(term9795, term9795.getClass(), "saltLenBytes", 114754804);
        setIntField(term9795, term9795.getClass(), "tagLenBytes", 1687361082);
        setField(term9795, term9795.getClass(), "hmacAlgorithm", "TJmVBGfTML");
        term9810 = (byte[]) newByteArray(7);
        setByteElement(term9810, 0, (byte) -121);
        setByteElement(term9810, 1, (byte) 68);
        setByteElement(term9810, 2, (byte) 11);
        setByteElement(term9810, 3, (byte) 59);
        setByteElement(term9810, 4, (byte) -18);
        setByteElement(term9810, 5, (byte) -8);
        setByteElement(term9810, 6, (byte) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.HKDF");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9810;
        callMethod(klass, "hmacKey", argTypes, term9795, args);
    }

};


