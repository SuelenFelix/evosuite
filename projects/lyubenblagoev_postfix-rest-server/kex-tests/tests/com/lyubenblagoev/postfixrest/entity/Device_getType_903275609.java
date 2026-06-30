package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Device_getType_903275609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2055;

    public Device_getType_903275609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2086 = new Long(1457594663983990440L);
        Object term2085 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2085, term2085.getClass(), "name", null);
        setField(term2085, term2085.getClass(), "users", null);
        setField(term2085, term2085.getClass(), "id", term2086);
        setBooleanField(term2085, term2085.getClass(), "enabled", true);
        setField(term2085, term2085.getClass(), "created", null);
        setField(term2085, term2085.getClass(), "updated", null);
        Object term2089 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2089, term2089.getClass(), "name", null);
        setField(term2089, term2089.getClass(), "users", null);
        setField(term2089, term2089.getClass(), "id", null);
        setBooleanField(term2089, term2089.getClass(), "enabled", false);
        setField(term2089, term2089.getClass(), "created", null);
        setField(term2089, term2089.getClass(), "updated", null);
        Object term2091 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2091, term2091.getClass(), "name", null);
        setField(term2091, term2091.getClass(), "users", null);
        setField(term2091, term2091.getClass(), "id", null);
        setBooleanField(term2091, term2091.getClass(), "enabled", false);
        setField(term2091, term2091.getClass(), "created", null);
        setField(term2091, term2091.getClass(), "updated", null);
        Object term2093 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2093, term2093.getClass(), "name", null);
        setField(term2093, term2093.getClass(), "users", null);
        setField(term2093, term2093.getClass(), "id", null);
        setBooleanField(term2093, term2093.getClass(), "enabled", false);
        setField(term2093, term2093.getClass(), "created", null);
        setField(term2093, term2093.getClass(), "updated", null);
        Long term2096 = new Long(-1333707622307134180L);
        Object term2095 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2095, term2095.getClass(), "name", null);
        setField(term2095, term2095.getClass(), "users", null);
        setField(term2095, term2095.getClass(), "id", term2096);
        setBooleanField(term2095, term2095.getClass(), "enabled", true);
        setField(term2095, term2095.getClass(), "created", null);
        setField(term2095, term2095.getClass(), "updated", null);
        Object term2099 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2099, term2099.getClass(), "name", null);
        setField(term2099, term2099.getClass(), "users", null);
        setField(term2099, term2099.getClass(), "id", null);
        setBooleanField(term2099, term2099.getClass(), "enabled", false);
        setField(term2099, term2099.getClass(), "created", null);
        setField(term2099, term2099.getClass(), "updated", null);
        ArrayList term2083 = new ArrayList();
        ((ArrayList) term2083).add(term2085);
        ((ArrayList) term2083).add(term2089);
        ((ArrayList) term2083).add(term2091);
        ((ArrayList) term2083).add(term2093);
        ((ArrayList) term2083).add(term2095);
        ((ArrayList) term2083).add(term2099);
        Long term2103 = new Long(3452833434644634217L);
        Long term2160 = new Long(-8603648071751666348L);
        term2055 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term2056 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term2081 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term2106 = newInstance(Class.forName("java.util.Date"));
        Object term2108 = newInstance(Class.forName("java.util.Date"));
        Object term2122 = newInstance(Class.forName("java.util.Date"));
        Object term2163 = newInstance(Class.forName("java.util.Date"));
        Object term2165 = newInstance(Class.forName("java.util.Date"));
        setField(term2056, term2056.getClass(), "email", "bxrCBbrrct");
        setField(term2056, term2056.getClass(), "password", "CKWpJaaaxX");
        setIntField(term2081, term2081.getClass(), "modCount", 0);
        setField(term2056, term2056.getClass(), "devices", term2081);
        setField(term2056, term2056.getClass(), "roles", term2083);
        setField(term2056, term2056.getClass(), "id", term2103);
        setBooleanField(term2056, term2056.getClass(), "enabled", true);
        setLongField(term2106, term2106.getClass(), "fastTime", 1842237600959L);
        setField(term2106, term2106.getClass(), "cdate", null);
        setField(term2056, term2056.getClass(), "created", term2106);
        setLongField(term2108, term2108.getClass(), "fastTime", 1770196770908L);
        setField(term2108, term2108.getClass(), "cdate", null);
        setField(term2056, term2056.getClass(), "updated", term2108);
        setField(term2055, term2055.getClass(), "user", term2056);
        setField(term2055, term2055.getClass(), "refreshToken", "vvoLrMGCoN");
        setLongField(term2122, term2122.getClass(), "fastTime", 1367935077317L);
        setField(term2122, term2122.getClass(), "cdate", null);
        setField(term2055, term2055.getClass(), "refreshTokenExpirationDate", term2122);
        setField(term2055, term2055.getClass(), "remoteAddress", "pXdglvyrQe");
        setField(term2055, term2055.getClass(), "type", "OcfNzHYdki");
        setField(term2055, term2055.getClass(), "os", "uPuCVuZYOI");
        setField(term2055, term2055.getClass(), "id", term2160);
        setBooleanField(term2055, term2055.getClass(), "enabled", false);
        setLongField(term2163, term2163.getClass(), "fastTime", 1875231796050L);
        setField(term2163, term2163.getClass(), "cdate", null);
        setField(term2055, term2055.getClass(), "created", term2163);
        setLongField(term2165, term2165.getClass(), "fastTime", 1470108020852L);
        setField(term2165, term2165.getClass(), "cdate", null);
        setField(term2055, term2055.getClass(), "updated", term2165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2055, args);
    }

};


