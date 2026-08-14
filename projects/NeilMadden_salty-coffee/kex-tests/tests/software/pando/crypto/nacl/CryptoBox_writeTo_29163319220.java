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

public class CryptoBox_writeTo_29163319220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513;

    public CryptoBox_writeTo_29163319220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1513 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1514 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1515 = (byte[]) newByteArray(8);
        byte[] term1524 = (byte[]) newByteArray(6);
        setByteElement(term1515, 0, (byte) 84);
        setByteElement(term1515, 1, (byte) 114);
        setByteElement(term1515, 2, (byte) 60);
        setByteElement(term1515, 3, (byte) -20);
        setByteElement(term1515, 4, (byte) 100);
        setByteElement(term1515, 5, (byte) -41);
        setByteElement(term1515, 6, (byte) -70);
        setByteElement(term1515, 7, (byte) -5);
        setField(term1514, term1514.getClass(), "nonce", term1515);
        setByteElement(term1524, 0, (byte) 119);
        setByteElement(term1524, 1, (byte) 81);
        setByteElement(term1524, 2, (byte) -28);
        setByteElement(term1524, 3, (byte) -18);
        setByteElement(term1524, 4, (byte) -61);
        setByteElement(term1524, 5, (byte) 70);
        setField(term1514, term1514.getClass(), "ciphertext", term1524);
        setField(term1513, term1513.getClass(), "box", term1514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeTo", argTypes, term1513, args);
    }

};


