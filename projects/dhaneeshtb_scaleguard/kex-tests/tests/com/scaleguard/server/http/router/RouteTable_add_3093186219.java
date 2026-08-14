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

public class RouteTable_add_3093186219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35520;

    public RouteTable_add_3093186219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35683 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term35683, term35683.getClass(), "pattern", null);
        setField(term35683, term35683.getClass(), "method", null);
        setBooleanField(term35683, term35683.getClass(), "cached", true);
        setBooleanField(term35683, term35683.getClass(), "async", true);
        setField(term35683, term35683.getClass(), "keyLookupType", null);
        setField(term35683, term35683.getClass(), "keyLookupHeaders", null);
        setField(term35683, term35683.getClass(), "keyLookupClass", null);
        ArrayList term35681 = new ArrayList();
        ((ArrayList) term35681).add(term35683);
        Object term35690 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35690, term35690.getClass(), "id", null);
        setField(term35690, term35690.getClass(), "host", null);
        setField(term35690, term35690.getClass(), "port", null);
        setField(term35690, term35690.getClass(), "health", null);
        setField(term35690, term35690.getClass(), "scheme", null);
        setIntField(term35690, term35690.getClass(), "priority", 533197381);
        setBooleanField(term35690, term35690.getClass(), "isActive", true);
        setField(term35690, term35690.getClass(), "type", null);
        setField(term35690, term35690.getClass(), "groupId", null);
        setFloatField(term35690, term35690.getClass(), "loadFactor", 0.96599394F);
        setBooleanField(term35690, term35690.getClass(), "isReachable", true);
        Object term35695 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35695, term35695.getClass(), "id", null);
        setField(term35695, term35695.getClass(), "host", null);
        setField(term35695, term35695.getClass(), "port", null);
        setField(term35695, term35695.getClass(), "health", null);
        setField(term35695, term35695.getClass(), "scheme", null);
        setIntField(term35695, term35695.getClass(), "priority", 1048271679);
        setBooleanField(term35695, term35695.getClass(), "isActive", true);
        setField(term35695, term35695.getClass(), "type", null);
        setField(term35695, term35695.getClass(), "groupId", null);
        setFloatField(term35695, term35695.getClass(), "loadFactor", 0.18580896F);
        setBooleanField(term35695, term35695.getClass(), "isReachable", true);
        Object term35700 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35700, term35700.getClass(), "id", null);
        setField(term35700, term35700.getClass(), "host", null);
        setField(term35700, term35700.getClass(), "port", null);
        setField(term35700, term35700.getClass(), "health", null);
        setField(term35700, term35700.getClass(), "scheme", null);
        setIntField(term35700, term35700.getClass(), "priority", -1529797673);
        setBooleanField(term35700, term35700.getClass(), "isActive", true);
        setField(term35700, term35700.getClass(), "type", null);
        setField(term35700, term35700.getClass(), "groupId", null);
        setFloatField(term35700, term35700.getClass(), "loadFactor", 0.12414467F);
        setBooleanField(term35700, term35700.getClass(), "isReachable", true);
        Object term35705 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35705, term35705.getClass(), "id", null);
        setField(term35705, term35705.getClass(), "host", null);
        setField(term35705, term35705.getClass(), "port", null);
        setField(term35705, term35705.getClass(), "health", null);
        setField(term35705, term35705.getClass(), "scheme", null);
        setIntField(term35705, term35705.getClass(), "priority", -868676396);
        setBooleanField(term35705, term35705.getClass(), "isActive", true);
        setField(term35705, term35705.getClass(), "type", null);
        setField(term35705, term35705.getClass(), "groupId", null);
        setFloatField(term35705, term35705.getClass(), "loadFactor", 0.24406976F);
        setBooleanField(term35705, term35705.getClass(), "isReachable", true);
        Object term35710 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35710, term35710.getClass(), "id", null);
        setField(term35710, term35710.getClass(), "host", null);
        setField(term35710, term35710.getClass(), "port", null);
        setField(term35710, term35710.getClass(), "health", null);
        setField(term35710, term35710.getClass(), "scheme", null);
        setIntField(term35710, term35710.getClass(), "priority", 1922684808);
        setBooleanField(term35710, term35710.getClass(), "isActive", true);
        setField(term35710, term35710.getClass(), "type", null);
        setField(term35710, term35710.getClass(), "groupId", null);
        setFloatField(term35710, term35710.getClass(), "loadFactor", 0.6438162F);
        setBooleanField(term35710, term35710.getClass(), "isReachable", true);
        Object term35715 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35715, term35715.getClass(), "id", null);
        setField(term35715, term35715.getClass(), "host", null);
        setField(term35715, term35715.getClass(), "port", null);
        setField(term35715, term35715.getClass(), "health", null);
        setField(term35715, term35715.getClass(), "scheme", null);
        setIntField(term35715, term35715.getClass(), "priority", -2005784375);
        setBooleanField(term35715, term35715.getClass(), "isActive", true);
        setField(term35715, term35715.getClass(), "type", null);
        setField(term35715, term35715.getClass(), "groupId", null);
        setFloatField(term35715, term35715.getClass(), "loadFactor", 0.79774547F);
        setBooleanField(term35715, term35715.getClass(), "isReachable", true);
        Object term35720 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35720, term35720.getClass(), "id", null);
        setField(term35720, term35720.getClass(), "host", null);
        setField(term35720, term35720.getClass(), "port", null);
        setField(term35720, term35720.getClass(), "health", null);
        setField(term35720, term35720.getClass(), "scheme", null);
        setIntField(term35720, term35720.getClass(), "priority", -288604325);
        setBooleanField(term35720, term35720.getClass(), "isActive", true);
        setField(term35720, term35720.getClass(), "type", null);
        setField(term35720, term35720.getClass(), "groupId", null);
        setFloatField(term35720, term35720.getClass(), "loadFactor", 0.4476599F);
        setBooleanField(term35720, term35720.getClass(), "isReachable", true);
        Object term35725 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35725, term35725.getClass(), "id", null);
        setField(term35725, term35725.getClass(), "host", null);
        setField(term35725, term35725.getClass(), "port", null);
        setField(term35725, term35725.getClass(), "health", null);
        setField(term35725, term35725.getClass(), "scheme", null);
        setIntField(term35725, term35725.getClass(), "priority", -1268314569);
        setBooleanField(term35725, term35725.getClass(), "isActive", true);
        setField(term35725, term35725.getClass(), "type", null);
        setField(term35725, term35725.getClass(), "groupId", null);
        setFloatField(term35725, term35725.getClass(), "loadFactor", 0.5329919F);
        setBooleanField(term35725, term35725.getClass(), "isReachable", true);
        ArrayList term35688 = new ArrayList();
        ((ArrayList) term35688).add(term35690);
        ((ArrayList) term35688).add(term35695);
        ((ArrayList) term35688).add(term35700);
        ((ArrayList) term35688).add(term35705);
        ((ArrayList) term35688).add(term35710);
        ((ArrayList) term35688).add(term35715);
        ((ArrayList) term35688).add(term35720);
        ((ArrayList) term35688).add(term35725);
        HashMap term35828 = new HashMap();
        HashMap term35833 = new HashMap();
        HashMap term35851 = new HashMap();
        term35520 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term35680 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term35520, term35520.getClass(), "host", "xcAalPvMas");
        setBooleanField(term35520, term35520.getClass(), "tunnel", false);
        setField(term35520, term35520.getClass(), "port", "CUcmZFIqJn");
        setField(term35520, term35520.getClass(), "scheme", "jZSTuVeJwm");
        setField(term35520, term35520.getClass(), "basePath", "sZtJeHgDoS");
        setField(term35520, term35520.getClass(), "id", "PNjoWpTIKl");
        setField(term35520, term35520.getClass(), "name", "czpPLQIQFj");
        setField(term35520, term35520.getClass(), "groupId", "FLMgyDzlCF");
        setField(term35520, term35520.getClass(), "target", "ZwHgGCiCeV");
        setBooleanField(term35520, term35520.getClass(), "async", true);
        setField(term35520, term35520.getClass(), "asyncEngine", "QbPwthOQnr");
        setField(term35520, term35520.getClass(), "callbackId", "JIQQIDNpGz");
        setField(term35520, term35520.getClass(), "jwtKeylookup", "lAvGKEIUzY");
        setField(term35520, term35520.getClass(), "certificateId", "DzpjyfzuLi");
        setField(term35520, term35520.getClass(), "secappid", "HaqsDSnFiE");
        setBooleanField(term35520, term35520.getClass(), "autoProcure", false);
        setField(term35680, term35680.getClass(), "cachedResources", term35681);
        setField(term35680, term35680.getClass(), "hostGroups", term35688);
        setField(term35680, term35680.getClass(), "host", "KsjHvhvzcS");
        setField(term35680, term35680.getClass(), "port", "ksazOmFJDf");
        setField(term35680, term35680.getClass(), "hostGroupId", "YTQAyFGSot");
        setField(term35680, term35680.getClass(), "scheme", "GrdIHGdREZ");
        setField(term35680, term35680.getClass(), "basePath", "lWuIErfrpX");
        setField(term35680, term35680.getClass(), "id", "lNaxalwwFL");
        setField(term35680, term35680.getClass(), "name", "IgfnslgZTI");
        setField(term35680, term35680.getClass(), "groupId", "RMVwTznaVb");
        setField(term35680, term35680.getClass(), "includeHeaders", term35828);
        setField(term35680, term35680.getClass(), "excludeHeaders", term35833);
        setBooleanField(term35680, term35680.getClass(), "enableCache", true);
        setField(term35520, term35520.getClass(), "targetSystem", term35680);
        setField(term35520, term35520.getClass(), "headerLookup", "YZyWVYutLo");
        setField(term35520, term35520.getClass(), "keyLookupMap", term35851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Object[] args = new Object[1];
        args[0] = term35520;
        callMethod(klass, "add", argTypes, null, args);
    }

};


