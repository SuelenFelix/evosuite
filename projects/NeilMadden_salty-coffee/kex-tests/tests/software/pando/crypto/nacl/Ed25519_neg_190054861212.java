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

public class Ed25519_neg_190054861212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3976;
     Object term3982;

    public Ed25519_neg_190054861212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3976 = (long[]) newLongArray(5);
        setLongElement(term3976, 0, 3288791194263207397L);
        setLongElement(term3976, 1, 3288941170644426558L);
        setLongElement(term3976, 2, -8338004844694486146L);
        setLongElement(term3976, 3, 6426732259596412988L);
        setLongElement(term3976, 4, 185793058502220865L);
        term3982 = (long[]) newLongArray(5);
        setLongElement(term3982, 0, -7698746988132548371L);
        setLongElement(term3982, 1, 2145420811068634601L);
        setLongElement(term3982, 2, 2191130532479601175L);
        setLongElement(term3982, 3, 860079646007397083L);
        setLongElement(term3982, 4, 3230472384687362867L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3976;
        args[1] = term3982;
        callMethod(klass, "neg", argTypes, null, args);
    }

};


