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

public class SecretBox_getCiphertextWithoutTag_195792112016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9263;

    public SecretBox_getCiphertextWithoutTag_195792112016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9263 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9264 = (byte[]) newByteArray(0);
        byte[] term9265 = (byte[]) newByteArray(6);
        setField(term9263, term9263.getClass(), "nonce", term9264);
        setByteElement(term9265, 0, (byte) 53);
        setByteElement(term9265, 1, (byte) 104);
        setByteElement(term9265, 2, (byte) -7);
        setByteElement(term9265, 3, (byte) 89);
        setByteElement(term9265, 4, (byte) -36);
        setByteElement(term9265, 5, (byte) -117);
        setField(term9263, term9263.getClass(), "ciphertext", term9265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCiphertextWithoutTag", argTypes, term9263, args);
    }

};


