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

public class Ed25519_getLsb_4987356911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3961;

    public Ed25519_getLsb_4987356911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3961 = (long[]) newLongArray(7);
        setLongElement(term3961, 0, -2338103433822116635L);
        setLongElement(term3961, 1, -1885698929232124806L);
        setLongElement(term3961, 2, 5731563613239387113L);
        setLongElement(term3961, 3, 3381333711768010594L);
        setLongElement(term3961, 4, 3580984732036213717L);
        setLongElement(term3961, 5, 5330761990446327930L);
        setLongElement(term3961, 6, -3954795081650780841L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3961;
        callMethod(klass, "getLsb", argTypes, null, args);
    }

};


