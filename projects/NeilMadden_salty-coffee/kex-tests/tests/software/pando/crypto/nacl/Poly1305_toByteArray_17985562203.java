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
import java.lang.Integer;

public class Poly1305_toByteArray_17985562203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term90;
     Object term92;

    public Poly1305_toByteArray_17985562203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = (byte[]) newByteArray(6);
        setByteElement(term83, 0, (byte) -16);
        setByteElement(term83, 1, (byte) -112);
        setByteElement(term83, 2, (byte) -111);
        setByteElement(term83, 3, (byte) 23);
        setByteElement(term83, 4, (byte) -15);
        setByteElement(term83, 5, (byte) 36);
        term90 = new Long(5270370404989704783L);
        term92 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term83;
        args[1] = term90;
        args[2] = term92;
        callMethod(klass, "toByteArray", argTypes, null, args);
    }

};


