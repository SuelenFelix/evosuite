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

public class SecretBox_getCiphertextWithTag_2800197815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9242;

    public SecretBox_getCiphertextWithTag_2800197815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9242 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9243 = (byte[]) newByteArray(4);
        byte[] term9248 = (byte[]) newByteArray(5);
        setByteElement(term9243, 0, (byte) 98);
        setByteElement(term9243, 1, (byte) -49);
        setByteElement(term9243, 2, (byte) 1);
        setByteElement(term9243, 3, (byte) -79);
        setField(term9242, term9242.getClass(), "nonce", term9243);
        setByteElement(term9248, 0, (byte) -55);
        setByteElement(term9248, 1, (byte) -24);
        setByteElement(term9248, 2, (byte) 104);
        setByteElement(term9248, 3, (byte) -1);
        setByteElement(term9248, 4, (byte) 82);
        setField(term9242, term9242.getClass(), "ciphertext", term9248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCiphertextWithTag", argTypes, term9242, args);
    }

};


