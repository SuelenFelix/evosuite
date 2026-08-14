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

public class SourceSystem_getHost_186784660519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10596;

    public SourceSystem_getHost_186784660519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10757 = new ArrayList();
        Object term10763 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term10763, term10763.getClass(), "id", null);
        setField(term10763, term10763.getClass(), "host", null);
        setField(term10763, term10763.getClass(), "port", null);
        setField(term10763, term10763.getClass(), "health", null);
        setField(term10763, term10763.getClass(), "scheme", null);
        setIntField(term10763, term10763.getClass(), "priority", 1114000454);
        setBooleanField(term10763, term10763.getClass(), "isActive", true);
        setField(term10763, term10763.getClass(), "type", null);
        setField(term10763, term10763.getClass(), "groupId", null);
        setFloatField(term10763, term10763.getClass(), "loadFactor", 0.25937343F);
        setBooleanField(term10763, term10763.getClass(), "isReachable", true);
        ArrayList term10761 = new ArrayList();
        ((ArrayList) term10761).add(term10763);
        HashMap term10866 = new HashMap();
        HashMap term10871 = new HashMap();
        HashMap term10889 = new HashMap();
        term10596 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term10756 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term10596, term10596.getClass(), "host", "tDmfqEyHaN");
        setBooleanField(term10596, term10596.getClass(), "tunnel", true);
        setField(term10596, term10596.getClass(), "port", "mTSMXFkWRr");
        setField(term10596, term10596.getClass(), "scheme", "qdIiMKwfzT");
        setField(term10596, term10596.getClass(), "basePath", "qrmUWIxufo");
        setField(term10596, term10596.getClass(), "id", "SeWCUkXfZv");
        setField(term10596, term10596.getClass(), "name", "woQcQRYwNH");
        setField(term10596, term10596.getClass(), "groupId", "uQjzusifTg");
        setField(term10596, term10596.getClass(), "target", "mOulGkUjOk");
        setBooleanField(term10596, term10596.getClass(), "async", true);
        setField(term10596, term10596.getClass(), "asyncEngine", "hNWRuNEgOf");
        setField(term10596, term10596.getClass(), "callbackId", "CEtjGBplmv");
        setField(term10596, term10596.getClass(), "jwtKeylookup", "XosDTAzIAT");
        setField(term10596, term10596.getClass(), "certificateId", "lcCEhCpiZM");
        setField(term10596, term10596.getClass(), "secappid", "OPJlqMJxdq");
        setBooleanField(term10596, term10596.getClass(), "autoProcure", false);
        setField(term10756, term10756.getClass(), "cachedResources", term10757);
        setField(term10756, term10756.getClass(), "hostGroups", term10761);
        setField(term10756, term10756.getClass(), "host", "JDTrhGRsDT");
        setField(term10756, term10756.getClass(), "port", "vHxsVQImjS");
        setField(term10756, term10756.getClass(), "hostGroupId", "jkVaRrZHQX");
        setField(term10756, term10756.getClass(), "scheme", "gSFFUuJipG");
        setField(term10756, term10756.getClass(), "basePath", "bQWfIFvxkQ");
        setField(term10756, term10756.getClass(), "id", "aDoBLXfFQI");
        setField(term10756, term10756.getClass(), "name", "HTimNhSNVi");
        setField(term10756, term10756.getClass(), "groupId", "IWJWbrHcqm");
        setField(term10756, term10756.getClass(), "includeHeaders", term10866);
        setField(term10756, term10756.getClass(), "excludeHeaders", term10871);
        setBooleanField(term10756, term10756.getClass(), "enableCache", true);
        setField(term10596, term10596.getClass(), "targetSystem", term10756);
        setField(term10596, term10596.getClass(), "headerLookup", "ucTcadpUdW");
        setField(term10596, term10596.getClass(), "keyLookupMap", term10889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term10596, args);
    }

};


