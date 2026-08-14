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

public class CryptoSecretKey_destroy_6636986755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5234;

    public CryptoSecretKey_destroy_6636986755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5234 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5235 = (byte[]) newByteArray(5);
        setByteElement(term5235, 0, (byte) -33);
        setByteElement(term5235, 1, (byte) 58);
        setByteElement(term5235, 2, (byte) 31);
        setByteElement(term5235, 3, (byte) -18);
        setByteElement(term5235, 4, (byte) 30);
        setField(term5234, term5234.getClass(), "keyMaterial", term5235);
        setField(term5234, term5234.getClass(), "algorithm", "MjGYSRKTNF");
        setBooleanField(term5234, term5234.getClass(), "destroyed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroy", argTypes, term5234, args);
    }

};


