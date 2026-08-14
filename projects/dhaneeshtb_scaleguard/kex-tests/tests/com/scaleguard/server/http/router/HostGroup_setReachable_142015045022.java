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
import java.lang.Boolean;

public class HostGroup_setReachable_142015045022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25559;
     Object term25648;

    public HostGroup_setReachable_142015045022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25559 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25559, term25559.getClass(), "id", "UqPFsSwrTW");
        setField(term25559, term25559.getClass(), "host", "zwAKIxjbAz");
        setField(term25559, term25559.getClass(), "port", "RlMsoYxesz");
        setField(term25559, term25559.getClass(), "health", "FkuWKCInZG");
        setField(term25559, term25559.getClass(), "scheme", "WoRWEXpkMK");
        setIntField(term25559, term25559.getClass(), "priority", -426764678);
        setBooleanField(term25559, term25559.getClass(), "isActive", true);
        setField(term25559, term25559.getClass(), "type", "EkKMYiEKHU");
        setField(term25559, term25559.getClass(), "groupId", "gvLQDVFTIF");
        setFloatField(term25559, term25559.getClass(), "loadFactor", 0.71719724F);
        setBooleanField(term25559, term25559.getClass(), "isReachable", true);
        term25648 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25648;
        callMethod(klass, "setReachable", argTypes, term25559, args);
    }

};


