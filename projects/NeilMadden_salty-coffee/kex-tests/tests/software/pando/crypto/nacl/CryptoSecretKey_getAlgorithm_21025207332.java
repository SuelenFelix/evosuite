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

public class CryptoSecretKey_getAlgorithm_21025207332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5123;

    public CryptoSecretKey_getAlgorithm_21025207332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5123 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5124 = (byte[]) newByteArray(2);
        setByteElement(term5124, 0, (byte) -71);
        setByteElement(term5124, 1, (byte) -6);
        setField(term5123, term5123.getClass(), "keyMaterial", term5124);
        setField(term5123, term5123.getClass(), "algorithm", "jJCZpVmanW");
        setBooleanField(term5123, term5123.getClass(), "destroyed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlgorithm", argTypes, term5123, args);
    }

};


