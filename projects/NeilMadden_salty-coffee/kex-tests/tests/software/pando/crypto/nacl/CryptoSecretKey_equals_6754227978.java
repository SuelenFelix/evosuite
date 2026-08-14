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

public class CryptoSecretKey_equals_6754227978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5353;
     Object term5375;

    public CryptoSecretKey_equals_6754227978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5353 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoSecretKey"));
        byte[] term5354 = (byte[]) newByteArray(7);
        setByteElement(term5354, 0, (byte) 11);
        setByteElement(term5354, 1, (byte) 91);
        setByteElement(term5354, 2, (byte) 48);
        setByteElement(term5354, 3, (byte) -118);
        setByteElement(term5354, 4, (byte) -15);
        setByteElement(term5354, 5, (byte) 91);
        setByteElement(term5354, 6, (byte) -114);
        setField(term5353, term5353.getClass(), "keyMaterial", term5354);
        setField(term5353, term5353.getClass(), "algorithm", "NRdvgJlhkX");
        setBooleanField(term5353, term5353.getClass(), "destroyed", true);
        term5375 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5375;
        callMethod(klass, "equals", argTypes, term5353, args);
    }

};


