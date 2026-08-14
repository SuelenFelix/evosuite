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

public class Ed25519_load3_167232875514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004;
     Object term4012;

    public Ed25519_load3_167232875514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004 = (byte[]) newByteArray(7);
        setByteElement(term4004, 0, (byte) 74);
        setByteElement(term4004, 1, (byte) 37);
        setByteElement(term4004, 2, (byte) -78);
        setByteElement(term4004, 3, (byte) 3);
        setByteElement(term4004, 4, (byte) -30);
        setByteElement(term4004, 5, (byte) -67);
        setByteElement(term4004, 6, (byte) -67);
        term4012 = new Integer(-93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4004;
        args[1] = term4012;
        callMethod(klass, "load3", argTypes, null, args);
    }

};


