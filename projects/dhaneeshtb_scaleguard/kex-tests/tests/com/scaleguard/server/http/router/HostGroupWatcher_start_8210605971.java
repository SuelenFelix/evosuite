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

public class HostGroupWatcher_start_8210605971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41179;

    public HostGroupWatcher_start_8210605971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41182 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41182, term41182.getClass(), "id", "");
        setField(term41182, term41182.getClass(), "host", "");
        setField(term41182, term41182.getClass(), "port", "");
        setField(term41182, term41182.getClass(), "health", "");
        setField(term41182, term41182.getClass(), "scheme", "");
        setIntField(term41182, term41182.getClass(), "priority", 1334483645);
        setBooleanField(term41182, term41182.getClass(), "isActive", true);
        setField(term41182, term41182.getClass(), "type", "");
        setField(term41182, term41182.getClass(), "groupId", "");
        setFloatField(term41182, term41182.getClass(), "loadFactor", 0.18817449F);
        setBooleanField(term41182, term41182.getClass(), "isReachable", true);
        Object term41194 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41194, term41194.getClass(), "id", "");
        setField(term41194, term41194.getClass(), "host", "");
        setField(term41194, term41194.getClass(), "port", "");
        setField(term41194, term41194.getClass(), "health", "");
        setField(term41194, term41194.getClass(), "scheme", "");
        setIntField(term41194, term41194.getClass(), "priority", 917513193);
        setBooleanField(term41194, term41194.getClass(), "isActive", true);
        setField(term41194, term41194.getClass(), "type", "");
        setField(term41194, term41194.getClass(), "groupId", "");
        setFloatField(term41194, term41194.getClass(), "loadFactor", 0.87325114F);
        setBooleanField(term41194, term41194.getClass(), "isReachable", true);
        Object term41206 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41206, term41206.getClass(), "id", "");
        setField(term41206, term41206.getClass(), "host", "");
        setField(term41206, term41206.getClass(), "port", "");
        setField(term41206, term41206.getClass(), "health", "");
        setField(term41206, term41206.getClass(), "scheme", "");
        setIntField(term41206, term41206.getClass(), "priority", 787278105);
        setBooleanField(term41206, term41206.getClass(), "isActive", true);
        setField(term41206, term41206.getClass(), "type", "");
        setField(term41206, term41206.getClass(), "groupId", "");
        setFloatField(term41206, term41206.getClass(), "loadFactor", 0.57387376F);
        setBooleanField(term41206, term41206.getClass(), "isReachable", true);
        Object term41218 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41218, term41218.getClass(), "id", "");
        setField(term41218, term41218.getClass(), "host", "");
        setField(term41218, term41218.getClass(), "port", "");
        setField(term41218, term41218.getClass(), "health", "");
        setField(term41218, term41218.getClass(), "scheme", "");
        setIntField(term41218, term41218.getClass(), "priority", -2063843486);
        setBooleanField(term41218, term41218.getClass(), "isActive", true);
        setField(term41218, term41218.getClass(), "type", "");
        setField(term41218, term41218.getClass(), "groupId", "");
        setFloatField(term41218, term41218.getClass(), "loadFactor", 0.897776F);
        setBooleanField(term41218, term41218.getClass(), "isReachable", true);
        Object term41230 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41230, term41230.getClass(), "id", "");
        setField(term41230, term41230.getClass(), "host", "");
        setField(term41230, term41230.getClass(), "port", "");
        setField(term41230, term41230.getClass(), "health", "");
        setField(term41230, term41230.getClass(), "scheme", "");
        setIntField(term41230, term41230.getClass(), "priority", 833762980);
        setBooleanField(term41230, term41230.getClass(), "isActive", true);
        setField(term41230, term41230.getClass(), "type", "");
        setField(term41230, term41230.getClass(), "groupId", "");
        setFloatField(term41230, term41230.getClass(), "loadFactor", 0.5694716F);
        setBooleanField(term41230, term41230.getClass(), "isReachable", true);
        Object term41242 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41242, term41242.getClass(), "id", "");
        setField(term41242, term41242.getClass(), "host", "");
        setField(term41242, term41242.getClass(), "port", "");
        setField(term41242, term41242.getClass(), "health", "");
        setField(term41242, term41242.getClass(), "scheme", "");
        setIntField(term41242, term41242.getClass(), "priority", 320711637);
        setBooleanField(term41242, term41242.getClass(), "isActive", true);
        setField(term41242, term41242.getClass(), "type", "");
        setField(term41242, term41242.getClass(), "groupId", "");
        setFloatField(term41242, term41242.getClass(), "loadFactor", 0.31070864F);
        setBooleanField(term41242, term41242.getClass(), "isReachable", true);
        Object term41254 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41254, term41254.getClass(), "id", "");
        setField(term41254, term41254.getClass(), "host", "");
        setField(term41254, term41254.getClass(), "port", "");
        setField(term41254, term41254.getClass(), "health", "");
        setField(term41254, term41254.getClass(), "scheme", "");
        setIntField(term41254, term41254.getClass(), "priority", 1241164745);
        setBooleanField(term41254, term41254.getClass(), "isActive", true);
        setField(term41254, term41254.getClass(), "type", "");
        setField(term41254, term41254.getClass(), "groupId", "");
        setFloatField(term41254, term41254.getClass(), "loadFactor", 0.21362513F);
        setBooleanField(term41254, term41254.getClass(), "isReachable", true);
        Object term41266 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41266, term41266.getClass(), "id", "");
        setField(term41266, term41266.getClass(), "host", "");
        setField(term41266, term41266.getClass(), "port", "");
        setField(term41266, term41266.getClass(), "health", "");
        setField(term41266, term41266.getClass(), "scheme", "");
        setIntField(term41266, term41266.getClass(), "priority", 1723148410);
        setBooleanField(term41266, term41266.getClass(), "isActive", true);
        setField(term41266, term41266.getClass(), "type", "");
        setField(term41266, term41266.getClass(), "groupId", "");
        setFloatField(term41266, term41266.getClass(), "loadFactor", 0.18330246F);
        setBooleanField(term41266, term41266.getClass(), "isReachable", true);
        Object term41278 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41278, term41278.getClass(), "id", "");
        setField(term41278, term41278.getClass(), "host", "");
        setField(term41278, term41278.getClass(), "port", "");
        setField(term41278, term41278.getClass(), "health", "");
        setField(term41278, term41278.getClass(), "scheme", "");
        setIntField(term41278, term41278.getClass(), "priority", -920797484);
        setBooleanField(term41278, term41278.getClass(), "isActive", true);
        setField(term41278, term41278.getClass(), "type", "");
        setField(term41278, term41278.getClass(), "groupId", "");
        setFloatField(term41278, term41278.getClass(), "loadFactor", 0.51947397F);
        setBooleanField(term41278, term41278.getClass(), "isReachable", true);
        ArrayList term41180 = new ArrayList();
        ((ArrayList) term41180).add(term41182);
        ((ArrayList) term41180).add(term41194);
        ((ArrayList) term41180).add(term41206);
        ((ArrayList) term41180).add(term41218);
        ((ArrayList) term41180).add(term41230);
        ((ArrayList) term41180).add(term41242);
        ((ArrayList) term41180).add(term41254);
        ((ArrayList) term41180).add(term41266);
        ((ArrayList) term41180).add(term41278);
        term41179 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroupWatcher"));
        setField(term41179, term41179.getClass(), "allHosts", term41180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroupWatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term41179, args);
    }

};


