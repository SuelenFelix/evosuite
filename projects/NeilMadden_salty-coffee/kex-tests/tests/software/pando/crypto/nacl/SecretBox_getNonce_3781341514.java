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

public class SecretBox_getNonce_3781341514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9219;

    public SecretBox_getNonce_3781341514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9219 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9220 = (byte[]) newByteArray(4);
        byte[] term9225 = (byte[]) newByteArray(6);
        setByteElement(term9220, 0, (byte) 30);
        setByteElement(term9220, 1, (byte) -34);
        setByteElement(term9220, 2, (byte) 21);
        setByteElement(term9220, 3, (byte) 87);
        setField(term9219, term9219.getClass(), "nonce", term9220);
        setByteElement(term9225, 0, (byte) 107);
        setByteElement(term9225, 1, (byte) -23);
        setByteElement(term9225, 2, (byte) 7);
        setByteElement(term9225, 3, (byte) -60);
        setByteElement(term9225, 4, (byte) -111);
        setByteElement(term9225, 5, (byte) 127);
        setField(term9219, term9219.getClass(), "ciphertext", term9225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNonce", argTypes, term9219, args);
    }

};


