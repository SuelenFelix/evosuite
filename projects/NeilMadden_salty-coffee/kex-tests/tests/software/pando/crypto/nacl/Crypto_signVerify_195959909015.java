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

public class Crypto_signVerify_195959909015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876;
     Object term1885;

    public Crypto_signVerify_195959909015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1876 = (byte[]) newByteArray(8);
        setByteElement(term1876, 0, (byte) 102);
        setByteElement(term1876, 1, (byte) 59);
        setByteElement(term1876, 2, (byte) -79);
        setByteElement(term1876, 3, (byte) -33);
        setByteElement(term1876, 4, (byte) 1);
        setByteElement(term1876, 5, (byte) -88);
        setByteElement(term1876, 6, (byte) -53);
        setByteElement(term1876, 7, (byte) -120);
        term1885 = (byte[]) newByteArray(8);
        setByteElement(term1885, 0, (byte) 94);
        setByteElement(term1885, 1, (byte) -76);
        setByteElement(term1885, 2, (byte) -122);
        setByteElement(term1885, 3, (byte) 43);
        setByteElement(term1885, 4, (byte) -31);
        setByteElement(term1885, 5, (byte) 95);
        setByteElement(term1885, 6, (byte) -33);
        setByteElement(term1885, 7, (byte) 21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.security.PublicKey");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1876;
        args[2] = term1885;
        callMethod(klass, "signVerify", argTypes, null, args);
    }

};


