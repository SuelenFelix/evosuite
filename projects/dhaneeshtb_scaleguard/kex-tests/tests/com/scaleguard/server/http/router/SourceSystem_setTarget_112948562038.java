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

public class SourceSystem_setTarget_112948562038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21199;

    public SourceSystem_setTarget_112948562038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21362 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term21362, term21362.getClass(), "pattern", null);
        setField(term21362, term21362.getClass(), "method", null);
        setBooleanField(term21362, term21362.getClass(), "cached", true);
        setBooleanField(term21362, term21362.getClass(), "async", false);
        setField(term21362, term21362.getClass(), "keyLookupType", null);
        setField(term21362, term21362.getClass(), "keyLookupHeaders", null);
        setField(term21362, term21362.getClass(), "keyLookupClass", null);
        Object term21365 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term21365, term21365.getClass(), "pattern", null);
        setField(term21365, term21365.getClass(), "method", null);
        setBooleanField(term21365, term21365.getClass(), "cached", true);
        setBooleanField(term21365, term21365.getClass(), "async", true);
        setField(term21365, term21365.getClass(), "keyLookupType", null);
        setField(term21365, term21365.getClass(), "keyLookupHeaders", null);
        setField(term21365, term21365.getClass(), "keyLookupClass", null);
        ArrayList term21360 = new ArrayList();
        ((ArrayList) term21360).add(term21362);
        ((ArrayList) term21360).add(term21365);
        ArrayList term21370 = new ArrayList();
        HashMap term21470 = new HashMap();
        HashMap term21475 = new HashMap();
        HashMap term21493 = new HashMap();
        term21199 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term21359 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term21199, term21199.getClass(), "host", "aKQcZIBmMO");
        setBooleanField(term21199, term21199.getClass(), "tunnel", false);
        setField(term21199, term21199.getClass(), "port", "izEIjACTdh");
        setField(term21199, term21199.getClass(), "scheme", "FBpdKznMSt");
        setField(term21199, term21199.getClass(), "basePath", "LCjhPHXcwj");
        setField(term21199, term21199.getClass(), "id", "inoNzxBFDa");
        setField(term21199, term21199.getClass(), "name", "dFDHlXwhMk");
        setField(term21199, term21199.getClass(), "groupId", "AUMXeSohOi");
        setField(term21199, term21199.getClass(), "target", "HjZSMjBIEl");
        setBooleanField(term21199, term21199.getClass(), "async", false);
        setField(term21199, term21199.getClass(), "asyncEngine", "SQQNAxPlwz");
        setField(term21199, term21199.getClass(), "callbackId", "AoOgJDNbaF");
        setField(term21199, term21199.getClass(), "jwtKeylookup", "PoxurfXwit");
        setField(term21199, term21199.getClass(), "certificateId", "fhKxidKBbV");
        setField(term21199, term21199.getClass(), "secappid", "SIJmlwIkel");
        setBooleanField(term21199, term21199.getClass(), "autoProcure", false);
        setField(term21359, term21359.getClass(), "cachedResources", term21360);
        setField(term21359, term21359.getClass(), "hostGroups", term21370);
        setField(term21359, term21359.getClass(), "host", "EElRQZBfvW");
        setField(term21359, term21359.getClass(), "port", "grlbPsQxaR");
        setField(term21359, term21359.getClass(), "hostGroupId", "PeFIZXlxPN");
        setField(term21359, term21359.getClass(), "scheme", "OIXYYXGdlX");
        setField(term21359, term21359.getClass(), "basePath", "VBfWgJrVqV");
        setField(term21359, term21359.getClass(), "id", "BgFpfnZiJG");
        setField(term21359, term21359.getClass(), "name", "tMDFwEQAGW");
        setField(term21359, term21359.getClass(), "groupId", "heAByNySVP");
        setField(term21359, term21359.getClass(), "includeHeaders", term21470);
        setField(term21359, term21359.getClass(), "excludeHeaders", term21475);
        setBooleanField(term21359, term21359.getClass(), "enableCache", false);
        setField(term21199, term21199.getClass(), "targetSystem", term21359);
        setField(term21199, term21199.getClass(), "headerLookup", "gPuVkQobYQ");
        setField(term21199, term21199.getClass(), "keyLookupMap", term21493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sAHDMENVSp";
        callMethod(klass, "setTarget", argTypes, term21199, args);
    }

};


