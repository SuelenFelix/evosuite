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

public class SourceSystem_setJwtKeylookup_42860274118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10041;

    public SourceSystem_setJwtKeylookup_42860274118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10204 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term10204, term10204.getClass(), "pattern", null);
        setField(term10204, term10204.getClass(), "method", null);
        setBooleanField(term10204, term10204.getClass(), "cached", false);
        setBooleanField(term10204, term10204.getClass(), "async", false);
        setField(term10204, term10204.getClass(), "keyLookupType", null);
        setField(term10204, term10204.getClass(), "keyLookupHeaders", null);
        setField(term10204, term10204.getClass(), "keyLookupClass", null);
        Object term10207 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term10207, term10207.getClass(), "pattern", null);
        setField(term10207, term10207.getClass(), "method", null);
        setBooleanField(term10207, term10207.getClass(), "cached", false);
        setBooleanField(term10207, term10207.getClass(), "async", false);
        setField(term10207, term10207.getClass(), "keyLookupType", null);
        setField(term10207, term10207.getClass(), "keyLookupHeaders", null);
        setField(term10207, term10207.getClass(), "keyLookupClass", null);
        Object term10210 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term10210, term10210.getClass(), "pattern", null);
        setField(term10210, term10210.getClass(), "method", null);
        setBooleanField(term10210, term10210.getClass(), "cached", false);
        setBooleanField(term10210, term10210.getClass(), "async", true);
        setField(term10210, term10210.getClass(), "keyLookupType", null);
        setField(term10210, term10210.getClass(), "keyLookupHeaders", null);
        setField(term10210, term10210.getClass(), "keyLookupClass", null);
        Object term10213 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term10213, term10213.getClass(), "pattern", null);
        setField(term10213, term10213.getClass(), "method", null);
        setBooleanField(term10213, term10213.getClass(), "cached", true);
        setBooleanField(term10213, term10213.getClass(), "async", true);
        setField(term10213, term10213.getClass(), "keyLookupType", null);
        setField(term10213, term10213.getClass(), "keyLookupHeaders", null);
        setField(term10213, term10213.getClass(), "keyLookupClass", null);
        Object term10216 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term10216, term10216.getClass(), "pattern", null);
        setField(term10216, term10216.getClass(), "method", null);
        setBooleanField(term10216, term10216.getClass(), "cached", false);
        setBooleanField(term10216, term10216.getClass(), "async", true);
        setField(term10216, term10216.getClass(), "keyLookupType", null);
        setField(term10216, term10216.getClass(), "keyLookupHeaders", null);
        setField(term10216, term10216.getClass(), "keyLookupClass", null);
        ArrayList term10202 = new ArrayList();
        ((ArrayList) term10202).add(term10204);
        ((ArrayList) term10202).add(term10207);
        ((ArrayList) term10202).add(term10210);
        ((ArrayList) term10202).add(term10213);
        ((ArrayList) term10202).add(term10216);
        Object term10223 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term10223, term10223.getClass(), "id", null);
        setField(term10223, term10223.getClass(), "host", null);
        setField(term10223, term10223.getClass(), "port", null);
        setField(term10223, term10223.getClass(), "health", null);
        setField(term10223, term10223.getClass(), "scheme", null);
        setIntField(term10223, term10223.getClass(), "priority", 1442160736);
        setBooleanField(term10223, term10223.getClass(), "isActive", true);
        setField(term10223, term10223.getClass(), "type", null);
        setField(term10223, term10223.getClass(), "groupId", null);
        setFloatField(term10223, term10223.getClass(), "loadFactor", 0.3357792F);
        setBooleanField(term10223, term10223.getClass(), "isReachable", true);
        ArrayList term10221 = new ArrayList();
        ((ArrayList) term10221).add(term10223);
        HashMap term10326 = new HashMap();
        HashMap term10331 = new HashMap();
        HashMap term10349 = new HashMap();
        term10041 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term10201 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term10041, term10041.getClass(), "host", "GwGUMPdvZq");
        setBooleanField(term10041, term10041.getClass(), "tunnel", true);
        setField(term10041, term10041.getClass(), "port", "iXRAYcFyfS");
        setField(term10041, term10041.getClass(), "scheme", "lokyclbLEz");
        setField(term10041, term10041.getClass(), "basePath", "hAPmQGaxkI");
        setField(term10041, term10041.getClass(), "id", "ojrnLnJZjT");
        setField(term10041, term10041.getClass(), "name", "rtvXSMjOdJ");
        setField(term10041, term10041.getClass(), "groupId", "EDkfjuDpNv");
        setField(term10041, term10041.getClass(), "target", "LNHkTUfuHX");
        setBooleanField(term10041, term10041.getClass(), "async", true);
        setField(term10041, term10041.getClass(), "asyncEngine", "SVWcOAHiTp");
        setField(term10041, term10041.getClass(), "callbackId", "oShLCaneoQ");
        setField(term10041, term10041.getClass(), "jwtKeylookup", "nwKkzNpzyC");
        setField(term10041, term10041.getClass(), "certificateId", "CwrsdYnHpH");
        setField(term10041, term10041.getClass(), "secappid", "jifjXNXluS");
        setBooleanField(term10041, term10041.getClass(), "autoProcure", true);
        setField(term10201, term10201.getClass(), "cachedResources", term10202);
        setField(term10201, term10201.getClass(), "hostGroups", term10221);
        setField(term10201, term10201.getClass(), "host", "pjEERkBbYo");
        setField(term10201, term10201.getClass(), "port", "FQPqmjhWog");
        setField(term10201, term10201.getClass(), "hostGroupId", "sYtJsiIiSX");
        setField(term10201, term10201.getClass(), "scheme", "KgfsAwTFFn");
        setField(term10201, term10201.getClass(), "basePath", "hFnFlgThhp");
        setField(term10201, term10201.getClass(), "id", "aEZAnHuGSR");
        setField(term10201, term10201.getClass(), "name", "uMzGGnJFYF");
        setField(term10201, term10201.getClass(), "groupId", "iAIRLRjFkP");
        setField(term10201, term10201.getClass(), "includeHeaders", term10326);
        setField(term10201, term10201.getClass(), "excludeHeaders", term10331);
        setBooleanField(term10201, term10201.getClass(), "enableCache", false);
        setField(term10041, term10041.getClass(), "targetSystem", term10201);
        setField(term10041, term10041.getClass(), "headerLookup", "cdXvvxXVTz");
        setField(term10041, term10041.getClass(), "keyLookupMap", term10349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tXsfWIqIPn";
        callMethod(klass, "setJwtKeylookup", argTypes, term10041, args);
    }

};


