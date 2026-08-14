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

public class HostGroup_setHealth_8914463964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22559;

    public HostGroup_setHealth_8914463964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22559 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term22559, term22559.getClass(), "id", "VGFyNxXSkc");
        setField(term22559, term22559.getClass(), "host", "qkZsBlbGpw");
        setField(term22559, term22559.getClass(), "port", "UonOkFcwuK");
        setField(term22559, term22559.getClass(), "health", "coDGKPmcIo");
        setField(term22559, term22559.getClass(), "scheme", "sNKnkClMjH");
        setIntField(term22559, term22559.getClass(), "priority", 991356662);
        setBooleanField(term22559, term22559.getClass(), "isActive", true);
        setField(term22559, term22559.getClass(), "type", "DzuhSmFHcg");
        setField(term22559, term22559.getClass(), "groupId", "lHFGeijIrp");
        setFloatField(term22559, term22559.getClass(), "loadFactor", 0.6496153F);
        setBooleanField(term22559, term22559.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OjqiiqbEQC";
        callMethod(klass, "setHealth", argTypes, term22559, args);
    }

};


