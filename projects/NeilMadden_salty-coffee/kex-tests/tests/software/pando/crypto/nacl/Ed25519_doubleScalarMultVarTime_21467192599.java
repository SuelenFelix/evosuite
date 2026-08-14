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
import java.lang.Object;

public class Ed25519_doubleScalarMultVarTime_21467192599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3840;
     Object term3845;
     Object term3891;

    public Ed25519_doubleScalarMultVarTime_21467192599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3840 = (byte[]) newByteArray(4);
        setByteElement(term3840, 0, (byte) 118);
        setByteElement(term3840, 1, (byte) -114);
        setByteElement(term3840, 2, (byte) 97);
        setByteElement(term3840, 3, (byte) -75);
        term3845 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term3846 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3847 = (long[]) newLongArray(10);
        long[] term3858 = (long[]) newLongArray(10);
        long[] term3869 = (long[]) newLongArray(10);
        long[] term3880 = (long[]) newLongArray(10);
        setField(term3846, term3846.getClass(), "x", term3847);
        setField(term3846, term3846.getClass(), "y", term3858);
        setField(term3846, term3846.getClass(), "z", term3869);
        setField(term3845, term3845.getClass(), "xyz", term3846);
        setField(term3845, term3845.getClass(), "t", term3880);
        term3891 = (byte[]) newByteArray(4);
        setByteElement(term3891, 0, (byte) 52);
        setByteElement(term3891, 1, (byte) -128);
        setByteElement(term3891, 2, (byte) 120);
        setByteElement(term3891, 3, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3840;
        args[1] = term3845;
        args[2] = term3891;
        callMethod(klass, "doubleScalarMultVarTime", argTypes, null, args);
    }

};


