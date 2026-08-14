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

public class Subtle_XSalsa20StreamCipher_nonce_12432711266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9510;

    public Subtle_XSalsa20StreamCipher_nonce_12432711266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9510 = newInstance(Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher"));
        setField(term9510, term9510.getClass(), "key", null);
        setField(term9510, term9510.getClass(), "nonce", null);
        setLongField(term9510, term9510.getClass(), "blockCounter", 0L);
        setBooleanField(term9510, term9510.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nonce", argTypes, term9510, args);
    }

};


