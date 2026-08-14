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

public class SecretBox_toString_78848352920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9307;

    public SecretBox_toString_78848352920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9307 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9308 = (byte[]) newByteArray(6);
        byte[] term9315 = (byte[]) newByteArray(2);
        setByteElement(term9308, 0, (byte) -127);
        setByteElement(term9308, 1, (byte) 116);
        setByteElement(term9308, 2, (byte) 48);
        setByteElement(term9308, 3, (byte) 91);
        setByteElement(term9308, 4, (byte) 13);
        setByteElement(term9308, 5, (byte) 87);
        setField(term9307, term9307.getClass(), "nonce", term9308);
        setByteElement(term9315, 0, (byte) 46);
        setByteElement(term9315, 1, (byte) 90);
        setField(term9307, term9307.getClass(), "ciphertext", term9315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9307, args);
    }

};


