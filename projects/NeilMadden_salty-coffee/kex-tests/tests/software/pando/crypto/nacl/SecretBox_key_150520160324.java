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

public class SecretBox_key_150520160324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9361;

    public SecretBox_key_150520160324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9361 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        setField(term9361, term9361.getClass(), "nonce", null);
        setField(term9361, term9361.getClass(), "ciphertext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "key", argTypes, term9361, args);
    }

};


