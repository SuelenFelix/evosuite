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

public class Ed25519_CachedXYT_copyConditional_6433300665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1193;
     Object term1201;
     Object term1211;

    public Ed25519_CachedXYT_copyConditional_6433300665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1193 = (long[]) newLongArray(7);
        setLongElement(term1193, 0, -1154553077993834885L);
        setLongElement(term1193, 1, -2850532706972744550L);
        setLongElement(term1193, 2, -2644215923136513282L);
        setLongElement(term1193, 3, -1468719814009985452L);
        setLongElement(term1193, 4, -7738503207562305297L);
        setLongElement(term1193, 5, 3825396310311739952L);
        setLongElement(term1193, 6, -3838084482494604218L);
        term1201 = (long[]) newLongArray(9);
        setLongElement(term1201, 0, 3892018155439224435L);
        setLongElement(term1201, 1, 5953383087795962419L);
        setLongElement(term1201, 2, 7994303628307559416L);
        setLongElement(term1201, 3, 2443640364875054177L);
        setLongElement(term1201, 4, -1610676979013636850L);
        setLongElement(term1201, 5, 2062173786000223358L);
        setLongElement(term1201, 6, -8658027316505137504L);
        setLongElement(term1201, 7, 414749984815662075L);
        setLongElement(term1201, 8, 463622836963501975L);
        term1211 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1193;
        args[1] = term1201;
        args[2] = term1211;
        callMethod(klass, "copyConditional", argTypes, null, args);
    }

};


