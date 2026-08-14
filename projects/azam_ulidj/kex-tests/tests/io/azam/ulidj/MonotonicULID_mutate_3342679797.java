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

public class MonotonicULID_mutate_3342679797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;

    public MonotonicULID_mutate_3342679797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2400 = new LinkedHashMap();
        Set<Object> term2709 =  ((Map) term2400).keySet();
        LinkedHashSet term2399 = new LinkedHashSet((Collection<? extends Object>) term2709);
        term2112 = newInstance(Class.forName("io.azam.ulidj.MonotonicULID"));
        Object term2113 = newInstance(Class.forName("java.time.Clock$SystemClock"));
        Object term2114 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2120 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term2121 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term2393 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term2394 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term2406 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term2407 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term2416 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        Object term2432 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        byte[] term2437 = (byte[]) newByteArray(10);
        setIntField(term2114, term2114.getClass(), "totalSeconds", 0);
        setField(term2114, term2114.getClass(), "id", "Z");
        setField(term2113, term2113.getClass(), "zone", term2114);
        setLongField(term2113, term2113.getClass(), "offset", 1786538097L);
        setField(term2112, term2112.getClass(), "clock", term2113);
        setField(term2121, term2121.getClass(), "name", "SUN");
        setField(term2121, term2121.getClass(), "info", "SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; PKCS12, JKS & DKS keystores; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)");
        setDoubleField(term2121, term2121.getClass(), "version", 11.0);
        setField(term2121, term2121.getClass(), "versionStr", "11");
        setField(term2121, term2121.getClass(), "entrySet", null);
        setIntField(term2121, term2121.getClass(), "entrySetCallCount", 0);
        setBooleanField(term2121, term2121.getClass(), "initialized", true);
        setBooleanField(term2121, term2121.getClass(), "legacyChanged", false);
        setBooleanField(term2121, term2121.getClass(), "servicesChanged", true);
        setField(term2121, term2121.getClass(), "legacyStrings", null);
        setField(term2393, term2393.getClass(), "table", term2394);
        setField(term2393, term2393.getClass(), "nextTable", null);
        setLongField(term2393, term2393.getClass(), "baseCount", 100L);
        setIntField(term2393, term2393.getClass(), "sizeCtl", 192);
        setIntField(term2393, term2393.getClass(), "transferIndex", 0);
        setIntField(term2393, term2393.getClass(), "cellsBusy", 0);
        setField(term2393, term2393.getClass(), "counterCells", null);
        setField(term2393, term2393.getClass(), "keySet", null);
        setField(term2393, term2393.getClass(), "values", null);
        setField(term2393, term2393.getClass(), "entrySet", null);
        setField(term2393, term2393.getClass(), "keySet", null);
        setField(term2393, term2393.getClass(), "values", null);
        setField(term2121, term2121.getClass(), "serviceMap", term2393);
        setField(term2121, term2121.getClass(), "prngAlgos", term2399);
        setField(term2121, term2121.getClass(), "legacyMap", null);
        setField(term2121, term2121.getClass(), "serviceSet", null);
        setField(term2121, term2121.getClass(), "defaults", null);
        setField(term2406, term2406.getClass(), "table", term2407);
        setField(term2406, term2406.getClass(), "nextTable", null);
        setLongField(term2406, term2406.getClass(), "baseCount", 152L);
        setIntField(term2406, term2406.getClass(), "sizeCtl", 192);
        setIntField(term2406, term2406.getClass(), "transferIndex", 0);
        setIntField(term2406, term2406.getClass(), "cellsBusy", 0);
        setField(term2406, term2406.getClass(), "counterCells", null);
        setField(term2406, term2406.getClass(), "keySet", null);
        setField(term2406, term2406.getClass(), "values", null);
        setField(term2406, term2406.getClass(), "entrySet", null);
        setField(term2406, term2406.getClass(), "keySet", null);
        setField(term2406, term2406.getClass(), "values", null);
        setField(term2121, term2121.getClass(), "map", term2406);
        setField(term2121, term2121.getClass(), "table", null);
        setIntField(term2121, term2121.getClass(), "count", 0);
        setIntField(term2121, term2121.getClass(), "threshold", 0);
        setFloatField(term2121, term2121.getClass(), "loadFactor", 0.0F);
        setIntField(term2121, term2121.getClass(), "modCount", 0);
        setField(term2121, term2121.getClass(), "keySet", null);
        setField(term2121, term2121.getClass(), "values", null);
        setField(term2120, term2120.getClass(), "provider", term2121);
        setField(term2120, term2120.getClass(), "secureRandomSpi", term2416);
        setBooleanField(term2120, term2120.getClass(), "threadSafe", true);
        setField(term2120, term2120.getClass(), "algorithm", "NativePRNG");
        setField(term2120, term2120.getClass(), "state", null);
        setField(term2120, term2120.getClass(), "digest", null);
        setField(term2120, term2120.getClass(), "randomBytes", null);
        setIntField(term2120, term2120.getClass(), "randomBytesUsed", 0);
        setLongField(term2120, term2120.getClass(), "counter", 0L);
        setLongField(term2432, term2432.getClass(), "value", 0L);
        setField(term2120, term2120.getClass(), "seed", term2432);
        setDoubleField(term2120, term2120.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2120, term2120.getClass(), "haveNextNextGaussian", false);
        setField(term2112, term2112.getClass(), "random", term2120);
        setLongField(term2112, term2112.getClass(), "lastTimestamp", -316468845751588286L);
        setField(term2112, term2112.getClass(), "lastEntropy", term2437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.MonotonicULID");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mutate", argTypes, term2112, args);
    }

};


