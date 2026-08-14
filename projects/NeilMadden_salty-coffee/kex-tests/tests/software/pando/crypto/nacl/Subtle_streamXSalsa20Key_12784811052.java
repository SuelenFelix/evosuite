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

public class Subtle_streamXSalsa20Key_12784811052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9871;

    public Subtle_streamXSalsa20Key_12784811052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9871 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term9872 = (byte[]) newByteArray(5);
        setByteElement(term9872, 0, (byte) -85);
        setByteElement(term9872, 1, (byte) -53);
        setByteElement(term9872, 2, (byte) -113);
        setByteElement(term9872, 3, (byte) 116);
        setByteElement(term9872, 4, (byte) -90);
        setField(term9871, term9871.getClass(), "array", term9872);
        setIntField(term9871, term9871.getClass(), "offset", 584893196);
        setIntField(term9871, term9871.getClass(), "length", 497269071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = term9871;
        callMethod(klass, "streamXSalsa20Key", argTypes, null, args);
    }

};


