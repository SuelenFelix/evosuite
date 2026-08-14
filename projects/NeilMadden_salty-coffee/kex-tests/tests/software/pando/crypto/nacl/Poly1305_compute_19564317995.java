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

public class Poly1305_compute_19564317995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term127;
     Object term133;
     Object term135;

    public Poly1305_compute_19564317995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = (byte[]) newByteArray(6);
        setByteElement(term120, 0, (byte) 80);
        setByteElement(term120, 1, (byte) 42);
        setByteElement(term120, 2, (byte) 72);
        setByteElement(term120, 3, (byte) 111);
        setByteElement(term120, 4, (byte) 99);
        setByteElement(term120, 5, (byte) -12);
        term127 = (byte[]) newByteArray(5);
        setByteElement(term127, 0, (byte) -61);
        setByteElement(term127, 1, (byte) -85);
        setByteElement(term127, 2, (byte) -22);
        setByteElement(term127, 3, (byte) 93);
        setByteElement(term127, 4, (byte) 69);
        term133 = new Integer(-1955890973);
        term135 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Poly1305");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term120;
        args[1] = term127;
        args[2] = term133;
        args[3] = term135;
        callMethod(klass, "compute", argTypes, null, args);
    }

};


