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

public class CryptoSecretKey_getEncoded_1718550454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5193;

    public CryptoSecretKey_getEncoded_1718550454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5193 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5194 = (byte[]) newByteArray(8);
        setByteElement(term5194, 0, (byte) 51);
        setByteElement(term5194, 1, (byte) -76);
        setByteElement(term5194, 2, (byte) 38);
        setByteElement(term5194, 3, (byte) -20);
        setByteElement(term5194, 4, (byte) -20);
        setByteElement(term5194, 5, (byte) 53);
        setByteElement(term5194, 6, (byte) -80);
        setByteElement(term5194, 7, (byte) -11);
        setField(term5193, term5193.getClass(), "keyMaterial", term5194);
        setField(term5193, term5193.getClass(), "algorithm", "SzjVpOQTyS");
        setBooleanField(term5193, term5193.getClass(), "destroyed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoded", argTypes, term5193, args);
    }

};


