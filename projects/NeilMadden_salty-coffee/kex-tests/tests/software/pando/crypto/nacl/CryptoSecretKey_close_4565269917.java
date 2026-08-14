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

public class CryptoSecretKey_close_4565269917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5310;

    public CryptoSecretKey_close_4565269917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5310 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5311 = (byte[]) newByteArray(9);
        setByteElement(term5311, 0, (byte) -64);
        setByteElement(term5311, 1, (byte) 24);
        setByteElement(term5311, 2, (byte) 61);
        setByteElement(term5311, 3, (byte) -45);
        setByteElement(term5311, 4, (byte) 40);
        setByteElement(term5311, 5, (byte) 52);
        setByteElement(term5311, 6, (byte) -56);
        setByteElement(term5311, 7, (byte) 81);
        setByteElement(term5311, 8, (byte) -26);
        setField(term5310, term5310.getClass(), "keyMaterial", term5311);
        setField(term5310, term5310.getClass(), "algorithm", "RMFIsYGgne");
        setBooleanField(term5310, term5310.getClass(), "destroyed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term5310, args);
    }

};


