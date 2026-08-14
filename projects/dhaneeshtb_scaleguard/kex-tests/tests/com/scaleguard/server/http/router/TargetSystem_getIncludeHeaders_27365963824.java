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

public class TargetSystem_getIncludeHeaders_27365963824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34072;

    public TargetSystem_getIncludeHeaders_27365963824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34073 = new ArrayList();
        Object term34079 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34079, term34079.getClass(), "id", "");
        setField(term34079, term34079.getClass(), "host", "");
        setField(term34079, term34079.getClass(), "port", "");
        setField(term34079, term34079.getClass(), "health", "");
        setField(term34079, term34079.getClass(), "scheme", "");
        setIntField(term34079, term34079.getClass(), "priority", -310648604);
        setBooleanField(term34079, term34079.getClass(), "isActive", true);
        setField(term34079, term34079.getClass(), "type", "");
        setField(term34079, term34079.getClass(), "groupId", "");
        setFloatField(term34079, term34079.getClass(), "loadFactor", 0.6853048F);
        setBooleanField(term34079, term34079.getClass(), "isReachable", true);
        Object term34091 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34091, term34091.getClass(), "id", "");
        setField(term34091, term34091.getClass(), "host", "");
        setField(term34091, term34091.getClass(), "port", "");
        setField(term34091, term34091.getClass(), "health", "");
        setField(term34091, term34091.getClass(), "scheme", "");
        setIntField(term34091, term34091.getClass(), "priority", -648200466);
        setBooleanField(term34091, term34091.getClass(), "isActive", true);
        setField(term34091, term34091.getClass(), "type", "");
        setField(term34091, term34091.getClass(), "groupId", "");
        setFloatField(term34091, term34091.getClass(), "loadFactor", 0.06480974F);
        setBooleanField(term34091, term34091.getClass(), "isReachable", true);
        ArrayList term34077 = new ArrayList();
        ((ArrayList) term34077).add(term34079);
        ((ArrayList) term34077).add(term34091);
        HashMap term34201 = new HashMap();
        HashMap term34206 = new HashMap();
        term34072 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term34072, term34072.getClass(), "cachedResources", term34073);
        setField(term34072, term34072.getClass(), "hostGroups", term34077);
        setField(term34072, term34072.getClass(), "host", "JTaFYFigKc");
        setField(term34072, term34072.getClass(), "port", "UkkxEeaUAd");
        setField(term34072, term34072.getClass(), "hostGroupId", "YuCzAoZaux");
        setField(term34072, term34072.getClass(), "scheme", "ovBBNANJnh");
        setField(term34072, term34072.getClass(), "basePath", "TXVFqDUypQ");
        setField(term34072, term34072.getClass(), "id", "bAuMZKiuMg");
        setField(term34072, term34072.getClass(), "name", "sOlEVEhJBz");
        setField(term34072, term34072.getClass(), "groupId", "PKUBbcvbbv");
        setField(term34072, term34072.getClass(), "includeHeaders", term34201);
        setField(term34072, term34072.getClass(), "excludeHeaders", term34206);
        setBooleanField(term34072, term34072.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncludeHeaders", argTypes, term34072, args);
    }

};


