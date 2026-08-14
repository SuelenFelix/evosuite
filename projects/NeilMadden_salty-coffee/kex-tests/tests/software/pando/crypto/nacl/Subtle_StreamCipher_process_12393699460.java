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

public class Subtle_StreamCipher_process_12393699460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4981;

    public Subtle_StreamCipher_process_12393699460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4981 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term4982 = (byte[]) newByteArray(2);
        setByteElement(term4982, 0, (byte) -84);
        setByteElement(term4982, 1, (byte) 69);
        setField(term4981, term4981.getClass(), "array", term4982);
        setIntField(term4981, term4981.getClass(), "offset", 972867650);
        setIntField(term4981, term4981.getClass(), "length", 1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$StreamCipher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = term4981;
        callMethod(klass, "process", argTypes, null, args);
    }

};


