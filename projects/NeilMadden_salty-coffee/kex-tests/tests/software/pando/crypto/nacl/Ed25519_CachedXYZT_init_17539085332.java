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

public class Ed25519_CachedXYZT_init_17539085332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744;
     Object term748;
     Object term753;
     Object term756;

    public Ed25519_CachedXYZT_init_17539085332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744 = (long[]) newLongArray(3);
        setLongElement(term744, 0, 7411271909051562686L);
        setLongElement(term744, 1, 4872422362414183754L);
        setLongElement(term744, 2, 6811161968424632369L);
        term748 = (long[]) newLongArray(4);
        setLongElement(term748, 0, -7237588299778557629L);
        setLongElement(term748, 1, 6967924379644551255L);
        setLongElement(term748, 2, -2813493605142626659L);
        setLongElement(term748, 3, -8885298608300233488L);
        term753 = (long[]) newLongArray(2);
        setLongElement(term753, 0, -4325723315152823407L);
        setLongElement(term753, 1, 2535595959091595249L);
        term756 = (long[]) newLongArray(5);
        setLongElement(term756, 0, -5476826692763582090L);
        setLongElement(term756, 1, -872011222785455006L);
        setLongElement(term756, 2, -316468845751588286L);
        setLongElement(term756, 3, 5127676408959197577L);
        setLongElement(term756, 4, -6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYZT");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        argTypes[3] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term744;
        args[1] = term748;
        args[2] = term753;
        args[3] = term756;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


