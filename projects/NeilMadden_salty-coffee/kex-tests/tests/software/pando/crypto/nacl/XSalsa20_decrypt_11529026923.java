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

public class XSalsa20_decrypt_11529026923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4498;
     Object term4501;
     Object term4511;
     Object term4513;
     Object term4525;

    public XSalsa20_decrypt_11529026923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4498 = (byte[]) newByteArray(2);
        setByteElement(term4498, 0, (byte) 98);
        setByteElement(term4498, 1, (byte) 80);
        term4501 = (byte[]) newByteArray(9);
        setByteElement(term4501, 0, (byte) 18);
        setByteElement(term4501, 1, (byte) 66);
        setByteElement(term4501, 2, (byte) 71);
        setByteElement(term4501, 3, (byte) 119);
        setByteElement(term4501, 4, (byte) -13);
        setByteElement(term4501, 5, (byte) -91);
        setByteElement(term4501, 6, (byte) 59);
        setByteElement(term4501, 7, (byte) -54);
        setByteElement(term4501, 8, (byte) 84);
        term4511 = new Integer(1551099402);
        term4513 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term4514 = (byte[]) newByteArray(8);
        setByteElement(term4514, 0, (byte) 38);
        setByteElement(term4514, 1, (byte) 126);
        setByteElement(term4514, 2, (byte) -47);
        setByteElement(term4514, 3, (byte) 63);
        setByteElement(term4514, 4, (byte) 10);
        setByteElement(term4514, 5, (byte) 62);
        setByteElement(term4514, 6, (byte) 115);
        setByteElement(term4514, 7, (byte) -128);
        setField(term4513, term4513.getClass(), "array", term4514);
        setIntField(term4513, term4513.getClass(), "offset", -2027534003);
        setIntField(term4513, term4513.getClass(), "length", 1063420942);
        term4525 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term4526 = (byte[]) newByteArray(0);
        setField(term4525, term4525.getClass(), "array", term4526);
        setIntField(term4525, term4525.getClass(), "offset", 1375330971);
        setIntField(term4525, term4525.getClass(), "length", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        argTypes[4] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[5];
        args[0] = term4498;
        args[1] = term4501;
        args[2] = term4511;
        args[3] = term4513;
        args[4] = term4525;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


