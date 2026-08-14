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

public class ByteSlice_wipe_20421957403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;

    public ByteSlice_wipe_20421957403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term540 = (byte[]) newByteArray(3);
        setByteElement(term540, 0, (byte) -70);
        setByteElement(term540, 1, (byte) -73);
        setByteElement(term540, 2, (byte) 1);
        setField(term539, term539.getClass(), "array", term540);
        setIntField(term539, term539.getClass(), "offset", 1876565163);
        setIntField(term539, term539.getClass(), "length", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wipe", argTypes, term539, args);
    }

};


