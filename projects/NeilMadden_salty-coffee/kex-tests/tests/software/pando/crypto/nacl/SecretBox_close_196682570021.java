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

public class SecretBox_close_196682570021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9326;

    public SecretBox_close_196682570021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9326 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9327 = (byte[]) newByteArray(8);
        byte[] term9336 = (byte[]) newByteArray(7);
        setByteElement(term9327, 0, (byte) -79);
        setByteElement(term9327, 1, (byte) -86);
        setByteElement(term9327, 2, (byte) 103);
        setByteElement(term9327, 3, (byte) 70);
        setByteElement(term9327, 4, (byte) 42);
        setByteElement(term9327, 5, (byte) 28);
        setByteElement(term9327, 6, (byte) 34);
        setByteElement(term9327, 7, (byte) 1);
        setField(term9326, term9326.getClass(), "nonce", term9327);
        setByteElement(term9336, 0, (byte) 70);
        setByteElement(term9336, 1, (byte) -58);
        setByteElement(term9336, 2, (byte) -44);
        setByteElement(term9336, 3, (byte) -25);
        setByteElement(term9336, 4, (byte) -90);
        setByteElement(term9336, 5, (byte) -96);
        setByteElement(term9336, 6, (byte) 126);
        setField(term9326, term9326.getClass(), "ciphertext", term9336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term9326, args);
    }

};


