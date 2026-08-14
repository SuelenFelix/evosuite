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

public class CryptoSecretKey_checkDestroyed_34577071011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5465;

    public CryptoSecretKey_checkDestroyed_34577071011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5465 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5466 = (byte[]) newByteArray(2);
        setByteElement(term5466, 0, (byte) -121);
        setByteElement(term5466, 1, (byte) -40);
        setField(term5465, term5465.getClass(), "keyMaterial", term5466);
        setField(term5465, term5465.getClass(), "algorithm", "LQFpaHEwXR");
        setBooleanField(term5465, term5465.getClass(), "destroyed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkDestroyed", argTypes, term5465, args);
    }

};


