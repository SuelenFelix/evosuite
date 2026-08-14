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

public class CryptoBox_SeedSecureRandom_engineNextBytes_4120156702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031;
     Object term2035;

    public CryptoBox_SeedSecureRandom_engineNextBytes_4120156702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2031 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom"));
        byte[] term2032 = (byte[]) newByteArray(2);
        setByteElement(term2032, 0, (byte) 40);
        setByteElement(term2032, 1, (byte) 83);
        setField(term2031, term2031.getClass(), "seed", term2032);
        term2035 = (byte[]) newByteArray(3);
        setByteElement(term2035, 0, (byte) -41);
        setByteElement(term2035, 1, (byte) -102);
        setByteElement(term2035, 2, (byte) -93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2035;
        callMethod(klass, "engineNextBytes", argTypes, term2031, args);
    }

};


