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

public class Subtle_XSalsa20StreamCipher_process_16321115801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9404;
     Object term9421;
     Object term9434;

    public Subtle_XSalsa20StreamCipher_process_16321115801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9404 = newInstance(Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher"));
        byte[] term9405 = (byte[]) newByteArray(8);
        byte[] term9414 = (byte[]) newByteArray(4);
        setByteElement(term9405, 0, (byte) -100);
        setByteElement(term9405, 1, (byte) -32);
        setByteElement(term9405, 2, (byte) 26);
        setByteElement(term9405, 3, (byte) 90);
        setByteElement(term9405, 4, (byte) 56);
        setByteElement(term9405, 5, (byte) 62);
        setByteElement(term9405, 6, (byte) -3);
        setByteElement(term9405, 7, (byte) -89);
        setField(term9404, term9404.getClass(), "key", term9405);
        setByteElement(term9414, 0, (byte) 79);
        setByteElement(term9414, 1, (byte) 30);
        setByteElement(term9414, 2, (byte) 104);
        setByteElement(term9414, 3, (byte) -52);
        setField(term9404, term9404.getClass(), "nonce", term9414);
        setLongField(term9404, term9404.getClass(), "blockCounter", -6394943900800506753L);
        setBooleanField(term9404, term9404.getClass(), "closed", false);
        term9421 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term9422 = (byte[]) newByteArray(9);
        setByteElement(term9422, 0, (byte) -103);
        setByteElement(term9422, 1, (byte) 8);
        setByteElement(term9422, 2, (byte) 87);
        setByteElement(term9422, 3, (byte) -87);
        setByteElement(term9422, 4, (byte) -38);
        setByteElement(term9422, 5, (byte) -45);
        setByteElement(term9422, 6, (byte) -30);
        setByteElement(term9422, 7, (byte) 18);
        setByteElement(term9422, 8, (byte) 84);
        setField(term9421, term9421.getClass(), "array", term9422);
        setIntField(term9421, term9421.getClass(), "offset", -1885090354);
        setIntField(term9421, term9421.getClass(), "length", -2066804303);
        term9434 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term9435 = (byte[]) newByteArray(6);
        setByteElement(term9435, 0, (byte) 1);
        setByteElement(term9435, 1, (byte) -46);
        setByteElement(term9435, 2, (byte) -46);
        setByteElement(term9435, 3, (byte) 124);
        setByteElement(term9435, 4, (byte) 105);
        setByteElement(term9435, 5, (byte) 118);
        setField(term9434, term9434.getClass(), "array", term9435);
        setIntField(term9434, term9434.getClass(), "offset", -1731761810);
        setIntField(term9434, term9434.getClass(), "length", 197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[2];
        args[0] = term9421;
        args[1] = term9434;
        callMethod(klass, "process", argTypes, term9404, args);
    }

};


