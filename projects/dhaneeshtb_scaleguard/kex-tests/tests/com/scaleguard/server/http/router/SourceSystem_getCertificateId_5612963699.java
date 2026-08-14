package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceSystem_getCertificateId_5612963699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4659;

    public SourceSystem_getCertificateId_5612963699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4822 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term4822, term4822.getClass(), "pattern", null);
        setField(term4822, term4822.getClass(), "method", null);
        setBooleanField(term4822, term4822.getClass(), "cached", false);
        setBooleanField(term4822, term4822.getClass(), "async", true);
        setField(term4822, term4822.getClass(), "keyLookupType", null);
        setField(term4822, term4822.getClass(), "keyLookupHeaders", null);
        setField(term4822, term4822.getClass(), "keyLookupClass", null);
        ArrayList term4820 = new ArrayList();
        ((ArrayList) term4820).add(term4822);
        Object term4829 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term4829, term4829.getClass(), "id", null);
        setField(term4829, term4829.getClass(), "host", null);
        setField(term4829, term4829.getClass(), "port", null);
        setField(term4829, term4829.getClass(), "health", null);
        setField(term4829, term4829.getClass(), "scheme", null);
        setIntField(term4829, term4829.getClass(), "priority", -226514366);
        setBooleanField(term4829, term4829.getClass(), "isActive", true);
        setField(term4829, term4829.getClass(), "type", null);
        setField(term4829, term4829.getClass(), "groupId", null);
        setFloatField(term4829, term4829.getClass(), "loadFactor", 0.9472605F);
        setBooleanField(term4829, term4829.getClass(), "isReachable", true);
        Object term4834 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term4834, term4834.getClass(), "id", null);
        setField(term4834, term4834.getClass(), "host", null);
        setField(term4834, term4834.getClass(), "port", null);
        setField(term4834, term4834.getClass(), "health", null);
        setField(term4834, term4834.getClass(), "scheme", null);
        setIntField(term4834, term4834.getClass(), "priority", 1193880199);
        setBooleanField(term4834, term4834.getClass(), "isActive", true);
        setField(term4834, term4834.getClass(), "type", null);
        setField(term4834, term4834.getClass(), "groupId", null);
        setFloatField(term4834, term4834.getClass(), "loadFactor", 0.27797186F);
        setBooleanField(term4834, term4834.getClass(), "isReachable", true);
        Object term4839 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term4839, term4839.getClass(), "id", null);
        setField(term4839, term4839.getClass(), "host", null);
        setField(term4839, term4839.getClass(), "port", null);
        setField(term4839, term4839.getClass(), "health", null);
        setField(term4839, term4839.getClass(), "scheme", null);
        setIntField(term4839, term4839.getClass(), "priority", -1087774327);
        setBooleanField(term4839, term4839.getClass(), "isActive", true);
        setField(term4839, term4839.getClass(), "type", null);
        setField(term4839, term4839.getClass(), "groupId", null);
        setFloatField(term4839, term4839.getClass(), "loadFactor", 0.7467328F);
        setBooleanField(term4839, term4839.getClass(), "isReachable", true);
        Object term4844 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term4844, term4844.getClass(), "id", null);
        setField(term4844, term4844.getClass(), "host", null);
        setField(term4844, term4844.getClass(), "port", null);
        setField(term4844, term4844.getClass(), "health", null);
        setField(term4844, term4844.getClass(), "scheme", null);
        setIntField(term4844, term4844.getClass(), "priority", -1530420153);
        setBooleanField(term4844, term4844.getClass(), "isActive", true);
        setField(term4844, term4844.getClass(), "type", null);
        setField(term4844, term4844.getClass(), "groupId", null);
        setFloatField(term4844, term4844.getClass(), "loadFactor", 0.6436713F);
        setBooleanField(term4844, term4844.getClass(), "isReachable", true);
        ArrayList term4827 = new ArrayList();
        ((ArrayList) term4827).add(term4829);
        ((ArrayList) term4827).add(term4834);
        ((ArrayList) term4827).add(term4839);
        ((ArrayList) term4827).add(term4844);
        HashMap term4947 = new HashMap();
        HashMap term4952 = new HashMap();
        HashMap term4970 = new HashMap();
        term4659 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term4819 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term4659, term4659.getClass(), "host", "awDQVEVIKi");
        setBooleanField(term4659, term4659.getClass(), "tunnel", true);
        setField(term4659, term4659.getClass(), "port", "HJwNgUzZZR");
        setField(term4659, term4659.getClass(), "scheme", "FvUCZgTXhq");
        setField(term4659, term4659.getClass(), "basePath", "wWWidPCHzx");
        setField(term4659, term4659.getClass(), "id", "OwPIiBRuKK");
        setField(term4659, term4659.getClass(), "name", "sgfGySMODT");
        setField(term4659, term4659.getClass(), "groupId", "ndAITnOsny");
        setField(term4659, term4659.getClass(), "target", "CVZnTiJucs");
        setBooleanField(term4659, term4659.getClass(), "async", false);
        setField(term4659, term4659.getClass(), "asyncEngine", "ecHEQufXoq");
        setField(term4659, term4659.getClass(), "callbackId", "btBLMvHzJg");
        setField(term4659, term4659.getClass(), "jwtKeylookup", "JdOMfNWgLP");
        setField(term4659, term4659.getClass(), "certificateId", "uWqXrwAsDU");
        setField(term4659, term4659.getClass(), "secappid", "hgFbWAUtsu");
        setBooleanField(term4659, term4659.getClass(), "autoProcure", true);
        setField(term4819, term4819.getClass(), "cachedResources", term4820);
        setField(term4819, term4819.getClass(), "hostGroups", term4827);
        setField(term4819, term4819.getClass(), "host", "ZLQamJFBmu");
        setField(term4819, term4819.getClass(), "port", "ZWcOCwKNvd");
        setField(term4819, term4819.getClass(), "hostGroupId", "GTmoNrziyc");
        setField(term4819, term4819.getClass(), "scheme", "LvztehSlhM");
        setField(term4819, term4819.getClass(), "basePath", "njvnWFTMxN");
        setField(term4819, term4819.getClass(), "id", "fLRqcTSfzF");
        setField(term4819, term4819.getClass(), "name", "EBYHwsuWAU");
        setField(term4819, term4819.getClass(), "groupId", "PtIjKpiSix");
        setField(term4819, term4819.getClass(), "includeHeaders", term4947);
        setField(term4819, term4819.getClass(), "excludeHeaders", term4952);
        setBooleanField(term4819, term4819.getClass(), "enableCache", false);
        setField(term4659, term4659.getClass(), "targetSystem", term4819);
        setField(term4659, term4659.getClass(), "headerLookup", "NZdTuwSCIM");
        setField(term4659, term4659.getClass(), "keyLookupMap", term4970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCertificateId", argTypes, term4659, args);
    }

};


