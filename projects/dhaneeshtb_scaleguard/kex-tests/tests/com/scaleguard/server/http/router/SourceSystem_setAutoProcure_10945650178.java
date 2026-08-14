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
import java.lang.Boolean;

public class SourceSystem_setAutoProcure_10945650178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4144;
     Object term4437;

    public SourceSystem_setAutoProcure_10945650178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4305 = new ArrayList();
        ArrayList term4309 = new ArrayList();
        HashMap term4409 = new HashMap();
        HashMap term4414 = new HashMap();
        HashMap term4432 = new HashMap();
        term4144 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term4304 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term4144, term4144.getClass(), "host", "XMHwbfiHRl");
        setBooleanField(term4144, term4144.getClass(), "tunnel", false);
        setField(term4144, term4144.getClass(), "port", "bucTnYicnp");
        setField(term4144, term4144.getClass(), "scheme", "EkgprvqZlM");
        setField(term4144, term4144.getClass(), "basePath", "fbnKvthhOz");
        setField(term4144, term4144.getClass(), "id", "PGfCDJTBek");
        setField(term4144, term4144.getClass(), "name", "ZwjARhAtHC");
        setField(term4144, term4144.getClass(), "groupId", "XXvscsYBWv");
        setField(term4144, term4144.getClass(), "target", "uePedtiAfL");
        setBooleanField(term4144, term4144.getClass(), "async", false);
        setField(term4144, term4144.getClass(), "asyncEngine", "AdSHvysxQB");
        setField(term4144, term4144.getClass(), "callbackId", "jlraKkBWFA");
        setField(term4144, term4144.getClass(), "jwtKeylookup", "mRBtFTxVdE");
        setField(term4144, term4144.getClass(), "certificateId", "IVacFDAZcj");
        setField(term4144, term4144.getClass(), "secappid", "EEYmuwyVDP");
        setBooleanField(term4144, term4144.getClass(), "autoProcure", true);
        setField(term4304, term4304.getClass(), "cachedResources", term4305);
        setField(term4304, term4304.getClass(), "hostGroups", term4309);
        setField(term4304, term4304.getClass(), "host", "EWFbEDAVrE");
        setField(term4304, term4304.getClass(), "port", "EMiMtYgfvr");
        setField(term4304, term4304.getClass(), "hostGroupId", "OyYyYYnJuF");
        setField(term4304, term4304.getClass(), "scheme", "aYLvcxZohT");
        setField(term4304, term4304.getClass(), "basePath", "mnHyQbMyld");
        setField(term4304, term4304.getClass(), "id", "KHtaDOIcJZ");
        setField(term4304, term4304.getClass(), "name", "vgdwrCZczl");
        setField(term4304, term4304.getClass(), "groupId", "gKMNrpKBpu");
        setField(term4304, term4304.getClass(), "includeHeaders", term4409);
        setField(term4304, term4304.getClass(), "excludeHeaders", term4414);
        setBooleanField(term4304, term4304.getClass(), "enableCache", false);
        setField(term4144, term4144.getClass(), "targetSystem", term4304);
        setField(term4144, term4144.getClass(), "headerLookup", "ZbHJVEqcoa");
        setField(term4144, term4144.getClass(), "keyLookupMap", term4432);
        term4437 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4437;
        callMethod(klass, "setAutoProcure", argTypes, term4144, args);
    }

};


