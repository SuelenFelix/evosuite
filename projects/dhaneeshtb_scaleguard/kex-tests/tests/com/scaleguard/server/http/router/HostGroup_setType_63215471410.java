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

public class HostGroup_setType_63215471410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23559;

    public HostGroup_setType_63215471410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23559 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23559, term23559.getClass(), "id", "vjUObaeMjo");
        setField(term23559, term23559.getClass(), "host", "JsIgccyWag");
        setField(term23559, term23559.getClass(), "port", "qSfmbHSpyF");
        setField(term23559, term23559.getClass(), "health", "nfLAMGBNLz");
        setField(term23559, term23559.getClass(), "scheme", "uMLxdkYOdc");
        setIntField(term23559, term23559.getClass(), "priority", 114754804);
        setBooleanField(term23559, term23559.getClass(), "isActive", true);
        setField(term23559, term23559.getClass(), "type", "oRXjZDPrtE");
        setField(term23559, term23559.getClass(), "groupId", "UYdKOLuJyq");
        setFloatField(term23559, term23559.getClass(), "loadFactor", 0.5584653F);
        setBooleanField(term23559, term23559.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzRmLCtUaL";
        callMethod(klass, "setType", argTypes, term23559, args);
    }

};


