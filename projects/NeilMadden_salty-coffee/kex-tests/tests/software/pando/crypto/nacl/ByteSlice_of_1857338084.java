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
import java.lang.Integer;

public class ByteSlice_of_1857338084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;
     Object term556;
     Object term558;

    public ByteSlice_of_1857338084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549 = (byte[]) newByteArray(6);
        setByteElement(term549, 0, (byte) 99);
        setByteElement(term549, 1, (byte) -121);
        setByteElement(term549, 2, (byte) -50);
        setByteElement(term549, 3, (byte) -79);
        setByteElement(term549, 4, (byte) 110);
        setByteElement(term549, 5, (byte) -111);
        term556 = new Integer(-1016503459);
        term558 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term549;
        args[1] = term556;
        args[2] = term558;
        callMethod(klass, "of", argTypes, null, args);
    }

};


