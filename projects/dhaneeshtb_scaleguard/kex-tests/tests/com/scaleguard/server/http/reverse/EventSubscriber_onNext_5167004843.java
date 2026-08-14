package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class EventSubscriber_onNext_5167004843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term694;

    public EventSubscriber_onNext_5167004843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("com.scaleguard.server.http.reverse.EventSubscriber"));
        setField(term693, term693.getClass(), "appServer", null);
        setField(term693, term693.getClass(), "subscription", null);
        Object term857 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term857, term857.getClass(), "pattern", null);
        setField(term857, term857.getClass(), "method", null);
        setBooleanField(term857, term857.getClass(), "cached", false);
        setBooleanField(term857, term857.getClass(), "async", true);
        setField(term857, term857.getClass(), "keyLookupType", null);
        setField(term857, term857.getClass(), "keyLookupHeaders", null);
        setField(term857, term857.getClass(), "keyLookupClass", null);
        Object term860 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term860, term860.getClass(), "pattern", null);
        setField(term860, term860.getClass(), "method", null);
        setBooleanField(term860, term860.getClass(), "cached", true);
        setBooleanField(term860, term860.getClass(), "async", true);
        setField(term860, term860.getClass(), "keyLookupType", null);
        setField(term860, term860.getClass(), "keyLookupHeaders", null);
        setField(term860, term860.getClass(), "keyLookupClass", null);
        Object term863 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term863, term863.getClass(), "pattern", null);
        setField(term863, term863.getClass(), "method", null);
        setBooleanField(term863, term863.getClass(), "cached", true);
        setBooleanField(term863, term863.getClass(), "async", false);
        setField(term863, term863.getClass(), "keyLookupType", null);
        setField(term863, term863.getClass(), "keyLookupHeaders", null);
        setField(term863, term863.getClass(), "keyLookupClass", null);
        Object term866 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term866, term866.getClass(), "pattern", null);
        setField(term866, term866.getClass(), "method", null);
        setBooleanField(term866, term866.getClass(), "cached", true);
        setBooleanField(term866, term866.getClass(), "async", false);
        setField(term866, term866.getClass(), "keyLookupType", null);
        setField(term866, term866.getClass(), "keyLookupHeaders", null);
        setField(term866, term866.getClass(), "keyLookupClass", null);
        ArrayList term855 = new ArrayList();
        ((ArrayList) term855).add(term857);
        ((ArrayList) term855).add(term860);
        ((ArrayList) term855).add(term863);
        ((ArrayList) term855).add(term866);
        Object term873 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term873, term873.getClass(), "id", null);
        setField(term873, term873.getClass(), "host", null);
        setField(term873, term873.getClass(), "port", null);
        setField(term873, term873.getClass(), "health", null);
        setField(term873, term873.getClass(), "scheme", null);
        setIntField(term873, term873.getClass(), "priority", 1725571209);
        setBooleanField(term873, term873.getClass(), "isActive", true);
        setField(term873, term873.getClass(), "type", null);
        setField(term873, term873.getClass(), "groupId", null);
        setFloatField(term873, term873.getClass(), "loadFactor", 0.13238746F);
        setBooleanField(term873, term873.getClass(), "isReachable", true);
        Object term878 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term878, term878.getClass(), "id", null);
        setField(term878, term878.getClass(), "host", null);
        setField(term878, term878.getClass(), "port", null);
        setField(term878, term878.getClass(), "health", null);
        setField(term878, term878.getClass(), "scheme", null);
        setIntField(term878, term878.getClass(), "priority", -522618178);
        setBooleanField(term878, term878.getClass(), "isActive", true);
        setField(term878, term878.getClass(), "type", null);
        setField(term878, term878.getClass(), "groupId", null);
        setFloatField(term878, term878.getClass(), "loadFactor", 0.2707036F);
        setBooleanField(term878, term878.getClass(), "isReachable", true);
        ArrayList term871 = new ArrayList();
        ((ArrayList) term871).add(term873);
        ((ArrayList) term871).add(term878);
        HashMap term981 = new HashMap();
        HashMap term986 = new HashMap();
        HashMap term1004 = new HashMap();
        term694 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term854 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term694, term694.getClass(), "host", "TEParAifyi");
        setBooleanField(term694, term694.getClass(), "tunnel", false);
        setField(term694, term694.getClass(), "port", "OWDIEULEFu");
        setField(term694, term694.getClass(), "scheme", "dWRymuLBtr");
        setField(term694, term694.getClass(), "basePath", "AijpHYOFuy");
        setField(term694, term694.getClass(), "id", "SbAoxhfrkn");
        setField(term694, term694.getClass(), "name", "kuTXqwMtDB");
        setField(term694, term694.getClass(), "groupId", "Ghbwtircqb");
        setField(term694, term694.getClass(), "target", "xrwlQZdwCp");
        setBooleanField(term694, term694.getClass(), "async", false);
        setField(term694, term694.getClass(), "asyncEngine", "IDCWpPLRkE");
        setField(term694, term694.getClass(), "callbackId", "nyiiPDVjAc");
        setField(term694, term694.getClass(), "jwtKeylookup", "aKnKipADSo");
        setField(term694, term694.getClass(), "certificateId", "wSQxaModmm");
        setField(term694, term694.getClass(), "secappid", "UlajhuVLaP");
        setBooleanField(term694, term694.getClass(), "autoProcure", false);
        setField(term854, term854.getClass(), "cachedResources", term855);
        setField(term854, term854.getClass(), "hostGroups", term871);
        setField(term854, term854.getClass(), "host", "PHvxnGHptP");
        setField(term854, term854.getClass(), "port", "TimdotUuNC");
        setField(term854, term854.getClass(), "hostGroupId", "PkWMRdJcBb");
        setField(term854, term854.getClass(), "scheme", "jSpAteRute");
        setField(term854, term854.getClass(), "basePath", "swZVeJAxjt");
        setField(term854, term854.getClass(), "id", "xOcJIiQQDu");
        setField(term854, term854.getClass(), "name", "GVizqqzXpy");
        setField(term854, term854.getClass(), "groupId", "JqXGgAhZPl");
        setField(term854, term854.getClass(), "includeHeaders", term981);
        setField(term854, term854.getClass(), "excludeHeaders", term986);
        setBooleanField(term854, term854.getClass(), "enableCache", true);
        setField(term694, term694.getClass(), "targetSystem", term854);
        setField(term694, term694.getClass(), "headerLookup", "jiKYgYHqIS");
        setField(term694, term694.getClass(), "keyLookupMap", term1004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.EventSubscriber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Object[] args = new Object[1];
        args[0] = term694;
        callMethod(klass, "onNext", argTypes, term693, args);
    }

};


