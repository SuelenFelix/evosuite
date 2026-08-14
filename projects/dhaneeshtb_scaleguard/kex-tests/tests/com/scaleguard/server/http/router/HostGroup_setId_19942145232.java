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

public class HostGroup_setId_19942145232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22219;

    public HostGroup_setId_19942145232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22219 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term22219, term22219.getClass(), "id", "wUXTYOJezz");
        setField(term22219, term22219.getClass(), "host", "dovCZEmPER");
        setField(term22219, term22219.getClass(), "port", "QIADULuFso");
        setField(term22219, term22219.getClass(), "health", "XWnZIYfmmD");
        setField(term22219, term22219.getClass(), "scheme", "PbkTntqZDZ");
        setIntField(term22219, term22219.getClass(), "priority", -1504890659);
        setBooleanField(term22219, term22219.getClass(), "isActive", true);
        setField(term22219, term22219.getClass(), "type", "yDWoqUswuW");
        setField(term22219, term22219.getClass(), "groupId", "mgjEDzRwET");
        setFloatField(term22219, term22219.getClass(), "loadFactor", 0.71142817F);
        setBooleanField(term22219, term22219.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CepeBzACyE";
        callMethod(klass, "setId", argTypes, term22219, args);
    }

};


