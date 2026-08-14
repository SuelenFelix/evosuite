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

public class SecretBox_getTag_123235769213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9190;

    public SecretBox_getTag_123235769213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9190 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9191 = (byte[]) newByteArray(4);
        byte[] term9196 = (byte[]) newByteArray(9);
        setByteElement(term9191, 0, (byte) 93);
        setByteElement(term9191, 1, (byte) -19);
        setByteElement(term9191, 2, (byte) 85);
        setByteElement(term9191, 3, (byte) -124);
        setField(term9190, term9190.getClass(), "nonce", term9191);
        setByteElement(term9196, 0, (byte) -103);
        setByteElement(term9196, 1, (byte) 27);
        setByteElement(term9196, 2, (byte) 52);
        setByteElement(term9196, 3, (byte) -42);
        setByteElement(term9196, 4, (byte) 86);
        setByteElement(term9196, 5, (byte) 8);
        setByteElement(term9196, 6, (byte) 87);
        setByteElement(term9196, 7, (byte) -60);
        setByteElement(term9196, 8, (byte) -53);
        setField(term9190, term9190.getClass(), "ciphertext", term9196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term9190, args);
    }

};


