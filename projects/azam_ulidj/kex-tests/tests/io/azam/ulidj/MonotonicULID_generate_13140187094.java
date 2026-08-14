package io.azam.ulidj;

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
import static io.azam.ulidj.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class MonotonicULID_generate_13140187094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258;

    public MonotonicULID_generate_13140187094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term546 = new LinkedHashMap();
        Set<Object> term855 =  ((Map) term546).keySet();
        LinkedHashSet term545 = new LinkedHashSet((Collection<? extends Object>) term855);
        term258 = newInstance(Class.forName("io.azam.ulidj.MonotonicULID"));
        Object term259 = newInstance(Class.forName("java.time.Clock$SystemClock"));
        Object term260 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term266 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term267 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term539 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term540 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term552 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term553 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term562 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        Object term578 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        byte[] term583 = (byte[]) newByteArray(10);
        setIntField(term260, term260.getClass(), "totalSeconds", 0);
        setField(term260, term260.getClass(), "id", "Z");
        setField(term259, term259.getClass(), "zone", term260);
        setLongField(term259, term259.getClass(), "offset", 1786538097L);
        setField(term258, term258.getClass(), "clock", term259);
        setField(term267, term267.getClass(), "name", "SUN");
        setField(term267, term267.getClass(), "info", "SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; PKCS12, JKS & DKS keystores; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)");
        setDoubleField(term267, term267.getClass(), "version", 11.0);
        setField(term267, term267.getClass(), "versionStr", "11");
        setField(term267, term267.getClass(), "entrySet", null);
        setIntField(term267, term267.getClass(), "entrySetCallCount", 0);
        setBooleanField(term267, term267.getClass(), "initialized", true);
        setBooleanField(term267, term267.getClass(), "legacyChanged", false);
        setBooleanField(term267, term267.getClass(), "servicesChanged", true);
        setField(term267, term267.getClass(), "legacyStrings", null);
        setField(term539, term539.getClass(), "table", term540);
        setField(term539, term539.getClass(), "nextTable", null);
        setLongField(term539, term539.getClass(), "baseCount", 100L);
        setIntField(term539, term539.getClass(), "sizeCtl", 192);
        setIntField(term539, term539.getClass(), "transferIndex", 0);
        setIntField(term539, term539.getClass(), "cellsBusy", 0);
        setField(term539, term539.getClass(), "counterCells", null);
        setField(term539, term539.getClass(), "keySet", null);
        setField(term539, term539.getClass(), "values", null);
        setField(term539, term539.getClass(), "entrySet", null);
        setField(term539, term539.getClass(), "keySet", null);
        setField(term539, term539.getClass(), "values", null);
        setField(term267, term267.getClass(), "serviceMap", term539);
        setField(term267, term267.getClass(), "prngAlgos", term545);
        setField(term267, term267.getClass(), "legacyMap", null);
        setField(term267, term267.getClass(), "serviceSet", null);
        setField(term267, term267.getClass(), "defaults", null);
        setField(term552, term552.getClass(), "table", term553);
        setField(term552, term552.getClass(), "nextTable", null);
        setLongField(term552, term552.getClass(), "baseCount", 152L);
        setIntField(term552, term552.getClass(), "sizeCtl", 192);
        setIntField(term552, term552.getClass(), "transferIndex", 0);
        setIntField(term552, term552.getClass(), "cellsBusy", 0);
        setField(term552, term552.getClass(), "counterCells", null);
        setField(term552, term552.getClass(), "keySet", null);
        setField(term552, term552.getClass(), "values", null);
        setField(term552, term552.getClass(), "entrySet", null);
        setField(term552, term552.getClass(), "keySet", null);
        setField(term552, term552.getClass(), "values", null);
        setField(term267, term267.getClass(), "map", term552);
        setField(term267, term267.getClass(), "table", null);
        setIntField(term267, term267.getClass(), "count", 0);
        setIntField(term267, term267.getClass(), "threshold", 0);
        setFloatField(term267, term267.getClass(), "loadFactor", 0.0F);
        setIntField(term267, term267.getClass(), "modCount", 0);
        setField(term267, term267.getClass(), "keySet", null);
        setField(term267, term267.getClass(), "values", null);
        setField(term266, term266.getClass(), "provider", term267);
        setField(term266, term266.getClass(), "secureRandomSpi", term562);
        setBooleanField(term266, term266.getClass(), "threadSafe", true);
        setField(term266, term266.getClass(), "algorithm", "NativePRNG");
        setField(term266, term266.getClass(), "state", null);
        setField(term266, term266.getClass(), "digest", null);
        setField(term266, term266.getClass(), "randomBytes", null);
        setIntField(term266, term266.getClass(), "randomBytesUsed", 0);
        setLongField(term266, term266.getClass(), "counter", 0L);
        setLongField(term578, term578.getClass(), "value", 0L);
        setField(term266, term266.getClass(), "seed", term578);
        setDoubleField(term266, term266.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term266, term266.getClass(), "haveNextNextGaussian", false);
        setField(term258, term258.getClass(), "random", term266);
        setLongField(term258, term258.getClass(), "lastTimestamp", 2535595959091595249L);
        setField(term258, term258.getClass(), "lastEntropy", term583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.MonotonicULID");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generate", argTypes, term258, args);
    }

};


