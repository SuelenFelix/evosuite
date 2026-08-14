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

public class MonotonicULID_generateULID_4419649726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1494;

    public MonotonicULID_generateULID_4419649726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1782 = new LinkedHashMap();
        Set<Object> term2091 =  ((Map) term1782).keySet();
        LinkedHashSet term1781 = new LinkedHashSet((Collection<? extends Object>) term2091);
        term1494 = newInstance(Class.forName("io.azam.ulidj.MonotonicULID"));
        Object term1495 = newInstance(Class.forName("java.time.Clock$SystemClock"));
        Object term1496 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1502 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term1503 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term1775 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term1776 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term1788 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term1789 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 256);
        Object term1798 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        Object term1814 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        byte[] term1819 = (byte[]) newByteArray(10);
        setIntField(term1496, term1496.getClass(), "totalSeconds", 0);
        setField(term1496, term1496.getClass(), "id", "Z");
        setField(term1495, term1495.getClass(), "zone", term1496);
        setLongField(term1495, term1495.getClass(), "offset", 1786538097L);
        setField(term1494, term1494.getClass(), "clock", term1495);
        setField(term1503, term1503.getClass(), "name", "SUN");
        setField(term1503, term1503.getClass(), "info", "SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; PKCS12, JKS & DKS keystores; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)");
        setDoubleField(term1503, term1503.getClass(), "version", 11.0);
        setField(term1503, term1503.getClass(), "versionStr", "11");
        setField(term1503, term1503.getClass(), "entrySet", null);
        setIntField(term1503, term1503.getClass(), "entrySetCallCount", 0);
        setBooleanField(term1503, term1503.getClass(), "initialized", true);
        setBooleanField(term1503, term1503.getClass(), "legacyChanged", false);
        setBooleanField(term1503, term1503.getClass(), "servicesChanged", true);
        setField(term1503, term1503.getClass(), "legacyStrings", null);
        setField(term1775, term1775.getClass(), "table", term1776);
        setField(term1775, term1775.getClass(), "nextTable", null);
        setLongField(term1775, term1775.getClass(), "baseCount", 100L);
        setIntField(term1775, term1775.getClass(), "sizeCtl", 192);
        setIntField(term1775, term1775.getClass(), "transferIndex", 0);
        setIntField(term1775, term1775.getClass(), "cellsBusy", 0);
        setField(term1775, term1775.getClass(), "counterCells", null);
        setField(term1775, term1775.getClass(), "keySet", null);
        setField(term1775, term1775.getClass(), "values", null);
        setField(term1775, term1775.getClass(), "entrySet", null);
        setField(term1775, term1775.getClass(), "keySet", null);
        setField(term1775, term1775.getClass(), "values", null);
        setField(term1503, term1503.getClass(), "serviceMap", term1775);
        setField(term1503, term1503.getClass(), "prngAlgos", term1781);
        setField(term1503, term1503.getClass(), "legacyMap", null);
        setField(term1503, term1503.getClass(), "serviceSet", null);
        setField(term1503, term1503.getClass(), "defaults", null);
        setField(term1788, term1788.getClass(), "table", term1789);
        setField(term1788, term1788.getClass(), "nextTable", null);
        setLongField(term1788, term1788.getClass(), "baseCount", 152L);
        setIntField(term1788, term1788.getClass(), "sizeCtl", 192);
        setIntField(term1788, term1788.getClass(), "transferIndex", 0);
        setIntField(term1788, term1788.getClass(), "cellsBusy", 0);
        setField(term1788, term1788.getClass(), "counterCells", null);
        setField(term1788, term1788.getClass(), "keySet", null);
        setField(term1788, term1788.getClass(), "values", null);
        setField(term1788, term1788.getClass(), "entrySet", null);
        setField(term1788, term1788.getClass(), "keySet", null);
        setField(term1788, term1788.getClass(), "values", null);
        setField(term1503, term1503.getClass(), "map", term1788);
        setField(term1503, term1503.getClass(), "table", null);
        setIntField(term1503, term1503.getClass(), "count", 0);
        setIntField(term1503, term1503.getClass(), "threshold", 0);
        setFloatField(term1503, term1503.getClass(), "loadFactor", 0.0F);
        setIntField(term1503, term1503.getClass(), "modCount", 0);
        setField(term1503, term1503.getClass(), "keySet", null);
        setField(term1503, term1503.getClass(), "values", null);
        setField(term1502, term1502.getClass(), "provider", term1503);
        setField(term1502, term1502.getClass(), "secureRandomSpi", term1798);
        setBooleanField(term1502, term1502.getClass(), "threadSafe", true);
        setField(term1502, term1502.getClass(), "algorithm", "NativePRNG");
        setField(term1502, term1502.getClass(), "state", null);
        setField(term1502, term1502.getClass(), "digest", null);
        setField(term1502, term1502.getClass(), "randomBytes", null);
        setIntField(term1502, term1502.getClass(), "randomBytesUsed", 0);
        setLongField(term1502, term1502.getClass(), "counter", 0L);
        setLongField(term1814, term1814.getClass(), "value", 0L);
        setField(term1502, term1502.getClass(), "seed", term1814);
        setDoubleField(term1502, term1502.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term1502, term1502.getClass(), "haveNextNextGaussian", false);
        setField(term1494, term1494.getClass(), "random", term1502);
        setLongField(term1494, term1494.getClass(), "lastTimestamp", -872011222785455006L);
        setField(term1494, term1494.getClass(), "lastEntropy", term1819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.MonotonicULID");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateULID", argTypes, term1494, args);
    }

};


