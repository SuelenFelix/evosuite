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

public class SecretBox_key_15052016032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8977;

    public SecretBox_key_15052016032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8977 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term8978 = (byte[]) newByteArray(5);
        setByteElement(term8978, 0, (byte) 34);
        setByteElement(term8978, 1, (byte) 100);
        setByteElement(term8978, 2, (byte) 26);
        setByteElement(term8978, 3, (byte) -128);
        setByteElement(term8978, 4, (byte) 122);
        setField(term8977, term8977.getClass(), "array", term8978);
        setIntField(term8977, term8977.getClass(), "offset", -601863069);
        setIntField(term8977, term8977.getClass(), "length", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = term8977;
        callMethod(klass, "key", argTypes, null, args);
    }

};


