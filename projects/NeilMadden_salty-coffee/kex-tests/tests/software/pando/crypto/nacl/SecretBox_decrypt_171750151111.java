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

public class SecretBox_decrypt_171750151111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9153;
     Object term9164;

    public SecretBox_decrypt_171750151111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9153 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9154 = (byte[]) newByteArray(2);
        byte[] term9157 = (byte[]) newByteArray(6);
        setByteElement(term9154, 0, (byte) 106);
        setByteElement(term9154, 1, (byte) -99);
        setField(term9153, term9153.getClass(), "nonce", term9154);
        setByteElement(term9157, 0, (byte) 66);
        setByteElement(term9157, 1, (byte) 82);
        setByteElement(term9157, 2, (byte) 81);
        setByteElement(term9157, 3, (byte) -106);
        setByteElement(term9157, 4, (byte) -110);
        setByteElement(term9157, 5, (byte) 126);
        setField(term9153, term9153.getClass(), "ciphertext", term9157);
        term9164 = (byte[]) newByteArray(4);
        setByteElement(term9164, 0, (byte) 100);
        setByteElement(term9164, 1, (byte) 97);
        setByteElement(term9164, 2, (byte) 31);
        setByteElement(term9164, 3, (byte) -113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9164;
        callMethod(klass, "decrypt", argTypes, term9153, args);
    }

};


