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

public class SecretBox_fromDetached_2907226679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9095;
     Object term9103;
     Object term9109;

    public SecretBox_fromDetached_2907226679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9095 = (byte[]) newByteArray(7);
        setByteElement(term9095, 0, (byte) -87);
        setByteElement(term9095, 1, (byte) -119);
        setByteElement(term9095, 2, (byte) -57);
        setByteElement(term9095, 3, (byte) -35);
        setByteElement(term9095, 4, (byte) -127);
        setByteElement(term9095, 5, (byte) 85);
        setByteElement(term9095, 6, (byte) -49);
        term9103 = (byte[]) newByteArray(5);
        setByteElement(term9103, 0, (byte) -18);
        setByteElement(term9103, 1, (byte) 120);
        setByteElement(term9103, 2, (byte) 116);
        setByteElement(term9103, 3, (byte) -100);
        setByteElement(term9103, 4, (byte) 95);
        term9109 = (byte[]) newByteArray(8);
        setByteElement(term9109, 0, (byte) -11);
        setByteElement(term9109, 1, (byte) 38);
        setByteElement(term9109, 2, (byte) -95);
        setByteElement(term9109, 3, (byte) 53);
        setByteElement(term9109, 4, (byte) 119);
        setByteElement(term9109, 5, (byte) -20);
        setByteElement(term9109, 6, (byte) 48);
        setByteElement(term9109, 7, (byte) 79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term9095;
        args[1] = term9103;
        args[2] = term9109;
        callMethod(klass, "fromDetached", argTypes, null, args);
    }

};


