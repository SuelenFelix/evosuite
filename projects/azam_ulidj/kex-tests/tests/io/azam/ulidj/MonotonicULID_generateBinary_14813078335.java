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

public class MonotonicULID_generateBinary_14813078335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;

    public MonotonicULID_generateBinary_14813078335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1164 = new LinkedHashMap();
        Set<Object> term1473 =  ((Map) term1164).keySet();
        LinkedHashSet term1163 = new LinkedHashSet((Collection<? extends Object>) term1473);
        term876 = newInstance(Class.forName("io.azam.ulidj.MonotonicULID"));
        Object term877 = newInstance(Class.forName("java.time.Clock$SystemClock"));
        Object term878 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term884 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term885 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term1157 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term1158 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term1170 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term1171 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term1180 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        Object term1196 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        byte[] term1201 = (byte[]) newByteArray(10);
        setIntField(term878, term878.getClass(), "totalSeconds", 0);
        setField(term878, term878.getClass(), "id", "Z");
        setField(term877, term877.getClass(), "zone", term878);
        setLongField(term877, term877.getClass(), "offset", 1786538097L);
        setField(term876, term876.getClass(), "clock", term877);
        setField(term885, term885.getClass(), "name", "SUN");
        setField(term885, term885.getClass(), "info", "SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; PKCS12, JKS & DKS keystores; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)");
        setDoubleField(term885, term885.getClass(), "version", 11.0);
        setField(term885, term885.getClass(), "versionStr", "11");
        setField(term885, term885.getClass(), "entrySet", null);
        setIntField(term885, term885.getClass(), "entrySetCallCount", 0);
        setBooleanField(term885, term885.getClass(), "initialized", true);
        setBooleanField(term885, term885.getClass(), "legacyChanged", false);
        setBooleanField(term885, term885.getClass(), "servicesChanged", true);
        setField(term885, term885.getClass(), "legacyStrings", null);
        setField(term1157, term1157.getClass(), "table", term1158);
        setField(term1157, term1157.getClass(), "nextTable", null);
        setLongField(term1157, term1157.getClass(), "baseCount", 100L);
        setIntField(term1157, term1157.getClass(), "sizeCtl", 192);
        setIntField(term1157, term1157.getClass(), "transferIndex", 0);
        setIntField(term1157, term1157.getClass(), "cellsBusy", 0);
        setField(term1157, term1157.getClass(), "counterCells", null);
        setField(term1157, term1157.getClass(), "keySet", null);
        setField(term1157, term1157.getClass(), "values", null);
        setField(term1157, term1157.getClass(), "entrySet", null);
        setField(term1157, term1157.getClass(), "keySet", null);
        setField(term1157, term1157.getClass(), "values", null);
        setField(term885, term885.getClass(), "serviceMap", term1157);
        setField(term885, term885.getClass(), "prngAlgos", term1163);
        setField(term885, term885.getClass(), "legacyMap", null);
        setField(term885, term885.getClass(), "serviceSet", null);
        setField(term885, term885.getClass(), "defaults", null);
        setField(term1170, term1170.getClass(), "table", term1171);
        setField(term1170, term1170.getClass(), "nextTable", null);
        setLongField(term1170, term1170.getClass(), "baseCount", 152L);
        setIntField(term1170, term1170.getClass(), "sizeCtl", 192);
        setIntField(term1170, term1170.getClass(), "transferIndex", 0);
        setIntField(term1170, term1170.getClass(), "cellsBusy", 0);
        setField(term1170, term1170.getClass(), "counterCells", null);
        setField(term1170, term1170.getClass(), "keySet", null);
        setField(term1170, term1170.getClass(), "values", null);
        setField(term1170, term1170.getClass(), "entrySet", null);
        setField(term1170, term1170.getClass(), "keySet", null);
        setField(term1170, term1170.getClass(), "values", null);
        setField(term885, term885.getClass(), "map", term1170);
        setField(term885, term885.getClass(), "table", null);
        setIntField(term885, term885.getClass(), "count", 0);
        setIntField(term885, term885.getClass(), "threshold", 0);
        setFloatField(term885, term885.getClass(), "loadFactor", 0.0F);
        setIntField(term885, term885.getClass(), "modCount", 0);
        setField(term885, term885.getClass(), "keySet", null);
        setField(term885, term885.getClass(), "values", null);
        setField(term884, term884.getClass(), "provider", term885);
        setField(term884, term884.getClass(), "secureRandomSpi", term1180);
        setBooleanField(term884, term884.getClass(), "threadSafe", true);
        setField(term884, term884.getClass(), "algorithm", "NativePRNG");
        setField(term884, term884.getClass(), "state", null);
        setField(term884, term884.getClass(), "digest", null);
        setField(term884, term884.getClass(), "randomBytes", null);
        setIntField(term884, term884.getClass(), "randomBytesUsed", 0);
        setLongField(term884, term884.getClass(), "counter", 0L);
        setLongField(term1196, term1196.getClass(), "value", 0L);
        setField(term884, term884.getClass(), "seed", term1196);
        setDoubleField(term884, term884.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term884, term884.getClass(), "haveNextNextGaussian", false);
        setField(term876, term876.getClass(), "random", term884);
        setLongField(term876, term876.getClass(), "lastTimestamp", -5476826692763582090L);
        setField(term876, term876.getClass(), "lastEntropy", term1201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.MonotonicULID");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateBinary", argTypes, term876, args);
    }

};


