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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class TargetSystem_setScheme_121181540615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31326;

    public TargetSystem_setScheme_121181540615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31327 = new ArrayList();
        Object term31333 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31333, term31333.getClass(), "id", "");
        setField(term31333, term31333.getClass(), "host", "");
        setField(term31333, term31333.getClass(), "port", "");
        setField(term31333, term31333.getClass(), "health", "");
        setField(term31333, term31333.getClass(), "scheme", "");
        setIntField(term31333, term31333.getClass(), "priority", 1236004505);
        setBooleanField(term31333, term31333.getClass(), "isActive", true);
        setField(term31333, term31333.getClass(), "type", "");
        setField(term31333, term31333.getClass(), "groupId", "");
        setFloatField(term31333, term31333.getClass(), "loadFactor", 0.46776146F);
        setBooleanField(term31333, term31333.getClass(), "isReachable", true);
        Object term31345 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31345, term31345.getClass(), "id", "");
        setField(term31345, term31345.getClass(), "host", "");
        setField(term31345, term31345.getClass(), "port", "");
        setField(term31345, term31345.getClass(), "health", "");
        setField(term31345, term31345.getClass(), "scheme", "");
        setIntField(term31345, term31345.getClass(), "priority", 1050765721);
        setBooleanField(term31345, term31345.getClass(), "isActive", true);
        setField(term31345, term31345.getClass(), "type", "");
        setField(term31345, term31345.getClass(), "groupId", "");
        setFloatField(term31345, term31345.getClass(), "loadFactor", 0.47720432F);
        setBooleanField(term31345, term31345.getClass(), "isReachable", true);
        Object term31357 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31357, term31357.getClass(), "id", "");
        setField(term31357, term31357.getClass(), "host", "");
        setField(term31357, term31357.getClass(), "port", "");
        setField(term31357, term31357.getClass(), "health", "");
        setField(term31357, term31357.getClass(), "scheme", "");
        setIntField(term31357, term31357.getClass(), "priority", 474518942);
        setBooleanField(term31357, term31357.getClass(), "isActive", true);
        setField(term31357, term31357.getClass(), "type", "");
        setField(term31357, term31357.getClass(), "groupId", "");
        setFloatField(term31357, term31357.getClass(), "loadFactor", 0.2877797F);
        setBooleanField(term31357, term31357.getClass(), "isReachable", true);
        Object term31369 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31369, term31369.getClass(), "id", "");
        setField(term31369, term31369.getClass(), "host", "");
        setField(term31369, term31369.getClass(), "port", "");
        setField(term31369, term31369.getClass(), "health", "");
        setField(term31369, term31369.getClass(), "scheme", "");
        setIntField(term31369, term31369.getClass(), "priority", -1656687479);
        setBooleanField(term31369, term31369.getClass(), "isActive", true);
        setField(term31369, term31369.getClass(), "type", "");
        setField(term31369, term31369.getClass(), "groupId", "");
        setFloatField(term31369, term31369.getClass(), "loadFactor", 0.24465042F);
        setBooleanField(term31369, term31369.getClass(), "isReachable", true);
        Object term31381 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31381, term31381.getClass(), "id", "");
        setField(term31381, term31381.getClass(), "host", "");
        setField(term31381, term31381.getClass(), "port", "");
        setField(term31381, term31381.getClass(), "health", "");
        setField(term31381, term31381.getClass(), "scheme", "");
        setIntField(term31381, term31381.getClass(), "priority", -249614216);
        setBooleanField(term31381, term31381.getClass(), "isActive", true);
        setField(term31381, term31381.getClass(), "type", "");
        setField(term31381, term31381.getClass(), "groupId", "");
        setFloatField(term31381, term31381.getClass(), "loadFactor", 0.110482514F);
        setBooleanField(term31381, term31381.getClass(), "isReachable", true);
        Object term31393 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31393, term31393.getClass(), "id", "");
        setField(term31393, term31393.getClass(), "host", "");
        setField(term31393, term31393.getClass(), "port", "");
        setField(term31393, term31393.getClass(), "health", "");
        setField(term31393, term31393.getClass(), "scheme", "");
        setIntField(term31393, term31393.getClass(), "priority", 1870727665);
        setBooleanField(term31393, term31393.getClass(), "isActive", true);
        setField(term31393, term31393.getClass(), "type", "");
        setField(term31393, term31393.getClass(), "groupId", "");
        setFloatField(term31393, term31393.getClass(), "loadFactor", 0.61427236F);
        setBooleanField(term31393, term31393.getClass(), "isReachable", true);
        ArrayList term31331 = new ArrayList();
        ((ArrayList) term31331).add(term31333);
        ((ArrayList) term31331).add(term31345);
        ((ArrayList) term31331).add(term31357);
        ((ArrayList) term31331).add(term31369);
        ((ArrayList) term31331).add(term31381);
        ((ArrayList) term31331).add(term31393);
        HashMap term31503 = new HashMap();
        HashMap term31508 = new HashMap();
        term31326 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term31326, term31326.getClass(), "cachedResources", term31327);
        setField(term31326, term31326.getClass(), "hostGroups", term31331);
        setField(term31326, term31326.getClass(), "host", "fLUSgXlneP");
        setField(term31326, term31326.getClass(), "port", "hKDHCIiSuI");
        setField(term31326, term31326.getClass(), "hostGroupId", "ZDvGrpCzSc");
        setField(term31326, term31326.getClass(), "scheme", "OseqIIMKlG");
        setField(term31326, term31326.getClass(), "basePath", "qOsyLpoLDX");
        setField(term31326, term31326.getClass(), "id", "ieESeaonzX");
        setField(term31326, term31326.getClass(), "name", "MiDxSLYCkN");
        setField(term31326, term31326.getClass(), "groupId", "olwpoCLMLH");
        setField(term31326, term31326.getClass(), "includeHeaders", term31503);
        setField(term31326, term31326.getClass(), "excludeHeaders", term31508);
        setBooleanField(term31326, term31326.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aigtpfubEk";
        callMethod(klass, "setScheme", argTypes, term31326, args);
    }

};


