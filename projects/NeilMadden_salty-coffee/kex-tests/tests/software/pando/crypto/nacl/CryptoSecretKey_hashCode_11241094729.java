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

public class CryptoSecretKey_hashCode_11241094729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5393;

    public CryptoSecretKey_hashCode_11241094729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5393 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5394 = (byte[]) newByteArray(6);
        setByteElement(term5394, 0, (byte) 124);
        setByteElement(term5394, 1, (byte) 97);
        setByteElement(term5394, 2, (byte) -15);
        setByteElement(term5394, 3, (byte) -70);
        setByteElement(term5394, 4, (byte) 48);
        setByteElement(term5394, 5, (byte) 33);
        setField(term5393, term5393.getClass(), "keyMaterial", term5394);
        setField(term5393, term5393.getClass(), "algorithm", "uuaPigETmJ");
        setBooleanField(term5393, term5393.getClass(), "destroyed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5393, args);
    }

};


