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

public class Subtle_streamXSalsa20Key_17583597773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9885;

    public Subtle_streamXSalsa20Key_17583597773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9885 = (byte[]) newByteArray(7);
        setByteElement(term9885, 0, (byte) 77);
        setByteElement(term9885, 1, (byte) 44);
        setByteElement(term9885, 2, (byte) -3);
        setByteElement(term9885, 3, (byte) -38);
        setByteElement(term9885, 4, (byte) -26);
        setByteElement(term9885, 5, (byte) 77);
        setByteElement(term9885, 6, (byte) 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9885;
        callMethod(klass, "streamXSalsa20Key", argTypes, null, args);
    }

};


