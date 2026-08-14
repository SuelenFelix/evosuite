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

public class Poly1305_computeMac_13862135286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term154;

    public Poly1305_computeMac_13862135286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = (byte[]) newByteArray(5);
        setByteElement(term148, 0, (byte) -74);
        setByteElement(term148, 1, (byte) -123);
        setByteElement(term148, 2, (byte) -23);
        setByteElement(term148, 3, (byte) 100);
        setByteElement(term148, 4, (byte) 106);
        term154 = (byte[]) newByteArray(2);
        setByteElement(term154, 0, (byte) -57);
        setByteElement(term154, 1, (byte) -103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Poly1305");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term148;
        args[1] = term154;
        callMethod(klass, "computeMac", argTypes, null, args);
    }

};


