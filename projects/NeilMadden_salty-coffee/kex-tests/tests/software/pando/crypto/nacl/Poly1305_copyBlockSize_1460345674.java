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

public class Poly1305_copyBlockSize_1460345674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;
     Object term108;
     Object term110;

    public Poly1305_copyBlockSize_1460345674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = (byte[]) newByteArray(7);
        setByteElement(term100, 0, (byte) 118);
        setByteElement(term100, 1, (byte) 106);
        setByteElement(term100, 2, (byte) 98);
        setByteElement(term100, 3, (byte) 67);
        setByteElement(term100, 4, (byte) 66);
        setByteElement(term100, 5, (byte) -121);
        setByteElement(term100, 6, (byte) -119);
        term108 = (byte[]) newByteArray(1);
        setByteElement(term108, 0, (byte) 71);
        term110 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term100;
        args[1] = term108;
        args[2] = term110;
        callMethod(klass, "copyBlockSize", argTypes, null, args);
    }

};


