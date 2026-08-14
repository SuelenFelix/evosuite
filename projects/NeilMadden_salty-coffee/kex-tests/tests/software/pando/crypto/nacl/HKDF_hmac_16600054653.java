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

public class HKDF_hmac_16600054653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9753;
     Object term9768;

    public HKDF_hmac_16600054653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9753 = newInstance(Class.forName("software.pando.crypto.nacl.HKDF"));
        setIntField(term9753, term9753.getClass(), "saltLenBytes", -1896376975);
        setIntField(term9753, term9753.getClass(), "tagLenBytes", 729658803);
        setField(term9753, term9753.getClass(), "hmacAlgorithm", "kBdSllIBVz");
        term9768 = (byte[]) newByteArray(8);
        setByteElement(term9768, 0, (byte) 49);
        setByteElement(term9768, 1, (byte) -20);
        setByteElement(term9768, 2, (byte) 43);
        setByteElement(term9768, 3, (byte) -21);
        setByteElement(term9768, 4, (byte) 83);
        setByteElement(term9768, 5, (byte) -103);
        setByteElement(term9768, 6, (byte) -74);
        setByteElement(term9768, 7, (byte) 51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.HKDF");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.crypto.SecretKey");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9768;
        callMethod(klass, "hmac", argTypes, term9753, args);
    }

};


