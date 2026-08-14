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

public class ByteSlice_toByteArray_15162125511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public ByteSlice_toByteArray_15162125511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term512 = (byte[]) newByteArray(2);
        setByteElement(term512, 0, (byte) 83);
        setByteElement(term512, 1, (byte) -123);
        setField(term511, term511.getClass(), "array", term512);
        setIntField(term511, term511.getClass(), "offset", 1962444399);
        setIntField(term511, term511.getClass(), "length", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toByteArray", argTypes, term511, args);
    }

};


