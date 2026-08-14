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

public class Subtle_XSalsa20StreamCipher_nonce_12432711262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9471;

    public Subtle_XSalsa20StreamCipher_nonce_12432711262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9471 = newInstance(Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher"));
        byte[] term9472 = (byte[]) newByteArray(3);
        byte[] term9476 = (byte[]) newByteArray(3);
        setByteElement(term9472, 0, (byte) -14);
        setByteElement(term9472, 1, (byte) -16);
        setByteElement(term9472, 2, (byte) 22);
        setField(term9471, term9471.getClass(), "key", term9472);
        setByteElement(term9476, 0, (byte) -73);
        setByteElement(term9476, 1, (byte) 59);
        setByteElement(term9476, 2, (byte) -89);
        setField(term9471, term9471.getClass(), "nonce", term9476);
        setLongField(term9471, term9471.getClass(), "blockCounter", -4867941246533901410L);
        setBooleanField(term9471, term9471.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nonce", argTypes, term9471, args);
    }

};


