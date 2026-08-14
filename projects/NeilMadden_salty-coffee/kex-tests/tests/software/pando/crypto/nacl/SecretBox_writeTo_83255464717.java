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

public class SecretBox_writeTo_83255464717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9278;

    public SecretBox_writeTo_83255464717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9278 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9279 = (byte[]) newByteArray(0);
        byte[] term9280 = (byte[]) newByteArray(2);
        setField(term9278, term9278.getClass(), "nonce", term9279);
        setByteElement(term9280, 0, (byte) 41);
        setByteElement(term9280, 1, (byte) -111);
        setField(term9278, term9278.getClass(), "ciphertext", term9280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeTo", argTypes, term9278, args);
    }

};


