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

public class ByteSlice_length_6782725912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;

    public ByteSlice_length_6782725912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term520 = (byte[]) newByteArray(8);
        setByteElement(term520, 0, (byte) -76);
        setByteElement(term520, 1, (byte) -115);
        setByteElement(term520, 2, (byte) -48);
        setByteElement(term520, 3, (byte) 126);
        setByteElement(term520, 4, (byte) -2);
        setByteElement(term520, 5, (byte) 103);
        setByteElement(term520, 6, (byte) 23);
        setByteElement(term520, 7, (byte) 96);
        setField(term519, term519.getClass(), "array", term520);
        setIntField(term519, term519.getClass(), "offset", -602026508);
        setIntField(term519, term519.getClass(), "length", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term519, args);
    }

};


