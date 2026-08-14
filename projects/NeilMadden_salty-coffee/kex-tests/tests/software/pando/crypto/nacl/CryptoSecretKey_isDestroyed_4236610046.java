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

public class CryptoSecretKey_isDestroyed_4236610046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5269;

    public CryptoSecretKey_isDestroyed_4236610046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5269 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5270 = (byte[]) newByteArray(8);
        setByteElement(term5270, 0, (byte) 105);
        setByteElement(term5270, 1, (byte) 100);
        setByteElement(term5270, 2, (byte) 117);
        setByteElement(term5270, 3, (byte) -111);
        setByteElement(term5270, 5, (byte) -92);
        setByteElement(term5270, 6, (byte) 16);
        setByteElement(term5270, 7, (byte) 65);
        setField(term5269, term5269.getClass(), "keyMaterial", term5270);
        setField(term5269, term5269.getClass(), "algorithm", "hRNSzYYIrc");
        setBooleanField(term5269, term5269.getClass(), "destroyed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDestroyed", argTypes, term5269, args);
    }

};


