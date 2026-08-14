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
import java.lang.Object;

public class CryptoBox_toString_24756207423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public CryptoBox_toString_24756207423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1567 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1568 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1569 = (byte[]) newByteArray(2);
        byte[] term1572 = (byte[]) newByteArray(1);
        setByteElement(term1569, 0, (byte) 89);
        setByteElement(term1569, 1, (byte) -99);
        setField(term1568, term1568.getClass(), "nonce", term1569);
        setByteElement(term1572, 0, (byte) 59);
        setField(term1568, term1568.getClass(), "ciphertext", term1572);
        setField(term1567, term1567.getClass(), "box", term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1567, args);
    }

};


