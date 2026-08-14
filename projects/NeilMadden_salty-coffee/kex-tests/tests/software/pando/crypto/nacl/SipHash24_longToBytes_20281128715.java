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
import java.lang.Long;

public class SipHash24_longToBytes_20281128715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term33;

    public SipHash24_longToBytes_20281128715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = (byte[]) newByteArray(4);
        setByteElement(term28, 0, (byte) 79);
        setByteElement(term28, 1, (byte) -119);
        setByteElement(term28, 2, (byte) -66);
        setByteElement(term28, 3, (byte) 83);
        term33 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SipHash24");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = term33;
        callMethod(klass, "longToBytes", argTypes, null, args);
    }

};


